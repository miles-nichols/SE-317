package part_a;
import org.junit.*;
import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;

public class BearingTest {
	   	   
	   @Test
	   public void answersValidBearing() {
	      assertThat(new Bearing(Bearing.MAX).value(), equalTo(Bearing.MAX));
	   }
	   
	   @Test
	   public void answersAngleBetweenItAndAnotherBearing() {
	      assertThat(new Bearing(15).angleBetween(new Bearing(12)), equalTo(3));
	   }
	   
	   @Test
	   public void angleBetweenIsNegativeWhenThisBearingSmaller() {
	      assertThat(new Bearing(12).angleBetween(new Bearing(15)), equalTo(-3));
	   }
	   
	   
	   //8 
	   

	    @Test
	    public void angleBetweenIsNegativeWhenThisBearingSmaller2() throws Exception {
	        assertThat(new Bearing(5).angleBetween(new Bearing(15)), equalTo(-10));
	    }

	    @Test
	    public void angleBetweenWithZeroBearing() throws Exception {
	        assertThat(new Bearing(0).angleBetween(new Bearing(90)), equalTo(-90));
	    }

	    @Test
	    public void angleBetweenCloseToMaxBearing() throws Exception {
	        assertThat(new Bearing(355).angleBetween(new Bearing(5)), equalTo(350));
	    }

	    @Test
	    public void angleBetweenAcrossZeroBoundary() throws Exception {
	        assertThat(new Bearing(5).angleBetween(new Bearing(355)), equalTo(-350));
	    }

	    @Test
	    public void angleBetweenQuarterCircle() throws Exception {
	        assertThat(new Bearing(90).angleBetween(new Bearing(180)), equalTo(-90));
	    }

	    @Test
	    public void angleBetweenHalfCircle() throws Exception {
	        assertThat(new Bearing(180).angleBetween(new Bearing(0)), equalTo(180));
	    }

	    @Test
	    public void angleBetweenSameBearing() throws Exception {
	        assertThat(new Bearing(123).angleBetween(new Bearing(123)), equalTo(0));
	    }

	    @Test
	    public void angleBetweenRandomBearings() throws Exception {
	        assertThat(new Bearing(55).angleBetween(new Bearing(100)), equalTo(-45));
	    }
	   
}
