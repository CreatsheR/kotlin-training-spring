package de.iteratec.playground.pizza

import com.fasterxml.jackson.databind.ObjectMapper
import com.fasterxml.jackson.module.kotlin.readValue
import org.springframework.core.io.ClassPathResource
import org.springframework.stereotype.Repository

interface PizzaRepository {
    fun findAll(): List<Pizza>
}

@Repository
class InMemoryPizzaRepository: PizzaRepository {
    private val pizzas = listOf(
        Pizza("Margherita", 1),
        Pizza("Hawaii", 666)
    )

    override fun findAll() = pizzas
}

@Repository
class JsonPizzaRepository(val objectMapper: ObjectMapper): PizzaRepository {
    override fun findAll(): List<Pizza> = objectMapper.readValue(ClassPathResource("pizza-list.json").inputStream)
}