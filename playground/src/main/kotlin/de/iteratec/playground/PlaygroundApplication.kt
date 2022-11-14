package de.iteratec.playground

import org.springframework.boot.CommandLineRunner
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration
import org.springframework.boot.runApplication

@SpringBootApplication(exclude = [DataSourceAutoConfiguration::class])
class PlaygroundApplication: CommandLineRunner {
    override fun run(vararg args: String?) {
        println("Hello Spring!")
    }
}

fun main(args: Array<String>) {
    runApplication<PlaygroundApplication>(*args)
}
