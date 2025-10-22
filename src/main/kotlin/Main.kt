fun main(){

 val input=readln()
    val formatedInput=input.toIntOrNull()

    if(formatedInput!=null){


      val output=  when(formatedInput){
//            formatedInput %2==0 && formatedInput>10  -> "Even and greater than 10"
//            formatedInput %2!=0 && formatedInput <10 && formatedInput>0  -> "Odd and less than 10"
//            formatedInput %2!=0  && formatedInput>0 -> "odd"
//            formatedInput %2==0 && formatedInput>0  -> "even"
//            else -> "Negaive number"

       3->"number is three"
          5->"number is  five"
          in 10.. 20 ->"between 10 and 20"
          else->"I am confussed"

        }

        println(output)
    }
    else{
        println("Null value is not valid")
    }


}