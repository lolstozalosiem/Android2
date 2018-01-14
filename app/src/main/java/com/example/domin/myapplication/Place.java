package com.example.domin.myapplication;

// 4. Utwórz klasę dla modelu Place. Klasa powinna zawierać pola: placeName,
// temperature, information,

public class Place {

    private String placeName;
    private Integer temperature;
    private String information;

    public Place(String placeName, Integer temperature, String information) {
        this.placeName = placeName;
        this.information = information;
        this.temperature = temperature;
    }
    // 5. Wygeneruj gettery i settery dla klasy Place

    public String getPlaceName() {
        return placeName;
    }

    public Integer getTemperature() {
        return temperature;
    }

    public String getInformation() {
        return information;
    }

    public void setPlaceName(String placeName) {
        this.placeName = placeName;
    }

    public void setTemperature(Integer temperature) {
        this.temperature = temperature;
    }

    public void setInformation(String information) {
        this.information = information;
    }

}
