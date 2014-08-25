package kuants.space

import kuants.UnitOfMeasure
import kuants.Quantity
import kuants.MetricSystem
import java.math.BigDecimal

/**
 * Created by evacchi on 16/07/14.
 */
class Length(override val value: BigDecimal) : Quantity<Length> {
    override val valueUnit = Meters
    override val valueConstructor = Meters
    fun invoke(value: BigDecimal): Length = valueConstructor(value)
    fun times(that: Length): Area = Area.invoke(this, that)
}
trait LengthUnit : UnitOfMeasure<Length> {
    override fun invoke(value: BigDecimal): Length = Length(value)
    override fun invoke(value: Double): Length = Length(BigDecimal(value))
}

object Kilometers: LengthUnit {
    override val conversionFactor = MetricSystem.Kilo
    override val symbol = "km"
}
public object Meters : LengthUnit {
    override val conversionFactor = MetricSystem.Unit
    override val symbol = "m"
}
object Decimeters: LengthUnit {
    override val conversionFactor = MetricSystem.Deci
    override val symbol = "dm"
}
object Centimeters: LengthUnit {
    override val conversionFactor = MetricSystem.Centi
    override val symbol = "cm"
}
object Millimeters: LengthUnit {
    override val conversionFactor = MetricSystem.Milli
    override val symbol = "mm"
}
