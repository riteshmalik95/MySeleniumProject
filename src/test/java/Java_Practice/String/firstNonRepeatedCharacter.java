package String;

public class firstNonRepeatedCharacter {

	public static void main(String[] args) {
        String str="serious";
        for(int i=0;i<str.length();i++) {
        	//Check if the character is non-repeated
        	if(str.indexOf(str.charAt(i))==str.lastIndexOf(str.charAt(i))){
        		System.out.println("First non-repeated character: "+str.charAt(i));
        		break;
        	}
        }
	}

}
