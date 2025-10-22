fun main(){

 val input=readln()
    val formatedInput=input.toIntOrNull()

    if(formatedInput!=null){
        val isEven=formatedInput%2==0;

        if(isEven){
            print("$formatedInput isEven")
        }
        else{
            println("$formatedInput is Odd")
        }
    }
    else{
        println("Null value is not valid")
    }


}