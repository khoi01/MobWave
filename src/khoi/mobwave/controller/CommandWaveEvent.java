package khoi.mobwave.controller;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class CommandWaveEvent implements CommandExecutor {

	//https://www.youtube.com/watch?v=jytF-6WD2Eo  (setup permissions)
	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {


		if(!(sender instanceof Player)) {
			return true;
		}
		
		Player player = (Player) sender;
		
		if(args == null) {
			return true;
		}
		
		if(args.length <= 0) {
			return true;
		}
		
		switch(args[0]) {
		case "start":
			player.sendMessage("you used (mobwave start)");
			
			if(args[1] == "war") {
				player.sendMessage("you used (mobwave start war)");
			}
			break;
		default:
			player.sendMessage("none used any command");
		}
		
		return true;
	}

}
