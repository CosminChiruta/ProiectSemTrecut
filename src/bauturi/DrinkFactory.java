package bauturi;

import meniu.AbstractFactory;
import meniu.FD;

public class DrinkFactory implements AbstractFactory {

	@Override
	public FD getFD(String FDtype) {
		switch(FDtype) {
			case "Bere": return new Bere();
			case "Fanta": return new Fanta();
			case "Cola": return new Cola();
			case "Sprite": return new Sprite();
			case "Nestea": return new Nestea();
			case "Cafea": return new Cafea();
		}
		return null;
	}

}
