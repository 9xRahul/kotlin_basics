fun main(){
 println("Enter the limit")
  val limit= readln().toIntOrNull()?:0

    var i=0
    var sum=0
    var nums=mutableListOf<Int>();

    for(i in 0 until limit){
        println("Enter ${i+1}th number")
        val num=readln().toIntOrNull()?:continue
        nums.add(num);
    }


  for( number in nums){
      println("$number")
  }





}