package com.example.egendatatyp;

public class Berg {
    private String name;
    private String location;
    private int height_m;

    public Berg(String name, String location, int height_m) {
        this.name = name;
        this.location = location;
        this.height_m = height_m;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public int getHeight_m() {
        return height_m;
    }

    public void setHeight_m(int height_m) {
        this.height_m = height_m;
    }
}
