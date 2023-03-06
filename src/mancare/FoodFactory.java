package mancare;

import meniu.AbstractFactory;
import meniu.FD;

public class FoodFactory implements AbstractFactory{

	@Override
	public FD getFD(String FDtype) {
		switch(FDtype) {
			case "Pizza":return new Pizza();
			case "Ciorba":return new Ciorba();
			case "Shaorma":return new Shaorma();
			case "Paste":return new Paste();
			case "Legume la cuptor":return new Legume_la_cuptor();
			case "Friptura de porc":return new Friptura_de_porc();
		}
		return null;
	}

}
