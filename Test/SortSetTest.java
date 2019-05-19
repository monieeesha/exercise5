import org.junit.*;

import java.util.*;

import static org.junit.Assert.*;

public class SortSetTest {

         SortSet fp;

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
            fp=new SortSet();

            System.out.println("Inside Before");

        }

        @After
        public void tearDown()
        {
            //arrange
            fp=null;

            System.out.println("Inside After");

        }
       /* sort the randomly passed string Elements in a set and store it in a list*/
        @Test
         public void  check_GivenSet_ReturnsortedList()
        {

            assertEquals(new ArrayList<String>(Arrays.asList("apple","banana","carrots","dryfruits")),fp.convertList(new HashSet<String>((Arrays.asList("carrots","banana","apple","dryfruits")))));

        }

        /* sort the randomly passed string Elements in a set and store it in a list*/
        @Test
        public void  check1_GivenSet_ReturnsortedList()
        {

        assertEquals(new ArrayList<String>(Arrays.asList("Alive","bluto","crypto")),fp.convertList(new HashSet<String>((Arrays.asList("Alive","bluto","crypto")))));

         }
}