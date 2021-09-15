package za.ac.cput.cms.booking.service;

public interface IService <T, Id> {

    T create(T type);
    T read(Id id);
    T update(T type);
    boolean delete(Id id);

}
