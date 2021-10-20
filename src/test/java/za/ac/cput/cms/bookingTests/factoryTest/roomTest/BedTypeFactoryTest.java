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