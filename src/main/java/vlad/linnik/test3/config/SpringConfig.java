package vlad.linnik.test3.config;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import vlad.linnik.test3.dao.UserDao;
import vlad.linnik.test3.dao.UserDaoImpl;
import vlad.linnik.test3.service.UserService;
import vlad.linnik.test3.service.UserServiceImpl;

import javax.sql.DataSource;

@Configuration
@ComponentScan(basePackages = {"vlad.linnik.test3.service", "vlad.linnik.test3.dao"})

public class SpringConfig {

    @Bean
    public JdbcTemplate getJdbcTemplate() {
        return new JdbcTemplate(getDataSource());
    }

    @Bean
    public DataSource getDataSource() {
        DriverManagerDataSource driverManagerDataSource = new DriverManagerDataSource();
        driverManagerDataSource.setUrl("jdbc:mysql://localhost:3306/vlad?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC");
        driverManagerDataSource.setUsername("Mdaush");
        driverManagerDataSource.setPassword("Whysoserious1995");
        driverManagerDataSource.setDriverClassName("com.mysql.jdbc.Driver");
        return driverManagerDataSource;
    }
}
