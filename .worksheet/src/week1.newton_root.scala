package week1

object newton_root {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(162); 

  //cel mai mare divizor comun
  def gdc(x: Double, y: Double): Double =
    if (y == 0)
      x
    else
      gdc(y, x % y);System.out.println("""gdc: (x: Double, y: Double)Double""");$skip(73); 

  def abs(x: Double): Double =
    if (x < 0)
      -x
    else
      x;System.out.println("""abs: (x: Double)Double""");$skip(377); 

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
  };System.out.println("""sqrt: (x: Double)Double""");$skip(15); val res$0 = 

  sqrt(1e+60);System.out.println("""res0: Double = """ + $show(res$0));$skip(15); val res$1 = 

  sqrt(1e-60);System.out.println("""res1: Double = """ + $show(res$1));$skip(13); val res$2 = 

  gdc(2, 9);System.out.println("""res2: Double = """ + $show(res$2))}

}
