package com.example.Shubham.Controller;

import com.example.Shubham.DTO.CollageDto;
import com.example.Shubham.Service.CollageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/clg")
public class CollageController {

    @Autowired


    CollageService collageService;

      @PostMapping("/create")
    public String Add(@RequestBody CollageDto collageDto){

        return collageService.add(collageDto);
    }
}
