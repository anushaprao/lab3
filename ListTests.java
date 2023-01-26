import static org.junit.Assert.*;
import org.junit.*;
import java.util.List;
import java.util.ArrayList;

public class ListTests {
    @Test 
	public void testList() {
    String[] list1 = new String[] {"cat", "dog", "lion"};
    List<String> input1 = new ArrayList<String>();
    StringCheck SC = new StringCheck();
    //ListExamples.filter(list1);
    for (int i = 0; i < 3; i++){
        input1.add(i,list1[i]);
    }

    assertEquals(input1, ListExamples.filter(input1,SC));
	}
    
}
