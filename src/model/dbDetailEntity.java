package model;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.Objects;

@Entity
@Table(name = "detail", schema = "jeeecomerce", catalog = "")
public class dbDetailEntity {
    private int idComde;
    private int idprod;
    private int qte;
    private double prix;

    @Basic
    @Column(name = "id_comde", nullable = false)
    public int getIdComde() {
        return idComde;
    }

    public void setIdComde(int idComde) {
        this.idComde = idComde;
    }

    @Basic
    @Column(name = "idprod", nullable = false)
    public int getIdprod() {
        return idprod;
    }

    public void setIdprod(int idprod) {
        this.idprod = idprod;
    }

    @Basic
    @Column(name = "qte", nullable = false)
    public int getQte() {
        return qte;
    }

    public void setQte(int qte) {
        this.qte = qte;
    }

    @Basic
    @Column(name = "prix", nullable = false, precision = 0)
    public double getPrix() {
        return prix;
    }

    public void setPrix(double prix) {
        this.prix = prix;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        dbDetailEntity that = (dbDetailEntity) o;
        return idComde == that.idComde &&
                idprod == that.idprod &&
                qte == that.qte &&
                Double.compare(that.prix, prix) == 0;
    }

    @Override
    public int hashCode() {

        return Objects.hash(idComde, idprod, qte, prix);
    }
}
