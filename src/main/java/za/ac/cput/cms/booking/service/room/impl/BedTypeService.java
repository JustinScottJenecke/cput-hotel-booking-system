/**
 * 	BedTypeService.java
 *	BedType Service
 *
 * @author Gaynor Jantjies
 * @student Number: 213069555
 * @Group 10
 */

public class BedTypeService {

    private static BedTypeService service = null;
    private BedTypeRepository repository = null;

    private BedtypeService(){
    	this.repository = BedTypeRepository.getBedTypeRepository();
    }

 public static BedTypeService getService() {
        if ( service== null)
            service = new BedTypeService();
        return service;
    }

    @Override
    public BedType create(BedType x) {
        return this.repository.create(x);
    }

    @Override
    public BedType read(String ID) {
        return this.repository.read(ID);
    }

    @Override
    public BedType update(BedType x) {
        return this.repository.update(x);
    }

    @Override
    public boolean delete(String ID) {
        return this.repository.delete(ID);
    }
}