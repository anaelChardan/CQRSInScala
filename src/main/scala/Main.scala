import Application.Command._
import Core.{Command, CommandBus, CommandHandler}

object Main extends App {
  override def main(args: Array[String]): Unit = {
    val createArticleHandler: CommandHandler[CreateArticle, String] = new CreateArticleHandler
    val deleteArticleHandler: CommandHandler[DeleteArticle, Unit] = new DeleteArticleHandler
    val updateArticleHandler: CommandHandler[UpdateArticle, Int] = new UpdateArticleHandler

    val list: List[CommandHandler[_, _]] = List(createArticleHandler, deleteArticleHandler, updateArticleHandler)
    val bus = new CommandBus(list)

    val createArticle : Command[String] = CreateArticle("toto")

    println(bus.dispatch(createArticle))
  }
}
