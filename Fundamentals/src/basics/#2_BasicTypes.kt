package basics

/*
https://kotlinlang.org/docs/basic-types.html
Data Type : In computer programming, a data type is a classification that specifies which type of value a variable can hold,
how the values of that type can be manipulated,
and how they are stored in memory. Data types provide a way to organize and work with data in a program,
and they help define the operations that can be performed on the data.
--------------------------------------------------------------
Category                        Basic types
--------------------------------------------------------------
1) Integers                    Byte, Short, Int, Long
2) Unsigned integers           UByte, UShort, UInt, ULong
3) Floating-point numbers      Float, Double
4) Booleans                    Boolean
5) Characters                  Char
6) Strings                     String
----------------------------------------------------------------
- Signed Data Types:
Signed data types can represent both positive and negative values.
The leftmost bit (most significant bit) in the binary representation is used as the sign bit, where 0 typically represents positive and 1 represents negative.
For example, in a signed 8-bit integer, the range would be from -128 to 127.
- Unsigned Data Types:
Unsigned data types represent only non-negative values (zero and positive values).
All bits in the binary representation are used to represent magnitude, with no sign bit.
For example, in an unsigned 8-bit integer, the range would be from 0 to 255.

- Kotlin's ability to infer the data type is called type inference.  val d = 3
*/

fun main() {
// Signed Integer Data Types
    val byteMin = Byte.MIN_VALUE
    val byteMax = Byte.MAX_VALUE
    val byteSizeInBits = Byte.SIZE_BITS
    val byteSizeInBytes = Byte.SIZE_BYTES

    val shortMin = Short.MIN_VALUE
    val shortMax = Short.MAX_VALUE
    val shortSizeInBits = Short.SIZE_BITS
    val shortSizeInBytes = Short.SIZE_BYTES

    val intMin = Int.MIN_VALUE
    val intMax = Int.MAX_VALUE
    val intSizeInBits = Int.SIZE_BITS
    val intSizeInBytes = Int.SIZE_BYTES

    val longMin = Long.MIN_VALUE
    val longMax = Long.MAX_VALUE
    val longSizeInBits = Long.SIZE_BITS
    val longSizeInBytes = Long.SIZE_BYTES

// UnSigned Integer Data Types
    val ubyteMin = UByte.MIN_VALUE
    val ubyteMax = UByte.MAX_VALUE
    val ubyteSizeInBits = UByte.SIZE_BITS
    val ubyteSizeInBytes = UByte.SIZE_BYTES

    val ushortMin = UShort.MIN_VALUE
    val ushortMax = UShort.MAX_VALUE
    val ushortSizeInBits = UShort.SIZE_BITS
    val ushortSizeInBytes = UShort.SIZE_BYTES

    val uintMin = UInt.MIN_VALUE
    val uintMax = UInt.MAX_VALUE
    val uintSizeInBits = UInt.SIZE_BITS
    val uintSizeInBytes = UInt.SIZE_BYTES

    val ulongMin = ULong.MIN_VALUE
    val ulongMax = ULong.MAX_VALUE
    val ulongSizeInBits = ULong.SIZE_BITS
    val ulongSizeInBytes = ULong.SIZE_BYTES

/*
Type     Size-(bits)     Significant-bits    Exponent-bits   Decimal-digits
-----------------------------------------------------------------------------
Float         32              24                  8               6-7
Double        64              53                  11              15-16
-----------------------------------------------------------------------------
*/
// Floating-Point Data Types
    val floatMin = Float.MIN_VALUE
    val floatMax = Float.MAX_VALUE
    val floatSizeInBits = Float.SIZE_BITS
    val floatSizeInBytes = Float.SIZE_BYTES

    val doubleMin = Double.MIN_VALUE
    val doubleMax = Double.MAX_VALUE
    val doubleSizeInBits = Double.SIZE_BITS
    val doubleSizeInBytes = Double.SIZE_BYTES

// Character Data Type
    val charMin = Char.MIN_VALUE.code // Convert Char to Int for display
    val charMax = Char.MAX_VALUE.code
    val charSizeInBits = Char.SIZE_BITS
    val charSizeInBytes = Char.SIZE_BYTES

// Boolean Data Type
    val booleanTrue = true
    val booleanFalse = false
    val booleanSizeInBits = 8 // Size of Boolean in bits (not explicitly defined in the language)
    val booleanSizeInBytes = 1 // Size of Boolean in bytes (not explicitly defined in the language)
/*
- In Kotlin, the Boolean type represents boolean objects that can have two values: true and false, On the JVM
booleans stored as primitive type: boolean, typically use 8 bits.
*/



// Displaying Information
    displayInfo("Byte", byteMin, byteMax, byteSizeInBits, byteSizeInBytes)
    displayInfo("Short", shortMin, shortMax, shortSizeInBits, shortSizeInBytes)
    displayInfo("Int", intMin, intMax, intSizeInBits, intSizeInBytes)
    displayInfo("Long", longMin, longMax, longSizeInBits, longSizeInBytes)
    displayInfo("UByte", ubyteMin, ubyteMax, ubyteSizeInBits, ubyteSizeInBytes)
    displayInfo("UShort", ushortMin, ushortMax, ushortSizeInBits, ushortSizeInBytes)
    displayInfo("UInt", uintMin, uintMax, uintSizeInBits, uintSizeInBytes)
    displayInfo("ULong", ulongMin, ulongMax, ulongSizeInBits, ulongSizeInBytes)
    displayInfo("Float", floatMin, floatMax, floatSizeInBits, floatSizeInBytes)
    displayInfo("Double", doubleMin, doubleMax, doubleSizeInBits, doubleSizeInBytes)
    displayInfo("Char", charMin, charMax, charSizeInBits, charSizeInBytes)
    displayInfo("Boolean", booleanTrue, booleanFalse, booleanSizeInBits, booleanSizeInBytes)

/*
n this example, we declare a variable obj of type Any and assign it the value "Hello, World!".
We then use reflection to get the type of obj as a string by calling obj::class.simpleName.
The output of this code will be The type of obj is String.
 */
    val obj = "Hello, World!"
    val type = obj::class.simpleName
    println("The type of obj is $type")

}

fun displayInfo(type: String, minValue: Any, maxValue: Any, sizeInBits: Int, sizeInBytes: Int) {
    println("Data Type: $type")
    println("Minimum Value: $minValue")
    println("Maximum Value: $maxValue")
    println("Size in Bits: $sizeInBits bits")
    println("Size in Bytes: $sizeInBytes bytes")
    println("----------------------------")
}
