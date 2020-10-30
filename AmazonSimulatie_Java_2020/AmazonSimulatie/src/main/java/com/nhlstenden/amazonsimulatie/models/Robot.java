package com.nhlstenden.amazonsimulatie.models;

import java.nio.file.Path;
import java.util.ArrayList;
import java.util.UUID;
import java.util.function.Consumer;

import com.nhlstenden.amazonsimulatie.controllers.GraphShow;

/*
 * Deze class stelt een robot voor. Hij impelementeerd de class Object3D, omdat het ook een
 * 3D object is. Ook implementeerd deze class de interface Updatable. Dit is omdat
 * een robot geupdate kan worden binnen de 3D wereld om zich zo voort te bewegen.
 */
class Robot implements Object3D, Updatable{
    private UUID uuid;

    private String name;
    private double x = 0;
    private double y = 0;
    private double z = 0;

    private double rotationX = 0;
    private double rotationY = 0;
    private double rotationZ = 0;

    private int start = 0;
    private int end = 0;
    private int length = 0;
    private int i = 0;
    private int t = 0;

    private boolean Vrachtwagen;

    GraphShow grapshow = new GraphShow();
    ArrayList<String> coordinates = new ArrayList<>();

    public Robot(String name) {
        this.name = name;
        this.uuid = UUID.randomUUID();
    }


    /*
     * Deze update methode wordt door de World aangeroepen wanneer de
     * World zelf geupdate wordt. Dit betekent dat elk object, ook deze
     * robot, in de 3D wereld steeds een beetje tijd krijgt om een update
     * uit te voeren. In de updatemethode hieronder schrijf je dus de code
     * die de robot steeds uitvoert (bijvoorbeeld positieveranderingen). Wanneer
     * de methode true teruggeeft (zoals in het voorbeeld), betekent dit dat
     * er inderdaad iets veranderd is en dat deze nieuwe informatie naar de views
     * moet worden gestuurd. Wordt false teruggegeven, dan betekent dit dat er niks
     * is veranderd, en de informatie hoeft dus niet naar de views te worden gestuurd.
     * (Omdat de informatie niet veranderd is, is deze dus ook nog steeds hetzelfde als
     * in de view)
     */

