import Events.HelloEvent;
import net.dv8tion.jda.api.JDA;
import net.dv8tion.jda.api.JDABuilder;

public class BotOne {

    public static void main(String args[]) throws Exception{

        JDA jda = new JDABuilder("NjM5NDg4OTAwNjgyNzQzODA4.XfauLA.SZ00ylABDJqNWdfkTPq3GIPP42w").build();

        jda.addEventListener(new HelloEvent());
    }

}
