import static org.junit.Assert.*;
import static org.hamcrest.Matchers.*;

import org.junit.Test;


public class Arrays_Test {

	@Test
	public void test() {
		int input[] = {1, 2, 3, 4, 5};
		String x = Arrays.arrayFormat(input);
		assertThat(x, equalTo ("(1, 2, 3, 4, 5)"));
	}
}
