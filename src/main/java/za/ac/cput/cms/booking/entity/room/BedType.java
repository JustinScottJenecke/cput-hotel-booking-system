
/**
 * 	BedType.java
 *	BedType Entity
 *
 * @author Gaynor Jantjies
 * @student Number: 213069555
 * @Group 10
 */

public class BedType {

	public String bedTypeId;
	public String type;
	public double cost;

	public BedType(Builder builder){

		this.bedTypeId = builder.bedTypeId;
		this.type = builder.type;
		this.cost = builder.cost;

	}

	public String getBedTypeId(){
		return bedTypeId;
	}
	public String getType(){
		return type;
	}
	public double getCost(){
		return
	}

	public static class Builder{

		public int bedTypeId;
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