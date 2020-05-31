package src;

import static org.junit.Assert.assertEquals;
import org.junit.Before;
import org.junit.Test;

public class SolutionTest {

    Solution solution;

    @Before
    public void setup(){
        solution = new Solution();
    }
    
    @Test
    public void SpinWordsTest() {
        assertEquals("emocleW", solution.spinWords("Welcome"));
        assertEquals("Hey wollef sroirraw",  solution.spinWords("Hey fellow warriors"));
    }
}
