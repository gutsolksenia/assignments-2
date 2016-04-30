package sp;

import org.junit.Assert;
import org.junit.Test;

import java.util.*;

import static junit.framework.Assert.assertEquals;
import static org.junit.Assert.fail;
import static sp.SecondPartTasks.calculateGlobalOrder;
import static sp.SecondPartTasks.findPrinter;
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
        Map<String, List<String>> test1 = new HashMap<String, List<String>>();
        test1.put("Esenin", Arrays.asList("sjkfskh", "sdfkjhfskh", "kjsfhk"));
        test1.put("Pushkin", Arrays.asList("sjkfskhggg", "sdfkjhfskh", "kjsfhkg"));
        test1.put("Mayakovskiy", Arrays.asList("sjkfskhggg", "sdfkjhfskh", "kjsfhkg"));
        assertEquals("Pushkin", findPrinter(test1));

        Map<String, List<String>> test2 = new HashMap<String, List<String>>();
        test2.put("Esenin", Arrays.asList("sjkfskh", "sdfkjhfskh", "kjsfhk"));
        test2.put("Pushkin", Arrays.asList("sjkfskhggg", "sdfkjhfskh", "kjsfhkg"));
        test2.put("Tolstoy", Arrays.asList("ksfhcs", "", "jccccccccccccccccccccccccccccccccccccccc", "hffffffffffff", "djjj"));

        Assert.assertEquals("Tolstoy", findPrinter(test2));

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