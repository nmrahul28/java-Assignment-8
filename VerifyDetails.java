package rahul.assignment.exceptions;

public class VerifyDetails {
	String phoneNumber;
	String Otp;
	String pinCode;
	
	VerifyDetails(String phoneNumber, String Otp, String pinCode){
		this.phoneNumber=phoneNumber;
		this.Otp=Otp;
		this.pinCode=pinCode;
		
	}
	public void checkValidity() throws InvalidPhoneNumber, InvalidOtp, InvalidPincode {	
		if(phoneNumber.length()>10 || phoneNumber.length()<10 ) {
			throw new InvalidPhoneNumber("Phone Number is invalid");
		}
		if(Otp.length()>4 || Otp.length()<4) {
			throw new InvalidOtp("Otp is invalid");
		}
		if(pinCode.length()>6 || pinCode.length()<6) {
			throw new InvalidPincode("Pincode is invalid");
		}
	}
}
