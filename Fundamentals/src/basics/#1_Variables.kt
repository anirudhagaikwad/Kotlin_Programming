package basics

/*
variable is a storage location identified by a name (an identifier) that is used to store and retrieve data.
Variables are essential for manipulating data in a program.
Kotlin has two types of variables based on their mutability: val & var
    - 'val' is used to declare read-only variables
    - 'var' is used to declare mutable variables
    - Use val when the value is not known until runtime or when the value can vary between instances.
    - To assign a value, use the assignment operator =
    - 'fun' is used to declare a function
    - The main() function is where the program starts execution
    - The body of a function is enclosed within curly braces {}
    - 'println()' and 'print()' functions are used to print their arguments to standard output
    - Kotlin's ability to infer the data type is called type inference.  var value=55
    - const variables are evaluated at compile time, and their values must be the same for all instances and at all times.
    - const can only be used at the top level or in an object declaration.
    - const is not allowed for local variables, function parameters, or properties declared inside classes.

 */

// Declares a compile-time constant.
const val VALUE = 55 //You will notice that there aren't any types declared for variables. Kotlin has inferred the type itself: Int

// Declaring a mutable variable 'variable' with the initial value 500
var variable = 500

// Entry point of the program
fun main() {
    // Declaring a read-only variable 'v' with the value 3
    val v = 3

    // Declaring a mutable variable 'vr' with the initial value 55
    var vr = 55

    // Declaring a read-only variable named 'v1' of type String
    val v1: String = "Hello"

    // Declaring a read-only variable named 'v2' of type Int
    val v2:Int
    v2=33

    // Printing original values
    println("Original value of v = $v")
    println("Original value of vr = $vr")
    println("Original value of const value = $VALUE")
    println("Original value of variable = $variable")
    println("Original value of v1 = $v1")
    println("Original value of v2 = $v2")

    // Uncommenting the following lines will result in compilation errors
    // v = 100 // Val cannot be reassigned
    // value = 100 // Val cannot be reassigned

    // Reassigning the value of mutable variable 'vr'
    vr = 58
    println("Reassigned value of vr = $vr")

    // Reassigning the value of mutable variable 'variable'
    variable = 100
    println("Reassigned value of variable = $variable")

    // Using expressions with variables
    println("Expression Result with value = ${VALUE + 2}")
    println("Expression Result with v = ${v * 2}")
}
