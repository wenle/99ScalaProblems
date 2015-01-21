package com.github.wenle.scalaproblems

/**
 * Created by wbao on 1/21/15.
 */

import org.scalatest._
import org.scalatest.junit.JUnitRunner
import org.junit.runner.RunWith

@RunWith(classOf[JUnitRunner])
class Problem01Test extends FlatSpec with Matchers {

  "lastOfList" should "return the last element of list" in {
    val list = List(1, 2, 3)
    Problem01.lastOfList(list) should be (3)
  }

  "lastOfList" should "throw exception for empty list" in {
    val list = List()
    intercept[NoSuchElementException] {
      Problem01.lastOfList(list)
    }
  }

}
