package zoo_keeper2;

public class Gorilla extends Mammal{
	
	public void throwSomething() {
		this.setEnergyLevel(this.displayEnergy() - 5);
		System.out.println("The gorilla has thrown something.");
	}
	
	public void eatBananas() {
		this.setEnergyLevel(this.displayEnergy() + 10);
		System.out.println("The gorilla has eaten a banana.");
	}
	
	public void climb() {
		this.setEnergyLevel(this.displayEnergy() - 10);
		System.out.println("The gorilla has climbed a tree.");
	}
}
