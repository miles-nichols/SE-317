package iloveyouboss;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.Before;
import org.junit.jupiter.api.Test;
import static org.hamcrest.Matchers.*;
import static org.hamcrest.MatcherAssert.assertThat;



class ScoreCollectionTest {
	
	@Test
	public void answerArithmeticMeanOfTwoNmber() {
		//Arrange
		ScoreCollection collection = new ScoreCollection();
		collection.add(() -> 5);
		collection.add(() -> 7);
		
		//Act
		int actualResult = collection.arithmeticMean();
		
		//Assert
//		assertThat(actualResult, equalTo(6);
//		assertEquals(6, actualResult);
		assertThat(actualResult, is(6));
	}
}
