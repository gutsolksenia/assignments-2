package sp;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static junit.framework.Assert.assertEquals;
import static org.junit.Assert.fail;
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
        fail();
    }
}