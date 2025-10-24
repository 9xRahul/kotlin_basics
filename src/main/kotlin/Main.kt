fun main(){
 println("Enter the a string")
  val str= readln();

if(str.reverseString()==str){
    println(" $str is Palinrome String")
}
    else{
        println(" $str Not a palinrome String ")
    }

}


fun String.reverseString() : String{



    val rev= buildString {
        for (i in this@reverseString.lastIndex downTo  0){
           append(this@reverseString[i])
        }
    }

 return rev

}