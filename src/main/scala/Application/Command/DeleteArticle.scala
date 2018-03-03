package Application.Command

import Core.Command

case class DeleteArticle(article: String) extends Command[Unit]
