/**
 * Created by evacchi on 16/07/14.
 */


import kuants.space.Kilometers
import kuants.space.Meters
import kuants.mass.Kilograms
import kuants.space.Length
import kuants.Quantity
import kuants.space.Area
import kuants.space.Volume
import kuants.space.Litres


class MioItem : Item {

    event fun onClick() {

        val m = Meters(10.0)

    }


}









trait Item
annotation class event
fun Meters(value:Double) = Meters.invoke(value)

fun main(args: Array<String>) {

    /*
      questo è per via di un bug che non dovrebbe essere necessario
      aggirare
     */
    // ------
    val Meters = Meters
    val Kilometers = Kilometers
    val Kilograms = Kilograms
    // ------


    val m10 = Meters(10)
    println("${ m10 } = ${ m10 to Kilometers }")

    val numbers = listOf(1, 2, 3)
    println(numbers.map { " ${Meters(it)} = ${ Meters(it) to Kilometers } " })

    val mts = Meters(19)
    val km2 = Kilometers(100)
    val kmm = km2 + mts

    //val mkg = Meters(19)+Kilograms(1)


    val x: Length = Meters(10.0)
    val y: Length = Meters(20.0)
    val z: Length = Meters(30.0)

    val area: Area = x * y
    println(area)

    val volume: Volume = x * y * z
    println(volume)

    println(volume to Litres)
}
