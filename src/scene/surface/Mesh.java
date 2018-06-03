package scene.surface;

import java.util.ArrayList;

import scene.material.Material;
import scene.transformation.Transformation;

public class Mesh extends Surface{
	
	String name;

	public Mesh(String name,Material material, ArrayList<Transformation> transformations) {
		super(material, transformations);
		this.name = name;
	}

}
