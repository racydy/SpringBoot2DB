package mongodb;

import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

@Document(collection = "Products")
public class Features {

    @Field("Name")
    private String name;

    @Field("Value")
    private Object value;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStringValue() {
        return (String) value;
    }

    public Boolean getBooleanValue() {
        return (Boolean) value;
    }

    public Object getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public void setValue_boolean(Boolean val) {
        this.value = val;
    }

}
