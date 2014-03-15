import static org.junit.Assert.*;
import static org.hamcrest.Matchers.*;

import org.junit.Test;

public class Recurrsion_Test {

	@Test
	public void test() {
		int sum = Recurrsion.sum(1, 1, 5);
		assertThat(sum, equalTo(120));
	}

	@Test
	public void test2() {
		int sum = Recurrsion.sum(1, 1, 6);
		assertThat(sum, equalTo(720));
	}
}
