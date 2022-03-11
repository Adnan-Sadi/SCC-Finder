
public class Vertex {

	int vertexNum;
	public String color = "";
	int d,f;
	Vertex parent;
	int verName;
	
	
	public Vertex(int vertex){
		
		this.vertexNum = vertex;
		this.color = "White";
		this.parent = null;
		this.d = 0;
		this.f = 0;
		this.verName = vertexNum + 1;
	}
	
    @Override
    public String toString(){
    	
    	
    	String str= "" + verName + "" +","+ color+","+d+","+f;
    	
		return str;
    }
}
