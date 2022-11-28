package de.iteratec.playground

import de.iteratec.playground.pizza.PizzaService
import org.springframework.boot.CommandLineRunner
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.context.properties.ConfigurationPropertiesScan
import org.springframework.boot.runApplication

@SpringBootApplication
@ConfigurationPropertiesScan
class PlaygroundApplication(private val pizzaService: PizzaService): CommandLineRunner {
    override fun run(vararg args: String?) {
        pizzaService.printAll()
    }
}

fun main(args: Array<String>) {
    runApplication<PlaygroundApplication>(*args)
}
