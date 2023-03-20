class CoffeeMachine(
    private var water: Int = 400,
    private var milk: Int = 540,
    private var coffeeBeans: Int = 120,
    private var disposableCups: Int = 9,
    private var money: Int = 550){

    private fun makingCoffee(waterNeed: Int, milkNeed: Int, beansNeed: Int, moneyNeed: Int){
        if (water < waterNeed){
            println("Sorry, not enough water!")
        }
        else if (coffeeBeans < beansNeed){
            println("Sorry, not enough coffee beans!")
        }
        else if (milk < milkNeed){
            println("Sorry, not enough coffee beans!")
        }
        else if (disposableCups < 1){
            println("Sorry, not enough disposable cups!")
        }
        else {
            println("I have enough resources, making you a coffee!")
            water -= waterNeed
            coffeeBeans -= beansNeed
            milk -= milkNeed
            disposableCups -= 1
            money += moneyNeed
        }
    }

    fun buy(choice: String){
        when(choice){
            "1" -> makingCoffee(250, 0,16, 4)
            "2" -> makingCoffee(350, 75, 20, 7)
            "3" -> makingCoffee(200, 100, 12, 6)
            "back" -> return
        }
    }

    fun fill(waterAdd: Int, milkAdd: Int, beansAdd: Int,cupsAdd: Int){
        water += waterAdd
        milk += milkAdd
        coffeeBeans += beansAdd
        disposableCups += cupsAdd
    }

    fun take(){
        println("I gave you $money")
        money = 0
    }

    fun remaining(){
        println("The coffee machine has:")
        println("$water of water,")
        println("$milk of milk,")
        println("$coffeeBeans of coffee beans,")
        println("$disposableCups of disposable cups,")
        println("$money of money.")
    }
}

fun main(){
    val machine = CoffeeMachine()
    while (true){
        println("Write action (buy, fill, take, remaining, exit): ")
        when(readln()){
            "buy" -> {
                println("What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino, back - to main menu")
                val choice = readln()
                machine.buy(choice)
            }
            "fill" -> {
                try {
                    println("Write how many ml of water you want to add:")
                    val water = readln().toInt()
                    println("Write how many ml of milk you want to add:")
                    val milk = readln().toInt()
                    println("Write how many grams of coffee beans you want to add:")
                    val coffeeBeans = readln().toInt()
                    println("Write how many disposable coffee cups you want to add:")
                    val disposableCups = readln().toInt()
                    machine.fill(water, milk, coffeeBeans,disposableCups)
                } catch (e: NumberFormatException){
                    println("Invalid input! Please enter a number.")
                }
            }
            "take" -> machine.take()
            "remaining" -> machine.remaining()
            "exit" -> break
        }
    }

}

