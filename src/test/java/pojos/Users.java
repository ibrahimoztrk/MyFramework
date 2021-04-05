package pojos;
import java.util.List;
import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import pojos.Meta;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "code",
        "meta",
        "data"
})
@Generated("jsonschema2pojo")
public class Users {

    @JsonProperty("code")
    private Integer code;
    @JsonProperty("meta")
    private Meta meta;
    @JsonProperty("data")
    private List<Infos> data = null;

    /**
     * No args constructor for use in serialization
     *
     */
    public Users() {
    }

    /**
     *
     * @param code
     * @param data
     * @param meta
     */
    public Users(Integer code, Meta meta, List<Infos> data) {
        super();
        this.code = code;
        this.meta = meta;
        this.data = data;
    }

    @JsonProperty("code")
    public Integer getCode() {
        return code;
    }

    @JsonProperty("code")
    public void setCode(Integer code) {
        this.code = code;
    }

    @JsonProperty("meta")
    public Meta getMeta() {
        return meta;
    }

    @JsonProperty("meta")
    public void setMeta(Meta meta) {
        this.meta = meta;
    }

    @JsonProperty("data")
    public List<Infos> getData() {
        return data;
    }

    @JsonProperty("data")
    public void setData(List<Infos> data) {
        this.data = data;
    }

}