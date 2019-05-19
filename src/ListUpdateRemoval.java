import java.util.ArrayList;
import java.util.List;


public class ListUpdateRemoval {

  /*method for updating the list with given strings*/
    public ArrayList<String> updateList(ArrayList<String> arrayList1, String str1[], String str2[]) {

        for (int i = 0; i < str1.length; i++)
        {
            if(arrayList1.contains(str1[i]))
            {
                int k = arrayList1.indexOf(str1[i]);
                arrayList1.remove(k);
                arrayList1.add(k, str2[i]);
            }
        }
        return arrayList1;
    }

/*method to clear the array List*/
    public ArrayList<String> removeList(ArrayList<String> arrayList1) {


        arrayList1.clear();
        return arrayList1;
    }

}

