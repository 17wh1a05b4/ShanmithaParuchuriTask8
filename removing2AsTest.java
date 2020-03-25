package Epam;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class removing2AsTest {
	
	removing2As x;
	
	@BeforeEach
	void setUp() {
		x = new removing2As();
	}

	@Test
	void firstA() {
		assertEquals("CDB",x.remove("ACDB"));
	}
	
	@Test
	void firstTwoAs() {
		assertEquals("BD", x.remove("AABD"));
	}
	
	@Test
	void AinTheMiddle() {
		assertEquals("BDC", x.remove("BADC"));
	}
	
	@Test
	void AsAtTheEnd() {
		assertEquals("CCAA", x.remove("CCAA"));
	}
	
	@Test
	void testing() {
		assertEquals("CCAA", x.remove("AACCAA"));
	}
}
