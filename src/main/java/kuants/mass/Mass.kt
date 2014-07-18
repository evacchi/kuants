package kuants.mass

import kuants.Quantity
import kuants.UnitOfMeasure
import kuants.MetricSystem

/**
 * Created by evacchi on 18/07/14.
 */
class Mass(override val value: Double) : Quantity<Mass> {
    override val valueUnit = Grams
    override val valueConstructor = Grams
    fun invoke(value: Double) = valueConstructor(value)
}

trait MassUnit : UnitOfMeasure<Mass> {
    override fun invoke(value: Double) = Mass(value)
}

object Kilograms: MassUnit {
    override val conversionFactor = MetricSystem.Kilo
    override val symbol = "Kg"
}


object Grams: MassUnit {
    override val conversionFactor = MetricSystem.Unit
    override val symbol = "g"
}