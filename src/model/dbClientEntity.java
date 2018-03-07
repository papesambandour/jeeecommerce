package model;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "client", schema = "jeeecomerce", catalog = "")
public class dbClientEntity {
    private int id;
    private String numpiece;
    private String nomcomplet;
    private String tel;
    private String email;
    private String adresse;

    @Id
    @Column(name = "id", nullable = false)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "numpiece", nullable = false, length = 50)
    public String getNumpiece() {
        return numpiece;
    }

    public void setNumpiece(String numpiece) {
        this.numpiece = numpiece;
    }

    @Basic
    @Column(name = "nomcomplet", nullable = false, length = 50)
    public String getNomcomplet() {
        return nomcomplet;
    }

    public void setNomcomplet(String nomcomplet) {
        this.nomcomplet = nomcomplet;
    }

    @Basic
    @Column(name = "tel", nullable = true, length = 50)
    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    @Basic
    @Column(name = "email", nullable = true, length = 50)
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Basic
    @Column(name = "adresse", nullable = true, length = 50)
    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        dbClientEntity that = (dbClientEntity) o;
        return id == that.id &&
                Objects.equals(numpiece, that.numpiece) &&
                Objects.equals(nomcomplet, that.nomcomplet) &&
                Objects.equals(tel, that.tel) &&
                Objects.equals(email, that.email) &&
                Objects.equals(adresse, that.adresse);
    }

    @Override
    public int hashCode() {

        return Objects.hash(id, numpiece, nomcomplet, tel, email, adresse);
    }
}
