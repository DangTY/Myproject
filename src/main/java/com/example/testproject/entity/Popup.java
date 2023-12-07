package com.example.testproject.entity;

import jakarta.persistence.*;
import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
@Getter
@Setter
public class Popup {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long popupNum;

    @Column(name = "productNum")
    private Long productNum;

    @Column(name = "popupCount")
    private int popupCount;
}
