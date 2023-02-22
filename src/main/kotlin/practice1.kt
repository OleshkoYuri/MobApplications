import java.util.Scanner

fun name(){
    println("Hello! My name is DICT_Bot.")
    val scanner = Scanner(System.`in`)
    println("Please, remind me your name.")
    val yourName = scanner.nextLine()
    println("What a great name you have, $yourName! ")
}
fun age(){
    val scanner = Scanner(System.`in`)
    println("Let me guess your age.")
    println("Enter remainders of dividing your age by 3, 5 and 7.")
    val remainder3 = scanner.nextInt()
    val remainder5 = scanner.nextInt()
    val remainder7 = scanner.nextInt()
    val yourAge = ((remainder3 * 70 + remainder5 * 21 + remainder7 * 15) % 105)
    println("Your age is $yourAge!")
}
fun counter(){
    println("Now I will prove to you that I can count to any number you want.")
    val scanner = Scanner(System.`in`)
    val count = scanner.nextInt()
    for (c in 0..count + 1){
        println("$c!")
        if (c == count)
            break
    }
}
fun test(){
    val scanner = Scanner(System.`in`)
    println("Let's test your programming knowledge.")
    println("Why do we use methods?")
    println("1. To repeat a statement multiple times.")
    println("2. To decompose a program into several small subroutines.")
    println("3. To determine the execution time of a program.")
    println("4. To interrupt the execution of a program.")
    while(true){
        val response = scanner.nextInt()
        if (response != 2){
            println("Please, try again.")
        }
        else{
            println("Completed, have a nice day!")
            println("Congratulations, have a nice day!")
            break
        }
    }
}


fun main(){
    name()
    age()
    counter()
    test()
}