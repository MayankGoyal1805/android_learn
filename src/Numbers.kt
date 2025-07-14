fun main(){
    // Integer is default to it's max value and then long is inferred. For short and byte, you have to explicitly specify the data type.
    val integerMaxValue = Int.MAX_VALUE
    val integerMinValue = Int.MIN_VALUE
    val className1 = integerMaxValue::class.simpleName

    println("Integer max value : $integerMaxValue")
    println("Integer min value : $integerMinValue")
    println("Data type: $className1\n")

    val byteMaxValue: Byte = Byte.MAX_VALUE
    val byteMinValue: Byte = Byte.MIN_VALUE
    val className2 = byteMaxValue::class.simpleName


    println("Byte max value: $byteMaxValue")
    println("Byte min value: $byteMinValue")
    println("Data type: $className2\n")

    val shortMaxValue: Short = Short.MAX_VALUE
    val shortMinValue: Short = Short.MIN_VALUE

    println("Short Max value: $shortMaxValue")
    println("Short Min value: $shortMinValue\n")

    val longMaxValue = Long.MAX_VALUE
    val longMinValue = Long.MIN_VALUE

    println("Long max value: $longMaxValue")
    println("Long min value: $longMinValue\n\n")

    // Above are whole number types. Below are float(decimal) types-float and double

    val myNumber = 2f // float, we have to mention by f or F
    val mySecondNumber = 2.3 //double is detected by default
    println("myNumber = $myNumber")
    println("mySecondNumber = $mySecondNumber")
}

