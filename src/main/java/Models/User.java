package Models;

import org.hibernate.id.IncrementGenerator;

import javax.persistence.*;

@Entity
@Table(name = "clients")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private int id;
    private String email;
    private String  nom;
    private String  prenom;
    private String  adresse;
    private String  codepostal;
    private String  ville;
    private String  tel;
    private String  password;
    public User() {

    }
    public User(String email,String  nom,String  prenom,String  adresse,String  codepostal,String  ville,String  tel,String  password) {
        this.id=id;
        this.email=email;
        this.nom=nom;
        this.prenom=prenom;
        this.adresse=adresse;
        this.codepostal=codepostal;
        this.ville=ville;
        this.tel=tel;
        this.password=password;
    }
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public String getCodepostal() {
        return codepostal;
    }

    public void setCodepostal(String codepostal) {
        this.codepostal = codepostal;
    }

    public String getVille() {
        return ville;
    }

    public void setVille(String ville) {
        this.ville = ville;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}