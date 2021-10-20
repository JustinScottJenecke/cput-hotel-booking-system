package za.ac.cput.cms.booking.entity.room;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * 	BedType.java
 *	BedType Entity
 *
 * @author Gaynor Jantjies
 * @student Number: 213069555
 * @Group 10
 */

@Entity
public class BedType {

	@Id
	private String bedTypeId;
	private String type;
	private double cost;

	protected BedType() {
	}

	private BedType(Builder builder ){

		this.bedTypeId = builder.bedTypeId;
		this.type = builder.type;
		this.cost = builder.cost;

	}

	public String getBedTypeId() {
		return bedTypeId;
	}

	public String getType() {
		return type;
	}

	public double getCost() {
		return cost;
	}

	@Override
	public String toString() {
		return "BedType{" +
				"bedTypeId='" + bedTypeId + '\'' +
				", type='" + type + '\'' +
				", cost=" + cost +
				'}';
	}

	public static class Builder{

		public String bedTypeId;
		public String type;
		public double cost;

	public Builder setBedTypeId(String bedTypeId) {
            this.bedTypeId = bedTypeId;
            return this;
        }
    public Builder setType(String type) {
            this.type = type;
            return this;
        }
    public Builder setCost(double cost) {
            this.cost = cost;
            return this;
        }
	public Builder copy(BedType bT){

		this.bedTypeId = bT.bedTypeId;
		this.type = bT.type;
		this.cost = bT.cost;

		return this;
	}

    public BedType build(){
    	return new BedType(this);
    }
	}

}