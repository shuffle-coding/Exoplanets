/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.codersbay.exoplanet;

import java.util.List;

/**
 *
 * @author Erik Wiesinger
 */
public class Application {

    private static final String FILE = "/files/Version2.csv";
    private static final String PHRASE = "Lick Observatory";

    public static void main(String[] args) {

        InputFile input = new InputFile();
        List<Planet> planets = input.read(FILE);
        
    }

}
