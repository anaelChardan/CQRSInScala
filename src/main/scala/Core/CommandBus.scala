package Core

class CommandBus(handlers: List[CommandHandler[_, _]]) {

  def dispatch[R](command: Command[R]): R = {
    //VERY UGLY WAY TO COMPARE TWO CLASSES GET AWAY FROM IT
    this.handlers
      .find(p => p.listenTo.getName.replace("$", "") == command.getClass.getName)
      .map(handler =>
        handler
        .asInstanceOf[CommandHandler[Command[R], R]]
        .handle(command)
      ).get
  }
}
