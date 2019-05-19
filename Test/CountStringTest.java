import org.junit.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

import static javax.swing.UIManager.put;
import static org.junit.Assert.*;

public class CountStringTest {


        CountString fp;

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
            fp=new CountString();

            System.out.println("Inside Before");

        }

        @After
        public void tearDown()
        {
            //arrange
            fp=null;

            System.out.println("Inside After");

        }
        /*When a string is passed count only the counts and strore how many times it repeats in a hashmap*/
        @Test
        public  void  count_Givenstring_ReturnTheCountOfString()
        {
            assertEquals(new HashMap<String,Integer>() {{{put("one", 3); put("three", 2); put("four",1 ); }}},fp.countTheOccrenceOfString("one******three,one,one_________four!!!!three"));


        }
        /*when a Empty String is Given return a Emptymap*/
        @Test
       public  void  count_Givenstring_ReturnEmptyMap()
       {
        assertEquals(new HashMap<String,Integer>() {},fp.countTheOccrenceOfString("this is bangalore"));


       }

       /*When a string is passed count only the counts and strore how many times it repeats in a hashmap*/
       @Test
      public  void  count_Givenstring_ReturnMapContainingOnlyZeroToNine()
      {
        assertEquals(new HashMap<String,Integer>() {{put("one", 3); put("two",1 ); }},fp.countTheOccrenceOfString("ten$$$$$oneoneone-----two"));


      }

    }



