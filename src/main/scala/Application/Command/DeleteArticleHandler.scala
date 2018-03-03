package Application.Command

import Core.CommandHandler

class DeleteArticleHandler extends CommandHandler[DeleteArticle, Unit]{
  override def handle(tCommand: DeleteArticle): Unit = {
    println("C'est supprimé")
  }

  override def listenTo: Class[_] = DeleteArticle.getClass
}
