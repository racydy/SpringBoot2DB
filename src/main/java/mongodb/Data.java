package mongodb;

import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import java.util.List;

@Document(collection = "Products")
public class Data  {

    @Field("ProductId")
    private String productId;

    @Field("ProductName")
    private String productName;

    @Field("ProductFloor")
    private String productFloor;

    @Field("ProductLink")
    private String productLink;

    @Field("Features")
    private List<Features> features;

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getProductFloor() {
        return productFloor;
    }

    public void setProductFloor(String productFloor) {
        this.productFloor = productFloor;
    }

    public String getProductLink() {
        return productLink;
    }

    public void setProductLink(String productLink) {
        this.productLink = productLink;
    }

    //数组对象
    public List<Features> getFeatures() {
        return features;
    }

    public void setFeatures(List<Features> features) {
        this.features = features;
    }
}
