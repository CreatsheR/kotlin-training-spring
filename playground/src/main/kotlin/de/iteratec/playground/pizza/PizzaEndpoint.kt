package de.iteratec.playground.pizza

import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/pizza")
class PizzaEndpoint(private val pizzaService: PizzaService) {

    @GetMapping
    fun getAll(): List<Pizza> = pizzaService.getAll()
}