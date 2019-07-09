package khoi.mobwave.controller;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import org.bukkit.plugin.java.JavaPlugin;

import khoi.mobwave.model.ListWave;
import khoi.mobwave.model.Mob;
import khoi.mobwave.model.Section;
import khoi.mobwave.model.Wave;

public class Globals {
	//https://bukkit.gamepedia.com/Configuration_API_Reference
	//https://bukkit.org/threads/tut-bukkits-new-fileconfiguration-api-create-a-yaml-configuration.42775/
	  //https://www.spigotmc.org/threads/creating-a-yml-config-if-it-does-not-exist.126091/
	public static File mainconfig;

	///Setup Yaml Config file
	public static void InitConfig(JavaPlugin plugin) {
        mainconfig = new File(plugin.getDataFolder(), "config.yml");

        if(!mainconfig.exists()) {
            plugin.getConfig().options().copyDefaults(true);
			plugin.getConfig().set("status",true);
			
			   /* Section 1*/

			Mob Mob1 = new Mob("Zombie",2);
			Mob Mob2 = new Mob("Spider",2);

			Mob Mob3 = new Mob("Orc",2);
			Mob Mob4 = new Mob("Zombie",2);
			List<Mob> mobs1 = new ArrayList<Mob>();
			mobs1.add(Mob1);
			mobs1.add(Mob2);
			
			List<Mob> mobs2 = new ArrayList<Mob>();
			mobs2.add(Mob3);
			mobs2.add(Mob4);	
			
			Wave wave1 = new Wave(1,false,false,"random",mobs1);
			Wave wave2 = new Wave(2,false,false,"random",mobs2);

		    List<Wave> waves1 = new ArrayList<Wave>();
		    waves1.add(wave1);
		    waves1.add(wave2);
		    
			   /* Section 2*/

			Mob Mob5 = new Mob("Creeper",3);
			Mob Mob6 = new Mob("Creeper",2);

			Mob Mob7 = new Mob("Atcher",2);
			Mob Mob8 = new Mob("Boomer",2);
			
			
			List<Mob> mobs3 = new ArrayList<Mob>();
			mobs3.add(Mob5);
			mobs3.add(Mob6);
			
			List<Mob> mobs4 = new ArrayList<Mob>();
			mobs4.add(Mob7);
			mobs4.add(Mob8);
			
			Wave wave3 = new Wave(1,false,false,"random",mobs3);
			Wave wave4 = new Wave(2,false,false,"random",mobs4);

		    List<Wave> waves2 = new ArrayList<Wave>();
		    waves2.add(wave3);
		    waves2.add(wave4);
		    
		    Section section1 = new Section("War 1",waves1);
		    Section section2 = new Section("War 2",waves2);

		    List<Section> sections = new ArrayList<Section>();
		    sections.add(section1);
		    sections.add(section2);

		    ListWave list = new ListWave(sections);
		    
		    plugin.getConfig().set("Data", list);
		    
			plugin.saveConfig();
        }	
	}
}
