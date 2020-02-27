package mongodb;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import java.io.Serializable;

@Document(collection = "Products")
public class Products implements Serializable{


    @Id
    private String Id;

    @Field("Data")
    private Data data;

    @Field("Version")
    private String version;

    @Field("UpdatedTimestamp")
    private Long updatedTimeStamp;

    public Data getData() {
        return data;
    }

    public void setData(Data data) {
        this.data = data;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public Long getUpdatedTimeStamp() {
        return updatedTimeStamp;
    }

    public void setUpdatedTimeStamp(Long updatedTimeStamp) {
        this.updatedTimeStamp = updatedTimeStamp;
    }
}
