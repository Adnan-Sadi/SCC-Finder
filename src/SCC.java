
import java.io.File;
import java.util.Arrays;
import java.util.Scanner;

public class SCC {

	public static void main(String[] args) throws Exception {
		
		File file = new File("input.txt");
		
		Scanner input = new Scanner(file); 
		
		int size = input.nextInt(); //getting the size of the graph form file
		int source = 0, dest = 0;
		Graph g = new Graph(size);//creating an object of the graph
		Graph gT = new Graph(size);// Transpose of graph g
		
		//reading source and destination of the edge from the file and then adding the edge
		while(input.hasNext()) {
			source = input.nextInt();
			dest = input.nextInt();
			
			g.addEdge(source, dest);
			gT.addEdge(dest, source); // graph transpose with reversed edges
		}
			
		
		//System.out.println(g); //uncomment to print Adjacency List representation of graph g
		
		
		g.DFS(); //performing depth first search on the graph
		
	/*	for (int i=0; i<size ; i++ ) {
			System.out.println(g.v[i]); //uncomment To print all the vertices with initial and final visit times after DFS		
		} */
					
		gT.DFS(g.Tsort);//performing DFS on the graph transpose, Tsort is a list of finishing times in descending order from the first DFS
		
		
		Object[] arr;
		
		System.out.println("Strongly Connected Components:");
		
		for(int i=0 ; i<gT.dfsTree.length ; i++) {
			
			if(gT.dfsTree[i] != null) {
				
				arr = gT.dfsTree[i].toArray();// converting the list of vertices to an array
				Arrays.sort(arr); // sorting the array in ascending the order
				System.out.println(Arrays.toString(arr));
							
			}
		}
	    	
		input.close();

	}
}
