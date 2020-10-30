package com.nhlstenden.amazonsimulatie.models;


import java.util.ArrayList;
import java.util.UUID;


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
    private double xs = 0;
    private double y = 0;
    private double z = 0;

    private double rotationX = 0;
    private double rotationY = 0;
    private double rotationZ = 0;

    private int start = 0;
    private int end = 0;
    private int length = 0;
    private int i = 0;

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
        this.start = 0;
        this.end = 4;
        coordinates = grapshow.graphShow(start, end);
        length = coordinates.size();

        Double f = 0.1;
        String c = coordinates.get(i);
        double p = Double.valueOf(coordinates.get(i+1));

            if(this.name == "robot" && c.equals("x")) {
                if (i == 0){
                    this.x = this.x + f * (p - this.x);
//                    System.out.print(" " + this.x);
                }
                if (i > 1){
                double bp = Double.valueOf(coordinates.get(i-1));
                if (p < bp){
                    p = p + bp;
                    this.x = this.x + f * (p - this.x);
//                    System.out.print(" " + this.x);
                } 
                if (this.x >= p - 0.1 && i < 3){
                    i+=2;
                }
                else {
                    this.x = this.x + f * (p - this.x);
//                    System.out.print(" " + this.x);
                }
            }          
            if (this.x >= p - 0.1 && i < 3){
                i+=2;
            }
            }
            else if (this.name == "robot" && c.equals("z")){
                this.z = this.z + f * (p - this.z);
//                System.out.print(" " + this.z);
            }
            else if (this.name == "robot1"){
                this.x = 0;
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