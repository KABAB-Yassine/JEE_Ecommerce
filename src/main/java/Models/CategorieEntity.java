package Models;

import javax.persistence.*;
import java.awt.*;

@Entity
@Table(name = "categorie", schema = "ecom")
public class CategorieEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "Refcat")
    private String refcat;
    @Basic
    @Column(name = "Categorie")
    private String categorie;
    @Column(name = "img")
    private int image;
    public CategorieEntity(String refcat, String categorie, int image) {
        this.refcat = refcat;
        this.categorie = categorie;
        this.image = image;
    }
    public CategorieEntity() {

    }
    public String getRefcat() {
        return refcat;
    }

    public void setRefcat(String refcat) {
        this.refcat = refcat;
    }

    public String getCategorie() {
        return categorie;
    }

    public void setCategorie(String categorie) {
        this.categorie = categorie;
    }
    public int getImage() {
        return image;
    }
    public void setImage(int image) {
        this.image = image;
    }

}
