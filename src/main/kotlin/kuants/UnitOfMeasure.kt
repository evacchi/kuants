package kuants

import kuants.space.Length

/**
 * Created by evacchi on 18/07/14.
 */
trait UnitOfMeasure<in T:Quantity<T>> {
    val conversionFactor: Double
    val symbol: String
    fun converterTo(value: Double): Double = value / this.conversionFactor
    fun invoke(value:Double): Quantity<T>
    fun invoke(value:Int) = invoke(value.toDouble())
}
