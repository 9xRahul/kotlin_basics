fun main(){

 val input=readln()
    val formatedInput=try{
        input.toInt()
    } catch(e:NumberFormatException){
        0
    }





      val output=  when(formatedInput){

       3->"number is three"
          5->"number is  five"
          in 10.. 20 ->"between 10 and 20"
          else->"I am confussed what to print"

        }

        println(output)



}