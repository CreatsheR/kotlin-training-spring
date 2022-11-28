package de.iteratec.playground.config

import com.fasterxml.jackson.databind.ObjectMapper
import com.fasterxml.jackson.module.kotlin.jacksonObjectMapper
import com.ionspin.kotlin.bignum.serialization.kotlinx.humanReadableSerializerModule
import kotlinx.serialization.json.Json
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.http.converter.json.KotlinSerializationJsonHttpMessageConverter

@Configuration
class JsonConfig {
    @Bean
    fun objectMapper(): ObjectMapper = jacksonObjectMapper()

    @Bean
    fun kotlinConverter() = KotlinSerializationJsonHttpMessageConverter(Json {
        encodeDefaults = false
        prettyPrint = true
        serializersModule = humanReadableSerializerModule
    })
}