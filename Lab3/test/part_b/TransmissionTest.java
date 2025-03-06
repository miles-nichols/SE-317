package part_b;

import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;

import org.junit.Before;
import org.junit.Test;

public class TransmissionTest {

    private Car car;
    private Transmission transmission;

    @Before
    public void create() {
        car = new Car();
        transmission = new Transmission(car);
    }

    @Test
    public void remainsInDriveAfterAcceleration() {
        transmission.shift(Gear.DRIVE);
        car.accelerateTo(35);
        assertThat(transmission.getGear(), equalTo(Gear.DRIVE));
    }

    @Test
    public void ignoresShiftToParkWhileInDrive() {
        transmission.shift(Gear.DRIVE);
        car.accelerateTo(30);
        transmission.shift(Gear.PARK);
        assertThat(transmission.getGear(), equalTo(Gear.DRIVE));
    }

    @Test
    public void allowsShiftToParkWhenNotMoving() {
        transmission.shift(Gear.DRIVE);
        car.accelerateTo(30);
        car.brakeToStop();
        transmission.shift(Gear.PARK);
        assertThat(transmission.getGear(), equalTo(Gear.PARK));
    }
}