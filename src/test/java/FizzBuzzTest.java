import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.io.StringReader;

import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.impl.FizzBuzz;

public class FizzBuzzTest {
    private PrintStream out;
    private FizzBuzz fb;
    private static final String systemDefaultNewLineString = System.getProperty("line.separator");

    @Before
    public void setUp() {
        fb = new FizzBuzz();
        out = System.out;
    }

    @After
    public void tearDown() {
        System.setOut(out);
    }

    private void doFizzBuzz(int n, String s) throws IOException {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        BufferedOutputStream bos = new BufferedOutputStream(baos);
        System.setOut(new PrintStream(bos));

        fb.fizzbuzz(n);

        System.out.flush();
        assertEquals(s, baos.toString());
    }

    @Test
    public void testFizzBuzz() throws IOException {
        doFizzBuzz(1, "1" + systemDefaultNewLineString);
        doFizzBuzz(2, "1" + systemDefaultNewLineString + "2" + systemDefaultNewLineString);
        doFizzBuzz(3, "1" + systemDefaultNewLineString + "2" + systemDefaultNewLineString + "Fizz" + systemDefaultNewLineString);
        doFizzBuzz(4, "1" + systemDefaultNewLineString + "2" + systemDefaultNewLineString + "Fizz" + systemDefaultNewLineString + "4" + systemDefaultNewLineString);
        doFizzBuzz(5, "1" + systemDefaultNewLineString + "2" + systemDefaultNewLineString + "Fizz" + systemDefaultNewLineString + "4" + systemDefaultNewLineString + "Buzz" + systemDefaultNewLineString);
        doFizzBuzz(6, "1" + systemDefaultNewLineString + "2" + systemDefaultNewLineString + "Fizz" + systemDefaultNewLineString + "4" + systemDefaultNewLineString + "Buzz" + systemDefaultNewLineString + "Fizz" + systemDefaultNewLineString);
        doFizzBuzz(7, "1" + systemDefaultNewLineString + "2" + systemDefaultNewLineString + "Fizz" + systemDefaultNewLineString + "4" + systemDefaultNewLineString + "Buzz" + systemDefaultNewLineString + "Fizz" + systemDefaultNewLineString + "7" + systemDefaultNewLineString);
        doFizzBuzz(8, "1" + systemDefaultNewLineString + "2" + systemDefaultNewLineString + "Fizz" + systemDefaultNewLineString + "4" + systemDefaultNewLineString + "Buzz" + systemDefaultNewLineString + "Fizz" + systemDefaultNewLineString + "7" + systemDefaultNewLineString + "8" + systemDefaultNewLineString);
        doFizzBuzz(9, "1" + systemDefaultNewLineString + "2" + systemDefaultNewLineString + "Fizz" + systemDefaultNewLineString + "4" + systemDefaultNewLineString + "Buzz" + systemDefaultNewLineString + "Fizz" + systemDefaultNewLineString + "7" + systemDefaultNewLineString + "8" + systemDefaultNewLineString + "Fizz" + systemDefaultNewLineString);
        doFizzBuzz(10, "1" + systemDefaultNewLineString + "2" + systemDefaultNewLineString + "Fizz" + systemDefaultNewLineString + "4" + systemDefaultNewLineString + "Buzz" + systemDefaultNewLineString + "Fizz" + systemDefaultNewLineString + "7" + systemDefaultNewLineString + "8" + systemDefaultNewLineString + "Fizz" + systemDefaultNewLineString + "Buzz" + systemDefaultNewLineString);
        doFizzBuzz(11, "1" + systemDefaultNewLineString + "2" + systemDefaultNewLineString + "Fizz" + systemDefaultNewLineString + "4" + systemDefaultNewLineString + "Buzz" + systemDefaultNewLineString + "Fizz" + systemDefaultNewLineString + "7" + systemDefaultNewLineString + "8" + systemDefaultNewLineString + "Fizz" + systemDefaultNewLineString + "Buzz" + systemDefaultNewLineString + "11" + systemDefaultNewLineString);
        doFizzBuzz(12, "1" + systemDefaultNewLineString + "2" + systemDefaultNewLineString + "Fizz" + systemDefaultNewLineString + "4" + systemDefaultNewLineString + "Buzz" + systemDefaultNewLineString + "Fizz" + systemDefaultNewLineString + "7" + systemDefaultNewLineString + "8" + systemDefaultNewLineString + "Fizz" + systemDefaultNewLineString + "Buzz" + systemDefaultNewLineString + "11" + systemDefaultNewLineString + "Fizz" + systemDefaultNewLineString);
        doFizzBuzz(13, "1" + systemDefaultNewLineString + "2" + systemDefaultNewLineString + "Fizz" + systemDefaultNewLineString + "4" + systemDefaultNewLineString + "Buzz" + systemDefaultNewLineString + "Fizz" + systemDefaultNewLineString + "7" + systemDefaultNewLineString + "8" + systemDefaultNewLineString + "Fizz" + systemDefaultNewLineString + "Buzz" + systemDefaultNewLineString + "11" + systemDefaultNewLineString + "Fizz" + systemDefaultNewLineString + "13" + systemDefaultNewLineString);
        doFizzBuzz(14, "1" + systemDefaultNewLineString + "2" + systemDefaultNewLineString + "Fizz" + systemDefaultNewLineString + "4" + systemDefaultNewLineString + "Buzz" + systemDefaultNewLineString + "Fizz" + systemDefaultNewLineString + "7" + systemDefaultNewLineString + "8" + systemDefaultNewLineString + "Fizz" + systemDefaultNewLineString + "Buzz" + systemDefaultNewLineString + "11" + systemDefaultNewLineString + "Fizz" + systemDefaultNewLineString + "13" + systemDefaultNewLineString + "14" + systemDefaultNewLineString);
        doFizzBuzz(15, "1" + systemDefaultNewLineString + "2" + systemDefaultNewLineString + "Fizz" + systemDefaultNewLineString + "4" + systemDefaultNewLineString + "Buzz" + systemDefaultNewLineString + "Fizz" + systemDefaultNewLineString + "7" + systemDefaultNewLineString + "8" + systemDefaultNewLineString + "Fizz" + systemDefaultNewLineString + "Buzz" + systemDefaultNewLineString + "11" + systemDefaultNewLineString + "Fizz" + systemDefaultNewLineString + "13" + systemDefaultNewLineString + "14" + systemDefaultNewLineString + "FizzBuzz" + systemDefaultNewLineString);
        doFizzBuzz(16, "1" + systemDefaultNewLineString + "2" + systemDefaultNewLineString + "Fizz" + systemDefaultNewLineString + "4" + systemDefaultNewLineString + "Buzz" + systemDefaultNewLineString + "Fizz" + systemDefaultNewLineString + "7" + systemDefaultNewLineString + "8" + systemDefaultNewLineString + "Fizz" + systemDefaultNewLineString + "Buzz" + systemDefaultNewLineString + "11" + systemDefaultNewLineString + "Fizz" + systemDefaultNewLineString + "13" + systemDefaultNewLineString + "14" + systemDefaultNewLineString + "FizzBuzz" + systemDefaultNewLineString + "16" + systemDefaultNewLineString);
    }
}
