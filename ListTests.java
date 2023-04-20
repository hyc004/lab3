import static org.junit.Assert.*;
import org.junit.*;
import java.util.ArrayList;
import java.util.List;


public class ListTests {
    public class Check implements StringChecker {
        public boolean checkString(String input) {
            if (input.contains("a")) {
                return true;
            } else return false;
        }
    }
	@Test
    public void testFilter() {
        List<String> strList = new ArrayList<>();
        StringChecker y = new Check();
        strList.add("howard");
        strList.add("bob");
        strList.add("apple");
        strList.add("red");
        List<String> actual = ListExamples.filter(strList, y);
        Object[] x = actual.toArray();
        assertArrayEquals("test1", new Object[] {"howard", "apple"}, x);

    }
    public void testMerge() {
        List<String> strList1 = new ArrayList<>();
        List<String> strList2 = new ArrayList<>();
        strList1.add("bob");
        strList1.add("howard");
        strList2.add("apple");
        strList2.add("red");
        List<String> actual = ListExamples.merge(strList1, strList2);
        Object[] x = actual.toArray();
        assertArrayEquals("test2", new Object[] {"apple", "bob", "howard", "red"}, x);
    }
}    