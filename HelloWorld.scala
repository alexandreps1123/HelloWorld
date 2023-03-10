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
        // case ae: ArithmeticException => throw new RuntimeException("Can't divided by 0")
        case ae: ArithmeticException => 0
      } finally {
        println("finally")
      }

    println(divided)

    // simple loops
    var x = 0

    while (x < 10) {
      println(s"the square of $x is ${x * x}")
      x += 1
    }

    do {
      println(s"the square of $x is ${x * x}")
      x += 1
    } while (x < 20)

    x = 0
    while (x < args.length) {
      println(s"Hello ${args(x)}")
      x += 1
    }

  }
}
