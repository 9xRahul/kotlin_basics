import kotlin.math.sqrt

fun main() {

    val rect1=Rectangle(12,12)

    println(rect1.perimeter)

}



class Rectangle(val width: Int, val height: Int) {


    val perimeter =4*(width*height)


}