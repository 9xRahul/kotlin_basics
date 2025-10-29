

fun main(){
    val favNumbers=intArrayOf(1,2,3,4,5)
    val helloWorld= "Hello world"

    val listOfStrings=listOf("Rahul","Arnold","DickHead");
    val listOfontegers=listOf(1,2,3,4,5);

    val filteredString=listOfStrings.myFilter { currentString->
        currentString.length<6
    }



    val filteredNumbres=listOfontegers.myFilter { currentInteger->currentInteger%2==0  }


    println(filteredNumbres)
    println(filteredString)


}


fun<T> List<T>.myFilter(predicate:(T)->Boolean): List<T> {
    val result=mutableListOf<T>();
    for(element in this){
        if(predicate(element)){
            result.add(element)
        }
    }

    return result.toList()
}