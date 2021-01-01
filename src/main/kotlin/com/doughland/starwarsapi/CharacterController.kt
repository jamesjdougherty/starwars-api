package com.doughland.starwarsapi

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class CharacterController {

    @GetMapping("api/v1/characters")
    fun getCharacterInfo(): String {
        return "Starwars character info coming soon ..."
    }
}