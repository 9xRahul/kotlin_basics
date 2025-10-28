import kotlin.math.PI
import kotlin.math.sqrt

fun main() {

    val rect1=Rectangle(name="first",12f,12f)
    val rect2=Rectangle(name="first",12f,12f)


    println("Rect 2 arrea : ${rect2.area} ${rect2.circumference}")

    val circle =Circle(15f);

    println("Circle Area : ${circle.area} Circumference : ${circle.circumference}")


    println(sumAreas(rect1, circle))



}


fun maxPerimeter( rect1:Rectangle,rect2:Rectangle):Rectangle{

    if(rect1.perimeter<rect2.perimeter)
        return  rect2
    else
        return rect1
}

data class Rectangle(val name:String, val width: Float, val height: Float,

):Shape {



    val perimeter =2*(width+height)

    override val area: Float= width * height

    override val circumference: Float=2*(height * width)

}

fun sumAreas(vararg shapes: Shape): Double{
    return shapes.sumOf { currentShape->
        currentShape.area.toDouble()
    }
}


data class Circle(val radius:Float):Shape{

    override val area: Float
        get() = 2 * PI.toFloat() * radius * radius;
    override val circumference: Float
        get() = 2 * PI.toFloat() * radius
}

interface  Shape{
    val area:Float
    val circumference:Float
}
