package com.nhlstenden.amazonsimulatie.models;



import java.util.UUID;

public class Scaffolding implements Object3D, Updatable {


//    public static String name;
    private UUID uuid;

    private String name;
    private double x = 0;
    private double y = 0;
    public static double z;

    private double rotationX = 0;
    private double rotationY = 0;
    private double rotationZ = 0;



    public Scaffolding(String name){
        this.name = name;
        this.uuid = UUID.randomUUID();



    }

    public static double lerp(double a, double b, double f) {
        return a + f * (b - a);
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

//    public void setZ(double z){
//        this.z = z;
//    }

    @Override
    public double getY() {
        return this.y;
    }

    @Override
    public double getZ() {
        return this.z;
    }

    @Override
    public double setZ(double z) {
        return this.z = getZ();
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
        this.z = z;


        if(this.name == "scaffolding" ) {
            this.z = 10;
            this.x = 10;
        }

        if(this.name == "scaffolding1" ) {
            this.z = 20;
            this.x = 20;
        }
        return true;


    }
}
