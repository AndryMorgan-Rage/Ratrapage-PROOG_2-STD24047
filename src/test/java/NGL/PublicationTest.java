package NGL;

import org.junit.Test;

import java.time.LocalDateTime;

import static NGL.confidentialite.prive;
import static org.junit.jupiter.api.Assertions.*;

public class PublicationTest {
        @Test
        public void messageTest(){
                Publication prs = new Publication("ter", "2007-12-03T10:15:30.", NGL.identifiantMessage.InternautAnonyme , prive);
                prs.messagePublier();
        }
        @Test
        public void UtilisateurTest(){
                Utilisateur rabe = new Utilisateur(1,"rabe","jary","emai.com");

        }
}