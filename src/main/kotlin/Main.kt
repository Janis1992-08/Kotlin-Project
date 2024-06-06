package org.example



fun main() {

    println("Hello, World!")

    val n = 10
    val primes = generatePrimes(n)

    println("First $n prime numbers:")
    println(primes)
}

fun generatePrimes(n: Int): List<Int> {
    val primes = mutableListOf<Int>()
    var num = 2

    while (primes.size < n) {
        var isPrime = true
        for (i in 2 until num) {
            if (num % i == 0) {
                isPrime = false
                break
            }
        }
        if (isPrime) {
            primes.add(num)
        }
        num++
    }

    return primes
}


/*
 * Kotlin is a statically typed programming language that runs on the Java Virtual Machine (JVM),
 *  as well as natively on other platforms. It was developed by JetBrains, the creators of IntelliJ IDEA,
 *  as a modern alternative to Java. Kotlin is designed to be fully interoperable with Java,
 *  meaning that Kotlin code can seamlessly call Java code and vice versa.
 *
 *
1. Null Safety: Kotlin has built-in null safety, reducing null pointer exceptions.
2. Extension Functions: Kotlin supports adding functions to existing classes without modifying their source.
3. Data Classes: Kotlin provides data classes for concise data representation.
4. Coroutines: Kotlin offers coroutines for asynchronous and non-blocking programming.
5. Smart Casts: Kotlin's type system includes smart casts, reducing the need for explicit type casting.
6. Range Expressions: Kotlin simplifies range creation and manipulation.
7. String Templates: Kotlin supports string templates for concise string formatting.
8. Functional Programming: Kotlin incorporates functional programming features for more expressive and concise code.
 */
