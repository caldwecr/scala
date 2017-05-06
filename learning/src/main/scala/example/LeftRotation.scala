package example

import scala.collection.mutable.ArrayBuffer
object LeftRotation {
  def rotateLeft(arr: Array[Int], numOfRots: Int = 0): Array[Int] = {
    val buffer = arr.toBuffer
    val parts = buffer.splitAt(numOfRots)
      (parts._2 ++ parts._1).toArray
  }
}
