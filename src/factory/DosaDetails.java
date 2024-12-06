package factory;

public class DosaDetails {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Dosa dosa= DosaFactory.createDosa(DosaTypes.Podi);
		Dosa dosa= DosaFactory.createDosa(DosaTypes.Podi);
		dosa.spreadFlavour();
		

	}

}
