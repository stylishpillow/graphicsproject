package com.nhlstenden.amazonsimulatie.models;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.UUID;
import java.util.concurrent.TimeUnit;

import com.nhlstenden.amazonsimulatie.controllers.GraphWeighted;
import com.nhlstenden.amazonsimulatie.controllers.NodeWeighted;

/*
 * Deze class stelt een robot voor. Hij impelementeerd de class Object3D, omdat het ook een
 * 3D object is. Ook implementeerd deze class de interface Updatable. Dit is omdat
 * een robot geupdate kan worden binnen de 3D wereld om zich zo voort te bewegen.
 */
class Robot implements Object3D, Updatable {
    private UUID uuid;

    private String name;
    private double x = 0;
    private double y = 0;
    private double z = 0;

    private double rotationX = 0;
    private double rotationY = 0;
    private double rotationZ = 0;

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
    public boolean update() throws InterruptedException {
        GraphWeighted graphWeighted = new GraphWeighted(true);
        NodeWeighted zero = new NodeWeighted(0, "0");
        NodeWeighted one = new NodeWeighted(1, "1");
        NodeWeighted two = new NodeWeighted(2, "2");
        NodeWeighted three = new NodeWeighted(3, "3");
        NodeWeighted four = new NodeWeighted(4, "4");
        //NodeWeighted five = new NodeWeighted(5, "5");
        //NodeWeighted six = new NodeWeighted(6, "6");

        // Our addEdge method automatically adds Nodes as well.
        // The addNode method is only there for unconnected Nodes,
        // if we wish to add any
        graphWeighted.addEdge(zero, one, 4);
        graphWeighted.addEdge(one, two, 4);
        graphWeighted.addEdge(two, three, 4);
        graphWeighted.addEdge(three, four, 4);
        //graphWeighted.addEdge(one, two, 7);
        //graphWeighted.addEdge(two, four, 9);
        //graphWeighted.addEdge(three, four, 5);
        //graphWeighted.addEdge(three, five, 2);
        //graphWeighted.addEdge(four, six, 6);
        //graphWeighted.addEdge(five, four, 1);
        //graphWeighted.addEdge(five, six, 8);

        graphWeighted.DijkstraShortestPath(zero, four);
        double xr = Math.random() * (30 - 1 + 1) + 1;
        double zr = Math.random() * (30 - 1 + 1) + 1;
        ArrayList<Integer> node = new ArrayList<>(Arrays.asList(10, 15));
        ArrayList<Integer> node2 = new ArrayList<>(Arrays.asList(30, 1));
        ArrayList<Integer> nodeEnd = new ArrayList<>(Arrays.asList(0, 0));



        if(this.name == "robot" && x < 15 && z == 0) {
            this.x += 1;
        }
        else if(this.name == "robot" && z < 15 && x == 15){
            this.z += 1;
        }
        else if(this.name == "robot" && x > 0 && z == 15){
            this.x -= 1;
        }
        else if(this.name == "robot" && x == 0 && z > 0){
            this.z -= 1;
        }

        if(this.name == "robot1" && x < node.get(0)) {

            this.x += 0.2;

        }
        else if(this.name == "robot1" && z < node.get(1)) {

            this.z += 0.2;

        }



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