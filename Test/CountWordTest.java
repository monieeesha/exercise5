import org.junit.*;

import java.util.HashMap;

import static org.junit.Assert.*;

public class CountWordTest
{

       CountWord fp;

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
            fp=new CountWord();

            System.out.println("Inside Before");

        }

        @After
        public void tearDown()
        {
            //arrange
            fp=null;

            System.out.println("Inside After");

        }

        /*Given a Array of Strings Count Each alphabet and if it occurs more than twice store it in a Hashmap along with a boolean value*/
        @Test
        public  void  count_Givenstring_ReturnTheCountOfString()
        {
            assertEquals(new HashMap<String,Boolean>() {{{put("a", true); put("b",false); put("c",true ); }}},fp.countTheOccrenceOfWord(new String[]{"a","b","c","a","a","c","c","c","c"}));
        }


       /*Given a Empty string array return a EmptyMap*/
       @Test
        public  void  count_GivenEmptystring_ReturnEmptyString()
       {
        assertEquals(new HashMap<String,Boolean>() {},fp.countTheOccrenceOfWord(new String[]{}));
       }

    }





