package co.edu.sena.YourPcStore.domain;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "Promociones")
public class Promociones {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY )
    private long idPromocion;
    @Column(name = "fecha_ini", nullable = false)
    private LocalDateTime fechaINI;
    @Column(name = "fecha_fin", nullable = false)
    private LocalDateTime fechaFin;
    @Column(name = "precio", nullable = false, length = 10)
    private long precio ;
}
