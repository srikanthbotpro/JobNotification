package com.ust.jobnotify.controller;

import com.ust.jobnotify.model.Jobinfo;
import com.ust.jobnotify.service.Jobservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/ust")
public class Jobcontroller
{
    @Autowired
    private Jobservice service;

    @PostMapping("/Addjob")
    public Jobinfo Addjob (@RequestBody Jobinfo i)
    {
        return service.Addjob(i);
    }

    @GetMapping("/Getjob")
    public List<Jobinfo> Getjob()
    {
        return service.Getjob();
    }

    @GetMapping("/Getjob/{id}")
    public Jobinfo Getjobbyid(@PathVariable int id)
    {
        return service.Getjobbyid(id);
    }
    @DeleteMapping("/deletejob/{id}")
    public void deletejobbyid(@PathVariable int id)
    {
         service.deletejobbyid(id);
    }
}
