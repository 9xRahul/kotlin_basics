fun main(){
 println("Enter the a string")
  val str= readln();

println(reverseString(str))

}


fun reverseString(str: String) : String{



    val rev= buildString {
        for (i in str.lastIndex downTo  0){
           append(str[i])
        }
    }

 return rev

}