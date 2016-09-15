package week1

object newton_root {

  //cel mai mare divizor comun
  def gdc(x: Double, y: Double): Double =
    if (y == 0)
      x
    else
      gdc(y, x % y)                               //> gdc: (x: Double, y: Double)Double

  def abs(x: Double): Double =
    if (x < 0)
      -x
    else
      x                                           //> abs: (x: Double)Double

  //sqrt using newton algorithm
  def sqrt(x: Double): Double = {

    def sqrtIter(guess: Double): Double =
      if (isGoodEnough(guess))
        guess
      else
        sqrtIter(improve(guess))

    def isGoodEnough(guess: Double): Boolean =
      abs(guess * guess - x) / x < 0.00001

    def improve(guess: Double) =
      (guess + x / guess) / 2

    sqrtIter(1.0)
  }                                               //> sqrt: (x: Double)Double

  sqrt(1e+60)                                     //> res0: Double = 1.0000000031080746E30

  sqrt(1e-60)                                     //> res1: Double = 1.0000000031080745E-30

  gdc(2, 9)                                       //> res2: Double = 1.0

}