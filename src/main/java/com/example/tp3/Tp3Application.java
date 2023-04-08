package com.example.tp3;

import com.example.tp3.entities.Patient;
import com.example.tp3.repositories.PatientRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.Date;

@SpringBootApplication
public class Tp3Application {

    public static void main(String[] args) {
        SpringApplication.run(Tp3Application.class, args);
    }

    @Bean
    CommandLineRunner commandLineRunner(PatientRepository patientRepository){
         return args -> {
            patientRepository.save(new Patient(null, "marouane",new Date(), Math.random()>0.5,(int) (Math.random()*100)));
            patientRepository.save(new Patient(null, "adam",new Date(), Math.random()>0.5,(int) (Math.random()*100)));
            patientRepository.save(new Patient(null, "aya",new Date(), Math.random()>0.5,(int) (Math.random()*100)));
            patientRepository.save(new Patient(null, "houssam",new Date(), Math.random()>0.5,(int) (Math.random()*100)));

            patientRepository.findAll().forEach(p->
                    System.out.println(p.getNom() ));
         };
    }

}
