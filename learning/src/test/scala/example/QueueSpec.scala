package learning

import org.specs2._

class QueueSpec extends Specification { def is = s2"""
 This is a specification of the Queue class

 The fillOutbox method
   empties the inbox                                     $e1
                                                         """

  def e1 = {
    val queue = new Queue[Int]
    queue.enqueue(123)

    queue.fillOutbox

    queue.isInboxEmpty must beTrue
  }

}
