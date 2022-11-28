package de.iteratec.playground.pizza

import org.springframework.boot.context.properties.ConfigurationProperties
import org.springframework.boot.context.properties.ConstructorBinding

@ConstructorBinding
@ConfigurationProperties("pizza.menu")
data class MenuProperties(
    val name: String,
    val version: Int,
    val creationDate: String
)
