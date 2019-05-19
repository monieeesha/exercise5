import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
/*Given string it will count the number of occurences of only the counts Ex:one,two...nine*/

public class CountString {
    public  Map<String, Integer> countTheOccrenceOfString(String input) {

        Map<String, Integer> x = new HashMap<String, Integer>();

        String[] str = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};

        for (int i = 0; i < str.length; i++) {
            Pattern pattern = Pattern.compile(str[i]);
            Matcher matcher = pattern.matcher(input);
            int count = 0;
            while (matcher.find()) {
                count++;
            }

            if (count >=1) {
                x.put(str[i], count);
            }
        }
        return x;
    }
}
