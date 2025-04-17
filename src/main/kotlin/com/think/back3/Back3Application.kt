package com.think.back3

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.cache.annotation.EnableCaching

@SpringBootApplication
@EnableCaching
class Back3Application

fun main(args: Array<String>) {
    runApplication<Back3Application>(*args)
}
