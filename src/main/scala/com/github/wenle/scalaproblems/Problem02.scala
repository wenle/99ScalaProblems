package com.github.wenle.scalaproblems

/**
 * Created by wbao on 1/21/15.
 * Find the last but one element of a list
 */
object Problem02 {

  def lastButOne[T](list: List[T]): T = list match {

    case head :: _ :: Nil => head
    case _ :: tail => lastButOne(tail)
    case _ => throw new NoSuchElementException
  }

}
