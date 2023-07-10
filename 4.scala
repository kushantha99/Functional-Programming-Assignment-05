def numChecker(n: Int): Boolean = {
  if (n == 0) {
    true
  } else if (n == 1) {
    false
  } else {
    numChecker(n - 2)
  }
}

 def main(args: Array[String]): Unit = {
    println("Enter a number:")
    val input = scala.io.StdIn.readInt()

    
    val result = numChecker(input)
    if (result) {
     println(s"$input is even")
    } else {
    println(s"$input is odd")
    }   

 }
