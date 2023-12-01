class unknownException extends RuntimeException{
	unknownException(String getit){
		super(getit);
	}
}

public class cutomised_ecception{
	public static void main(String[] args){
		int x = 20;
		if(x>15){
			System.out.println("go to the lead....");
		}else{
			throw new unknownException("value is lower .......");
		}
	}
}
	
	