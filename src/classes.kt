fun main(){
    Constructors(34)

    val mayank = Person("mayank")
    val dog = Pet(mayank)
    println(mayank)
    println(dog)
    println(mayank.name)
    println(dog.ownerName)
}

class Person(val name: String = "who"
, val pets: MutableList<Pet> = mutableListOf()
)

class Pet{
    var ownerName = ""
    constructor(owner: Person){
        owner.pets.add(this)
        ownerName = owner.name
    }
}

class Constructors {
    init {
        println("Init block")
    }

    constructor(i: Int) {
        println("Constructor $i")
    }
}

