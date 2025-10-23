fun main(){
 println("Enter the a string")
  val str= readln();

    val finalStr= buildString {  for(i in str.lastIndex downTo 0){
         append(str[i])
    } }




 print(finalStr)

}