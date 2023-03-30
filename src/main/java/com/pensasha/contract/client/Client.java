package com.pensasha.contract.client;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.*;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Client {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;  
    private String name;
    private String location;
    private String country;
    private String joingDate;
    private String endingDate;
    private String noticeDate;

}
