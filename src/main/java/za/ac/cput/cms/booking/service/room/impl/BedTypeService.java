package za.ac.cput.cms.booking.service.room.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import za.ac.cput.cms.booking.entity.room.BedType;
import za.ac.cput.cms.booking.repository.room.IBedTypeRepository;
import za.ac.cput.cms.booking.service.room.IBedTypeService;

/**
 * 	BedTypeService.java
 *	BedType Service
 *
 * @author Gaynor Jantjies
 * @student Number: 213069555
 * @Group 10
 */

@Service
public class BedTypeService implements IBedTypeService {

    @Autowired
    private IBedTypeRepository bedTypeRepository;

    @Override
    public BedType create(BedType bedType) {
        return this.bedTypeRepository.save(bedType);
    }

    @Override
    public BedType read(String s) {
        return this.bedTypeRepository.findById(s).orElseGet(null);
    }

    @Override
    public BedType update(BedType bedType) {
        return this.bedTypeRepository.save(bedType);
    }

    @Override
    public boolean delete(String s) {
        this.bedTypeRepository.deleteById(s);
        return !this.bedTypeRepository.existsById(s);
    }
}
/*
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
}*/