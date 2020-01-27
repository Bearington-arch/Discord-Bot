package Events;

import net.dv8tion.jda.api.entities.Message;
import net.dv8tion.jda.api.entities.MessageChannel;
import net.dv8tion.jda.api.events.message.MessageReceivedEvent;
import net.dv8tion.jda.api.events.message.guild.GuildMessageReceivedEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;

public class HelloEvent extends ListenerAdapter {
    public void onMessageReceived(MessageReceivedEvent event)
    {
        Message msg = event.getMessage();
        if (msg.getContentRaw().equals("f:greeting")) {
            MessageChannel channel = event.getChannel();
            // long time = System.currentTimeMillis();
            channel.sendMessage("hi") /* => RestAction<Message> */
                    .queue();
        }
         else if (msg.getContentRaw().equals("f:help")){
            MessageChannel channel = event.getChannel();
            channel.sendMessage("\"f:greeting\" provides you with a nice greeting \n " +
                    "\"f:hug\" gives you a hug ")
                    .queue();
        }
         else if(msg.getContentRaw().equals("f:hug")){
             MessageChannel channel = event.getChannel();
             channel.sendMessage("Have a hug bud, you're doing great")
                     .queue();
        }
    }
}
