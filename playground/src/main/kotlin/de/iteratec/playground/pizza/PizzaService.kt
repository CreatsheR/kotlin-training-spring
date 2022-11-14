package de.iteratec.playground.pizza

import org.springframework.beans.factory.annotation.Qualifier
import org.springframework.stereotype.Service

@Service
class PizzaService(@Qualifier("jsonPizzaRepository") private val pizzaRepository: PizzaRepository) {
    fun printAll() = println(pizzaRepository.findAll())
}