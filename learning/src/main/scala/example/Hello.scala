package example

object Hello extends Greeting with App {
  val numRotationsNeeded = 3
  val arr = Array(1, 2, 3, 4, 5)

  LeftRotation.rotateLeft(arr, numRotationsNeeded).map((num) => println(num))
}

trait Greeting {
  lazy val greeting: String = "hello"
}
