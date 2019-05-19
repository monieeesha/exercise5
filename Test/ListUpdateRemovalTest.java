import org.junit.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class ListUpdateRemovalTest {
        ListUpdateRemoval fp;

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
            fp=new ListUpdateRemoval();

            System.out.println("Inside Before");

        }

        @After
        public void tearDown()
        {
            //arrange
            fp=null;

            System.out.println("Inside After");

        }
        @Test
        public  void  updatelist_GivenListToReplace_ReturnUpdatedList()
        {


          assertEquals(new ArrayList<String>(Arrays.asList("kiwi","grape","mango","berry")),fp.updateList(new ArrayList<String>(Arrays.asList("apple","grape","melon","berry")),new String[]{"apple","melon"},new String[]{"kiwi","mango"}));

        }

      @Test
      public  void  removelist_GivenListToRemove_ReturnEmptyList()
       {


        assertEquals(new ArrayList<String>(Arrays.asList()),fp.removeList(new ArrayList<String>(Arrays.asList("apple","grape","melon","berry"))));

       }




}

