package org.example.dennis_300378786;

import org.example.dennis_300378786.entities.Reservation;
import org.example.dennis_300378786.repositories.ReservationRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.Date;

@SpringBootApplication
public class Dennis300378786Application {

    public static void main(String[] args) {
        SpringApplication.run(Dennis300378786Application.class, args);
    }

    @Bean
    CommandLineRunner commandLineRunner(ReservationRepository reservationRepository){
        return args -> {
            reservationRepository.save(new Reservation(null, "Jona Elon", new Date(), "1D"));
            reservationRepository.save(new Reservation(null, "David Elon", new Date(), "1E"));
            reservationRepository.save(new Reservation(null, "Sarah Elon", new Date(), "1C"));
            reservationRepository.save(new Reservation(null, "Musk Elon", new Date(), "1B"));

            reservationRepository.findAll().forEach(r->{
                System.out.println(r.getName());
            });
        };
    }
}
