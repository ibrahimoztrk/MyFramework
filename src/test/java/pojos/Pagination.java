package pojos;


import javax.annotation.Generated;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "total",
        "pages",
        "page",
        "limit"
})
@Generated("jsonschema2pojo")
@JsonIgnoreProperties(ignoreUnknown = true)
public class Pagination {

    @JsonProperty("total")
    private Integer total;
    @JsonProperty("pages")
    private Integer pages;
    @JsonProperty("page")
    private Integer page;
    @JsonProperty("limit")
    private Integer limit;

    /**
     * No args constructor for use in serialization
     *
     */
    public Pagination() {
    }

    /**
     *
     * @param total
     * @param pages
     * @param limit
     * @param page
     */
    public Pagination(Integer total, Integer pages, Integer page, Integer limit) {
        super();
        this.total = total;
        this.pages = pages;
        this.page = page;
        this.limit = limit;
    }

    @JsonProperty("total")
    public Integer getTotal() {
        return total;
    }

    @JsonProperty("total")
    public void setTotal(Integer total) {
        this.total = total;
    }

    @JsonProperty("pages")
    public Integer getPages() {
        return pages;
    }

    @JsonProperty("pages")
    public void setPages(Integer pages) {
        this.pages = pages;
    }

    @JsonProperty("page")
    public Integer getPage() {
        return page;
    }

    @JsonProperty("page")
    public void setPage(Integer page) {
        this.page = page;
    }

    @JsonProperty("limit")
    public Integer getLimit() {
        return limit;
    }

    @JsonProperty("limit")
    public void setLimit(Integer limit) {
        this.limit = limit;
    }

}