package com.nhlstenden.amazonsimulatie.controllers;

import java.util.ArrayList;

public class GraphShow {

    public ArrayList<String> graphShow(int start, int end) {
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
        graphWeighted.addEdge(one, two, 8, 'x');
        graphWeighted.addEdge(two, three, 8, 'y');
        graphWeighted.addEdge(three, four, 8, 'x');

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