import java.util.HashMap;
import java.util.Map;

public class ModifyMap {


/*method will replace the value2 by value1 and replace value1 by "" in a hashmap*/
    public   Map<String, String> elementExchange(Map<String, String> x)
    {

      String var= x.get("val1");
      x.put("val2",var);
      x.put("val1","");
      return x;

    }

}
