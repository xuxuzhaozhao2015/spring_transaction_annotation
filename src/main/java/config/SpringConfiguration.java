package config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.PropertySource;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration
@ComponentScan("top.xuxuzhaozhao")
@Import({JdbcConfig.class, TransactionConfig.class})
@PropertySource("classpath:jdbc.properties")
@EnableTransactionManagement //开启事务注解支持
public class SpringConfiguration {

}
