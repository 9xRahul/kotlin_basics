fun main(){
 println("Enter the a string")
  val str= readln();

if(reverseString(str= str)==str){
    println(" $str is Palinrome String")
}
    else{
        println(" $str Not a palinrome String ")
    }

}


fun reverseString(str: String) : String{



    val rev= buildString {
        for (i in str.lastIndex downTo  0){
           append(str[i])
        }
    }

 return rev

}