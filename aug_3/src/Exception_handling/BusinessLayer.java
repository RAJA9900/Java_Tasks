package Exception_handling;

public class BusinessLayer {
	
	public void isValidAadharCard(String aadharCard) throws InvalidAadharException, InvalidAadharLengthException{
		//1234567890121
		//
		aadharCard = aadharCard.replaceAll(" ", "").trim();
		if(aadharCard.matches("[0-9]{12}")) {
			System.out.println("Aadhar Num3ber is Valid");
		} else if(aadharCard.length()>12) {
			throw new InvalidAadharLengthException("Invalid Aadhar Length");
		} else {
			throw new InvalidAadharException("Invalid Aadhar Number");
		}
	}
	
	public void isValidPassword(String password) throws InvalidPasswordException{
		if (password.matches("[A-Z]{1}[0-9]{1}[!@#$%]{1}[a-zA-Z]{5,28}")) {
			System.out.println(password + " is a valid Password");
		} else {
			throw new InvalidPasswordException(password + " is a Invalid password");
		}
	}
	
	
}
