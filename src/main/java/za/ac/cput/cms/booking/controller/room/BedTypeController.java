package za.ac.cput.cms.booking.controller.room;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import za.ac.cput.cms.booking.entity.room.BedType;
import za.ac.cput.cms.booking.service.room.impl.BedTypeService;


@RestController
@RequestMapping("/za.ac.cput.hotelbookingservice/api/bedtype")
public class BedTypeController {


    @Autowired
    private BedTypeService bedTypeService;

    @RequestMapping("")
    public String bedTypeLanding() {
        return "Landing String for Bed Type Service requests";
    }

    @PostMapping("/create")
    public BedType createBedType(@RequestBody BedType bedType) {

        BedType newBedType = new BedType.Builder().copy(bedType).build();
        return this.bedTypeService.create(newBedType);
    }

    @GetMapping("/read/{id}")
    public BedType readBedType(@PathVariable String id) {
        return this.bedTypeService.read(id);
    }

    @PutMapping("/update")
    public BedType updateBedType(@RequestBody BedType bedType) {

        BedType updatedBedType = new BedType.Builder().copy(bedType).build();
        return this.bedTypeService.update(updatedBedType);
    }

    @DeleteMapping("/delete/{id}")
    public Boolean deleteBedType(@PathVariable String id) {
        return this.bedTypeService.delete(id);
    }

}
