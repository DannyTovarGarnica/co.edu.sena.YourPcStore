package co.edu.sena.YourPcStore.domain;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "usuario")
public class Usuario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
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
    private LocalDateTime fecha_Nac;
}
