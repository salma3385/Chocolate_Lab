package com.bnta.chocolate.services;

import com.bnta.chocolate.models.Chocolate;
import com.bnta.chocolate.repositories.ChocolateRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ChocolateService {
    @Autowired
    ChocolateRepository chocolateRepository;

    public ChocolateService() {
    }

    public List<Chocolate> getAllChocolate(){
        return chocolateRepository.findAll();
    }
    public Optional<Chocolate> getChocolateById(long id){
        return  chocolateRepository.findById(id);
    }
}
