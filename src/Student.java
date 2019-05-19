import kotlin.reflect.jvm.internal.impl.load.kotlin.JvmType;

import java.security.PrivateKey;
import java.util.*;

public class Student{


    private String name;
    private  int age;
    private  int id;

    Student(String name,int age,int id)
    {

        this.name=name;
        this.age=age;
        this.id=id;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public int getId() {
        return id;
    }


    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", id=" + id +
                '}';
    }
}


    class MainTest {
    public static void main(String args[]) {
    Student obj1 = new Student("Anush", 18, 10);
    Student obj2 = new Student("vani", 20, 30);
    Student obj3 = new Student("monisha", 22, 50);
    Student obj4 = new Student("harshitha", 18, 40);
    Student obj5 = new Student("harshitha", 21, 20);
    List<Student> list = new ArrayList<Student>();
    list.add(obj1);
    list.add(obj2);
    list.add(obj3);
    list.add(obj4);
    list.add(obj5);
    StudentSort s=new StudentSort();
    Collections.sort(list,s);
    for(Student str: list)
        System.out.println(" "+str);

    }
 }
class StudentSort  implements Comparator<Student>
        {

            public int compare(Student x1,Student x2)
            {
                int n=x1.getAge()-(x2.getAge());
                if(n==0)
                {
                    int k=x1.getName().compareTo(x2.getName());
                    if(k==0)
                    {
                          return x1.getId()-(x2.getId());
                    }
                    else
                    {
                        return k;
                    }
                }
                else
                {
                    return n;
                }



            }


        }








