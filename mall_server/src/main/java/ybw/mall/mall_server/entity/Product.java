package ybw.mall.mall_server.entity;

public class Product {
    public Product(){
        this.id = "0";
        this.name = "";
        this.price = 0.0f;
        this.imgurl = "";
        this.desc = "";
    }
    public Product(String id,String name,float price,String imgurl,String desc){
        this.id = id;
        this.name = name;
        this.price = price;
        this.imgurl = imgurl;
        this.desc = desc;
    }
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public String getImgurl() {
        return imgurl;
    }

    public void setImgurl(String imgurl) {
        this.imgurl = imgurl;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    private String id;
    private String name;
    private float price;
    private String imgurl;
    private String desc;
}
