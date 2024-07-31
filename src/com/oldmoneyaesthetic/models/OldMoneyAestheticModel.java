/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.oldmoneyaesthetic.models;

/**
 *
 * @author pabishabhatta
 */
public class OldMoneyAestheticModel {
    int sn;
    String clothing;
    String brand;
    String size;
    String design;
    String color;
    int price;
    String designer;
    String occasion;
    String fabric;

    public OldMoneyAestheticModel(int sn, String clothing, String brand, String size, String design, String color, int price, String designer, String occasion, String fabric) {
        this.sn = sn;
        this.clothing = clothing;
        this.brand = brand;
        this.size = size;
        this.design = design;
        this.color = color;
        this.price = price;
        this.designer = designer;
        this.occasion = occasion;
        this.fabric = fabric;
    }

    public int getSn() {
        return sn;
    }

    public void setSn(int sn) {
        this.sn = sn;
    }

    public String getClothing() {
        return clothing;
    }

    public void setClothing(String clothing) {
        this.clothing = clothing;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getDesign() {
        return design;
    }

    public void setDesign(String design) {
        this.design = design;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getDesigner() {
        return designer;
    }

    public void setDesigner(String designer) {
        this.designer = designer;
    }

    public String getOccasion() {
        return occasion;
    }

    public void setOccasion(String occasion) {
        this.occasion = occasion;
    }
    
    public String getFabric() {
        return fabric;
    }

    public void setFabric(String fabric) {
        this.fabric = fabric;
    }
    
    
    
    
    
    
}
