kuants
======

A Kotlin API for Quantities and Units of Measure inspired by [Squants](http://www.squants.com)

Example:

```kotlin


    val x: Length = Meters(10.0)
    val y: Length = Meters(20.0)
    val z: Length = Meters(30.0)

    val area: Area = x * y
    println(area)

    val volume: Volume = x * y * z
    println(volume)

    println(volume to Litres)

```
