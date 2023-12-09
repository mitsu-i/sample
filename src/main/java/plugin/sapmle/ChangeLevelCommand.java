package plugin.sapmle;

import java.util.Random;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class ChangeLevelCommand implements CommandExecutor {


  @Override
  public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
    if(sender instanceof Player player){
      Random randomNumber = new Random();
      int randomLevel = randomNumber.nextInt(101);
      player.setLevel(randomLevel);
    }
    return false;
  }
}
