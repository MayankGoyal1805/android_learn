fun main(){
    print("Enter the value: ")
    val x = readln().toDouble()
    val y = when(x) {
        1.0 -> {
            println("x==1")
            "x==1"
        }
        2.0 -> "x==2"
        else -> "Well the number isn't one or two it is $x"
    }
    println(y)
}