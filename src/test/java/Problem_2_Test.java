import static org.junit.Assert.*;
import static org.hamcrest.Matchers.*;

import org.junit.Test;

public class Problem_2_Test {
	@Test
	public void test() {
		int sum = Problem_2_PE.sum(1, 1, 0, 4000000);
		assertThat(sum, equalTo(4613732));
	}
}