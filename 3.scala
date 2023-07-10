def Sum(n: Int): Int = {
  if (n == 1) {
    1
  } else {
    n + Sum(n - 1)
  }
}


  def main(args: Array[String]): Unit = {
    val n = 5
    val result = Sum(n)
    println(s"The sum of numbers from 1 to $n is: $result")
  }

