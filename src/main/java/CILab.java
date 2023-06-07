public class CILab implements CILabInterface {
	
    private String myString;

    @Override
    public String getString() {
    	
    	if(this.myString == null)
    		return null;
    	
        return myString;
    }

    @Override
    public void setString(String string) {
        this.myString = string;
    }
    
    @Override
    public boolean detectCapitalUse() {
    	//get string to be examined
    	String text = this.getString();
    	
    	//if string is null or length is 0, return false
    	if (text == null || text.length() == 0)
    		return false;
    	
    	//all caps case
    	Boolean allCaps = checkIfAllCaps(text);
    	if(allCaps)
    		return true;
    	
    	//all lower case
    	Boolean allLower = checkIfAllLower(text);
    	if(allLower)
    		return true;
    	
    	
    	//firstLetter upper and rest lower case
    	Boolean onlyFirstLetterCaps = checkIfOnlyFirstLetterCaps(text);
    	if(onlyFirstLetterCaps)
    		return true;
    	
    	
        return false;
    }
    
    public boolean checkIfOnlyFirstLetterCaps(String text) {
    	char firstLetter = text.charAt(0);
    	
    	if(Character.isLowerCase(firstLetter))
    		return false;
    	
    	for(int i = 1; i < text.length(); i++) {
    		char letter = text.charAt(i);
    		if(Character.isUpperCase(letter))
    			return false;
    	}
    	
    	return true;	
    }
    
    public boolean checkIfAllCaps(String text) {
    	//check if string is all caps
    	for(int i = 0; i < text.length(); i++) {
    		char letter = text.charAt(i);
    		if(Character.isLowerCase(letter)) {
    			return false;
    		}
    	}
    	return true;
    }
    
    public boolean checkIfAllLower(String text) {
    	//check if string is all lowercase
    	for(int i = 0; i < text.length(); i++) {
    		char letter = text.charAt(i);
    		if(Character.isUpperCase(letter)) {
    			return false;
    		}
    	}
    	return true;
    }

}