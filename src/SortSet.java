import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.TreeSet;

/* sort the randomly passed string Elements in a set and store it in alist*/
public class SortSet {

    public List<String>  convertList( HashSet<String> x)
    {
        TreeSet<String> ts = new TreeSet<String>(x);
        List<String> list = new ArrayList<String>(ts);
        return list;
    }
}
