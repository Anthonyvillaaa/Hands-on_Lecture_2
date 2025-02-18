import org.junit.Test;
import com.example.PascalTriangle;
import static org.junit.Assert.assertArrayEquals;


public class PascalTriangleTest {
	@Test
	public void testGenerateFiveRows(){
		int[][] pascalTriangle = PascalTriangle.generatePascalTriangle(5);
		int[][] expected = {
			{1},
			{1, 1},
			{1, 2, 1},
			{1, 3, 3, 1},
			{1, 4, 6, 4, 1}
		};
		assertArrayEquals(expected, pascalTriangle);
	}
	
	@Test
	public void testGenerateZeroRows(){
		int[][] pascalTriangle = PascalTriangle.generatePascalTriangle(0);
		int[][] expected = {};
		assertArrayEquals(expected, pascalTriangle);
	}
	@Test
	public void testGenerateOneRows(){
		int[][] pascalTriangle = PascalTriangle.generatePascalTriangle(1);
		int[][] expected = {{1}};
		assertArrayEquals(expected, pascalTriangle);
	}

	@Test
	public void testGenerateTwoRows(){
		int[][] pascalTriangle = PascalTriangle.generatePascalTriangle(2);
		int[][] expected = {
		{1},
		{1, 1}
		};
		assertArrayEquals(expected, pascalTriangle);
	}

	
}
