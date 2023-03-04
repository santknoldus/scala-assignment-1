package com.knoldus.assignmentsolution

object Solution {

  //finding product of all the elements in the array
  def productOfNumbers(numbers: Array[Int]): Int = {
    var product = 1
    for (number <- numbers) {
      product = product * number
    }
    product
  }

  def main(args:Array[String]): Unit = {

    val array = Array(1, 2, 3, 4, 5)

    try {
      val result = productOfNumbers(array)
      println("Product of all the elements = " + result)
    } catch {
      case exception: Exception =>
        println("Error occurred :" + exception.getMessage)
    }
  }

}
