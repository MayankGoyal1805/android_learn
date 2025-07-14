fun main() {
    // kotlin has null safety, and we have to add `?` to make normal variable become nullable variables
    var text: String? = "Name"
    text = null
    println("$text")

    // we can't call text.length, Only safe (?.) or non-null asserted (!!.) calls are allowed on a nullable receiver of type String?
    // we have to make safe calls on null types which require us to basically check for the null before

    if(text != null) println(text.length) else println("variable is null")

    // all the smart casting rules apply here, read the docs of both


    // We can also use `?.`. It's called safe call operator, and it just returns null instead of throwing a null pointer exception
    text = "juja"
    println("${text?.length}")
    text = null
    println("${text?.length}")

    // Elvis operator
    // We can check for null and then provide an alternative value
    // But instead of writing the if condition, we can use the elvis operator




}