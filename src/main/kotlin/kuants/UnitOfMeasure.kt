package kuants

import kuants.space.Length
import java.math.BigDecimal
import kotlin.math.div
import java.math.MathContext
import kotlin.math.times

/**
 * Created by evacchi on 18/07/14.
 */
trait UnitOfMeasure<in T:Quantity<T>> {
    val conversionFactor: BigDecimal
    val symbol: String
    fun converterTo(value: BigDecimal): BigDecimal = this.conversionFactor * value
    fun invoke(value: BigDecimal): Quantity<T>
    fun invoke(value: Double) = invoke(BigDecimal(value))
    fun invoke(value: Int) = invoke(BigDecimal(value))
}
