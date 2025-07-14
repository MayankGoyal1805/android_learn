fun main(){
    val x = 5
    val y = 3f

    println("x + y = ${x+y}")
    println("x - y = ${x-y}")
    println("x * y = ${x*y}")
    println("x / y = ${x/y}")
    println("x % y = ${x%y}")

    println("(3 + 3) * 4 = ${(3+3)*4}")

    var a = 0
    println("a: $a")
    println("a++: ${a++}")
    println("++a: ${++a}")
    println("a--: ${a--}")
    println("--a: ${--a}")

    val isActive = true

    if (isActive) {
        println("The condition is true.")
    }
    else {
        println("The condition is false")
    }


    val myNumber = 5

    if (myNumber>5) println("The number is greater than 5")
    else if (myNumber==5) println("The number is equal to 5")
    else println("The number is smaller than 5")

    // if blocks and boolean operators are just like c and java, so I am not writing everything
    // && for and and || for or

    // One big difference is that we can return value through our if-else statements, the last expression in the code block is returned

    val num1 = 5
    val num2 = -3
    val text = if (num1 > 0 && num2 > 0)  "This is text 1" else "This is text 2"
            // we can also have different data types in if and else blocks
        // now we omitted curly braces because we just have a single line but we can have multiple statements and it will still return the last statement
    println(text)


}









