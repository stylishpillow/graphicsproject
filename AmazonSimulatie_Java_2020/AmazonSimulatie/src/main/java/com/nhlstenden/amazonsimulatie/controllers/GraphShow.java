package com.nhlstenden.amazonsimulatie.controllers;

import java.util.ArrayList;

public class GraphShow {

    public ArrayList<String> graphShow(int start, int end) {
        GraphWeighted graphWeighted = new GraphWeighted(true);
        NodeWeighted zero = new NodeWeighted(0, "0", "x");
        NodeWeighted one = new NodeWeighted(15, "15", "x");
        //NodeWeighted two = new NodeWeighted(2, "2");
        //NodeWeighted three = new NodeWeighted(3, "3");
        //NodeWeighted four = new NodeWeighted(4, "4");
        //NodeWeighted five = new NodeWeighted(5, "5");
        //NodeWeighted six = new NodeWeighted(6, "6");
        NodeWeighted starts = new NodeWeighted(0, "0", "");
        NodeWeighted ends = new NodeWeighted(0, "0", "");

    
        // Our addEdge method automatically adds Nodes as well.
        // The addNode method is only there for unconnected Nodes,
        // if we wish to add any
        graphWeighted.addEdge(zero, one, 8);
        //graphWeighted.addEdge(zero, two, 11);
       // graphWeighted.addEdge(one, three, 3);
        //graphWeighted.addEdge(one, four, 8);
        //graphWeighted.addEdge(one, two, 7);
        //graphWeighted.addEdge(two, four, 9);
       // graphWeighted.addEdge(three, four, 5);
       // graphWeighted.addEdge(three, five, 2);
       // graphWeighted.addEdge(four, six, 6);
        //graphWeighted.addEdge(five, four, 1);
        //graphWeighted.addEdge(five, six, 8);

        switch (start){
            case 0:
            starts = zero;
            break;
        }

        switch (end){
            case 1:
            ends = one;
            break;
        }

        ArrayList<String> path3 = new ArrayList<String>();
        path3 = graphWeighted.DijkstraShortestPath(starts, ends);
        return path3;
    }
}