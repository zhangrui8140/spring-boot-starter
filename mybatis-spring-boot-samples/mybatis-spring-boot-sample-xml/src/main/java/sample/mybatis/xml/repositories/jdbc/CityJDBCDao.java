package sample.mybatis.xml.repositories.jdbc;

import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.*;
import org.springframework.stereotype.Repository;
import sample.mybatis.xml.mapper.City;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

@Repository
public class CityJDBCDao {

    private final JdbcOperations jdbcOperations;
    public CityJDBCDao(JdbcOperations jdbcOperations){
        this.jdbcOperations=jdbcOperations;
    }

    public City selectCityById(long id) {
        return this.jdbcOperations.query(" select id, name, state, country from city where id = ?", new PreparedStatementSetter() {
            @Override
            public void setValues(PreparedStatement ps) throws SQLException {
                ps.setLong(1, 1L);
            }
        }, new ResultSetExtractor<City>() {
            @Override
            public City extractData(ResultSet rs) throws SQLException, DataAccessException {
                return City.builder().id(rs.getLong(0)).name(rs.getString(0)).build();
            }
        });
    }
}
