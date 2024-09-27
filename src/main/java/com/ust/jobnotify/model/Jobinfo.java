package com.ust.jobnotify.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Jobinfo
{
    @Id
    private int JobId;
    @NonNull
    private String Jobtitle;
    private String JobDescription;
    private String Joblocation;
    private String JobSalary;
}
