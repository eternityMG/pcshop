package com.example.pcshop.model;

public class Product {
    private Long id;
    private String name;
    private String description;
    private String fullDescription;
    private String price;
    private String imageUrl;
    private String[] specs;
    private boolean inStock;

    public Product(Long id, String name, String description, String fullDescription,
                   String price, String imageUrl, String[] specs, boolean inStock) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.fullDescription = fullDescription;
        this.price = price;
        this.imageUrl = imageUrl;
        this.specs = specs;
        this.inStock = inStock;
    }

    public Long getId() { return id; }
    public String getName() { return name; }
    public String getDescription() { return description; }
    public String getFullDescription() { return fullDescription; }
    public String getPrice() { return price; }
    public String getImageUrl() { return imageUrl; }
    public String[] getSpecs() { return specs; }
    public boolean isInStock() { return inStock; }
}