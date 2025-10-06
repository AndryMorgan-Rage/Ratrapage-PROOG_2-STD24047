package NGL;

import java.time.LocalDateTime;

public class Publication {
   private final String texte;
    private  final String publicationDate ;
    private final identifiantMessage identifiantMessage;
    private final confidentialite Confidentialite;

    public Publication(String texte, String publicationDate, identifiantMessage identifiantMessage , confidentialite Confidentialite) {
        this.texte = texte;
        this.publicationDate = publicationDate;
        this.identifiantMessage = identifiantMessage;
        this.Confidentialite = Confidentialite;
    }

    public void messagePublier (){
        
        System.out.println(identifiantMessage + texte + publicationDate +  Confidentialite );
    }


}
