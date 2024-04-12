package org.launchcode;

public class MenuItem {
    private String id;
    private double price;
    private String description;
    private String category;
    private boolean isNew;

    public MenuItem(String id, double price, String description, String category, boolean isNew) {
        this.id = id;
        this.price = price;
        this.description = description;
        this.category = category;
        this.isNew = isNew;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public void setNew(boolean aNew) {
        isNew = aNew;
    }
}

