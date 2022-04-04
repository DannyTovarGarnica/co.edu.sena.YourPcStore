package co.edu.sena.YourPcStore.domain;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "Producto")
public class Producto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_producto", nullable = false)
    private long idProducto;
    @Column(name = "nom_producto", nullable = false, length = 45)
    private String nomProducto;
    @Column(name = "precio", nullable = false, length = 11)
    private double precio;

    @OneToMany(mappedBy = "producto")
    private List<Venta>ventaList;
    @ManyToOne
    @JoinColumn(name = "id_distribuidor", nullable = false, referencedColumnName = "id_distribuidor",
        foreignKey = @ForeignKey(name = "fk_dist_prod"))
    private Distribuidor distribuidor;
    @OneToMany(mappedBy = "producto")
    private List<Combos>combosList;
    @OneToMany(mappedBy = "producto")
    private List<Promociones>promocionesList;
    @OneToMany(mappedBy = "producto")
    private List<Consultas>consultasList;

    public long getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(long idProducto) {
        this.idProducto = idProducto;
    }

    public String getNomProducto() {
        return nomProducto;
    }

    public void setNomProducto(String nomProducto) {
        this.nomProducto = nomProducto;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
}
