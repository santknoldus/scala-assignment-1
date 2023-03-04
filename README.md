# Scala-Assignment-1-Solution

**Problem :**
You have been given an array  consisting of positive integers. You need to find and print the product of all the number in the array.

Sample Input: A = [1 2 3 4 5]
Sample Output: 120

**Solution :**

```
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
```
**Output:**

```
Product of all the elements = 120
```

**Points Followed**
* The method name is specific and describes what it does.
* The code has been made more modular by breaking down the product calculation into a separate method.
* There are comments to explain what the code does.
* The code is testable.
* Exception handling has been added to the code.
