package learning

object Hello extends Greeting with App {

  val stk = new Stack[Int]

  stk.push(5)

  stk.push(2)

  stk.push(-5)

  println(stk.pop)

  println(stk.pop)

}

trait Greeting {
  lazy val greeting: String = "hello"
}
