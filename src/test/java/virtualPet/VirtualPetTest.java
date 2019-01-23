package virtualPet;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class VirtualPetTest {

	@Test
	public void shouldReturnObjectProperties() {
		Pet underTest = new Pet(50, 50, 50, 50, 50);
		int thirst = underTest.getThirst();
		int hunger = underTest.getHunger();
		int waste = underTest.getWaste();
		int boredom = underTest.getBoredom();
		int energy = underTest.getEnergy();
		assertEquals(50, thirst);
		assertEquals(50, hunger);
		assertEquals(50, waste);
		assertEquals(50, boredom);
		assertEquals(50, energy);
	}

	@Test
	public void shouldIncreaseAtributesWithTick() {
		Pet underTest = new Pet(50, 50, 50, 50, 50);
		underTest.tick(10);
		int thirst = underTest.getThirst();
		int hunger = underTest.getHunger();
		int waste = underTest.getWaste();
		int boredom = underTest.getBoredom();
		int energy = underTest.getEnergy();
		assertEquals(60, thirst);
		assertEquals(60, hunger);
		assertEquals(60, waste);
		assertEquals(60, boredom);
		assertEquals(60, energy);
	}

	@Test
	public void shouldDecreaseHungerWithFeeding() {
		Pet underTest = new Pet(50, 50, 50, 50, 50);
		underTest.feed();
		int hunger = underTest.getHunger();
		assertEquals(0, hunger);
	}

	@Test
	public void shouldIncreaseThirstAndWasteWithFeeding() {
		Pet underTest = new Pet(50, 50, 50, 50, 50);
		underTest.feed();
		int thirst = underTest.getThirst();
		int waste = underTest.getWaste();
		assertEquals(60, thirst);
		assertEquals(60, waste);
	}

	@Test
	public void shouldDecreaseBoredomWithPlay() {
		Pet underTest = new Pet(50, 50, 50, 50, 50);
		underTest.play();
		int boredom = underTest.getBoredom();
		assertEquals(0, boredom);
	}

	@Test
	public void shouldIncreaseEnergyandHungerWithPlay() {
		Pet underTest = new Pet(50, 50, 50, 50, 50);
		underTest.play();
		int hunger = underTest.getHunger();
		int energy = underTest.getEnergy();
		assertEquals(60, hunger);
		assertEquals(60, energy);
	}

	@Test
	public void shouldDecreaseEnergyWithSleep() {
		Pet underTest = new Pet(50, 50, 50, 50, 50);
		underTest.sleep();
		int energy = underTest.getEnergy();
		assertEquals(0, energy);
	}

	@Test
	public void shouldIncreaseHungerandThirstWithSleep() {
		Pet underTest = new Pet(50, 50, 50, 50, 50);
		underTest.sleep();
		int hunger = underTest.getHunger();
		int thirst = underTest.getThirst();
		assertEquals(60, hunger);
		assertEquals(60, thirst);
	}

	@Test
	public void shouldDecreaseThirstWithDrink() {
		Pet underTest = new Pet(50, 50, 50, 50, 50);
		underTest.drink();
		int thirst = underTest.getThirst();
		assertEquals(0, thirst);
	}

	@Test
	public void shouldDecreaseWasteWithBathroom() {
		Pet underTest = new Pet(50, 50, 50, 50, 50);
		underTest.bathroom();
		int waste = underTest.getWaste();
		assertEquals(0, waste);
	}

	@Test
	public void shouldRefusePlayWhenEnergyIs100() {
		Pet underTest = new Pet (50,50,50,50, 100);
		underTest.play();
		int boredom = underTest.getBoredom();
		assertEquals(50,boredom); 
		}
	
	}

