object Main extends App {
  def primeSeq(n: Int): Unit = {
    div = 2
    if (current < n) {
      if (isPrime(current)) {
        print(current + " ")
      }
      current += 1
      primeSeq(n)
    }
  }
  def isPrime(m: Int): Boolean = {
    if (m <= 1) {
      false
    } else if (div * div > m) {
      true
    } else if (m % div == 0) {
      false
    } else {
      div += 1
      isPrime(m)
    }
  }
  var current: Int = 2
  var div: Int = 2
  print("\n")
  primeSeq(25)
}