    @Override
    public boolean update()  {
        if(this.name == "robot") {
            this.start = 0;
            this.end = 7;
            this.coordinates = grapshow.graphShow(start, end);
            this.length = coordinates.size();

            Double f = 0.9;
            String c = coordinates.get(i);
            double p = Double.valueOf(coordinates.get(i+1));
            if (this.x + this.z != Double.valueOf(coordinates.get(length - 1))){
                if (c.equals("x")){
                    if (i == 0){
                        this.x = this.x + f * (p - this.x);
                        System.out.print(" " + this.x);
                        if (this.x == p && i < length - 3){
                            this.i+=2;
                            c = coordinates.get(i);
                        }
                    }
                    if (i > 1 && c.equals("x")){
                        double bp = Double.valueOf(coordinates.get(i-1));
                        if (p < bp){
                            p = p + bp;
                            this.x = this.x + f * (p - this.x);
                            System.out.print(" " + this.x);
                            if (this.x == p && i < length - 3){
                                this.i+=2;
                                c = coordinates.get(i);
                            }
                        }
                        if (p == bp && c.equals("x")){
                            this.t += 1;
                            if (t > 1 && i > 2){
                                double bpt = Double.valueOf(coordinates.get(i-3));
                                p = p + bp + bpt;
                                this.x = this.x + f * (p - this.x);
                                System.out.print(" " + this.x);
                            }
                            p = p + bp;
                            this.x = this.x + f * (p - this.x);
                            System.out.print(" " + this.x);
                            if (this.x == p && i < length - 3){
                                this.i+=2;
                                c = coordinates.get(i);
                            }
                        }
                        else if (c.equals("x")) {
                            this.x = this.x + f * (p - this.x);
                            System.out.print(" " + this.x);
                        }
                    }
                }
                else if (c.equals("z")){
                    this.t = 0;
                    if (i == 0){
                        this.z = this.z + f * (p - this.z);
                        System.out.print(" " + this.z);
                        if (this.z == p && i < length - 3){
                            this.i+=2;
                            c = coordinates.get(i);
                        }
                    }
                    if (i > 1 && c.equals("z")){
                        double bp = Double.valueOf(coordinates.get(i-1));
                        if (p < bp){
                            p = p + bp;
                            this.z = this.z + f * (p - this.z);
                            System.out.print(" " + this.x);
                            if (this.z == p && i < length - 3){
                                this.i+=2;
                                c = coordinates.get(i);
                            }
                        }
                        if (p == bp && c.equals("z")){
                            this.t += 1;
                            if (t > 1 && i > 2){
                                double bpt = Double.valueOf(coordinates.get(i-3));
                                p = p + bp + bpt;
                                this.z = this.z + f * (p - this.z);
                                System.out.print(" " + this.z);
                            }
                            p = p + bp;
                            this.z = this.z + f * (p - this.z);
                            System.out.print(" " + this.z);
                            if (this.z == p && i < length - 3){
                                this.i+=2;
                                c = coordinates.get(i);
                            }
                        }
                        else if (c.equals("z")){
                            this.z = this.z + f * (p - this.z);
                            System.out.print(" " + this.z);
                        }
                    }
                    if (this.z == p && i < length - 3){
                        this.i+=2;
                        c = coordinates.get(i);
                    }
                }
            }
        }
        else if (this.name == "robot1"){
            this.start = 0;
            this.end = 10;
            this.coordinates = grapshow.graphShow(start, end);
            this.length = coordinates.size();

            Double f = 0.9;
            String c = coordinates.get(i);
            double p = Double.valueOf(coordinates.get(i+1));
            if (this.x + this.z != Double.valueOf(coordinates.get(length - 1))){
                if (c.equals("x")){
                    if (i == 0){
                        this.x = this.x + f * (p - this.x);
                        System.out.print(" " + this.x);
                        if (this.x == p && i < length - 3){
                            this.i+=2;
                            c = coordinates.get(i);
                        }
                    }
                    if (i > 1 && c.equals("x")){
                        double bp = Double.valueOf(coordinates.get(i-1));
                        if (p < bp){
                            p = p + bp;
                            this.x = this.x + f * (p - this.x);
                            System.out.print(" " + this.x);
                            if (this.x == p && i < length - 3){
                                this.i+=2;
                                c = coordinates.get(i);
                            }
                        }
                        if (p == bp && c.equals("x")){
                            this.t += 1;
                            if (t > 1 && i > 2){
                                double bpt = Double.valueOf(coordinates.get(i-3));
                                p = p + bp + bpt;
                                this.x = this.x + f * (p - this.x);
                                System.out.print(" " + this.x);
                            }
                            p = p + bp;
                            this.x = this.x + f * (p - this.x);
                            System.out.print(" " + this.x);
                            if (this.x == p && i < length - 3){
                                this.i+=2;
                                c = coordinates.get(i);
                            }
                        }
                        else if (c.equals("x")) {
                            this.x = this.x + f * (p - this.x);
                            System.out.print(" " + this.x);
                        }
                    }
                }
                if (c.equals("z")){
                    if (i == 0){
                        this.z = this.z + f * (p - this.z);
                        System.out.print(" " + this.z);
                        if (this.z == p && i < length - 3){
                            this.i+=2;
                            c = coordinates.get(i);
                        }
                    }
                    if (i > 1 && c.equals("z")){
                        double bp = Double.valueOf(coordinates.get(i-1));
                        if (p < bp){
                            p = p + bp;
                            this.z = this.z + f * (p - this.z);
                            System.out.print(" " + this.x);
                            if (this.z == p && i < length - 3){
                                this.i+=2;
                                c = coordinates.get(i);
                            }
                        }
                        if (p == bp && c.equals("z")){
                            this.t += 1;
                            if (t > 1 && i > 2){
                                double bpt = Double.valueOf(coordinates.get(i-3));
                                p = p + bp + bpt;
                                this.z = this.z + f * (p - this.z);
                                System.out.print(" " + this.z);
                            }
                            if (t < 2){
                                p = p + bp;
                                this.z = this.z + f * (p - this.z);
                                System.out.print(" " + this.z);
                            }
                            if (this.z == p && i < length - 3){
                                this.i+=2;
                                c = coordinates.get(i);
                            }
                        }
                        else if (c.equals("z")){
                            this.z = this.z + f * (p - this.z);
                            System.out.print(" " + this.z);
                        }
                    }
                    if (this.z == p && i < length - 3){
                        this.i+=2;
                        c = coordinates.get(i);
                    }
                }
            }
        }


        //else if(this.name == "robot" && z < 15 && x == 15){
        //   this.z += 1;
        // }
        // else if(this.name == "robot" && x > 0 && z == 15){
        //    this.x -= 1;
        //}
        //else if(this.name == "robot" && x == 0 && z > 0){
        //    this.z -= 1;
        //}
        //}
        return true;
    }

    @Override
    public String getUUID() {
        return this.uuid.toString();
    }

    @Override
    public String getType() {
        /*
         * Dit onderdeel wordt gebruikt om het type van dit object als stringwaarde terug
         * te kunnen geven. Het moet een stringwaarde zijn omdat deze informatie nodig
         * is op de client, en die verstuurd moet kunnen worden naar de browser. In de
         * javascript code wordt dit dan weer verder afgehandeld.
         */
        return Robot.class.getSimpleName().toLowerCase();
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
}