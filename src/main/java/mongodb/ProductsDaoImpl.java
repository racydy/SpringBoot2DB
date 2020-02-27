package mongodb;

import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.data.mongodb.repository.support.SimpleMongoRepository;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.util.*;

@Component
public class ProductsDaoImpl implements ProductsDao{

    private static final Logger logger = LoggerFactory.getLogger(ProductsDaoImpl.class);

    @Autowired
    private MongoTemplate mongoTemplate;

    public void save(Products product) {

        mongoTemplate.save(product);

    }

    public List<Products> findAll() {
        List<Products> getProducts_list = mongoTemplate.findAll(Products.class);

        return getProducts_list;
    }

    public List<Products> findByFloorAndCodes(String productFloor, String productCode) {

        Query query = new Query();
        Criteria criteria = new Criteria();
        try {
            criteria.where("Data.ProductFloor").is(productFloor).and("Data.ProductId").is(productCode);
        }catch (Exception e) {
            logger.error("findByFloorAndCodes was wrong...");
            e.printStackTrace();
        }

        query.addCriteria(criteria);
        List<Products> productsList = mongoTemplate.find(query, Products.class);

        return productsList;
    }




}
