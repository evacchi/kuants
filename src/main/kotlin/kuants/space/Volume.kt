package kuants.space

import kuants.Quantity
import kuants.UnitOfMeasure
import kuants.MetricSystem
import java.math.BigDecimal
import kotlin.math.times

/**
 * Created by evacchi on 29/07/14.
 */

class Volume(override val value: BigDecimal) : Quantity<Volume> {
    class object {
        fun invoke(a: Area, l: Length) = Volume( (a to SquareMeters) * (l to Meters) )
    }

    override val valueUnit = CubicMeters
    override val valueConstructor = CubicMeters

}

trait VolumeUnit : UnitOfMeasure<Volume> {
    override fun invoke(value: BigDecimal) = Volume(value)
}

object CubicMeters : VolumeUnit {
    override val conversionFactor = MetricSystem.Unit
    override val symbol = "m³"
}


object Litres : VolumeUnit {
    override val symbol = "l"
    override val conversionFactor = MetricSystem.Centi
}

object Nanolitres : VolumeUnit {
    override val symbol = "nl"
    override val conversionFactor = Litres.conversionFactor * MetricSystem.Nano
}

object Microlitres : VolumeUnit {
    override val symbol = "µl"
    override val conversionFactor = Litres.conversionFactor * MetricSystem.Micro
}

object Millilitres : VolumeUnit {
    override val symbol = "ml"
    override val conversionFactor = Litres.conversionFactor * MetricSystem.Milli
}

object Centilitres : VolumeUnit {
    override val symbol = "cl"
    override val conversionFactor = Litres.conversionFactor * MetricSystem.Centi
}

object Decilitres : VolumeUnit {
    override val symbol = "dl"
    override val conversionFactor = Litres.conversionFactor * MetricSystem.Deci
}

object Hectolitres : VolumeUnit {
    override val symbol = "hl"
    override val conversionFactor = Litres.conversionFactor * MetricSystem.Hecto
}
