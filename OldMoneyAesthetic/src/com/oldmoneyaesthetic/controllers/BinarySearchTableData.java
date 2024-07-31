/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.oldmoneyaesthetic.controllers;

import com.oldmoneyaesthetic.models.OldMoneyAestheticModel;
import java.util.ArrayList;

/**
 *
 * @author pabishabhatta
 */
public class BinarySearchTableData {
    public OldMoneyAestheticModel binarySearch(ArrayList<OldMoneyAestheticModel> a, String selectedColumn, String value) {
        int left = 0;
        int right = a.size() - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            OldMoneyAestheticModel midVal = a.get(mid);
            int cmp = compareModels(midVal, value, selectedColumn);

            if (cmp < 0) {
                left = mid + 1;
            } else if (cmp > 0) {
                right = mid - 1;
            } else {
                return midVal; 
            }
        }
        return null; 
    }

    private int compareModels(OldMoneyAestheticModel model, String value, String selectedColumn) {
        switch (selectedColumn) {
            case "Clothing":
                return model.getClothing().compareTo(value);
            case "Brand":
                return model.getBrand().compareTo(value);
            case "S.N.":
                return Integer.compare(model.getSn(), Integer.parseInt(value));
            case "Size":
                 return model.getSize().compareTo(value);
            case "Design":
               return model.getDesign().compareTo(value);
            case "Color":
               return model.getColor().compareTo(value);
            case "Price":
                return Integer.compare(model.getPrice(), Integer.parseInt(value));
            case "Designer Name":
                return model.getDesigner().compareTo(value);
            case "Occasion":
               return model.getOccasion().compareTo(value);
            case "Fabric":
                return model.getFabric().compareTo(value);
            default: 
                return 0;
                
        }
    }
}