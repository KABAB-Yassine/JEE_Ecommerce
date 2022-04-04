package Models;

import javax.persistence.*;

@Entity
@Table(name = "Commandes", schema = "ecom")
public class CommandesEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "Numcommandes")
    private int numcommandes;

    public int getCodeArticle() {
        return codeArticle;
    }

    public void setCodeArticle(int codeArticle) {
        this.codeArticle = codeArticle;
    }

    public int getQteCte() {
        return QteCte;
    }

    public void setQteCte(int qteCte) {
        QteCte = qteCte;
    }

    @Basic
    @Column(name = "codeclient")
    private int codeclient;

    public CommandesEntity(int codeclient, int codeArticle, int qteCte) {
        this.codeclient = codeclient;
        this.codeArticle = codeArticle;
        QteCte = qteCte;
    }
    @Basic
    @Column(name = "datecommandes")
    private String datecommandes;
    @Column(name = "codeArticle")
    private int codeArticle;
    @Column(name = "QteCte")
    private int QteCte;
    public int getNumcommandes() {
        return numcommandes;
    }

    public void setNumcommandes(int numcommandes) {
        this.numcommandes = numcommandes;
    }

    public int getCodeclient() {
        return codeclient;
    }

    public void setCodeclient(int codeclient) {
        this.codeclient = codeclient;
    }

    public String getDatecommandes() {
        return datecommandes;
    }

    public void setDatecommandes(String datecommandes) {
        this.datecommandes = datecommandes;
    }
}
