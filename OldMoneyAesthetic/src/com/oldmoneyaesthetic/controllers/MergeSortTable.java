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
public class MergeSortTable {
    public void sortArrayList(ArrayList<OldMoneyAestheticModel> a, String selectedColumn) {
        if (a.size() <= 1)
            return;
        ArrayList<OldMoneyAestheticModel> first = new ArrayList<>();
        ArrayList<OldMoneyAestheticModel> second = new ArrayList<>();//
        for (int i = 0; i < a.size(); i++) {
            if (i < a.size() / 2) {
                first.add(a.get(i));
            } else {
                second.add(a.get(i));
            }
        }//
        sortArrayList(first, selectedColumn);
        sortArrayList(second, selectedColumn);
        mergeArrayList(first, second, a, selectedColumn);
    }

    private void mergeArrayList(ArrayList<OldMoneyAestheticModel> first, ArrayList<OldMoneyAestheticModel> second, ArrayList<OldMoneyAestheticModel> a, String selectedColumn) {
        int firstCount = 0;
        int secondCount = 0;
        int arrayCount = 0;
        while (firstCount < first.size() && secondCount < second.size()) {
            if (compareModels(first.get(firstCount), second.get(secondCount), selectedColumn) < 0) {
                a.set(arrayCount, first.get(firstCount));
                firstCount++;
            } else {
                a.set(arrayCount, second.get(secondCount));
                secondCount++;
            }
            arrayCount++;
        }
        while (firstCount < first.size()) {
            a.set(arrayCount, first.get(firstCount));
            firstCount++;
            arrayCount++;
        }
        while (secondCount < second.size()) {
            a.set(arrayCount, second.get(secondCount));
            secondCount++;
            arrayCount++;
        }
    }

    private int compareModels(OldMoneyAestheticModel model1, OldMoneyAestheticModel model2, String selectedColumn) {
        switch (selectedColumn) {
            case "Clothing":
                return model1.getClothing().compareTo(model2.getClothing());
            case "Brand":
                return model1.getBrand().compareTo(model2.getBrand());
            case "S.N.":
                return Integer.compare(model1.getSn(), model2.getSn());
            case "Size":
                 return model1.getSize().compareTo(model2.getSize());
            case "Design":
               return model1.getDesign().compareTo(model2.getDesign());
            case "Color":
               return model1.getColor().compareTo(model2.getColor());
            case "Price":
                return Integer.compare(model1.getPrice(), model2.getSn());
            case "Designer Name":
                return model1.getDesigner().compareTo(model2.getDesigner());
            case "Occasion":
               return model1.getOccasion().compareTo(model2.getOccasion());
            case "Fabric":
                return model1.getFabric().compareTo(model2.getFabric());
            default:
                return 0; 
        }
    }
}
