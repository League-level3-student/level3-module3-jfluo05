package _01_AnimalFarm;
import java.util.ArrayList;

public class Farm {
public static void main(String[] args) {
	 ArrayList<Animal> farm = new ArrayList<Animal>(); 
	 farm.add(new Camel());
	 farm.add(new Emu());
	 farm.add(new Alpaca());
	 farm.add(new Ostrich());
	 farm.add(new Camel());
	 farm.add(new Emu());

	 for (int i = 0; i < farm.size(); i++) {
		farm.get(i).makeNoise();
		farm.get(i).breathe();
	}
}
}
