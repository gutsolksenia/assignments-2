package sp;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

import static junit.framework.Assert.assertEquals;
import static org.junit.Assert.fail;
import static sp.SecondPartTasks.calculateGlobalOrder;
import static sp.SecondPartTasks.findQuotes;

public class SecondPartTasksTest {

    @Test
    public void testFindQuotes() {
        assertEquals(Arrays.asList("mama", "ramu"),
                                   findQuotes(Arrays.asList("mama", "myla", "ramu"), "am"));

        assertEquals(Arrays.asList("jflaVihLF", "afigauFha:H:", "jdshiwfSpF, ", "F"),
                findQuotes(Arrays.asList("jflaVihLF", "afigauFha:H:", "", "jdshiwfSpF, ", "F", "gggg"), "F"));

        assertEquals(new ArrayList<String>(),
                findQuotes(Arrays.asList("jflaVihLF", "afigauFha:H:", "", "jdshiwfSpF, ", "F", "gggg"), "!!!"));
    }

    @Test
    public void testPiDividedBy4() {
        fail();
    }

    @Test
    public void testFindPrinter() {
        fail();
    }

    @Test
    public void testCalculateGlobalOrder() {
        Map<String, Integer> ord1 = new HashMap<String, Integer>();
        ord1.put("pizza", 10);
        ord1.put("banana", 100);
        ord1.put("cola", 20);

        Map<String, Integer> ord2 = new HashMap<String, Integer>();
        ord2.put("pizza", 30);
        ord2.put("banana", 10);
        ord2.put("fanta", 20);

        Map<String, Integer> ord3 = new HashMap<String, Integer>();
        ord3.put("pizza", 2);
        ord3.put("apple", 10);
        ord3.put("banana", 20);

        Map<String, Integer> answ1 = new HashMap<String, Integer>();
        answ1.put("pizza", 42);
        answ1.put("banana", 130 );
        answ1.put("cola", 20);
        answ1.put("fanta", 20);
        answ1.put("apple", 10);

        assertEquals(calculateGlobalOrder(Arrays.asList(ord1, ord2, ord3)), answ1);

        Map<String, Integer> answ2 = new HashMap<String, Integer>();
        answ2.put("pizza", 40);
        answ2.put("banana", 110);
        answ2.put("cola", 20);
        answ2.put("fanta", 20);

        assertEquals(calculateGlobalOrder(Arrays.asList(ord1, ord2)), answ2);

        Map<String, Integer> answ3 = new HashMap<String, Integer>();
        answ3.put("pizza", 32);
        answ3.put("banana", 30);
        answ3.put("apple", 10);
        answ3.put("fanta", 20);

        assertEquals(calculateGlobalOrder(Arrays.asList(ord2, ord3)), answ3);
    }
}