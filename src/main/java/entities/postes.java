package entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
import java.util.Date;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "postes")
public class postes implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String nomposte;
    private String  descriptionposte ;
    private int salaire ;

    public Date getDatedebut() {
        return datedebut;
    }

    public void setDatedebut(Date datedebut) {
        this.datedebut = datedebut;
    }

    @DateTimeFormat(pattern = "dd/MM/yyyy")
    private Date datedebut ;
    private String type ;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getSalaire() {
        return salaire;
    }

    public void setSalaire(int salaire) {
        this.salaire = salaire;
    }



    public String getNomposte() {
        return nomposte;
    }

    public void setNomposte(String nomposte) {
        this.nomposte = nomposte;
    }



    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }



    public String getDescriptionposte() {
        return descriptionposte;
    }

    public void setDescriptionposte(String descriptionposte) {
        this.descriptionposte = descriptionposte;
    }




}
