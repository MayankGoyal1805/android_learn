fun main(){
    sendMessage(name="Alexa")
    sum(3,4,4,5,56,7,8)
}

fun sendMessage(name: String = "User", message: String = sendText()){
    println("Name = $name and message = $message")
}

fun sendText() = "Some text"


fun sum(vararg numbers: Int) {
    val result = numbers.sum()
    println(result)
    numbers.forEach {
        println("This element is $it") }
}