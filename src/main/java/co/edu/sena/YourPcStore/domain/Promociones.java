package co.edu.sena.YourPcStore.domain;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "Promociones")
public class Promociones {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY )
    @Column(name = "id_promocion", nullable = false)
    private long idPromocion;
    @Column(name = "fecha_ini", nullable = false)
    private LocalDateTime fechaINI;
    @Column(name = "fecha_fin", nullable = false)
    private LocalDateTime fechaFin;
    @Column(name = "precio", nullable = false, length = 10)
    private long precio ;

    @ManyToOne
    @JoinColumn(name = "id_producto",nullable = false,referencedColumnName = "id_producto",
        foreignKey = @ForeignKey(name = "fk_prod_prom"))
    private Producto producto;
}
