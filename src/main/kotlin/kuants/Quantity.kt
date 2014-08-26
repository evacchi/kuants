package kuants

import java.math.BigDecimal
import kotlin.math.minus
import kotlin.math.times
import kotlin.math.plus
import kuants.space.Length

/**
 * Created by evacchi on 18/07/14.
 */
trait Quantity<T : Quantity<T>> {
    val value: BigDecimal
    val valueConstructor: UnitOfMeasure<T>
    val valueUnit: UnitOfMeasure<T>

    fun invoke(value: BigDecimal) = valueConstructor(valueConstructor.conversionFactor * value)
    fun to(u: UnitOfMeasure<T>): BigDecimal = u.converterTo(value)

    override fun toString() = "${value} ${valueUnit.symbol}"
    fun plus(that: Quantity<T>): Quantity<T> = valueUnit(this.value + that.value)
    fun minus(that: Quantity<T>): Quantity<T> = valueUnit(this.value - that.value)
    fun times(scalar: Double): Quantity<T> = valueUnit(this.value * BigDecimal(scalar))
}
