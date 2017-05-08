package learning

class Stack[A] {

  private var items: List[A] = List[A]()

  def getItems: List[A] = items

  def push(item: A) = {
    items = items :+ item
    items
  }

  def pop: Option[A] = {
    if(items.isEmpty) return None
    val item = items.last
    items = items.dropRight(1)
    Some(item)
  }

  def isEmpty = items.isEmpty
}

class Queue[A] {
  private var inbox: Stack[A] = new Stack[A]
  private var outbox: Stack[A] = new Stack[A]

  def isInboxEmpty = inbox.isEmpty

  def enqueue(item: A) = {
    inbox.push(item)
  }

  def dequeue = {

  }

  def fillOutbox: Unit = {
    val msg = inbox.pop
    msg match {
      case None => return
      case Some(item) => outbox.push(item)
    }
    fillOutbox
  }
}
