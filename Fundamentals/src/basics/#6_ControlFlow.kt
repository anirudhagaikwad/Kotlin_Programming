package basics

fun ifExpression(){
    val a = 1
    val b = 2
    var max = a
// if With else
    if (a > b) {
        max = a
    } else {
        max = b
    }

// As expression
    max = if (a > b) a else b

// `else if` in expressions:
    val maxLimit = 1
    val maxOrLimit = if (maxLimit > a) maxLimit else if (a > b) a else b

    /*
    There is no ternary operator condition ? then : else in Kotlin. Instead, if can be used as an expression
    if is an expression: it returns a value
     */
    println(if (a > b) a else b) // Returns a value: 2
}

fun whenExpression(){
/* When
when defines a conditional expression with multiple branches.
It is similar to the switch statement in C-like languages
Use when, when you have a conditional expression with multiple branches.
when can be used either as a statement or as an expression.
Here is an example of using when as a statement:
Place the conditional expression within parentheses () and the actions to take within curly braces {}.
Use -> in each branch to separate each condition from each action.
all branch conditions are checked sequentially until one of them is satisfied.
So only the one suitable branch is executed.
*/
    val x=3
    val s="str"
    val y=5
    when (x) {
        1 -> println("x == 1")
        2 -> println("x == 2")
        else -> {
            println("x is neither 1 nor 2")
        }
    }

// If when is used as an expression, the else branch is mandatory, unless the compiler can detect that all possible cases are covered by the branch conditions.
    val temp = 18
    val description = when {
        // If temp < 0 is true, sets description to "very cold"
        temp < 0 -> "very cold"
        // If temp < 10 is true, sets description to "a bit cold"
        temp < 10 -> "a bit cold"
        // If temp < 20 is true, sets description to "warm"
        temp < 20 -> "warm"
        // Sets description to "hot" if no previous condition is satisfied
        else -> "hot"
    }
    println("description = ${description}")  // warm

// define a common behavior for multiple cases, combine their conditions in a single line with a comma:
        when (x) {
            0, 1 -> println("x == 0 or x == 1")
            else -> println("otherwise")
        }

// check a value for being in or !in a range or a collection:
    val validNumbers = listOf(3, 6, 9)
    when (x) {
        in 1..10 -> println("x is in the range")
        in validNumbers -> println("x is valid")
        !in 10..20 -> println("x is outside the range")
        else -> println("none of the above")
    }
// when can also be used as a replacement for an if-else if chain.
    when {
        x.isOdd() -> print("x is odd")
        y.isEven() -> print("y is even")
        else -> print("x+y is odd")
    }

// checking that a value is or !is of a particular type
    val obj:Any=254L
    when (obj) {                                     // 1
        1 -> println("One")                          // 2
        "Hello" -> println("Greeting")               // 3
        is Long -> println("Long")                   // 4
        !is String -> println("Not a string")        // 5
        else -> println("Unknown")                   // 6
    }
}

fun Int.isOdd(): Boolean {
    return this % 2 != 0
}

fun Int.isEven(): Boolean {
    return this % 2 == 0
}


fun main(){
ifExpression()
whenExpression()
    forLoop1()
    forLoop2()
    forLoop3()
    jumpExpressions_break_continue()
    println("${jumpExpressions_return(5)}")
}

/* Range
The most common way to create a range in Kotlin is to use the .. operator. For example, 1..4 is equivalent to 1, 2, 3, 4.

To declare a range that doesn't include the end value, use the ..< operator. For example, 1..<4 is equivalent to 1, 2, 3.

To declare a range in reverse order, use downTo. For example, 4 downTo 1 is equivalent to 4, 3, 2, 1.

To declare a range that increments in a step that isn't 1, use step and your desired increment value. For example, 1..5 step 2 is equivalent to 1, 3, 5.

You can also do the same with Char ranges:

'a'..'d' is equivalent to 'a', 'b', 'c', 'd'

'z' downTo 's' step 2 is equivalent to 'z', 'x', 'v', 't'

Place the iterator and range within parentheses () with keyword in. Add the action you want to complete within curly braces {}:
*/

/* For Loop
The for loop iterates through anything that provides an iterator. This is equivalent to the foreach loop in languages like C#. The syntax of for is the following:
for (item in collection) print(item)
The body of for can be a block.
for (item: Int in ints) {
    // ...
}
*/

fun forLoop1(){
// create a for loop that iterates over numbers 1 to 5 and prints the number each time.

    for (number in 1..5) {
        // number is the iterator and 1..5 is the range
        print(number) // 12345
    }
}

fun forLoop2() {
//Collections can also be iterated over by loops:
    val cakes = listOf("carrot", "cheese", "chocolate")
    for (cake in cakes) {
        println("Yummy, it's a $cake cake!")
    }
}

fun forLoop3(){
// iterate through an array or a list with an index
    val array = arrayOf("a", "b", "c")
    for (i in array.indices) {
        println(array[i])
    }
    for ((index, value) in array.withIndex()) {
        println("the element at $index is $value")
    }
}

/* While
while and do-while loops execute their body continuously while their condition is satisfied. The difference between them is the condition checking time:
- while checks the condition and, if it's satisfied, executes the body and then returns to the condition check.
- do-while executes the body and then checks the condition. If it's satisfied, the loop repeats. So, the body of do-while executes at least once regardless of the condition.
*/

fun whileLoop(){
    var cakesEaten = 0
    while (cakesEaten < 3) {
        println("Eat a cake")
        cakesEaten++
    }
}

fun doWhileLoop(){
    var cakesEaten = 1
    var cakesBaked = 5
    do {
        println("Bake a cake")
        cakesBaked++
    } while (cakesBaked < cakesEaten)
}

/*
Kotlin has three structural jump expressions:
- return by default returns from the nearest enclosing function or anonymous function.
- break terminates the nearest enclosing loop.
- continue proceeds to the next step of the nearest enclosing loop.
 */

fun jumpExpressions_break_continue(){
    for (i in 1..10) {
        if (i == 5) {
            break
        }
        println("Example break : ${i}")
    }

    for (i in 1..10) {
        if (i % 2 == 0) {
            continue
        }
        println("Example continue : ${i}")
    }
}

fun jumpExpressions_return(x: Int): Int {
    if (x < 0) {
        return 0
    }
    return x * 2
}