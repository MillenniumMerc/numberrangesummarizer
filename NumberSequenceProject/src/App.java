import java.util.*;
public class App {
    public static void main(String[] args) throws Exception {
        NumberRangeSummarizerImpl summarizer = new NumberRangeSummarizerImpl();
        //Collection<Integer> inputNumbers = summarizer.collect("1,3,6,7,8,12,13,14,15,21,22,23,24,31");
        Collection<Integer> inputNumbers = summarizer.collect("1,1,3,6,7,8,12,13,14,15,21,22,23,24,25,26,27,31");
        String outputString = summarizer.summarizeCollection(inputNumbers);
        System.out.println(outputString);
    }
}
