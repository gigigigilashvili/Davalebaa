fun main(){
    var coordinate = Point(3.44, 4.66)
    println(x.equals(y))
    println(coordinate)
    coordinate.moveXSymetrically()
    coordinate.moveYSymetrically()

    println(coordinate.toString())

}
open class Point(var x: Double,var y: Double) {
    override fun toString(): String {
        return "x: $x, y: $y"
    }
    override fun equals(other:Any?): Boolean {
        if (other is Point) {
            if (x == other)
                return true}
        return false
    }
    fun moveYSymetrically(): Double {
        return (-y)
    }

    fun moveXSymetrically(): Double {
        return (-x)
    }
}