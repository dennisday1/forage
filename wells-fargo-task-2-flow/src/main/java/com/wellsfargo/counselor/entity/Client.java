package com.wellsfargo.counselor.entity;

public class Client {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long clientId;

    private   String firstName;
    private String lastName;
    private String address;
    private String phone;
    private String email;  


    @ManyToOne
    @JoinColumn(name = "advisorId")
    private Advisor advisor;

    public Client() {}

    // Getters and setters (omitted for brevity)
}
}
