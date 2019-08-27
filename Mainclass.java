package rahul.assignment.exceptions;

public class Mainclass {

	public static void main(String[] args) {
		try {
			VerifyDetails vd=new VerifyDetails("98765432101", "9876","521175");
			vd.checkValidity();
		}catch(InvalidPhoneNumber | InvalidOtp | InvalidPincode e) {
			System.out.println(e.getMessage());
		}finally {
			System.out.println("final block.");
		}

	}

}
