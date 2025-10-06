package NGL;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

public class Publication {
   private final String texte;
    private final LocalDateTime publicationDate;
    private final List<InternautAnonyme> internauts;
    private final List<Publication> messages;
    private final List<Utilisateur> utilisateurs;
    private final identifiantMessage identifiantMessage;
    private final confidentialite Confidentialite;

    public Publication(String texte, LocalDateTime publicationDate, List<InternautAnonyme> internauts, List<Publication> messages, List<Utilisateur> utilisateurs, identifiantMessage identifiantMessage , confidentialite Confidentialite) {
        this.texte = texte;
        this.publicationDate = publicationDate;
        this.internauts = internauts;
        this.messages = messages;
        this.utilisateurs = utilisateurs;
        this.identifiantMessage = identifiantMessage;
        this.Confidentialite = Confidentialite;
    }

    public void messagePublier (){
        System.out.println(identifiantMessage + texte + publicationDate +  Confidentialite );
    }
    public void
}
