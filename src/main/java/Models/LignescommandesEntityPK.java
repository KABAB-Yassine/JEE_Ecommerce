package Models;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.io.Serializable;

public class LignescommandesEntityPK implements Serializable {
    @Column(name = "Numcommandes")
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int numcommandes;
    @Column(name = "codeArticle")
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int codeArticle;

    public int getNumcommandes() {
        return numcommandes;
    }

    public void setNumcommandes(int numcommandes) {
        this.numcommandes = numcommandes;
    }

    public int getCodeArticle() {
        return codeArticle;
    }

    public void setCodeArticle(int codeArticle) {
        this.codeArticle = codeArticle;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        LignescommandesEntityPK that = (LignescommandesEntityPK) o;

        if (numcommandes != that.numcommandes) return false;
        if (codeArticle != that.codeArticle) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = numcommandes;
        result = 31 * result + codeArticle;
        return result;
    }
}
