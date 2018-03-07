package pkgQuiz;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class QuestionTest {

	@Test
	void test() {
		Question1 test = new Question1(35000, 0.10, 60);
		assertEquals(test.carPayment(35000, 0.10, 60), 743.65, .1);
		assertEquals(test.interestCost(35000, 0.10, 60), 9618.79, .1);
	}

}
