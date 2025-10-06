package NGL;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Utilisateur {
    // attributs
   final private int id;
   final private String nom;
   final private String prenom;
   final private String Email;


    public Utilisateur(int id, String nom, String prenom, String email ) {
        this.id = id;
        this.nom = nom;
        this.prenom = prenom;
        Email = email;

    }

    public static void main(String[] args) {
        Utilisateur rakoto = new Utilisateur(1,"rabe","rakoto","rakoto.email.com");
    }

}
