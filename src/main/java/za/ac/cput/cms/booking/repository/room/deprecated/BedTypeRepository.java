package za.ac.cput.cms.booking.repository.room.deprecated; /**
 * 	BedTypeRepository.java
 *	BedType Repository
 *
 * @author Gaynor Jantjies
 * @student Number: 213069555
 * @Group 10
 */
import java.util.ArrayList;
import java.util.List;
@Deprecated
public class BedTypeRepository {}
/*
private static BedTypeRepository bedTypeRepository = null;
    private List<BedType> bedTypeRepositoryDB = null;

    private BedTypeRepository(){
        bedTypeRepositoryDB = new ArrayList<BedType>();
    }

    public static BedTypeRepository getBedTypeRepository(){

        if (bedTypeRepository == null)
            bedTypeRepository = new BedTypeRepository();

        return bedTypeRepository;
    }
    @Override
    public BedType create(BedType bedType) {

        boolean created = bedTypeRepositoryDB.add(bedType);
        if(created)
            return bedType;
        else
            return null;
    }

    @Override
    public BedType read(String bedTypeId) {
        for (BedType bTyp:bedTypeRepositoryDB) {
            if (bTyp.getId() == bedTypeId)
                return bTyp;
        }
        return null;

    }

    @Override
    public BedType update(BedType x) {

        BedType oldBedType = read(x.getId());
        if (oldBedType != null){
            bedTypeRepositoryDB.remove(oldBedType);
            bedTypeRepositoryDB.add(x);
            return x;
        }
        return null;
    }

    @Override
    public boolean delete(String bedTypeId) {

        BedType delBedType = read(bedTypeId);
        if (delBedType == null)
            return false;
        bedTypeRepositoryDB.remove(delBedType);
        return true;
    }


}*/