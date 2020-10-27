package com.nhlstenden.amazonsimulatie.models;

import java.sql.Time;
import java.util.UUID;

class Truck implements Object3D, Updatable {
    private UUID uuid;

    private String name;
    private double x = 0;
    private double y = 0;
    private double z = 0;

    private double rotationX = 0;
    private double rotationY = 0;
    private double rotationZ = 0;
    boolean left = true;

    public Truck(String name) {
        this.name = name;
        this.uuid = UUID.randomUUID();
        this.z = 50;
    }

    @Override
    public String getUUID() {
        return this.uuid.toString();
    }

    @Override
    public String getType() {
        return Truck.class.getSimpleName().toLowerCase();
    }

    @Override
    public double getX() {
        return this.x;
    }

    @Override
    public double getY() {
        return this.y;
    }

    @Override
    public double getZ() {
        return this.z;
    }

    @Override
    public double getRotationX() {
        return this.rotationX;
    }

    @Override
    public double getRotationY() {
        return this.rotationY;
    }

    @Override
    public double getRotationZ() {
        return this.rotationZ;
    }

    @Override
    public boolean update()  {
        boolean start = true;
        double end = 10;
        double leave = 1000;
        double f = 0.1;




        if(start) {
            this.z = this.z + f * (end - this.z);
            return false;
        }
        else {
            this.z = this.z + f * (leave - this.z);
        }



        return true;
    }

}