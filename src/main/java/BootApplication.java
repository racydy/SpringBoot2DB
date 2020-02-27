import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class BootApplication {

    private static final Logger logger = LoggerFactory.getLogger(BootApplication.class);

    // 外置Tomcat中可以部署
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(BootApplication.class);
    }

    public static void main(String[] args) throws Exception{
        SpringApplication.run(BootApplication.class,args);

        // MongoDBTest
        ApplicationContext context = UtilContext.getApplicationContext();
        ProductsDaoImpl productDao = context.getBean(ProductsDaoImpl.class);

         List<Products> products = productDao.findAll();
         logger.info("&&&&&####### product  ##"+products.get(0).getData().getFeatures().get(8).getStringValue());


    }
}
