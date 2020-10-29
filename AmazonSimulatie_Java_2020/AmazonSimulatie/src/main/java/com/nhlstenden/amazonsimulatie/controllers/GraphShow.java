package com.nhlstenden.amazonsimulatie.controllers;

import java.util.ArrayList;

public class GraphShow {

    private int current = 0;
    private int next = 0;
    private int length = 0;

    public ArrayList<String> graphShow(int start, int end) {
        GraphWeighted graphWeighted = new GraphWeighted(true);
        NodeWeighted zero = new NodeWeighted(0, "0");
        NodeWeighted one = new NodeWeighted(1, "1");
        NodeWeighted two = new NodeWeighted(2, "2");
        NodeWeighted three = new NodeWeighted(3, "3");
        NodeWeighted four = new NodeWeighted(4, "4");
        NodeWeighted five = new NodeWeighted(5, "5");
        NodeWeighted six = new NodeWeighted(6, "6");
        NodeWeighted seven = new NodeWeighted(7, "7");
        NodeWeighted eigth = new NodeWeighted(8, "8");
        NodeWeighted nine = new NodeWeighted(9, "9");
        NodeWeighted ten = new NodeWeighted(10, "10");
        NodeWeighted eleven = new NodeWeighted(11, "12");
        NodeWeighted twelve = new NodeWeighted(12, "12");
        NodeWeighted thirteen = new NodeWeighted(13, "13");
        NodeWeighted fourteen = new NodeWeighted(14, "14");
        NodeWeighted fifteen = new NodeWeighted(15, "15");
        NodeWeighted sixteen = new NodeWeighted(16, "16");
        NodeWeighted seventeen = new NodeWeighted(17, "17");
        NodeWeighted eighteen = new NodeWeighted(18, "18");
        NodeWeighted nineteen = new NodeWeighted(19, "19");
        NodeWeighted twenty = new NodeWeighted(20, "20");
        NodeWeighted twentyone = new NodeWeighted(21, "21");
        NodeWeighted twentytwo = new NodeWeighted(22, "22");
        NodeWeighted twentythree = new NodeWeighted(23, "23");
        NodeWeighted starts = new NodeWeighted(0, "0");
        NodeWeighted ends = new NodeWeighted(0, "0");

    
        // Our addEdge method automatically adds Nodes as well.
        // The addNode method is only there for unconnected Nodes,
        // if we wish to add any
        graphWeighted.addEdge(zero, one, 4, 'x');
        graphWeighted.addEdge(zero, two, 20, 'z');

        graphWeighted.addEdge(one, seven, 4, 'x');
        graphWeighted.addEdge(one, four, 5, 'z');

        graphWeighted.addEdge(two, three,4, 'x');

        graphWeighted.addEdge(three, six, 5, 'z');
        graphWeighted.addEdge(three, eleven, 4, 'x');

        graphWeighted.addEdge(four, five, 5, 'z');

        graphWeighted.addEdge(five, six, 5, 'z');

        graphWeighted.addEdge(seven, fifteen, 4, 'x');
        graphWeighted.addEdge(seven, eigth, 5, 'z');

        graphWeighted.addEdge(eigth, nine, 5, 'z');

        graphWeighted.addEdge(nine, ten, 40, 'x');

        graphWeighted.addEdge(eleven, ten, 5, 'z');
        graphWeighted.addEdge(eleven, twelve, 4, 'x');

        graphWeighted.addEdge(twelve, thirteen, 5, 'z');
        graphWeighted.addEdge(twelve, nineteen, 4, 'x');

        graphWeighted.addEdge(thirteen, fourteen, 10, 'z');

        graphWeighted.addEdge(fifteen, fourteen, 5, 'z');
        graphWeighted.addEdge(fifteen, sixteen, 4, 'x');

        graphWeighted.addEdge(sixteen, seventeen, 5, 'z');
        graphWeighted.addEdge(sixteen, twentytwo, 4, 'x');

        graphWeighted.addEdge(seventeen, eighteen, 10, 'z');

        graphWeighted.addEdge(nineteen, eighteen, 5, 'z');
        graphWeighted.addEdge(nineteen, twenty, 5, 'z');

        graphWeighted.addEdge(twenty, twentyone, 2, 'x');
        graphWeighted.addEdge(twentytwo, twentythree, 2, 'x');
        

        switch (start){
            case 0: starts = zero; break;
            case 1: starts = one; break;
            case 2: starts = two; break;
            case 3: starts = three; break;
            case 4: starts = four; break;
            case 5: starts = five; break;
            case 6: starts = six; break;
            case 7: starts = seven; break;
            case 8: starts = eigth; break;
            case 9: starts = nine; break;
            case 10: starts = ten; break;
            case 11: starts = eleven; break;
            case 12: starts = twelve; break;
            case 13: starts = thirteen; break;
            case 14: starts = fourteen; break;
            case 15: starts = fifteen; break;
            case 16: starts = sixteen; break;
            case 17: starts = seventeen; break;
            case 18: starts = eighteen; break;
            case 19: starts = nineteen; break;
            case 20: starts = twenty; break;
            case 21: starts = twentyone; break;
            case 22: starts = twentytwo; break;
            case 23: starts = twentythree; break;
        }

        switch (end){
            case 0: ends = zero; break;
            case 1: ends = one; break;
            case 2: ends = two; break;
            case 3: ends = three; break;
            case 4: ends = four; break;
            case 5: ends = five; break;
            case 6: ends = six; break;
            case 7: ends = seven; break;
            case 8: ends = eigth; break;
            case 9: ends = nine; break;
            case 10: ends = ten; break;
            case 11: ends = eleven; break;
            case 12: ends = twelve; break;
            case 13: ends = thirteen; break;
            case 14: ends = fourteen; break;
            case 15: ends = fifteen; break;
            case 16: ends = sixteen; break;
            case 17: ends = seventeen; break;
            case 18: ends = eighteen; break;
            case 19: ends = nineteen; break;
            case 20: ends = twenty; break;
            case 21: ends = twentyone; break;
            case 22: ends = twentytwo; break;
            case 23: ends = twentythree; break;
        }

        ArrayList<String> path3 = new ArrayList<String>();
        ArrayList<String> co = new ArrayList<String>();

        path3 = graphWeighted.DijkstraShortestPath(starts, ends);
        length = path3.size();
        for (int i = 0; i < length - 1; i++){    
            if (i < length -2){
            this.current = Integer.parseInt(path3.get(i));
            this.next = Integer.parseInt(path3.get(i+1));

            Double coordinaten = graphWeighted.GetCoordinaten(current, next);
            Character chars = graphWeighted.GetCharacter(current, next);
            co.add(String.valueOf(chars));
            co.add(String.valueOf(coordinaten));
            }
            else {
                co.add(path3.get(i+1));
            }
        }
        //co.add(get(pat))
        return co;
    }
}