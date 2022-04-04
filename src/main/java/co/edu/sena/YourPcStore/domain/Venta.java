package co.edu.sena.YourPcStore.domain;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.List;

@Entity
@Table(name = "Venta")
public class Venta {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_venta", nullable = false)
    private long idVenta;
    @Column(name = "fecha_venta", nullable = false)
    private LocalDateTime fechaVenta;
    @Column(name = "valor_Venta", nullable = false)
    private double valorVenta;

    @ManyToOne
    @JoinColumn(name = "id_usuario", nullable = false,referencedColumnName = "id_usuario",
        foreignKey = @ForeignKey(name = "fk_usu_vent"))
    private Usuario usuario;
    @ManyToOne
    @JoinColumn(name = "id_producto", nullable = false, referencedColumnName = "id_producto",
        foreignKey = @ForeignKey(name = "fk_prod_vent"))
    private Producto producto;
    @ManyToOne
    @JoinColumn(name = "id_tienda",nullable = false, referencedColumnName = "id_tienda",
        foreignKey = @ForeignKey(name = "fk_tie_vent"))
    private Tienda tienda;

    public long getIdVenta() {
        return idVenta;
    }

    public void setIdVenta(long idVenta) {
        this.idVenta = idVenta;
    }

    public LocalDateTime getFechaVenta() {
        return fechaVenta;
    }

    public void setFechaVenta(LocalDateTime fechaVenta) {
        this.fechaVenta = fechaVenta;
    }

    public double getValorVenta() {
        return valorVenta;
    }

    public void setValorVenta(double valorVenta) {
        this.valorVenta = valorVenta;
    }
}
