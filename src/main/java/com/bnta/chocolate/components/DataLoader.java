package com.bnta.chocolate.components;

import com.bnta.chocolate.models.Chocolate;
import com.bnta.chocolate.models.Estate;
import com.bnta.chocolate.repositories.ChocolateRepository;
import com.bnta.chocolate.repositories.EstateRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class DataLoader implements ApplicationRunner {

    @Autowired
    ChocolateRepository chocolateRepository;

    @Autowired
    EstateRepository estateRepository;

    @Override
    public void run(ApplicationArguments args) throws Exception {

        Estate ghanaianEstate = new Estate("Ghanaian Estate", "Ghana");
        estateRepository.save(ghanaianEstate);
        Estate colombianEstate = new Estate("Colombian Estate", "Colombia");
        estateRepository.save(colombianEstate);
        Estate nigerianEstate = new Estate("Nigerian Estate", "Nigeria");
        estateRepository.save(nigerianEstate);

        Chocolate darkChocolate = new Chocolate("Dark Chocolate", 80, ghanaianEstate);
        chocolateRepository.save(darkChocolate);
        Chocolate milkChocolate = new Chocolate("Milk Chocolate", 60, colombianEstate);
        chocolateRepository.save(milkChocolate);
        Chocolate whiteChocolate = new Chocolate("White Chocolate", 20, nigerianEstate);
        chocolateRepository.save(whiteChocolate);
        Chocolate hazelnutChocolate = new Chocolate("Hazelnut Chocolate", 65, ghanaianEstate);
        chocolateRepository.save(hazelnutChocolate);
        Chocolate caramelChocolate = new Chocolate("Caramel Chocolate", 50, ghanaianEstate);
        chocolateRepository.save(caramelChocolate);
        Chocolate orangeChocolate = new Chocolate("Orange Chocolate", 55, colombianEstate);
        chocolateRepository.save(orangeChocolate);

    }

}
