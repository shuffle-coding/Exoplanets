/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.comparators;

import java.util.Comparator;
import model.Planet;

/**
 *
 * @author Codersbay
 */
public class SortByLoc_rowid implements Comparator<Planet>{

    @Override
    public int compare(Planet o1, Planet o2) {
        return o1.getLoc_rowid() - o2.getLoc_rowid();
    }
    
}
