package com.vsomsekhar.springbootweb.SpringBoot.Web.controllers;

import com.vsomsekhar.springbootweb.SpringBoot.Web.dtos.GamerDTO;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.util.List;

@RestController
public class GamersController {

    @GetMapping("/gamer/{gamerId}")
    public GamerDTO getGamer(@PathVariable(name = "gamerId") Long ID) {
        return new GamerDTO(ID, "Som", LocalDate.of(1111, 11, 1), true);
    }

    @GetMapping("/gamer")
    public List<GamerDTO> getGamers(@RequestParam(name = "isPro", required = false) Boolean isPro) {
        if (isPro != null) {
            return List.of(new GamerDTO(1L, "Som", LocalDate.of(1111, 11, 1), true));
        }
        return List.of(new GamerDTO(1L, "Som", LocalDate.of(1111, 11, 1), true),
                new GamerDTO(2L, "Sekhar", LocalDate.of(1111, 11, 1), true));
    }

}
