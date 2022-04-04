package co.edu.sena.YourPcStore.domain;

import javax.persistence.*;

@Entity
@Table(name ="Distribuidor" )
public class Distribuidor {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idDistribuidor;
    @Column(name = "nombres", nullable = false, length = 45)
    private String nombres;
}
