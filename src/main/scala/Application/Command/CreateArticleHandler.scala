package Application.Command

import Core.CommandHandler

class CreateArticleHandler extends CommandHandler[CreateArticle, String] {
  override def handle(tCommand: CreateArticle): String = {
    s"C'est crée: ${tCommand.name}"
  }

  override def listenTo: Class[_] = CreateArticle.getClass
}
