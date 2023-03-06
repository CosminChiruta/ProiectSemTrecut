package meniu;

import bauturi.DrinkFactory;
import mancare.FoodFactory;

public final class FactoryParser {
	private  FactoryParser() {
		throw new AssertionError();
	}
	public static AbstractFactory getFactory(String factoryType) {
		switch(factoryType)
		{
		case "Mancare":return new FoodFactory();
		case "Bautura": return new DrinkFactory();
		}
		return null;
	}
}
