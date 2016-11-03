package unittest.cs105;

import static org.junit.Assert.assertEquals;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import edu.sbcc.cs105.SumFun;

public class SumFunTester {
	private static final int maximumScore = 14;
	private static final int maximumAssignmentScore = 18;
	private static int totalScore;

	@BeforeClass
	public static void beforeTesting() {
		totalScore = 0;
	}

	@AfterClass
	public static void afterTesting() {

		if (totalScore == maximumScore) {
			System.out.printf("Your unit test score is %d out of %d.\n\n", totalScore, maximumScore);
		} else {
			System.out.printf("Your unit test score is %d out of %d (%d).\n\n", totalScore, maximumScore,
					totalScore - maximumScore);
		}

		int difference = maximumAssignmentScore - maximumScore;
		String correctedPoint = (difference == 1) ? "point" : "points";

		System.out.printf("The assignment is worth a total of %d where the remainder of %d %s\n",
				maximumAssignmentScore, difference, correctedPoint);
		System.out.println("comes from grading related to documentation, algorithms, and other");
		System.out.println("criteria.");
	}

	@Test
	public void testStaticValuedFunctions() throws Exception {

		assertEquals(2550, SumFun.computeEvenSum());
		totalScore += 1;
		
		assertEquals(338350, SumFun.computeSquaresSum());
		totalScore += 2;
	}

	@Test
	public void testZeros() throws Exception {
		assertEquals(0, SumFun.computeOddSum(0, 0));
		totalScore += 1;
		
		assertEquals(0, SumFun.computeOddDigitSum(0));
		totalScore += 2;
	}
	
	@Test
	public void testNonZeros() throws Exception {
		assertEquals(25, SumFun.computeOddSum(1, 10));
		totalScore += 1;
		
		assertEquals(25, SumFun.computeOddDigitSum(123456789));
		totalScore += 2;
	}

	@Test
	public void testAllEvenDigits() throws Exception {
		assertEquals(0, SumFun.computeOddDigitSum(24680));
		totalScore += 1;
	}

	@Test
	public void testAGreaterThanB() throws Exception {
		assertEquals(25, SumFun.computeOddSum(10, 1));
		totalScore += 4;
	}
}
