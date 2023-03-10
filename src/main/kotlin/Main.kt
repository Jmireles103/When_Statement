fun main() {

    val number = 8

    val numberString: String = when(number){
        1-> "Uno"
        2-> "Dos"
        3-> "Tres"
        4-> "Cuatro"
        5-> "Cinco"
        6-> "Seis"
        7-> "Siete"
        8-> "Ocho"
        9-> "Nueve"
        10-> "Diez"
        !in 1..10 -> "Out of Range"
        else -> "Unknown"

    }
    println("The number $number translated into spanish is: $numberString")
}