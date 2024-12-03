package factory;

import java.util.logging.Logger;

public class OnionDosa implements Dosa {
	
	private static final Logger logger =Logger.getLogger(OnionDosa.class.getName());

	@Override
	public void spreadFlavour() {
		logger.info("The Onion is spread inside the dosa");
		
	}

}
