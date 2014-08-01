package kuants

/**
 * Created by evacchi on 18/07/14.
 */
trait Quantity<T : Quantity<T>> {
    val value: Double
    val valueConstructor: UnitOfMeasure<T>
    val valueUnit: UnitOfMeasure<T>

    fun to(u: UnitOfMeasure<T>): Double = u.converterTo(value)

    override fun toString() = "${value} ${valueUnit.symbol}"
    fun plus(that: Quantity<T>): Quantity<T> = valueUnit(this.value + that.value)
    fun minus(that: Quantity<T>): Quantity<T> = valueUnit(this.value - that.value)
    fun times(scalar: Double): Quantity<T> = valueUnit(this.value * scalar)
}
