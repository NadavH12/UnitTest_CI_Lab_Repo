import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class CILabTest {

    private CILabInterface myString;

    @BeforeEach
    public void setUp() {
        myString = new CILab();
    }

    @AfterEach
    public void tearDown() {
        myString = null;
    }

    @Test
    public void detectCapitalUseTest1() {
    	myString.setString("leetcode");
        boolean test = myString.detectCapitalUse();
        assertTrue(test);
    }
    
    @Test
    public void detectCapitalUseTest2() {
    	myString.setString("USA");
    	boolean test = myString.detectCapitalUse();
    	assertTrue(test);
    }

    @Test
    public void detectCapitalUseTest3() {
    	myString.setString("Google");
    	boolean test = myString.detectCapitalUse();
    	assertTrue(test);
    	
    }
    
    @Test
    public void detectCapitalUseTest4() {
    	myString.setString("FalsE");
    	boolean test = myString.detectCapitalUse();
    	assertFalse(test);
    }
}