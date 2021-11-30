/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.arangodb.arangosemantics;

import java.io.IOException;
import java.io.InputStream;
import org.eclipse.rdf4j.model.Model;
import org.eclipse.rdf4j.rio.RDFFormat;
import org.eclipse.rdf4j.rio.Rio;

/**
 *
 * @author arthurkeen
 */
public class LoadTurtleStar {
    

	public static void main(String[] args) throws IOException {

		String filename = "owlstar.ttl";

		// read the file 'example-data-artists.ttl' as an InputStream.
		InputStream input = LoadTurtleStar.class.getResourceAsStream("/" + filename);

		// Rio also accepts a java.io.Reader as input for the parser.
		Model model = Rio.parse(input, "", RDFFormat.TURTLESTAR);

		// To check that we have correctly read the file, let's print out the model to the screen again
		model.forEach(System.out::println);
                
                // write out
                Rio.write(model, System.out, RDFFormat.JSONLD);
	}
}