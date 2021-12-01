/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.arangodb.arangosemantics;

import com.arangodb.ArangoDB;
import com.arangodb.ArangoDBException;
import static com.arangodb.entity.arangosearch.analyzer.AQLAnalyzerProperties.ReturnType.string;
import com.arangodb.mapping.ArangoJack;
import java.io.IOException;

/**
 *
 * @author arthurkeen
 */
public class Arango2RDF {

    public static void main(String[] args) throws IOException {
        ArangoDB arangoDB = new ArangoDB.Builder()
                .serializer(new ArangoJack())
                .user("root")
                .password("openSesame")
                .build();
        String version = null;
        try {
            version = arangoDB.getVersion().getVersion();
            System.out.println("ArangoDB version: " + version);
        } catch (final ArangoDBException e) {
            System.err.println("Failed to read ArangoDB version: " + e.getMessage());
        }
        String server = null;
        try {
            server = arangoDB.getServerId();
            System.out.println("ArangoDB server: " + server);
        } catch (final ArangoDBException e) {
            System.err.println("Failed to read ArangoDB server ID: " + e.getMessage());
        }

    }

}
