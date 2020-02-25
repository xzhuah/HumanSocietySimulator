package com.environment.models;

import java.util.ArrayList;

/**
 * Created by Xinyu Zhu on 2/24/2020, 4:42 PM
 * com.environment.models in HumanSocietySimulator
 */
public class Map {
    private Area[][] map;

    public Map(Area[][] map) {
        this.map = map;
    }

    public Map(int width, int length) {
        map = new Area[width][length];
        for (int i = 0; i < width; i++) {
            for (int j = 0; j < length; j++) {
                map[i][j] = new Area();
            }
        }
    }

    public Map(String filepath) {

    }

    public Map(ArrayList<Area> keyAreas) {

    }

    public boolean saveToFile(String file) {
        return true;
    }
    public boolean saveToFile(String file, String resource) {
        return true;
    }

    public Map subMap(int x1, int y1, int x2, int y2) {
        return null;
    }

    public boolean setResource(String resource, String file) {
        return false;
    }

    public boolean setResource(String resource, double amount) {
        return false;
    }
}
