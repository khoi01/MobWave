package khoi.mobwave.model;

import java.util.List;

public class Wave {
	private int Count;
	private boolean IsDropItem;
	private boolean IsDropExp;
	private String SpawnType;
	private List<Mob> Mobs;
	
	
	
	public Wave(int count, boolean isDropItem, boolean isDropExp, String spawnType, List<Mob> mobs) {
		super();
		Count = count;
		IsDropItem = isDropItem;
		IsDropExp = isDropExp;
		SpawnType = spawnType;
		Mobs = mobs;
	}
	
	


	public boolean isIsDropItem() {
		return IsDropItem;
	}
	public void setIsDropItem(boolean isDropItem) {
		IsDropItem = isDropItem;
	}
	public boolean isIsDropExp() {
		return IsDropExp;
	}
	public void setIsDropExp(boolean isDropExp) {
		IsDropExp = isDropExp;
	}
	public String getSpawnType() {
		return SpawnType;
	}
	public void setSpawnType(String spawnType) {
		SpawnType = spawnType;
	}
	public List<Mob> getMobs() {
		return Mobs;
	}
	public void setMobs(List<Mob> mobs) {
		Mobs = mobs;
	}




	public int getCount() {
		return Count;
	}




	public void setCount(int count) {
		Count = count;
	}

	
	
	
	
	
}
