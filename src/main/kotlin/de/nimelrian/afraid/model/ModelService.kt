package de.nimelrian.afraid.model

import org.springframework.stereotype.Service

@Service
class ModelService {
    fun message(): String {
        return "Hello World"
    }
}

