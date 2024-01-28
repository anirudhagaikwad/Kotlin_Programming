package basics
/*
 - Literal is a notation for representing a fixed value in source code.
   It directly denotes a specific value rather than representing it as a variable or an expression.
   Literals are used to initialize variables or provide constant values within the code.

There are the following kinds of literal constants for integral values:
1) Signed integers literals
- Binaries: 0b00001011
Octal literals are not supported in Kotlin.
- Decimals: 123
- Hexadecimals: 0x0F
- Longs are tagged by a capital L: 123L

2) Unsigned integers literals
To make unsigned integers easier to use,
- Kotlin provides an ability to tag an integer literal with a suffix indicating a specific unsigned type (similarly to Float or Long):
- u and U tag is for unsigned literals. The exact type is determined based on the expected type.
  If no expected type is provided, compiler will use UInt or ULong depending on the size of literal
- uL and UL explicitly tag literal as unsigned long

3) Kotlin also supports a conventional notation for floating-point numbers:
- Doubles by default: 123.5, 123.5e10
- Floats are tagged by Suffix f or F: 123.5f
- In the context of a floating-point literal like `123.5e10`, the `e` represents the exponent in scientific notation.
  The `e` stands for "exponent" and indicates that the number should be multiplied by 10 raised to the power of
  the following value.

In the example `123.5e10`:

- `123.5` is the significand or mantissa.
- `e` denotes the exponent.
- `10` is the exponent value.

So, `123.5e10` is equivalent to 123.5 * 10^10, or 123,500,000,000. It's a concise way to represent very large
or very small numbers using scientific notation.
The `e` is a common notation in many programming languages for expressing numbers in this form.

4) Character Literals:
- Enclosed in single quotes, e.g., 'A', '9'.
-Special characters start from an escaping backslash \. The following escape sequences are supported:
------------------------------------------------------------------------------------------------------
\t – tab        \b – backspace      \n – new line (LF)      \r – carriage return (CR)

\' – single quotation mark      \" – double quotation mark      \\ – backslash      \$ – dollar sign
-------------------------------------------------------------------------------------------------------
- To encode any other character, use the Unicode escape sequence syntax: '\uFF00'.

5) Boolean Literals:
- boolean objects that can have two values: true and false.

6) String Literals
- Kotlin has two types of string literals:
    - Escaped strings : val s = "Hello, world!\n"
    - Multiline strings : val text = """
                                        for (c in "foo")
                                        print(c)
                                     """
7) Null Literal:
- null represents the absence of a value : val nullableValue: String? = null

8) Array Literals:
- A way to initialize arrays : val intArray = intArrayOf(1, 2, 3, 4, 5)

*/


fun main() {
//Signed integers literals

    // Underscores for better readability in large numbers
     val oneMillion = 1_000_000
     val creditCardNumber = 1234_5678_9012_3456L
     val socialSecurityNumber = 999_99_9999L
     val hexBytes = 0xFF_EC_DE_5E
     val bytes = 0b11010010_01101001_10010100_10010010

//Unsigned integers literals
    val b: UByte = 1u  // UByte, expected type provided
    val s: UShort = 1u // UShort, expected type provided
    val l: ULong = 1u  // ULong, expected type provided
    val a1 = 42u // UInt: no expected type provided, constant fits in UInt
    val a2 = 0xFFFF_FFFF_FFFFu // ULong: no expected type provided, constant doesn't fit in UInt
    val a = 1UL // ULong, even though no expected type provided and constant fits into UInt

//floating-point Literals
    val doubleLiteral1 = 123.5
    val doubleLiteral2 = 123.5e10
    val floatLiteral = 123.5f

// Character Literals
    val aChar: Char = 'a'
    val bChar:Char='\r'
    val cChar:Char='\uFF00'

//Boolean Literal
val boolVar: Boolean =true

// String Literal
    val str = "Hello, world!\n"
    val text = """
    for (c in "foo")
        print(c)
    """

/*
Multiline strings can contain newlines and arbitrary text. It is delimited by a triple quote """ ,
contains no escaping and can contain newlines and any other characters:
To remove leading whitespace from multiline strings, use the trimMargin() function:

val text = """
    |Tell me and I forget.
    |Teach me and I remember.
    |Involve me and I learn.
    |(Benjamin Franklin)
    """.trimMargin()
By default, a pipe symbol | is used as margin prefix,
but you can choose another character and pass it as a parameter, like trimMargin(">").
*/

// Array Literal :
    val intArray = intArrayOf(1, 2, 3, 4, 5)

// Print the values to demonstrate the literals

    println("Signed Integers Literals:")
    println("oneMillion: $oneMillion")
    println("creditCardNumber: $creditCardNumber")
    println("socialSecurityNumber: $socialSecurityNumber")
    println("hexBytes: $hexBytes")
    println("bytes: $bytes")

    println("\nUnsigned Integers Literals:")
    println("b: $b")
    println("s: $s")
    println("l: $l")
    println("a1: $a1")
    println("a2: $a2")
    println("a: $a")

    println("\nFloating-Point Literals:")
    println("doubleLiteral1: $doubleLiteral1")
    println("doubleLiteral2: $doubleLiteral2")
    println("floatLiteral: $floatLiteral")

    println("\nCharacter Literals:")
    println("aChar: $aChar")
    println("bChar: $bChar")
    println("cChar: $cChar")

    println("\nBoolean Literal:")
    println("boolVar: $boolVar")

    println("\nString Literal:")
    println("str: $str")
    println("text: $text")

    println("\nArray Literal:")
    println("array hash code : ${intArray.hashCode()}")

}
