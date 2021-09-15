package za.ac.cput.cms.booking.service;

/**
 * Author: Justin Jenecke 215163052
 * Generic Service interface
 * Created: 15/09/2021
 * */

public interface IService <T, Id> {

    T create(T type);
    T read(Id id);
    T update(T type);
    boolean delete(Id id);

}
