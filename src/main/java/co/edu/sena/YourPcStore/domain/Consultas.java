package co.edu.sena.YourPcStore.domain;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "Consultas")
public class Consultas {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idConsultas;
    @Column(name = "precio", nullable = false, length = 11)
    private double precio;
    @Column(name = "fecha", nullable = false)
    private LocalDateTime fecha;
}
