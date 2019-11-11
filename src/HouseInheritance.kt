fun main() {
    val rooms = readLine()!!.toInt()
    val price = readLine()!!.toInt()
    val house = when {
        rooms <= 1 -> Cabin(1, price)
        rooms in 2..3 -> Bungalow(rooms, price)
        rooms == 4 -> Cottage(rooms, price)
        rooms in 5..7 -> Mansion(rooms, price)
        else -> Palace(rooms, price)
    }
    println(totalPrice(house))
}

open class House(val rooms: Int, val price: Int) {
    val basePrice = this.rooms * this.price
        get() = when{
            field < 0 -> 0
            field >= 1_000_000 -> 1_000_000
            else -> field
        }
}

class Cabin (rooms: Int, price: Int, val coefficient:Double = 1.0) : House(rooms, price)
class Bungalow (rooms: Int, price: Int, val coefficient:Double = 1.2) : House(rooms, price)
class Cottage (rooms: Int, price: Int, val coefficient:Double = 1.25) : House(rooms, price)
class Mansion (rooms: Int, price: Int, val coefficient:Double = 1.4) : House(rooms, price)
class Palace (rooms: Int, price: Int, val coefficient:Double = 1.6) : House(rooms, price)

fun totalPrice(house: House): Int {
    return (house.basePrice * when(house){
        is Cabin -> house.coefficient
        is Bungalow ->house.coefficient
        is Cottage ->house.coefficient
        is Mansion -> house.coefficient
        is Palace -> house.coefficient
        else -> 1.0
    }).toInt()
}