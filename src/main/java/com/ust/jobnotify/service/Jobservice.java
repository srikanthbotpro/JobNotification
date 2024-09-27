package com.ust.jobnotify.service;

import com.ust.jobnotify.model.Jobinfo;
import com.ust.jobnotify.respo.jobrespo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Jobservice
{
    @Autowired
    private jobrespo repo;

    public Jobinfo Addjob(Jobinfo info)
    {
        return repo.save(info);
    }
    public List<Jobinfo> Getjob()
    {
        return repo.findAll();
    }
    public Jobinfo Getjobbyid(int id)
    {
        return repo.findById(id).orElse(null);
    }

    public void deletejobbyid(int id) {
         repo.deleteById(id);
    }
}
