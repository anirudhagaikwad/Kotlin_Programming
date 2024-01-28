package basics
/*
- Operators are symbols that perform specific operation on one,two or three operands and then return result
    1) Arithmetic Operators: These operators perform basic mathematical operations on numeric values.
        + (addition)
        - (subtraction)
        * (multiplication)
        / (division)
        % (modulo)
    2) Assignment Operators: These operators assign a value to a variable.
        = (simple assignment)
        += (addition assignment)
        -= (subtraction assignment)
        *= (multiplication assignment)
        /= (division assignment)
        %= (modulo assignment)
    3) Comparison Operators: These operators compare two values and return a Boolean result.
        == (equality)
        != (inequality)
        < (less than)
        > (greater than)
        <= (less than or equal to)
        >= (greater than or equal to)
    4) Logical Operators: These operators perform logical operations on Boolean values.
        && (logical AND)
        || (logical OR)
        ! (logical NOT)
    5) Unary Operators:
        + (unary plus)
        - (unary minus)
        ++ (increment)
        -- (decrement)
        ! (logical NOT)
    6) Bitwise Operators: These operators perform bit-level operations on integers.
        and (bitwise AND)
        or (bitwise OR)
        xor (bitwise XOR)
        inv (bitwise inversion)
        shl (left shift)
        shr (right shift)
        ushr (unsigned right shift)
7) Range Operator : `..`. This operator is used to create a range of values.
   For example, `1..10` creates a range of values from 1 to 10.
8) In Operator : `in`. This operator is used to check whether a value belongs to a range,
   a collection, or another entity that defines a 'contains' method.
   For example, `x in 1..10` checks whether `x` is between 1 and 10.
9) Not In Operator : `!in`. This operator is used to check whether a value does not belong to a range,
   a collection, or another entity that defines a 'contains' method.
   For example, `x !in 1..10` checks whether `x` is not between 1 and 10.
10) Elvis Operator : `?:`. This operator is used to provide a default value when a nullable variable is null.
    For example, `val result = nullableVariable ?: defaultValue` assigns `defaultValue` to `result` if `nullableVariable` is null.
11) Safe Call Operator: `?.`. This operator is used to safely call a method or property on a nullable object.
    For example, `nullableObject?.method()` calls `method()` on `nullableObject` if it is not null, and returns null otherwise.

*/
fun main(){
//Arithmetic Operators:
    val a = 10
    val b = 3
    val sum = a + b  // sum = 13
    val difference = a - b // difference = 7
    val product = a * b // product = 30
    val quotient = a / b // quotient = 3
    val remainder = a % b // remainder = 1

    val x = 5 / 2 //Division between integers numbers always returns an integer number. Any fractional part is discarded
    //println(x == 2.5) // ERROR: Operator '==' cannot be applied to 'Int' and 'Double'
    println(x == 2) // true

//Assignment Operators:
    var xAssignment = 10
    var yAssignment = 5
    xAssignment += yAssignment // equivalent to xAssignment = xAssignment + yAssignment. xAssignment = 15
    xAssignment -= yAssignment // equivalent to xAssignment = xAssignment - yAssignment. xAssignment = 10
    xAssignment *= yAssignment // equivalent to xAssignment = xAssignment * yAssignment. xAssignment = 50
    xAssignment /= yAssignment // equivalent to xAssignment = xAssignment / yAssignment. xAssignment = 10
    xAssignment %= yAssignment // equivalent to xAssignment = xAssignment % yAssignment. xAssignment = 0

//Comparison Operators:
    val xComparison = 5
    val yComparison = 8
    val isEqual = xComparison == yComparison // false
    val isNotEqual = xComparison != yComparison // true
    val isLessThan = xComparison < yComparison // true
    val isGreaterThan = xComparison > yComparison // false
    val isLessThanOrEqual = xComparison <= yComparison // true
    val isGreaterThanOrEqual = xComparison >= yComparison // false

//Logical Operators:
    val condition1 = true
    val condition2 = false
    val resultAND = condition1 && condition2 // false
    val resultOR = condition1 || condition2 // true

//Unary Operators:
    var aUnry = 5
    var bUnry = -aUnry // bUnry = -5
    var cUnry = +aUnry // cUnry = 5
    aUnry++ // aUnry = 6
    bUnry-- // bUnry = -6
    val isTrue = !condition1 // false

//Bitwise Operators:
    val xBit = 0b1100 //12
    val yBit = 0b1010 //10
    println("xbit = ${xBit}")
    println("ybit = ${yBit}")
/*
and
This operator returns 1 if both the operands are 1 or else it returns 0.
A	B	A & B
0	0	  0
0	1	  0
1	0	  0
1	1	  1
*/
    val resultAnd = xBit and yBit // resultAnd = 0b1000  (1100 and 1010 = 1000)   (12 and 10 = 8)


/*
or
This operator returns 1 if either of the bits in the operand is 1, else it returns 0.
A	B	A | B
0	0	  0
0	1	  1
1	0	  1
1	1	  1
*/
    val resultOr = xBit or yBit // resultOr = 0b1110  (1100 or 1010 = 1110 )   (12 or 10 = 14)

/*
xor
This operator returns 1 if the corresponding bits are different, else it returns 0.
If both the operators are 0 or if both of them are 1 then the result is 0.
A	B	A ^ B
0	0	  0
0	1	  1
1	0	  1
1	1	  0
*/
    val resultXor = xBit xor yBit // resultXor = 0b0110  (1100 xor 1010 = 1110 )   (12 xor 10 = 6)
    println("reult XOR = ${resultXor}")

/*
inv
This operator inverts all the bits of its operands. It is denoted by the function inv().
It inverts the bits of the number, which means that it changes all 0s to 1s and all 1s to 0s .
- Choosing the number of bits depends on the requirements of the application.
  In modern computers, 16, 32, or 64 bits are commonly used for representing integers,
  depending on the architecture and the specific needs of the system
- Larger bit sizes provide a wider range of representable values but
  also require more storage space and processing power.
- 4 bits: With 4 bits, you can represent unsigned integers from 0 to 15. In the case of 2's complement, you can represent signed integers from -8 to 7.
- 16 bits: With 16 bits, you can represent a much larger range of values. For unsigned integers,
  it goes from 0 to 65535.
  In 2's complement, you can represent signed integers from -32768 to 32767.
- 32 bits: With 32 bits, you can represent unsigned integers from 0 to 4,294,967,295.
  In the case of 2's complement, you can represent signed integers from approximately -2,147,483,648 to 2,147,483,647.
- 64 bits: With 64 bits, you can represent unsigned integers from 0 to 18,446,744,073,709,551,615. In 2's complement,
  you can represent signed integers from approximately -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807.
*/
    val resultInv = xBit.inv() // resultInv = -13   0000 0000 0000 0000 0000 0000 0000 1100 inverts 11111111111111111111111111110011
    println("resultInv = ${resultInv}") // Decimal from signed 2's complement -13
    println("type is ${resultInv::class.simpleName}")


/*
shl
left shift operator.
It shifts the bits of a number to the left by a specified number of positions.
The leftmost bits are discarded, and zero bits are shifted into the low-order positions 1.
- In the code, xBit is assigned the value of 0b1100,
  which is equivalent to 12 in decimal notation.
  When we apply the shl operator to xBit with an argument of 1,
  it shifts the bits of xBit to the left by one position.
  The result is 0b11000, which is equivalent to 24 in decimal notation 1
 */
    val resultShl = xBit shl 1 // resultShl = 0b11000
    println("resultShl = ${resultShl}")

/*
shr
operator is a signed right shift operator.
It shifts the bits of a number to the right by a specified number of positions.
The rightmost bits are discarded, and the leftmost bits are filled with copies of the sign bit (the most significant bit)
of the original number 1.
- In the code, xBit is assigned the value of 0b1100, which is equivalent to 12 in decimal notation.
  When we apply the shr operator to xBit with an argument of 1,
  it shifts the bits of xBit to the right by one position. The result is 0b0110, which is equivalent to 6
 */
    val resultShr = xBit shr 1 // resultShr = 0b0110
    println("resultShr = ${resultShr}") //6

/*
ushr
unsigned right shift operator. It shifts the bits of a number to the right by a specified number of positions.
The rightmost bits are discarded, and zero bits are shifted into the high-order positions 1.
- In the code you provided, xBit is assigned the value of 0b1100, which is equivalent to 12 in decimal notation.
  When we apply the ushr operator to xBit with an argument of 1, it shifts the bits of xBit to the right by one position.
  The result is 0b0110, which is equivalent to 6 in decimal notation 1.
 */
    val resultUshr = xBit ushr 1 // resultUshr = 0b0110


// Range Operator
    val range = 1..10
    println(range) // prints "1..10"

// In Operator
    val xx = 5
    if (xx in 1..10) {
        println("$xx is between 1 and 10")
    } else {
        println("$xx is not between 1 and 10")
    }

// Not In Operator
    val y = 15
    if (y !in 1..10) {
        println("$y is not between 1 and 10")
    } else {
        println("$y is between 1 and 10")
    }

// Elvis Operator
    val nullableVariable: String? = null
    val result = nullableVariable ?: "default value"
    println(result) // prints "default value"

// Safe Call Operator
    val nullableObject: String? = null
    val length = nullableObject?.length
    println(length) // prints "null"

}