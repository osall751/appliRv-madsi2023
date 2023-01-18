package sn.sat.ugb.appliRvmadsi.modeles;

import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import org.hibernate.annotations.GenericGenerator;

import java.util.Date;
import java.util.UUID;

@Entity
public class RendezVous {
    @Id @GeneratedValue(generator="system-uuid")
    @GenericGenerator(name="system-uuid", strategy = "uuid")
    private String id= UUID.randomUUID().toString();
    private String desc;
    private String lieu;
    @JsonFormat(pattern = "dd/MM/yyyy")
    private Date date;
    private String image;

    public RendezVous() {
    }
    public RendezVous(String desc, String lieu, Date date, String image) {
        this.desc = desc;
        this.lieu = lieu;
        this.date = date;
        this.image = image;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public String getLieu() {
        return lieu;
    }

    public void setLieu(String lieu) {
        this.lieu = lieu;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    @Override
    public String toString() {
        return "RendezVous{" +
                "id='" + id + '\'' +
                ", desc='" + desc + '\'' +
                ", lieu='" + lieu + '\'' +
                ", date=" + date +
                ", image='" + image + '\'' +
                '}';
    }
}
