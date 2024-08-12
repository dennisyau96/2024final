package org.example.dennis_300378786.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Getter
@Setter
public class Seat {
    private String seatNumber;
    private boolean occupied = false;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;


}
