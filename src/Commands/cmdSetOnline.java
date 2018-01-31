package Commands;

import Core.Main;
import net.dv8tion.jda.core.OnlineStatus;
import net.dv8tion.jda.core.events.message.MessageReceivedEvent;

public class cmdSetOnline implements Command{

	@Override
	public boolean called(String[] args, MessageReceivedEvent event) {
		
		return false;
	}

	@Override
	public void action(String[] args, MessageReceivedEvent event) {
		Main.builder.setStatus(OnlineStatus.ONLINE);
		event.getTextChannel().sendMessage("Der Bot wird nun auf allen Servern mit dem Status **ONLINE** versehen!").queue();;
	}

	@Override
	public void executed(boolean success, MessageReceivedEvent event) {
		System.out.println("ONLINE wurde ausgef�hrt");
		
	}

	@Override
	public String help() {
		
		return null;
	}

}