
import java.util.*;

public class Graph {
    
	LinkedList<Integer> graph[];
	Vertex v[];
	int time = 0;
	LinkedList<Integer> dfsTree[]; //depth first search tree
	LinkedList<Integer> Tsort = new LinkedList<Integer>();//List for Topological sort
	int treeIndex;
	
    public Graph(int n) { //creating a graph in adjacency list representation
    	
    	graph = new LinkedList[n];
    	v = new Vertex[n];
    	dfsTree = new LinkedList[n];
    
    	for(int i = 0 ; i<graph.length ; i++) {
    		graph[i] = new LinkedList<Integer>();
    		v[i] = new Vertex(i);
    	}
    }
    
    public void addEdge(int src, int dst ) {
    	graph[src-1].addLast(dst);
    }
    
    //implementing the depth first search algorithm
	public void DFS() {
		
		this.treeIndex = 0;
		
		for(int i=0; i<graph.length ; i++) {
			
			if(v[i].color == "White") {
				dfsTree[treeIndex] = new LinkedList<Integer>();
				DFS_VISIT(v[i]);
				treeIndex++;
			}
		}
		
		this.time = 0;	
	}
	
	//for performing DFS in the decreasing order of finishing times
	public void DFS(LinkedList<Integer> list) {
		
		this.treeIndex = 0;
		
		for(int i=0; i<graph.length ; i++) {
			
			if(v[list.get(i)].color == "White") {
				dfsTree[treeIndex] = new LinkedList<Integer>();
				DFS_VISIT(v[list.get(i)]);
				treeIndex++;
			}
		}
		
		this.time = 0;	
	}	
	
	public void DFS_VISIT(Vertex u) {
		
		this.time = this.time + 1;
		
		u.d = this.time;
		u.color = "Gray";
		int vnum = u.vertexNum;//getting vertex number
		
		for(int i=0 ; i<graph[vnum].size() ; i++) {
						
			int vAdj = graph[vnum].get(i)-1; // getting adjacent vertex
					
			if( v[vAdj].color == "White") {
				v[vAdj].parent = u;
				DFS_VISIT(v[vAdj]);
			}
		}
		
		u.color = "Black";
		dfsTree[treeIndex].addFirst(u.vertexNum+1);
		this.time = this.time + 1;
		u.f = this.time;
		Tsort.addFirst(u.vertexNum);// Topologically sorted list	
	}
	
	
    @Override
    public String toString(){
    	String str="";
    	
		for(int i=1 ; i<=graph.length ; i++) {
			str += i + "=>" +graph[i-1] + "\n";
		}
		
		return str;
    }
    
    
}
