fun main(){

     val favNumbers=intArrayOf(13,62,37,94,95);
    println("enter number to search");
     var input=readln();

       val search=input.toIntOrNull();

   if(search!=null && search in 0..favNumbers.size){
       println("number at position $search is ${favNumbers[search]}");
   } else{
        println("That fucking index not valid")
   }



}