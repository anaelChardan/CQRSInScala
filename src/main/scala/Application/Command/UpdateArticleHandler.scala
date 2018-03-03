package Application.Command

import Core.CommandHandler

class UpdateArticleHandler extends CommandHandler[UpdateArticle, Int]{
  override def handle(tCommand: UpdateArticle): Int = {
    1
  }

  override def listenTo: Class[_] = UpdateArticle.getClass
}
