package Application.Command

import Core.Command

case class CreateArticle(name: String) extends Command[String]
