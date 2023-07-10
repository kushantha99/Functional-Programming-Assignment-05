object PrimeSequence {
  def primeSeq(n: Int): Unit = {
    def isPrime(num: Int, div: Int): Boolean = {
      if (div <= 1) true
      else if (num % div == 0) false
      else isPrime(num, div - 1)
    }

    def printPrimes(num: Int): Unit = {
      if (num < 2) return
      printPrimes(num - 1)
      if (isPrime(num, Math.sqrt(num).toInt)) {
        println(num)
      }
    }

    printPrimes(n - 1)
  }

  def main(args: Array[String]): Unit = {
    val n = 10
    primeSeq(n)
  }
}
