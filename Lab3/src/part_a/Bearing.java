package part_a;

public class Bearing {
	   public static final int MAX = 360;
	   private int value;

	   public Bearing(int value) {
	        try {
	            if (value < 0 || value > MAX) {
	                throw new BearingOutOfRangeException();
	            }
	            this.value = value;
	        } catch (BearingOutOfRangeException e) {
	            System.out.println("Error: " + e.getMessage());
	            this.value = 0; 
	        }
	    }

	   public int value() { return value; }

	   public int angleBetween(Bearing bearing) { return value - bearing.value; }
	}


