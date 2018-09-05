package test.model;

public class Link {
    /**
     * 链接主键
     */
    private Integer id;

    /**
     * 链接名称
     */
    private String name;

    /**
     * 连接地址
     */
    private String url;

    /**
     * 连接类型
     */
    private String type;

    /**
     * 链接主键
     * @return id 链接主键
     */
    public Integer getId() {
        return id;
    }

    /**
     * 链接主键
     * @param id 链接主键
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 链接名称
     * @return name 链接名称
     */
    public String getName() {
        return name;
    }

    /**
     * 链接名称
     * @param name 链接名称
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * 连接地址
     * @return url 连接地址
     */
    public String getUrl() {
        return url;
    }

    /**
     * 连接地址
     * @param url 连接地址
     */
    public void setUrl(String url) {
        this.url = url == null ? null : url.trim();
    }

    /**
     * 连接类型
     * @return type 连接类型
     */
    public String getType() {
        return type;
    }

    /**
     * 连接类型
     * @param type 连接类型
     */
    public void setType(String type) {
        this.type = type == null ? null : type.trim();
    }
}