import java.util.Scanner
fun task1(){
    val scanner = Scanner(System.`in`)
    val num = scanner.nextInt()
    if (num % 2 == 0) println("Even") else println("Odd")
}

fun task2(){
    val scanner = Scanner(System.`in`)
    val num = scanner.nextInt()
    if (num % 2 == 0) println(num * 4) else println(num * 5)
}

fun task3(){
    val scanner = Scanner(System.`in`)
    val num = scanner.nextInt()
    println(-num)
}

fun task4(){
    val scanner = Scanner(System.`in`)
    val year = scanner.nextInt()
    println(2023 - year)
}

fun task5(){
    val scanner = Scanner(System.`in`)
    val num = scanner.nextLine()
    val numbers = num.split(" ").map{it.toInt()}.toIntArray()
    var min = numbers[0]
    for (n in numbers){
        if(n < min) min = n
    }
    println(min)
}

fun task6(){
    val scanner = Scanner(System.`in`)
    val num = scanner.nextLine()
    val numbers = num.split(" ").map{it.toInt()}.toIntArray()
    var firstLargest = Int.MIN_VALUE
    var secondLargest = Int.MIN_VALUE
    for (n in numbers){
        if(n > firstLargest) {
            secondLargest = firstLargest
            firstLargest = n
        } else if(n > secondLargest) secondLargest = n
    }
    println(listOf(secondLargest, firstLargest))
}

fun task7(){
    val scanner = Scanner(System.`in`)
    val num = scanner.nextLine()
    val numbers = num.split(" ").map{it.toInt()}.toIntArray()
    if (numbers == null || numbers.isEmpty()) println(intArrayOf())
    var positiveCount = 0
    var negativeSum = 0
    for (n in numbers) {
        if (n > 0) positiveCount++ else negativeSum += n
    }
    println(arrayListOf(positiveCount, negativeSum))
}

fun task8(){
    val scanner = Scanner(System.`in`)
    val string = scanner.nextLine()
    val str = string.toCharArray()
    val vowels = setOf('a', 'e', 'i', 'o', 'u', 'y')
    var n = 0
    for (i in str) if (i in vowels) n++
    println(n)
}

fun task9(){
    val scanner = Scanner(System.`in`)
    val string = scanner.nextLine()
    val middle = string.length / 2
    if (string.length % 2 == 0) println(string.substring(middle -1, middle +1))
    else println(string.substring(middle, middle +1))
    println()
}

fun task10():Array<IntArray>{
    val scanner = Scanner(System.`in`)
    val num = scanner.nextInt()
    val table = Array(num) {IntArray(num)}
    for (i in 0 until num){
        for (j in 0 until num) table[i][j] = (i + 1) * (j + 1)
    }
    return table
}
fun main(){
    println("Enter an even or odd number (task 1):")
    task1()
    println()
    println("Enter an even or odd number (task 2):")
    task2()
    println()
    println("Enter a positive number (task 3):")
    task3()
    println()
    println("Enter your year of birth (task 4):")
    task4()
    println()
    println("Enter an array of integers (task 5):")
    task5()
    println()
    println("Enter an array of integers (task 6):")
    task6()
    println()
    println("Enter an array of integers (task 7):")
    task7()
    println()
    println("Enter a string (task 8):")
    task8()
    println()
    println("Enter a string (task 9):")
    task9()
    println()
    println("Enter the size of the multiplication matrix (task 10):")
    println(task10().contentDeepToString())
}