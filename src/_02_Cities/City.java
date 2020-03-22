package _02_Cities;

import java.util.ArrayList;

public abstract class City {
	protected int population;
	protected double growthRate;
	
	public static void main(String[] args) {
		ArrayList<City> city = new ArrayList<City>();
		city.add(new SanDiego(1407000, 1.6));
		city.add(new Boston(673184, 1.2));
		city.add(new LosAngeles(3976000, 1.4));
		city.add(new Atlanta(472522, 1));

		
	}
	
	public City(int population, double growthRate) {
		this.population = population;
		this.growthRate = growthRate;
	}
	
	public int getPopulation() {
		return population;
	}
	
	public double getGrowthRate() {
		return growthRate;
	}
	
	abstract double getAnnualTaxes();
}
