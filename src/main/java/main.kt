/**
 * Created by evacchi on 16/07/14.
 */


import kuants.space.Kilometers
import kuants.space.Meters
import kuants.mass.Kilograms


fun main(args: Array<String>) {

    val Meters = Meters
    val Kilometers = Kilometers

    val Kilograms = Kilograms

    val m10 = Meters(10)
    println("${ m10 } = ${ m10 to Kilometers }")

    val numbers = listOf(1,2,3)
    println(numbers.map { " ${Meters(it)} = ${ Meters(it) to Kilometers } "  })

    val mts = Meters(19)
    val km2 = Kilometers(100)
    val kmm = km2 + mts

    //val mkg = Meters(19)+Kilograms(1)
    val kg = Kilograms(100)


    println(listOf(mts, km2, kmm))

}



