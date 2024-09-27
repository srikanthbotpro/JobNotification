package com.ust.jobnotify.respo;

import com.ust.jobnotify.model.Jobinfo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface jobrespo extends JpaRepository<Jobinfo,Integer> {
}
