package NGL;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Publication {
   private final String texte;
    private  final String publicationDate ;
    private final identifiantMessage identifiantMessage;
    private final confidentialite Confidentialite;
    private final List<Publication> message;

    public Publication(String texte, String publicationDate, identifiantMessage identifiantMessage , confidentialite Confidentialite) {
        this.texte = texte;
        this.publicationDate = publicationDate;
        this.identifiantMessage = identifiantMessage;
        this.Confidentialite = Confidentialite;
        this.message = new ArrayList<>();
    }

    public void messagePublier (){
        System.out.println(identifiantMessage + texte + publicationDate +  Confidentialite );
    }


}
