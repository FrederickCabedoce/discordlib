package cabedoce.cloud.solutions.discord.discordlib.exception;

public class MissingHandlerException extends Exception {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 887542610938975732L;
	
	private static final String ERROR_MESSAGE = "There is a missing command handler implementation. Missing handler : ";
	
	public MissingHandlerException(String missingHandler) {
		super(ERROR_MESSAGE + missingHandler);
	}

}
