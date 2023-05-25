package com.nexsys.nexsys.model;

public class ProductModel {

    private String name;
    private String priceFinal;
    private String description;
    private Integer categoryId;
    private String imageUrl;

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getPriceFinal() {
        return priceFinal;
    }
    public void setPriceFinal(String priceFinal) {
        this.priceFinal = priceFinal;
    }
    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }
    public Integer getCategoryId() {
        return categoryId;
    }
    public void setCategoryId(Integer categoryId) {
        this.categoryId = categoryId;
    }
    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    @Override
    public String toString() {
        return "ProductModel{" +
                "name='" + name + '\'' +
                ", priceFinal='" + priceFinal + '\'' +
                ", description='" + description + '\'' +
                ", categoryId='" + categoryId + '\'' +
                ", imageUrl='" + imageUrl + '\'' +
                '}';
    }
}
