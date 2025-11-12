package com.springforgame.springboota3.Controller;


import com.springforgame.springboota3.Model.Names;
import com.springforgame.springboota3.Service.NamesService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1/names")
public class NamesController {
    private NamesService namesService;

    public NamesController(NamesService namesService) {
        this.namesService = namesService;
    }

    @GetMapping
    public List<Names> getNamesService() {
        return namesService.getAllNames();
    }

    @GetMapping("{id}")
    public Names getNames(@PathVariable int id){
        return namesService.getNamesById(id);
    }

}
