import java.util.*;

public class NumberRangeSummarizerImpl implements NumberRangeSummarizer {

    public Collection<Integer> collect(String input) 
    {
        
        // Split the input string into individual number strings and parse them into integers
        String[] numberStrings = input.split(",");
        List<Integer> numbers = new ArrayList<>();
        for (String numberString : numberStrings) {
            try {
                int number = Integer.parseInt(numberString.trim());
                numbers.add(number);
                //numbers are added to an arraylist 
            } catch (NumberFormatException e) {
                // Ignore any non-integer input values t7hfy6h6tg6 number int add the sorted list t
            }
        }
        return numbers;
    }

    
    public String summarizeCollection(Collection<Integer> input) {
        if (input == null || input.isEmpty()) {
            return "Input invalid.";
        }
        // Sort the input numbers ASC
        List<Integer> sortedNumbers = new ArrayList<>(input);
        Collections.sort(sortedNumbers);
        
        // compile output string
        StringBuilder sb = new StringBuilder();
        int startNumber = sortedNumbers.get(0);
        int lastNumber = startNumber;
        sb.append(startNumber);
        for (int i = 1; i < sortedNumbers.size(); i++) {
            int number = sortedNumbers.get(i);
            if (number == lastNumber + 1) {
                // The current number is sequential to the previous number
                lastNumber = number;
            } else {
                // The current number is not sequential to the previous number
                if (lastNumber > startNumber) {
                    // Output a range of numbers instead of just the lastNumber
                    sb.append("-").append(lastNumber);
                }
                sb.append(", ").append(number);
                startNumber = number;
                lastNumber = number;
            }
        }
        // Handle the last range of numbers, if there was one
        if (lastNumber > startNumber) {
            sb.append("-").append(lastNumber);
        }
        return sb.toString();
    }
}
