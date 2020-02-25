package com.environment.models;

import java.util.HashMap;

/**
 * Created by Xinyu Zhu on 2/24/2020, 4:35 PM
 * com.environment.models in HumanSocietySimulator
 */
enum AreaType
{
    GROUND, WATER;
}

public class Area {
    private int x;
    private int y;
    private int altitude;
    private AreaType areaType;
    private HashMap<String, ResourceContainer> resources;


}
