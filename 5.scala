def EvenSum(n: Int): Int = {
  if (n <= 0) {
    0
  } else if (n % 2 == 0) {
    n + EvenSum(n - 2)
  } else {
    EvenSum(n - 1)
  }
}

def main(args: Array[String]): Unit = {
    
    println("Enter a number:")
    val i = scala.io.StdIn.readInt()

    val result = EvenSum(i)
    println(s"The sum of even numbers less than $i is: $result")
}

