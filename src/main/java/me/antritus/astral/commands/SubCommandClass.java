package me.antritus.astral.commands;

import me.antritus.astral.AdvancedPlugin;
import org.bukkit.command.CommandSender;

public class SubCommandClass {
	protected final AdvancedPlugin main;
	public SubCommandClass(AdvancedPlugin main){
		this.main = main;
	}
	public void message(CommandSender sender, String key, String... placeholders){
		main.getMessageManager().message(sender, key, placeholders);
	}
	public void message(boolean reparse, CommandSender sender, String key, String... placeholders){
		main.getMessageManager().message(reparse, sender, key, placeholders);
	}
	public void broadcast(String key, String... placeholders){
		main.getMessageManager().broadcast(key, placeholders);
	}
}
