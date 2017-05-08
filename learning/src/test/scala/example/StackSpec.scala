package learning

import org.specs2._

class StackSpec extends Specification { def is = s2"""
 This is a specification of the Stack class

 The push method
   adds its argument to the items in the Stack            $e1
   returns the items                                      $e2

 The pop method
   removes the most recently pushed item from the Stack   $e3
   returns the most recently pushed item                  $e4
                                                          """

  def e1 = {
    val stack = new Stack[Int]
    stack.push(123)
    stack.push(234)
    stack.push(345)
    stack.getItems must contain(exactly(123, 234, 345))
  }
  def e2 = {
    val stack = new Stack[Int]
    val pushResult = stack.push(123)
    pushResult must beTypedEqualTo(List(123))
  }

  def e3 = {
    val stack = new Stack[Int]
    stack.push(123)
    stack.push(345)

    stack.pop

    stack.getItems must contain(exactly(123))
  }

  def e4 = {
    val stack = new Stack[Int]
    stack.push(123)
    stack.push(345)

    stack.pop.get must beEqualTo(345)
  }
}
