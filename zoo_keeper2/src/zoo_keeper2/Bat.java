package zoo_keeper2;

public class Bat extends Mammal{
	public Bat() {
		this.setEnergyLevel(300);
	}
	
	public void fly() {
		System.out.println("Woosh woosh");
		this.setEnergyLevel(this.displayEnergy() - 50);
	}
	
	public void eatHumans() {
		this.setEnergyLevel(this.displayEnergy() - 25);
	}
	
	public void attackTown() {
		System.out.println("Cackle Cackle");
		this.setEnergyLevel(this.displayEnergy() - 100);
	}
}
