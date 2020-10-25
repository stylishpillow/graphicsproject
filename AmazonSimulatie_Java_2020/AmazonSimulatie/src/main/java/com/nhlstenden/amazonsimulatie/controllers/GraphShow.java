package com.nhlstenden.amazonsimulatie.controllers;

import java.util.ArrayList;

public class GraphShow {

    private int current = 0;
    private int length = 0;

    public ArrayList<Double> graphShow(int start, int end) {
        GraphWeighted graphWeighted = new GraphWeighted(true);
        NodeWeighted zero = new NodeWeighted(0, "0");
        NodeWeighted one = new NodeWeighted(1, "1");
        NodeWeighted two = new NodeWeighted(2, "2");
        NodeWeighted three = new NodeWeighted(3, "3");
        NodeWeighted four = new NodeWeighted(4, "4");
        //NodeWeighted five = new NodeWeighted(5, "5");
        //NodeWeighted six = new NodeWeighted(6, "6");
        NodeWeighted starts = new NodeWeighted(0, "0");
        NodeWeighted ends = new NodeWeighted(0, "0");

    
        // Our addEdge method automatically adds Nodes as well.
        // The addNode method is only there for unconnected Nodes,
        // if we wish to add any
        graphWeighted.addEdge(zero, one, 8, 'x');
        graphWeighted.addEdge(one, two, 9, 'x');
        graphWeighted.addEdge(two, three, 10, 'y');
        graphWeighted.addEdge(three, four,11, 'x');

        switch (start){
            case 0:
            starts = zero;
            break;
        }

        switch (end){
            case 4:
            ends = four;
            break;
        }
        //graphWeighted.DijkstraShortestPath(starts, ends);

        ArrayList<String> path3 = new ArrayList<String>();
        ArrayList<Double> co = new ArrayList<Double>();

        path3 = graphWeighted.DijkstraShortestPath(starts, ends);
        length = path3.size();
        for (int i = 0; i < length - 1; i++){    
            //this.current = Integer.parseInt(path3.get(i));
            this.current = Integer.parseInt(path3.get(i));

            Double coordinaten = graphWeighted.GetCoordinaten(current);
            co.add(coordinaten);
        }
        return co;
        //return path3;
    }
}