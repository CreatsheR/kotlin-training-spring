package de.iteratec.playground.pizza

import org.springframework.stereotype.Service

@Service
class PizzaService(
    private val pizzaRepository: PizzaRepository,
    private val menuProperties: MenuProperties
) {
    fun printAll() {
        println(menuProperties)
        println(pizzaRepository.findAll())
    }

    fun getAll() = pizzaRepository.findAll()
}