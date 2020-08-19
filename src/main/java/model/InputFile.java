package model;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.time.Year;
import java.util.ArrayList;
import java.util.List;

public class InputFile {

    private String FILE;

    public InputFile(String file) {
        this.FILE = file;
    }
    
    public List<Planet> read() {
        List<Planet> result = new ArrayList<>();
        BufferedReader reader = null;
        try {
            String line;
            reader = new BufferedReader(new InputStreamReader(getClass().getResourceAsStream(FILE)));
            while ((line = reader.readLine()) != null) {
                String[] arrOfLine = line.split(",");
                result.add(new Planet(
                        Integer.parseInt(arrOfLine[0]),
                        arrOfLine[1],
                        arrOfLine[2],
                        arrOfLine[3],
                        (arrOfLine[4].equals("") ? -1.0f : Float.parseFloat(arrOfLine[4])),
                        (arrOfLine[5].equals("") ? -1.0f : Float.parseFloat(arrOfLine[5])),
                        (arrOfLine[6].equals("") ? -1.0f : Float.parseFloat(arrOfLine[6])),
                        (arrOfLine[7].equals("") ? -1.0f : Float.parseFloat(arrOfLine[7])),
                        arrOfLine[8],
                        Year.parse(arrOfLine[9]),
                        arrOfLine[10],
                        Integer.parseInt(arrOfLine[11])
                ));
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                reader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return result;
        
    }
}
