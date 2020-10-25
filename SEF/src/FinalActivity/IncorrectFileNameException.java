package FinalActivity;
import java.lang.Exception;

public class IncorrectFileNameException extends Exception {
 
	public IncorrectFileNameException() {
		super("Invalid name or surname. It should bu onlu letters!");
	}

	public IncorrectFileNameException(String message) {
		super(message);
	}		
}