package sample.mybatis.xml.config;

import org.apache.ibatis.session.SqlSession;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.Primary;
import org.springframework.data.jdbc.core.convert.DataAccessStrategy;
import org.springframework.data.jdbc.core.convert.DefaultDataAccessStrategy;
import org.springframework.data.jdbc.core.convert.DelegatingDataAccessStrategy;
import org.springframework.data.jdbc.core.convert.JdbcConverter;
import org.springframework.data.jdbc.core.mapping.JdbcMappingContext;
import org.springframework.data.jdbc.mybatis.MyBatisDataAccessStrategy;
import org.springframework.data.jdbc.mybatis.NamespaceStrategy;
import org.springframework.data.jdbc.repository.config.EnableJdbcRepositories;
import org.springframework.data.jdbc.repository.config.MyBatisJdbcConfiguration;
import org.springframework.data.relational.core.dialect.Dialect;
import org.springframework.data.relational.core.sql.IdentifierProcessing;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcOperations;

@Configuration
public class ConfigBean {

    @Import({MyBatisJdbcConfiguration.class})
    @EnableJdbcRepositories(basePackages = "sample.mybatis.xml.repositories.jdbc")
    static class JdbcConfiguration{

    }


   /* @Primary
    @Bean
    public DataAccessStrategy getDelegatingDataAccessStrategy(SqlSession sqlSession, DataAccessStrategy defaultDataAccessStrategy,
                                                              NamedParameterJdbcOperations operations, JdbcConverter jdbcConverter,
                                                              JdbcMappingContext context, Dialect dialect) {
        DelegatingDataAccessStrategy delegatingDataAccessStrategy=new DelegatingDataAccessStrategy();
        delegatingDataAccessStrategy.setDelegate(new MyBatisDataAccessStrategy(sqlSession, IdentifierProcessing.ANSI));
        return delegatingDataAccessStrategy;
    }*/
}
