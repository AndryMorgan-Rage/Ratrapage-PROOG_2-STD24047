package NGL;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Utilisateur {
    // attributs
   final private int id;
   final private String nom;
   final private String prenom;
   final private String Email;
   final private LocalDateTime dateDePublicationUtilisateur;
   final private confidentialite confidentialite;

    public Utilisateur(int id, String nom, String prenom, String email , LocalDateTime dateDePublicationUtilisateur, confidentialite confidentialite) {
        this.id = id;
        this.nom = nom;
        this.prenom = prenom;
        Email = email;
        this.dateDePublicationUtilisateur = dateDePublicationUtilisateur;
        this.confidentialite = confidentialite;
    }


}
