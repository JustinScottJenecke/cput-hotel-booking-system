package za.ac.cput.cms.booking.factory.room;

import za.ac.cput.cms.booking.entity.room.BedType;

/**
 * 	BedType Factory.java
 *	BedType Factory
 *
 * @author Gaynor Jantjies
 * @student Number: 213069555
 * @Group 10
 */


public class BedTypeFactory {

    public static BedType createBedType(
		 String bedTypeId,
     	 String type,
    	 double cost) {

		BedType bedType = new BedType.Builder()
				.setBedTypeId(bedTypeId)
				.setType(type)
				.setCost(cost)
				.build();

		return bedType;
	}

}