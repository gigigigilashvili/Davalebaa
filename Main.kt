fun main() {
    var first = Fraction(6, 10)
    var second = Fraction(3,9)
    println(first.getGamravleba(second))
    println(first == second)
    println(first.getGayopa(second))
    println(first.getJami(second))
}

interface FractionMaths{
    fun getGamravleba(other: Any?): Any?
    fun getGayopa(other: Any?): Any?
    fun getJami(other:Any?): Any?

}

open class Fraction(var numerator: Int, var denominator: Int): FractionMaths {
    override fun getJami(other: Any?): Any? {
        if (other is Fraction){
            var anumerator = denominator * other.denominator/denominator*numerator + denominator * other.denominator/other.denominator*other.numerator
            var adenominator = denominator * other.denominator
            return Fraction(anumerator,adenominator)
        }
        return Fraction(numerator,denominator)
    }
    override fun getGayopa(other: Any?): Any? {
        if (other is Fraction){
            val anumerator = numerator * other.denominator
            val adenominator = denominator * other.numerator
            return Fraction(anumerator,adenominator)
        }
        return Fraction(numerator,denominator)
    }
    override fun toString(): String {
        return "$numerator / $denominator"
    }

    override fun equals(other: Any?): Boolean {
        if (other is Fraction)
            if (numerator * other.denominator == other.numerator * denominator) {
                return true
            }
        return false
    }

    override fun getGamravleba(other: Any?): Any? {
        if (other is Fraction) {
            val anumerator = numerator * other.numerator
            val adenominator = denominator * other.denominator
            return Fraction(anumerator, adenominator)
        }
        return Fraction(numerator, denominator)
    }
    }