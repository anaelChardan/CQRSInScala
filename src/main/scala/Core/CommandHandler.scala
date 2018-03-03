package Core

trait CommandHandler[TCommand <: Command[TResponse], TResponse] {
  def handle(tCommand: TCommand): TResponse
  def listenTo: Class[_]
}