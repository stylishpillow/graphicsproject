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

    private boolean Vrachtwagen = true;

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
    public boolean update() {
//        if (Vrachtwagen){
//        GraphShow grapshow = new GraphShow();
//        this.start = 0;
//        this.end = 4;
//        //ArrayList<String> finalpath = new ArrayList<>();
//        //finalpath = grapshow.graphShow(start, end);
//
//        ArrayList<String> coordinates = new ArrayList<>();
//        coordinates = grapshow.graphShow(start, end);
//        length = coordinates.size();
//        //System.out.println(coordinates);
//        //this.x = 0;
//        //this.i = 0;
//        String c = coordinates.get(i);
//        double p = Double.valueOf(coordinates.get(i+1));
//        if(this.name == "robot" && x < p) {
//         this.x += 1;
//         }
//         else if (this.name == "robot" && c == "y" && y < p) {
//            this.y += 1;
//            }
//            else {
//                i += 2;
//            }
//        //else if(this.name == "robot" && z < 15 && x == 15){
//        //   this.z += 1;
//       // }
//       // else if(this.name == "robot" && x > 0 && z == 15){
//        //    this.x -= 1;
//        //}
//        //else if(this.name == "robot" && x == 0 && z > 0){
//        //    this.z -= 1;
//        //}
////        return true;
//    }
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