fun main(){
 println("Enter the limit")
  val limit= readln().toIntOrNull()?:0

    var i=0
    var sum=0
    var nums=mutableListOf<int>();


    while(i<limit){
        println("Enter ${i+1}th number")
        val num=readln().toIntOrNull()?:continue
        nums+=num

        i++
    }


    println(nums.contentToString())


}