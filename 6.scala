def printFibonacci(n: Int): Unit = {
  if (n > 0) {
    printFibonacci(n - 1)
    val fibonacciNumber = fibonacci(n)
    print(f"$fibonacciNumber ")
  }
}

def fibonacci(n: Int): Int = {
  if (n <= 1) {
    n
  } else {
    fibonacci(n - 1) + fibonacci(n - 2)
  }
}

def main(args: Array[String]): Unit = {
    println("Enter the fibonacci value:")
    val n = scala.io.StdIn.readInt()
    printFibonacci(n)
}

