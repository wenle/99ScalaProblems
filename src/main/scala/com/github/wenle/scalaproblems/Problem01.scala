package com.github.wenle.scalaproblems

/**
 * Created by wbao on 1/21/15.
 * Functional implementation for List.last
 */
object Problem01 {

  def lastOfList[T](list : List[T]) : T = list match {
    case head :: Nil => head
    case _ :: tail => lastOfList(tail)
    case _ => throw new NoSuchElementException
  }

}
