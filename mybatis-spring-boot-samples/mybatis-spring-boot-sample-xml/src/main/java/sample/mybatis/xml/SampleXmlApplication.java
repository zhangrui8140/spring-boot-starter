/*
 *    Copyright 2015-2022 the original author or authors.
 *
 *    Licensed under the Apache License, Version 2.0 (the "License");
 *    you may not use this file except in compliance with the License.
 *    You may obtain a copy of the License at
 *
 *       https://www.apache.org/licenses/LICENSE-2.0
 *
 *    Unless required by applicable law or agreed to in writing, software
 *    distributed under the License is distributed on an "AS IS" BASIS,
 *    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *    See the License for the specific language governing permissions and
 *    limitations under the License.
 */
package sample.mybatis.xml;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;
import org.springframework.data.jdbc.repository.config.MyBatisJdbcConfiguration;
import sample.mybatis.xml.mapper.CityMapper;
import sample.mybatis.xml.mapper.HotelMapper;
import sample.mybatis.xml.repositories.jdbc.CityJDBCDao;
import sample.mybatis.xml.service.CityHotelManage;


@SpringBootApplication
public class SampleXmlApplication implements CommandLineRunner {

  public static void main(String[] args) {
    SpringApplication.run(SampleXmlApplication.class, args);
  }

  private final CityMapper cityDao;

  private final HotelMapper hotelMapper;

  @Autowired
  private CityHotelManage cityHotelManage;


  @Autowired
  private CityJDBCDao cityJDBCDao;

  public SampleXmlApplication(CityMapper cityDao, HotelMapper hotelMapper) {
    this.cityDao = cityDao;
    this.hotelMapper = hotelMapper;
  }

  @Override
  @SuppressWarnings("squid:S106")
  public void run(String... args) {
    //this.cityRepository.findAll().forEach(c-> System.out.println(c));
    //cityHotelManage.createCityHotel();
    //this.cityHotelManage.getHotelRepository().findAll().forEach(c->System.out.println("####################SQL结果输出2"+ c));//this.cityHotelManage.getHotelRepository().findAll().iterator().next());
    //System.out.println(this.cityDao.findByState("CA"));
    //System.out.println(this.hotelMapper.selectByCityId(1));
    System.out.println(cityJDBCDao.selectCityById(1));
  }

}
