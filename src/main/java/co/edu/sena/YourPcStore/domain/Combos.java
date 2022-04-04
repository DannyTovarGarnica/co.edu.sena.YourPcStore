package co.edu.sena.YourPcStore.domain;

import javax.persistence.*;

@Entity
@Table(name = "Combos")
public class Combos {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_combo", nullable = false)
    private long idCombo;
    @Column(name ="precio", nullable = false, length = 11)
    private double precio;

    @ManyToOne
    @JoinColumn(name = "id_producto",nullable = false, referencedColumnName = "id_producto",
        foreignKey = @ForeignKey(name = "fk_prod_comb"))
    private Producto producto;
}
