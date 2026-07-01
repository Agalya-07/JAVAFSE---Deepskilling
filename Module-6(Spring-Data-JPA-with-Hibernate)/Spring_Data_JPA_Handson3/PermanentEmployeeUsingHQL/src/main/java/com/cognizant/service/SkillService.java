package com.cognizant.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cognizant.entity.Skill;
import com.cognizant.repository.SkillRepository;

@Service
public class SkillService {

    @Autowired
    private SkillRepository repo;

    public List<Skill> getAll() {
        return repo.findAll();
    }
}