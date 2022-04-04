package Models;

import javax.persistence.*;

@Entity
@Table(name = "lignescommandes", schema = "ecom")
@IdClass(LignescommandesEntityPK.class)
public class LignescommandesEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "Numcommandes")
    private int numcommandes;
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "codeArticle")
    private int codeArticle;
    @Basic
    @Column(name = "QteCte")
    private int qteCte;

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

    public int getQteCte() {
        return qteCte;
    }

    public void setQteCte(int qteCte) {
        this.qteCte = qteCte;
    }
}
