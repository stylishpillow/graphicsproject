package com.nhlstenden.amazonsimulatie.controllers;

import java.util.LinkedList;

public class NodeWeighted {

        public static NodeWeighted zero;
	// The int n and String name are just arbitrary attributes
    // we've chosen for our nodes these attributes can of course
    // be whatever you need
    int n;
    String name;
    String co;
    private boolean visited;
    LinkedList<EdgeWeighted> edges;

    public NodeWeighted(int n, String name, String co) {
        this.n = n;
        this.name = name;
        this.co = co;
        visited = false;
        edges = new LinkedList<>();
    }

    boolean isVisited() {
        return visited;
    }

    void visit() {
        visited = true;
    }

    void unvisit() {
        visited = false;
    }
}
