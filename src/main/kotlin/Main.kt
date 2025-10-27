import kotlin.math.sqrt

fun main() {

    val rect1=Rectangle(name="first",12,12)
    val rect2=Rectangle(name="first",12,12)

 val r=  maxPerimeter(rect1, rect2)

    println("${r.name} has perimeter ${r.perimeter}.")


    print(rect1==rect2)

}


fun maxPerimeter( rect1:Rectangle,rect2:Rectangle):Rectangle{

    if(rect1.perimeter<rect2.perimeter)
        return  rect2
    else
        return rect1
}

data class Rectangle(val name:String,  val width: Int, val height: Int) {


    val perimeter =2*(width+height)


}