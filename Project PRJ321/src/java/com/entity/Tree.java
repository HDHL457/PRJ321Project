package com.entity;

import java.util.Date;

public class Tree {

    private int treeID;
    private String treeName;
    private double unitPrice;
    private int categoryID;
    private Date dateCreated, dateUpdated;
    private int unitInStock, UnitInOrder;
    private boolean available;

    public Tree() {
    }
    
    public Tree(int treeID, String treeName, double unitPrice, int categoryID, Date dateCreated, Date dateUpdated, int unitInStock, int UnitInOrder, boolean available) {
        this.treeID = treeID;
        this.treeName = treeName;
        this.unitPrice = unitPrice;
        this.categoryID = categoryID;
        this.dateCreated = dateCreated;
        this.dateUpdated = dateUpdated;
        this.unitInStock = unitInStock;
        this.UnitInOrder = UnitInOrder;
        this.available = available;
    }

    public int getTreeID() {
        return treeID;
    }

    public void setTreeID(int treeID) {
        this.treeID = treeID;
    }

    public String getTreeName() {
        return treeName;
    }

    public void setTreeName(String treeName) {
        this.treeName = treeName;
    }

    public double getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(double unitPrice) {
        this.unitPrice = unitPrice;
    }

    public int getCategoryID() {
        return categoryID;
    }

    public void setCategoryID(int categoryID) {
        this.categoryID = categoryID;
    }

    public Date getDateCreated() {
        return dateCreated;
    }

    public void setDateCreated(Date dateCreated) {
        this.dateCreated = dateCreated;
    }

    public Date getDateUpdated() {
        return dateUpdated;
    }

    public void setDateUpdated(Date dateUpdated) {
        this.dateUpdated = dateUpdated;
    }

    public int getUnitInStock() {
        return unitInStock;
    }

    public void setUnitInStock(int unitInStock) {
        this.unitInStock = unitInStock;
    }

    public int getUnitInOrder() {
        return UnitInOrder;
    }

    public void setUnitInOrder(int UnitInOrder) {
        this.UnitInOrder = UnitInOrder;
    }

    public boolean isAvailable() {
        return available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }

}
