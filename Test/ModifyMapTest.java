import org.junit.*;

import java.util.HashMap;

import static org.junit.Assert.*;

public class ModifyMapTest {

        ModifyMap fp;

        @BeforeClass
        public static void setUpBeforeClass()
        {


            System.out.println("Inside BeforeClass");

        }

        @AfterClass
        public static void tearDownAfterClass()
        {


            System.out.println("Inside AfterClass");

        }

        @Before
        public void setUp()
        {
            //arrange
            fp=new ModifyMap();

            System.out.println("Inside Before");

        }

        @After
        public void tearDown()
        {
            //arrange
            fp=null;

            System.out.println("Inside After");

        }

        /*method will replace the python by java and replace java by "" in a hashmap*/
        @Test
        public  void  count_Givenstring_ReturnTheCountOfString()
        {
            assertEquals(new HashMap<String,String>(){{put("val1",""); put("val2","java");}},fp.elementExchange(new HashMap<String,String>(){{put("val1", "java"); put("val2", "python");}}));

        }

    /*method will replace the kerala by andra and andra value1 by "" in a hashmap*/
        @Test
        public  void  count2_Givenstring_ReturnTheCountOfString()
        {
        assertEquals(new HashMap<String,String>(){{put("val1",""); put("val2","andra");}},fp.elementExchange(new HashMap<String,String>(){{put("val1", "andra"); put("val2", "kerala");}}));

        }

}