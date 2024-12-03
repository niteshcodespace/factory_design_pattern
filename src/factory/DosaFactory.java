package factory;

public class DosaFactory {

	public static Dosa createDosa(DosaTypes dosaTypes) {

		prepareDosa();

		switch (dosaTypes) {
		case Podi:
			return new PodiDosa();
		case Masala:
			return new MasalaDosa();
		case Onion:
			return new OnionDosa();
		default:
			
			throw new IllegalArgumentException("Unknown Dosa Types");
		}
		
	}

	private static void prepareDosa() {
		// TODO Auto-generated method stub
		// common first four steps
		// reusable code -- helper classes /utilies classes
		DosaPrepHelper.makeBatter();
		DosaPrepHelper.Ferment();
		DosaPrepHelper.heatTawa();
		DosaPrepHelper.pourBatter();
		
	}

}
