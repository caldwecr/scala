package learning

class Stack[A] {

  private var items: List[A] = List[A]()

  def getItems: List[A] = items

  def push(item: A) = {
    items = items :+ item
    items
  }

  def pop: A = {
    val h = items.head
    items = items.tail
    h
  }
}
