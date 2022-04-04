package co.edu.sena.YourPcStore.domain;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "Tienda",
        uniqueConstraints={
        @UniqueConstraint(name = "uk_nom_tienda", columnNames = "nom_tienda"),
        @UniqueConstraint(name = "uk_telefono", columnNames = "telefono"),
})
public class Tienda {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_tienda", nullable = false)
    private long idTienda;
    @Column(name = "nom_tienda", nullable = false, length = 45)
    private String nomTienda;
    @Column(name = "direccion", nullable = false, length = 45)
    private String direccion;
    @Column(name = "telefono", nullable = false, length = 10)
    private long telefono;

    @OneToMany(mappedBy = "tienda")
    private List<Venta> ventaList;
    @OneToMany(mappedBy = "tienda")
    private List<Distribuidor>distribuidorList;
}
