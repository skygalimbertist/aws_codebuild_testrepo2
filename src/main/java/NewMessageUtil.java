public class NewMessageUtil extends MessageUtil {
	
	private String message;

	public NewMessageUtil(String message) {
		super(message);
		this.message = message;
	}

	public String salutationMessage() {
		message = "Hi all!" + message;
		System.out.println(message);
		return message;
	}
}
