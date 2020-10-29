package com.nhlstenden.amazonsimulatie.models;



import java.util.UUID;

public class Scaffolding implements Object3D, Updatable {

    private UUID uuid;

    private String name;
    private double x = 0;
    private double y = 0;
    private double z = 0;

    private double rotationX = 0;
    private double rotationY = 0;
    private double rotationZ = 0;

    public Scaffolding(String name){
        this.name = name;
        this.uuid = UUID.randomUUID();
    }
    @Override
    public String getUUID() {
        return this.uuid.toString();
    }

    @Override
    public String getType() {
        return Scaffolding.class.getSimpleName().toLowerCase();
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
        return rotationX;
    }

    @Override
    public double getRotationY() {
        return rotationY;
    }

    @Override
    public double getRotationZ() {
        return rotationZ;
    }

    @Override
    public boolean update() throws InterruptedException {
        return true;
    }
}
