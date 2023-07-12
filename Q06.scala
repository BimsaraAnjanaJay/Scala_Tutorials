import scala.io.StdIn
object Fibonacci {

  def main(args: Array[String]): Unit = {
    printf("Provide a value:  ")
    val n = StdIn.readInt()
    printt(n)
  }

  def printt(n: Int): Unit = {
    for (i <- 0 until n) {
      val value = fibonacci(i)
      println(value)
    }
  }

  def fibonacci(n: Int): Int = {
    if (n <= 1)
      n
    else
      fibonacci(n - 1) + fibonacci(n - 2)
  }

}
