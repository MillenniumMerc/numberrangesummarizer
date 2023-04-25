import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import static org.junit.Assert.assertEquals;
import java.util.Collection;
import java.util.Arrays;

@RunWith(JUnit4.class)
public class NumberRangeSummarizerImplTest {

    @Test
    public void testSummarizeCollection() {
        NumberRangeSummarizerImpl summarizer = new NumberRangeSummarizerImpl();
        Collection<Integer> inputNumbers = Arrays.asList(1, 3, 6, 7, 8, 12, 13, 14, 15, 21, 22, 23, 24, 31);
        String expectedOutput = "1, 3, 6-8, 12-15, 21-24, 31";
        String actualOutput = summarizer.summarizeCollection(inputNumbers);
        assertEquals(expectedOutput, actualOutput);
    }
}
