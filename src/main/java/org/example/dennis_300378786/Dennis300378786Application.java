package org.example.dennis_300378786;

import org.example.dennis_300378786.entities.Reservation;
import org.example.dennis_300378786.entities.Seat;
import org.example.dennis_300378786.repositories.ReservationRepository;
import org.example.dennis_300378786.repositories.SeatRepository;
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
    CommandLineRunner commandLineRunner(SeatRepository seatRepository) {
        return args -> {
            seatRepository.save(new Seat(null, "1A", false));
            seatRepository.save(new Seat(null, "1B", false));
            seatRepository.save(new Seat(null, "1C", false));
            seatRepository.save(new Seat(null, "1D", false));
            seatRepository.save(new Seat(null, "1E", false));
            seatRepository.save(new Seat(null, "2A", false));
            seatRepository.save(new Seat(null, "2B", false));
            seatRepository.save(new Seat(null, "2C", false));
            seatRepository.save(new Seat(null, "2D", false));
            seatRepository.save(new Seat(null, "2E", false));
            seatRepository.save(new Seat(null, "3A", false));
            seatRepository.save(new Seat(null, "3B", false));
            seatRepository.save(new Seat(null, "3C", false));
            seatRepository.save(new Seat(null, "3D", false));
            seatRepository.save(new Seat(null, "3E", false));
            seatRepository.save(new Seat(null, "4A", false));
            seatRepository.save(new Seat(null, "4B", false));
            seatRepository.save(new Seat(null, "4C", false));
            seatRepository.save(new Seat(null, "4D", false));
            seatRepository.save(new Seat(null, "E", false));
            seatRepository.save(new Seat(null, "5A", false));
            seatRepository.save(new Seat(null, "5B", false));
            seatRepository.save(new Seat(null, "5C", false));
            seatRepository.save(new Seat(null, "5D", false));
            seatRepository.save(new Seat(null, "5E", false));


        };
    }
//    @Bean
//    CommandLineRunner commandLineRunner(ReservationRepository reservationRepository) {
//        return args -> {
//            reservationRepository.save(new Reservation(null, "Jona Elon", new Date(), "1D"));
//            reservationRepository.save(new Reservation(null, "David Elon", new Date(), "1E"));
//            reservationRepository.save(new Reservation(null, "Sarah Elon", new Date(), "1C"));
//            reservationRepository.save(new Reservation(null, "Musk Elon", new Date(), "1B"));
//
//
//            reservationRepository.findAll().forEach(r -> {
//                System.out.println(r.getName());
//            });
//        };
//    }


}
