package java_raytracer;

import java.io.IOException;
import scene.Scene;
import xml.XMLParser;

public class Main {

	public static void main(String[] args) throws IOException{
		
		Scene s = XMLParser.parseScene(args[1]);
		Renderer r = new Renderer(s);
		r.render();
		
		
	}
}
