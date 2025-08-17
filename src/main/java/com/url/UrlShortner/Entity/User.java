package com.url.UrlShortner.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class User {

    @Id
    private Long id;

    @Column(length = 30,nullable = false)
    private String userName;

    @Column(nullable = false)
    private String email;

    @Column(length= 10,nullable = false)
    private String password;


}
