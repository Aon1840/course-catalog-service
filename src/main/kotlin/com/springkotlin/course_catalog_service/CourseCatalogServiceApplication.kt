package com.springkotlin.course_catalog_service

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class CourseCatalogServiceApplication

fun main(args: Array<String>) {
	runApplication<CourseCatalogServiceApplication>(*args)
}
