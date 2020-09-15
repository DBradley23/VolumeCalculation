package com.gmail.dbradley831.volumecalculation;

public class SphereVolume {
    private double radius;

    public SphereVolume(float newRadius) {
        setRadius(newRadius);
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double newRadius) {
        if(newRadius > 0)
            radius = newRadius;
    }

    public double sphereRadius() {

        return 3/4*3.14*(radius*radius*radius);
    }
}
