package emailapp;

public class EmailApp {

	public static void main(String[] args) {
		
		Email email = new Email("Jonathan", "Sequeira");
		
		email.setAlternateEmail("sequeira.s.jonathan@gmail.com");
		email.setMailboxCapacity(1000);

		email.showInfo();
	}
}
