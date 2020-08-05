package snapcheckchallenge;
import org.junit.Test;
import static org.junit.Assert.*;

/*
 * Unit tests for the Encrypt function
 */

public class unittest {
	
	Encryption e = new Encryption();
	
	@Test
	public void testSample0() {

        String result = e.encrypt("haveaniceday");

        assertEquals("hae and via ecy", result);

    }
	
	@Test
	public void testSample1() {

        String result = e.encrypt("feedthedog");

        assertEquals("fto ehg ee dd", result);

    }
	
	@Test
	public void testSample2() {

        String result = e.encrypt("chillout");

        assertEquals("clu hlt io", result);

    }
	
	@Test
	public void testExample() {

        String result = e.encrypt("ifmanwasmeanttostayonthegroundgodwouldhavegivenusroots");

        assertEquals("imtgdvs fearwer mayoogo anouuio ntnnlvt wttddes aohghn sseoau", result);

    }
	
	@Test
	public void testSizeofOne() {

        String result = e.encrypt("a");

        assertEquals("a", result);

    }
	
	@Test
	public void testSmallSize() {

        String result = e.encrypt("ab");

        assertEquals("ab", result);

    }
	
	@Test(expected = AssertionError.class)
	public void testZeroSize() {

        String result = e.encrypt("");

    }
	
	
	@Test(expected = AssertionError.class)
	public void testTooBigSize() {

        String result = e.encrypt("asdhfioasdhfhsfiohewPIOFHesofhsdoihfoijksdhbfljkasdhfkjdshfkjahsifhasedifhsldkfhisdhfsajkdhfaadvjkndfakjhsdlfjhesdklfhasdkfkasd");

    }
	
	@Test(expected = AssertionError.class)
	public void testWrongInput() {

        String result = e.encrypt("asd;A1hfsdkfkasd");

    }
	
	@Test(expected = NullPointerException.class)
	public void testNullInput() {
		String n = null;

        String result = e.encrypt(n);

    }
	
	
	
	

}
