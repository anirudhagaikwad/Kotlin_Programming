package basics
/*
In Kotlin, type casting is the process of explicitly converting a variable from one type to another.
Kotlin provides two types of type casting:
1) Safe Cast (as?):
val result: TargetType? = sourceValue as? TargetType
The as? operator is used for safe casting. It returns null if the casting is not possible.
It is generally used when you are not sure if the casting will succeed.
2) Unsafe Cast (as):
val result: TargetType = sourceValue as TargetType
The as operator is used for unsafe casting. It throws a ClassCastException if the casting is not possible.
It should be used when you are confident that the casting will always succeed.
3) Smart casts
In most cases, you don't need to use explicit cast operators in Kotlin because the compiler tracks the is-checks
and explicit casts for immutable values and inserts (safe) casts automatically when necessary
- Use the is operator or its negated form !is to perform a runtime check that identifies whether
  an object conforms to a given type
-
 */
fun main(){
// 1) Safe Cast (as?):
    val anyValue: Any = "Hello, Kotlin!"
    val stringValue: String? = anyValue as? String // Safe cast
    if (stringValue != null) {
        println("Length of the stringValue: ${stringValue.length}")
    } else {
        println("Not a string")
    }

// 2) Unsafe Cast (as):
    val stringValue2: String = anyValue as String // Unsafe cast
    println("Length of the stringValue2: ${stringValue2.length}")

// 3) Smart casts
    when (anyValue) {
        is Int -> print("is Int =${anyValue + 1}")
        is String -> print("is String =${anyValue.length}")
        is IntArray -> print("is IntArray= ${anyValue.sum()}")
    }
    val x="hello"
    // x is automatically cast to String on the right-hand side of `||`
    if (x !is String || x.length == 0) return
    // x is automatically cast to String on the right-hand side of `&&`
    if (x is String && x.length > 0) {
        print(x.length) // x is automatically cast to String
    }

/*
As a consequence, smaller types are NOT implicitly converted to bigger types.
This means that assigning a value of type Byte to an Int variable requires an explicit conversion:
- toByte(): Byte
- toShort(): Short
- toInt(): Int
- toLong(): Long
- toFloat(): Float
- toDouble(): Double
*/
    val b: Byte = 1 // OK, literals are checked statically
    // val i: Int = b // ERROR
    val i1: Int = b.toInt()
    val xi = 5 / 2.toDouble()
/*
In many cases, there is no need for explicit conversions because the type is inferred from the context,
and arithmetical operations are overloaded for appropriate conversions, for example
 */
    val l = 1L + 3 // Long + Int => Long
}
/*
It's important to note that using the safe cast (as?) is generally recommended to avoid ClassCastException errors.
Always check the result of the casting for null before using the casted variable.
 */
