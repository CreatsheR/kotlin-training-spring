package de.iteratec.playground.pizza

import com.ionspin.kotlin.bignum.decimal.BigDecimal
import org.springframework.stereotype.Repository

interface PizzaRepository {
    fun findAll(): List<Pizza>
}

@Repository
class InMemoryPizzaRepository: PizzaRepository {
    private val pizzas = mutableListOf(
        CheesePizza("Margherita", BigDecimal.fromInt(3)),
        PeperoniPizza("Hawaii", BigDecimal.fromInt(666))
    )

    override fun findAll() = pizzas
}