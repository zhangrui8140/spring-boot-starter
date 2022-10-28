package sample.mybatis.xml.repositories.jdbc;

import org.springframework.data.repository.CrudRepository;
import sample.mybatis.xml.mapper.Hotel;


public interface HotelRepository extends CrudRepository<Hotel, Long> {

}
