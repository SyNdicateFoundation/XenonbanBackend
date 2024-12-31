package ir.realstresser.xenonbanbackend.commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;

public class UnbanCommand extends Command {
    public UnbanCommand(){
        super("ban");
    }
    @Override
    public boolean execute(CommandSender commandSender, String s, String[] strings) {
        if(commandSender.hasPermission("xenonban.ban")) {

        }
        return false;
    }
}
