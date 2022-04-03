package co.edu.sena.YourPcStore.domain;

import javax.persistence.*;

@Entity
@Table(name = "Combos")
public class Combos {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idCombo;
    @Column(name ="precio", nullable = false, length = 11)
    private double precio;
}
