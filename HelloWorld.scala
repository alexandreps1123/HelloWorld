object HelloWorld {
  def main(args: Array[String]) = {
    println("Hello World!")

    val a = 10
    val b = 20

    // ternary operator like
    if (a > b) println(a) else println(b)

    def maxSquaredDoubled(a: Int, b: Int): Int = 
      if (a > b) {
        val squared = a * a
        squared * 2
      } else {
        val squared = b * b
        squared * 2
      }

    println(maxSquaredDoubled(a, b))

    val divided = try {
      1 / 0
      } catch {
        case ae: ArithmeticException => throw new RuntimeException("Can't divided by 0")
        // case ae: ArithmeticException => 0
      } finally {
        println("finally")
      }

    println(divided)
  }
}
