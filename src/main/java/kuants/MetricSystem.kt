package kuants

/**
 * Created by evacchi on 18/07/14.
 */
object MetricSystem {
    val Milli = .001
    val Centi = .01
    val Deci  = .1

    val Micro = .001 * Milli
    val Nano  = .001 * Micro
    val Pico  = .001 * Nano
    val Femto = .001 * Pico
    val Atto  = .001 * Femto
    val Zepto = .001 * Atto
    val Yocto = .001 * Zepto

    val Unit = 1.0

    val Deca  = 10.0
    val Hecto = 100.0
    val Kilo  = 1000.0
    val Mega  = 1000.0 * Kilo
    val Giga  = 1000.0 * Mega
    val Tera  = 1000.0 * Giga
    val Peta  = 1000.0 * Tera
    val Exa   = 1000.0 * Peta
    val Zetta = 1000.0 * Exa
    val Yotta = 1000.0 * Zetta
}
