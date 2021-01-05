package com.kazakago.ktor_starter

import io.ktor.application.*
import io.ktor.response.*
import io.ktor.routing.*

fun Application.module() {
    install(Routing) {
        get("/") {
            call.respond("Hello world from Ktor!")
        }
    }
}
