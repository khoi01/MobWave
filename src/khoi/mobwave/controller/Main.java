package khoi.mobwave.controller;


import org.bukkit.plugin.java.JavaPlugin;




public class Main extends JavaPlugin{
    
    @Override
	public void onEnable() {
		
    	Globals.InitConfig(this);
    	this.getCommand("mobwave").setExecutor(new CommandWaveEvent());

    }
    
	@Override
	public void onDisable() {
		saveConfig();
	}

	
}
