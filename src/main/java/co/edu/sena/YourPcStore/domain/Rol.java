package co.edu.sena.YourPcStore.domain;

import javax.persistence.*;
import java.util.List;

@Entity
@Table (name = "rol")
public class Rol {

    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    @Column(name = "id_rol")
    private long idRol;
    @Column(name = "rol", nullable = false, length = 45)
    private String rol;


   @OneToMany(mappedBy = "rol")
   private List <Usuario> usuarioList;

    public long getIdRol() {
        return idRol;
    }

    public void setIdRol(long idRol) {
        this.idRol = idRol;
    }

    public String getRol() {
        return rol;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }
}
