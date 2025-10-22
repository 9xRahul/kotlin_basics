fun main(){

 val input=readln()
    val formatedInput=input.toIntOrNull()

    if(formatedInput!=null){
        val isEven=formatedInput%2==0;

        val output= if(formatedInput%2==0){
            "isEven"
        }
        else{
            "is Odd"
        }

        println(output)
    }
    else{
        println("Null value is not valid")
    }


}