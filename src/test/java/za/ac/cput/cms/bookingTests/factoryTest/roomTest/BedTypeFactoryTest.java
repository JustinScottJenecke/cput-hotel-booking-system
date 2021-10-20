package za.ac.cput.cms.bookingTests.factoryTest.roomTest;

import org.junit.jupiter.api.Test;
import za.ac.cput.cms.booking.entity.room.BedType;
import za.ac.cput.cms.booking.factory.room.BedTypeFactory;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * 	BedTypeFactoryTest.java
 *	BedType Factory Test
 *
 * @author Gaynor Jantjies
 * @student Number: 213069555
 * @Group 10
 */


public class BedTypeFactoryTest {

    @Test
	public void createBedType(){

		BedType bedType = BedTypeFactory.createBedType(

			"25S",
			"Single Bed",
			250);

			assertEquals("25S", bedType.getBedTypeId());
			assertEquals("Single Bed", bedType.getType());
			assertEquals(250, bedType.getCost());

	}

}