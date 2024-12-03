package factory;

import java.util.logging.Logger;

public class MasalaDosa implements Dosa {
	
	private static final Logger logger =Logger.getLogger(MasalaDosa.class.getName());

	@Override
	public void spreadFlavour() {
		logger.info("The Masala spread inside the dosa");
		
	}

}
