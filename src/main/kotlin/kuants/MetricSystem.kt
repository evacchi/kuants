package kuants

import java.math.BigDecimal
import kotlin.math.times

/**
 * Created by evacchi on 18/07/14.
 */
object MetricSystem {
    val Milli = BigDecimal(".001")
    val Centi = BigDecimal(".01")
    val Deci  = BigDecimal(".1")

    val Micro = Milli * Milli
    val Nano  = Milli * Micro
    val Pico  = Milli * Nano
    val Femto = Milli * Pico
    val Atto  = Milli * Femto
    val Zepto = Milli * Atto
    val Yocto = Milli * Zepto

    val Unit = BigDecimal(1)

    val Deca  = BigDecimal(10)
    val Hecto = BigDecimal(100)
    val Kilo  = BigDecimal(1000)
    val Mega  = Kilo * Kilo
    val Giga  = Kilo * Mega
    val Tera  = Kilo * Giga
    val Peta  = Kilo * Tera
    val Exa   = Kilo * Peta
    val Zetta = Kilo * Exa
    val Yotta = Kilo * Zetta
}
