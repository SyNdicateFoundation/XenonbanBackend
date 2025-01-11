package ir.realstresser.xenonbanbackend.commands;

import ir.realstresser.xenonbanbackend.XenonBanBackend;
import lombok.Cleanup;
import lombok.SneakyThrows;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.util.Arrays;

public class BanCommand implements CommandExecutor {

    @Override
    @SneakyThrows  public boolean onCommand(CommandSender commandSender, Command command, String s, String[] strings) {
        if(commandSender.hasPermission("xenonban.ban")) {
            final StringBuilder sb = new StringBuilder();

            Arrays.stream(strings).forEach(word -> sb.append(word).append(" "));

            String cmd = String.format("ban %s", sb);

            @Cleanup final Socket socket = new Socket("127.0.0.1", 20019);

            @Cleanup BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));

            bw.write(cmd);

            return true;
        }
        return false;
    }
}
