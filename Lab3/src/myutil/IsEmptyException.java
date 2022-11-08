package myutil;

//TODO: Komplettering, this is not a nullpointerexception. Your
//exceptions should either extend from RuntimeException or Exception
//(which one is more reasonable?). Fix this for all of your
//exceptions. DONE

public class IsEmptyException extends RuntimeException {

	public IsEmptyException(String message) {
		super("ERROR: " + message + " is empty.");
	}
}
