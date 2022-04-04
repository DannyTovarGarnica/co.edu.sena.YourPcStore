package co.edu.sena.YourPcStore.domain;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.List;

@Entity
@Table(name = "usuario",
        uniqueConstraints={
    @UniqueConstraint(name = "uk_correo", columnNames = "correo"),
    @UniqueConstraint(name = "uk_celular", columnNames = "celular"),
    @UniqueConstraint(name = "uk_telefono", columnNames = "telefono")
        })
public class Usuario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_usuario", nullable = false)
    private long idUsuario;
    @Column(name="nombres",nullable = false,length = 45)
    private String nombres;
    @Column(name="apellidos",nullable = false,length = 45)
    private String apellidos;
    @Column(name="correo",nullable = false,length = 45)
    private String correo;
    @Column(name="contraseña",nullable = false,length = 45)
    private String contraseña;
    @Column(name="telefono",nullable = false,length = 10)
    private long telefono;
    @Column(name="celular",nullable = false,length = 10)
    private  long celular;
    @Column(name="fecha_nac",nullable = false)
    private LocalDateTime fechaNac;


    @ManyToOne
    @JoinColumn(name = "id_rol", nullable = false, referencedColumnName ="id_rol",
            foreignKey = @ForeignKey(name = "fk_rol_usu"))
        private Rol rol;
    @OneToMany(mappedBy ="usuario" )
    private List<Consultas>consultasList;
    @OneToMany(mappedBy = "usuario")
    private List<Venta>ventaList;


    public long getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(long idUsuario) {
        this.idUsuario = idUsuario;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public long getTelefono() {
        return telefono;
    }

    public void setTelefono(long telefono) {
        this.telefono = telefono;
    }

    public long getCelular() {
        return celular;
    }

    public void setCelular(long celular) {
        this.celular = celular;
    }

    public LocalDateTime getFecha_Nac() {
        return fechaNac;
    }

    public void setFecha_Nac(LocalDateTime fecha_Nac) {
        this.fechaNac = fecha_Nac;
    }
}
