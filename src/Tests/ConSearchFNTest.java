package Tests;

import models.contact.Contact;
import models.contact.HibUtil;
import org.hibernate.Session;
import org.hibernate.query.Query;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Created by Kristin Newill (aingealfire) on 3/29/2019.
 */
class ConSearchFNTest {

    @BeforeEach
    void setUp() {
    }

    @Test
    void conSearch() {

        //Hibernate Session and Queries
        Session hs = HibUtil.getSessionFactory().openSession();

        Query q = hs.createQuery("select firstName from models.contact.Contact where firstName = 'Spennig'");
        String res = String.valueOf(q.uniqueResult());

        Query q2 = hs.createQuery("select zip from models.contact.Contact where zip = '11235'");
        String res2 = String.valueOf(q2.uniqueResult());

        Query q3 = hs.createQuery("select lastName from models.contact.Contact where lastName = 'realironman@stark.net'");
        String res3 = String.valueOf(q3.uniqueResult());


        //Variables
        String str1 = "Spennig";
        String str2 = res;
        String str3 = "11235";
        String str4 = res2;
        String str5 = null;
        String str6 = res3;
        int int1 = 1;
        int	int2 = 5;
        int[] basicArrary1 = { 1, 5, 10 };
        int[] basicArrary2 = { 1, 5, 10 };

        //Asserts
        assertEquals(str1,str2);
        assertArrayEquals(basicArrary1, basicArrary2);
        /*assertSame(str3, str4);
        Fails due to issues: "org.opentest4j.AssertionFailedError: expected: java.lang.String@5696c927<11235> but was: java.lang.String@7459a21e<11235>"
        Even though it also gives:
        Expected :11235
        Actual   :11235
        */
        assertNotSame(str1, str3);
        assertNotNull(str6);
        assertNull(str5);
        assertTrue(int1<int2);
        assertFalse(int1>int2);

        hs.close();

        /*
        I was not able to successfully pull the ID int numbers in to use for the int tests.
        String values were able to be pulled and tested other than assertSame, which failed due to java.lang.String issue not the actual value pulled.
         */

        /*
        assertThat was removed from Junit 5
        */

    }


    @AfterEach
    void tearDown() {
    }
}