package khoi.mobwave.model;

import java.util.List;

public class Section {

	private String Section;
	private List<Wave> Waves;
	
	
	public Section(String section, List<Wave> waves) {
		super();
		Section = section;
		Waves = waves;
	}

	public String getSection() {
		return Section;
	}

	public void setSection(String section) {
		Section = section;
	}

	public List<Wave> getWaves() {
		return Waves;
	}

	public void setWaves(List<Wave> waves) {
		Waves = waves;
	}
	
	
}
