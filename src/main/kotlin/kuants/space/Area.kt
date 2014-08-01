package kuants.space

import kuants.Quantity
import kuants.UnitOfMeasure
import kuants.MetricSystem

/**
 * Created by evacchi on 29/07/14.
 */
class Area(override val value: Double) : Quantity<Area> {
    class object {
        fun invoke(l1: Length, l2: Length) = Area( (l1 to Meters) * (l2 to Meters) )
    }

    fun times(that: Length): Volume = Volume.invoke(this, that)

    override val valueUnit = SquareMeters
    override val valueConstructor = SquareMeters

}

trait AreaUnit : UnitOfMeasure<Area> {
    override fun invoke(value: Double) = Area(value)
}

object SquareMeters: AreaUnit {
    override val conversionFactor = MetricSystem.Unit
    override val symbol = "m²"
}

object SquareCentimeters: AreaUnit {
    override val conversionFactor = MetricSystem.Centi * MetricSystem.Centi
    override val symbol = "cm²"
}

object SquareKilometers : AreaUnit {
  override val symbol = "km²"
  override val conversionFactor = MetricSystem.Kilo * MetricSystem.Kilo
}
