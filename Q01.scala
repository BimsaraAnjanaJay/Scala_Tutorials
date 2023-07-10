object Solution extends App {
  def isPrime(n: Int): Boolean = {
    if (n <= 1) {
      false
    } else if (div * div > n) {
      true
    } else if (n % div == 0) {
      false
    } else {
      div += 1
      isPrime(n)
    }
  }
  var div: Int = 2
  println(isPrime(5))
  div = 2
  println(isPrime(8))
}
