package com.github.wenle.scalaproblems

/**
 * Created by wbao on 1/21/15.
 */

import org.junit.runner.RunWith
import org.scalatest._
import org.scalatest.junit.JUnitRunner

@RunWith(classOf[JUnitRunner])
class Problem02Test extends FlatSpec with Matchers {

   "lastButOne" should "return the last but one element of list" in {
     val list = List(1, 2, 3)
     Problem02.lastButOne(list) should be (2)
   }

   "lastButOne" should "throw exception for empty list" in {
     val list = List()
     intercept[NoSuchElementException] {
       Problem02.lastButOne(list)
     }
   }

  "lastButOne" should "throw exception for list containing only one element" in {
    val list = List(1)
    intercept[NoSuchElementException] {
      Problem02.lastButOne(list)
    }
  }
 }
