package za.ac.cput.cms.booking.service;

/**
 * Author: Justin Jenecke 215163052
 * Generic Service interface
 * Created: 15/09/2021
 * */

public interface IService <T, ID > {

    T create(T object);
    T read(ID id);
    T update(ID object);
    boolean delete(ID id);

}
