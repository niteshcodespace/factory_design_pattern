package factory;

import java.util.logging.Logger;

public class PodiDosa implements Dosa {
	
	private static final Logger logger =Logger.getLogger(PodiDosa.class.getName());

	@Override
	public void spreadFlavour() {
		logger.info("The podi is spread around the dosa");
		
	}

}
