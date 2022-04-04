package co.edu.sena.YourPcStore.domain;

import javax.persistence.*;

@Entity
@Table(name = "Producto")
public class Producto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idProducto;
    @Column(name = "nom_producto", nullable = false, length = 45)
    private String nomProducto;
    @Column(name = "precio", nullable = false, length = 11)
    private double precio;
}
