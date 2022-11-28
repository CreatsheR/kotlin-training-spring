package de.iteratec.playground.pizza

import com.ionspin.kotlin.bignum.decimal.BigDecimal
import kotlinx.serialization.Contextual
import kotlinx.serialization.Serializable

interface Pizza {
    val name: String
    val price: BigDecimal
}

@Serializable
data class CheesePizza(
    override val name: String,
    @Contextual override val price: BigDecimal
): Pizza

@Serializable
data class PeperoniPizza(
    override val name: String,
    @Contextual override val price: BigDecimal
): Pizza