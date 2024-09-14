package assigment_1.dao;

import assigment_1.entity.Passenger;

public interface PassengerDao {
    int create(Passenger passenger);

    int update(Passenger passenger);

    int delete(int id);

    int read(int id);

    void readAll();

}
