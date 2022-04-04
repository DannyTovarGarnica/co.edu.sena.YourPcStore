package co.edu.sena.YourPcStore.domain;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "Consultas")
public class Consultas {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_consultas", nullable = false)
    private long idConsultas;
    @Column(name = "precio", nullable = false, length = 11)
    private double precio;
    @Column(name = "fecha", nullable = false)
    private LocalDateTime fecha;


    @ManyToOne
    @JoinColumn(name = "id_usuario", nullable = false, referencedColumnName = "id_usuario",
        foreignKey = @ForeignKey(name = "fk_usu_cons"))
    private Usuario usuario;
    @ManyToOne
    @JoinColumn(name = "id_producto", nullable = false, referencedColumnName = "id_producto",
        foreignKey = @ForeignKey(name = "fk_prod_cons"))
    private Producto producto;


    public long getIdConsultas() {
        return idConsultas;
    }

    public void setIdConsultas(long idConsultas) {
        this.idConsultas = idConsultas;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public LocalDateTime getFecha() {
        return fecha;
    }

    public void setFecha(LocalDateTime fecha) {
        this.fecha = fecha;
    }
}
