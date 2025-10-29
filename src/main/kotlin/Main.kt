

// Step 1: Define a sealed interface
sealed interface Animal {
    val name: String  // All animals will have a name
}

// Step 2: Define different types of animals that implement the sealed interface
data class Dog(override val name: String, val breed: String) : Animal
data class Cat(override val name: String, val color: String) : Animal
data class Bird(override val name: String, val canFly: Boolean) : Animal

object Fish : Animal { override val name = "Goldfish" }

// Step 3: Function to describe each animal and its behavior
fun describeAnimal(animal: Animal): String {
    return when (animal) {
        is Dog -> "🐶 ${animal.name} is a ${animal.breed} dog and loves to bark!"
        is Cat -> "🐱 ${animal.name} is a ${animal.color} cat and loves to sleep!"
        is Bird -> {
            if (animal.canFly)
                "🐦 ${animal.name} is a bird that can fly high in the sky!"
            else
                "🐤 ${animal.name} is a bird that cannot fly."
        }
        Fish -> "🐠 ${animal.name} swims all day and loves bubbles!"
    }
}

// Step 4: Main function to test it all
fun main() {
//    val animals: List<Animal> = listOf(
//        Dog(name = "Buddy", breed = "Labrador"),
//        Cat(name = "Misty", color = "White"),
//        Bird(name = "Tweety", canFly = true),
//        Bird(name = "Pengu", canFly = false),
//        Fish
//    )
//
//    // Print details for each animal
//    for (animal in animals) {
//        println(describeAnimal(animal))
//    }

    println(" ${greetMe(Country.INDIA)} From ${Country.INDIA}")
}


enum class Country{
    GERMANY,INDIA,UK,USA
}

fun  greetMe(country:Country):String{
    return when(country){
        Country.GERMANY -> "Guten tag"
        Country.INDIA -> "Namaste"
        Country.UK -> "Hii"
        Country.USA -> "HEllo"
    }

}