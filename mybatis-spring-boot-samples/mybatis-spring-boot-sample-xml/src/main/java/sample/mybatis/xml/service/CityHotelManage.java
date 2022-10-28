package sample.mybatis.xml.service;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import sample.mybatis.xml.repositories.jdbc.CityRepository;
import sample.mybatis.xml.repositories.jdbc.HotelRepository;
import sample.mybatis.xml.mapper.City;
import sample.mybatis.xml.mapper.Hotel;

@Service
public class CityHotelManage {
    private CityRepository cityRepository;
    private HotelRepository hotelRepository;

    public CityHotelManage(CityRepository cityRepository, HotelRepository hotelRepository) {
        this.cityRepository = cityRepository;
        this.hotelRepository = hotelRepository;
    }

    public CityRepository getCityRepository() {
        return cityRepository;
    }

    public void setCityRepository(CityRepository cityRepository) {
        this.cityRepository = cityRepository;
    }

    public HotelRepository getHotelRepository() {
        return hotelRepository;
    }

    public void setHotelRepository(HotelRepository hotelRepository) {
        this.hotelRepository = hotelRepository;
    }

    @Transactional
    public void createCityHotel(){
        createHotel(createCity());
    }

    private City createCity(){
        return cityRepository.save(City.builder().name("nj").state("js").country("CA").build());
    }

    private void createHotel(City city){
        hotelRepository.save(Hotel.builder().city(city.getId()).name("su 8").build());
    }
}
