package Models;

import javax.persistence.*;

@Entity
@Table(name = "articles", schema = "ecom", catalog = "")
public class ArticlesEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "codeArticle")
    private int codeArticle;
    @Basic
    @Column(name = "designation")
    private String designation;
    @Basic
    @Column(name = "prix")
    private int prix;
    @Basic
    @Column(name = "stock")
    private String stock;
    @Basic
    @Column(name = "categorie")
    private String categorie;
    @Basic
    @Column(name = "photo")
    private String photo;

    public int getCodeArticle() {
        return codeArticle;
    }

    public void setCodeArticle(int codeArticle) {
        this.codeArticle = codeArticle;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public int getPrix() {
        return prix;
    }

    public void setPrix(int prix) {
        this.prix = prix;
    }

    public String getStock() {
        return stock;
    }

    public void setStock(String stock) {
        this.stock = stock;
    }

    public String getCategorie() {
        return categorie;
    }

    public void setCategorie(String categorie) {
        this.categorie = categorie;
    }

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ArticlesEntity that = (ArticlesEntity) o;

        if (codeArticle != that.codeArticle) return false;
        if (prix != that.prix) return false;
        if (designation != null ? !designation.equals(that.designation) : that.designation != null) return false;
        if (stock != null ? !stock.equals(that.stock) : that.stock != null) return false;
        if (categorie != null ? !categorie.equals(that.categorie) : that.categorie != null) return false;
        if (photo != null ? !photo.equals(that.photo) : that.photo != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = codeArticle;
        result = 31 * result + (designation != null ? designation.hashCode() : 0);
        result = 31 * result + prix;
        result = 31 * result + (stock != null ? stock.hashCode() : 0);
        result = 31 * result + (categorie != null ? categorie.hashCode() : 0);
        result = 31 * result + (photo != null ? photo.hashCode() : 0);
        return result;
    }
}
