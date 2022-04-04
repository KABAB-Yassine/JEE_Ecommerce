package DAO;

import Models.User;

import java.util.List;

public interface AUTH {
    public List<User> Login(String email, String Password);
    public  Boolean Register(String email,String  nom,String  prenom,String  adresse,String  codepostal,String  ville,String  tel,String  password);
}
