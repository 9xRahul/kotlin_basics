fun main() {
    println("Enter the a string")
    val str = readln()

    val greet = { name: String -> println("Hello, $name!") }

    println(greet( str))

    val output=str.myFilter { it.isLetter() }


 println(output)

}


fun String.myFilter(predicate:(Char)->Boolean):String{

    return buildString {
        for(char in this@myFilter){
            if(predicate(char)){
                append(char)
            }
        }
    }

}