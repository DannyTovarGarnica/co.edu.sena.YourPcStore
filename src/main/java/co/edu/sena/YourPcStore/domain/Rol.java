package co.edu.sena.YourPcStore.domain;

import javax.persistence.*;

@Entity
@Table (name = "rol")
public class Rol {

    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private long idRol;
    @Column(name = "rol", nullable = false, length = 45)
    private String rol;
}
