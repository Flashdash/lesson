import static org.junit.Assert.*;
import static org.hamcrest.Matchers.*;

import org.junit.Test;


public class Problem_1_Test {

	@Test
	public void test() {
		int sum = Problem_1_PE.sum(1, 11, 1);
		assertThat(sum, equalTo(55));
	}

	@Test
	public void test2() {
		int sum = Problem_1_PE.sum(1, 11, 3);
		assertThat(sum, equalTo(22));
	}
	@Test
	public void test3() {
		int sum = Problem_1_PE.sum(2, 11, 3);
		assertThat(sum, equalTo(15));
	}
	@Test
	public void test4() {
		int sum = Problem_1_PE.sum(3, 1000, 3);
		assertThat(sum, equalTo(166833));
	}
}
