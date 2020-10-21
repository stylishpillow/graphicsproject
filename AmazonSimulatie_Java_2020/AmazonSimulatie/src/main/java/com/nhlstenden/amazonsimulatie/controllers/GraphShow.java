package com.nhlstenden.amazonsimulatie.controllers;

import java.util.ArrayList;

public class GraphShow {

    public ArrayList<String> graphShow(int start, int end) {
        GraphWeighted graphWeighted = new GraphWeighted(true);
        NodeWeighted zero = new NodeWeighted(0, "0", "x");
        NodeWeighted one = new NodeWeighted(15, "15", "x");
        NodeWeighted two = new NodeWeighted(50, "50", "y");
        NodeWeighted three = new NodeWeighted(30, "30", "x");
        NodeWeighted four = new NodeWeighted(41, "41", "y");
        //NodeWeighted five = new NodeWeighted(5, "5");
        //NodeWeighted six = new NodeWeighted(6, "6");
        NodeWeighted starts = new NodeWeighted(0, "0", "");
        NodeWeighted ends = new NodeWeighted(0, "0", "");

    
        // Our addEdge method automatically adds Nodes as well.
        // The addNode method is only there for unconnected Nodes,
        // if we wish to add any
        graphWeighted.addEdge(zero, one, 8);
        graphWeighted.addEdge(one, two, 8);
        graphWeighted.addEdge(two, three, 8);
        graphWeighted.addEdge(three, four, 8);

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
        path3 = graphWeighted.DijkstraShortestPath(starts, ends);
        return path3;
    }
}