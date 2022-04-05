package zoo_keeper2;

public class Mammal {
	protected int energyLevel;

	public Mammal() {
		this.setEnergyLevel(100);
	}
	
	public int displayEnergy() {
		System.out.println(energyLevel);
		return energyLevel;
	}

	public void setEnergyLevel(int energyLevel) {
		this.energyLevel = energyLevel;
	}
	
	
	
}
