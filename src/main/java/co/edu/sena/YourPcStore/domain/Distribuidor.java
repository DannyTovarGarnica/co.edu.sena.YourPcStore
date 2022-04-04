package co.edu.sena.YourPcStore.domain;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name ="Distribuidor" )
public class Distribuidor {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_distribuidor", nullable = false)
    private long idDistribuidor;
    @Column(name = "nombres", nullable = false, length = 45)
    private String nombres;

    @OneToMany(mappedBy = "distribuidor")
    private List<Producto>productoList;
    @ManyToOne
    @JoinColumn(name = "id_tienda", nullable = false, referencedColumnName = "id_tienda",
        foreignKey = @ForeignKey(name = "fk_tie_dist"))
    private Tienda tienda;
}
