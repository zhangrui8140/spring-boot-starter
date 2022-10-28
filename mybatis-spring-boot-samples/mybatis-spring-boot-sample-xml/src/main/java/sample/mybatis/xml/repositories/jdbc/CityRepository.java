package sample.mybatis.xml.repositories.jdbc;

import org.springframework.data.repository.CrudRepository;
import sample.mybatis.xml.mapper.City;


public interface CityRepository extends CrudRepository<City, Long> {
    City findByName(String name);
}
