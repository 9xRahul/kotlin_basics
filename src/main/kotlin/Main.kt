fun main(){
 println("Enter the a string")
  val str= readln();

reverseString(str)

}


fun reverseString(str: String){



    val rev= buildString {
        for (i in str.lastIndex downTo  0){
           append(str[i])
        }
    }

    print(rev)

}