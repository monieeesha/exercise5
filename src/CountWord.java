import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
/*Given a Array of Strings Count Each alphabet and if it occurs more than twice store it in a Hashmap along with a boolean value*/

public class CountWord {

    public Map<String, Boolean> countTheOccrenceOfWord(String[] input) {

        Map<String, Boolean> x = new HashMap<String, Boolean>();

         int count=0;

          for (int i = 0; i <input.length-1; i++) {
                count=0;

            for (int j = 0; j <input.length; j++) {


                    if (input[i] == input[j])
                    {
                        count++;
                    }
                }

                if (count >= 2) {
                    x.put(input[i], true);
                }
                else {
                    x.put(input[i], false);
                }

            }

        return x;
    }
}
