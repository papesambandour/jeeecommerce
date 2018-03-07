package model;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "produit", schema = "jeeecomerce", catalog = "")
public class dbProduitEntity {
    private int id;
    private String nom;
    private Integer qtestock;

    @Id
    @Column(name = "id", nullable = false)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "nom", nullable = false, length = 50)
    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    @Basic
    @Column(name = "qtestock", nullable = true)
    public Integer getQtestock() {
        return qtestock;
    }

    public void setQtestock(Integer qtestock) {
        this.qtestock = qtestock;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        dbProduitEntity that = (dbProduitEntity) o;
        return id == that.id &&
                Objects.equals(nom, that.nom) &&
                Objects.equals(qtestock, that.qtestock);
    }

    @Override
    public int hashCode() {

        return Objects.hash(id, nom, qtestock);
    }
}
