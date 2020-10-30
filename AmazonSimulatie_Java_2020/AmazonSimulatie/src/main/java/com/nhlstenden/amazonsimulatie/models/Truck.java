package com.nhlstenden.amazonsimulatie.models;


import java.util.ArrayList;
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
    boolean s = false;
    boolean t = true;
    int j = 0;

  
    private int i = 0;

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
    public double setZ(double z) {
        return 0;
    }

//    @Override
//    public double setZ() {
//        return 0;
//    }

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

    public static double lerp(double a, double b, double f) {
        return a + f * (b - a);
    }


    @Override
    public boolean update() throws InterruptedException {

        boolean start = s ^ t;
        int end = 10;
        int begin = 50;
        double f = 0.1;




        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(0, end);
        list.add(1, begin);

        double p = list.get(i);
        Scaffolding.z = lerp(this.z, p, f);



        if(start) {
            if (this.name == "truck") {

                if (i == 0) {
                    this.z = lerp(this.z, p, f);

                }
                if (i == 1 && j == 200) {
                    this.z = lerp(this.z, p, f);
                    if(this.z == p - 0.1){
                        s = true;
                    }

                }
                if (i == 0) {
                    if (this.z <= p + 0.1) {
                        i += 1;
                    }
                }
                if(j != 200)
                j+=1;

            }
        }


        return true;
    }
}



