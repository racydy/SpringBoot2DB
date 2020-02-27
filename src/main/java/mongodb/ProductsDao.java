package mongodb;

import java.util.List;

public interface ProductsDao {

    public void save(Products product);

    public List<Products> findAll() ;

    public List<Products> findByFloorAndCodes(String productFloor, String productCode) ;

}
