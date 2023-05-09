package entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "formulaire")
public class formulaire implements Serializable {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private int id;
    private String nomcomplet;
    private String Email;
    private String emplacement;

    //(cocher oui ou non )
    private  boolean    travail_en_ligne ;
    private String experience ;
    private String salire_desiré;
    @Column (nullable = true, length = 64)
    private String cv ;

    @Column (nullable = true, length = 64)
    private String lettre_de_motivation;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNomcomplet() {
        return nomcomplet;
    }

    public void setNomcomplet(String nomcomplet) {
        this.nomcomplet = nomcomplet;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public String getEmplacement() {
        return emplacement;
    }

    public void setEmplacement(String emplacement) {
        this.emplacement = emplacement;
    }

    public boolean isTravail_en_ligne() {
        return travail_en_ligne;
    }

    public void setTravail_en_ligne(boolean travail_en_ligne) {
        this.travail_en_ligne = travail_en_ligne;
    }

    public String getExperience() {
        return experience;
    }

    public void setExperience(String experience) {
        this.experience = experience;
    }

    public String getSalire_desiré() {
        return salire_desiré;
    }

    public void setSalire_desiré(String salire_desiré) {
        this.salire_desiré = salire_desiré;
    }

    public String getCv() {
        return cv;
    }

    public void setCv(String cv) {
        this.cv = cv;
    }

    public String getLettre_de_motivation() {
        return lettre_de_motivation;
    }

    public void setLettre_de_motivation(String lettre_de_motivation) {
        this.lettre_de_motivation = lettre_de_motivation;
    }




}
