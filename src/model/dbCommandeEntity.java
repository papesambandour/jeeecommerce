package model;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name = "commande", schema = "jeeecomerce", catalog = "")
public class dbCommandeEntity {
    private int id;
    private Timestamp datecom;
    private Timestamp dateliv;
    private int idClient;

    @Id
    @Column(name = "id", nullable = false)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "datecom", nullable = false)
    public Timestamp getDatecom() {
        return datecom;
    }

    public void setDatecom(Timestamp datecom) {
        this.datecom = datecom;
    }

    @Basic
    @Column(name = "dateliv", nullable = false)
    public Timestamp getDateliv() {
        return dateliv;
    }

    public void setDateliv(Timestamp dateliv) {
        this.dateliv = dateliv;
    }

    @Basic
    @Column(name = "id_client", nullable = false)
    public int getIdClient() {
        return idClient;
    }

    public void setIdClient(int idClient) {
        this.idClient = idClient;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        dbCommandeEntity that = (dbCommandeEntity) o;
        return id == that.id &&
                idClient == that.idClient &&
                Objects.equals(datecom, that.datecom) &&
                Objects.equals(dateliv, that.dateliv);
    }

    @Override
    public int hashCode() {

        return Objects.hash(id, datecom, dateliv, idClient);
    }
}
