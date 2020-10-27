package com.nhlstenden.amazonsimulatie.models;

import java.util.UUID;

class Truck implements Object3D, Updatable{
    private UUID uuid;

    private String name;
    private double x = 0;
    private double y = 0;
    private double z = 0;

    private double rotationX = 0;
    private double rotationY = 0;
    private double rotationZ = 0;


    public Truck(String name) {
        this.name = name;
        this.uuid = UUID.randomUUID();
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
        if(this.name == "truck") {
//           this.x += 1;
            }

        return true;
    }
}