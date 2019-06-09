package com.nidhi.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpMethod;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
public class HomeController {

    @Autowired
    private NameService nameService;
    @RequestMapping("/nidhi")
    public List<Names> getAllNames(){
        return nameService.getAllNames();
    }


    @RequestMapping(method = RequestMethod.POST,value = "/nidhi")
    public String addName(@RequestBody Names names){

        nameService.addNames(names);
        return "added";

    }

    @RequestMapping("/nidhi/{name}")
    public Names getByName(@PathVariable String name){

        return nameService.getSingleName(name);

    }

    @RequestMapping(method = RequestMethod.DELETE,value = "/nidhi/{name}")
    public String deleteByName(@PathVariable String name){

        return nameService.deleteNames(name);

    }

    @RequestMapping(method = RequestMethod.PUT, value = "/nidhi/{name}")
    public List<Names> updateNames(@PathVariable String name, @RequestParam("idToUpdate") String idToUpdate ){
        return nameService.updateNames(name,idToUpdate);
    }
}
