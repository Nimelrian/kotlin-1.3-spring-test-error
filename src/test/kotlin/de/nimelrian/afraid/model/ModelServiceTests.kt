package de.nimelrian.afraid.model

import org.assertj.core.api.Assertions.*
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.test.context.junit.jupiter.SpringExtension

@ExtendWith(SpringExtension::class)
@SpringBootTest
class ModelServiceTests {

    @Autowired
    private lateinit var service: ModelService

    @Test
    fun contextLoads() {
        assertThat(service.message()).isEqualTo("Hello World")
    }

    @SpringBootApplication
    internal class TestConfiguration
}
