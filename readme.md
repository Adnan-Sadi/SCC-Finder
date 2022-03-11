# About
The algorithm for finding Strongly Connected Components (SCC) in a directed graph is implemented in this program.
This requires implementing Depth First Search and modifying DFS to be able to modify 
the search order at the top level as required by SCC.

The program reads a graph description from the 'input.txt' file. The graph has n vertices, with 
vertices numbered from 1 to n. The first line of the file needs to be a single integer value which defines n, the number of vertices. Each line after that will contain a pair of integers specifying a 
directed edge of the graph. The first integer is the source vertex number for the edge, the 
second integer is the destination vertex number for the edge. The program reads all the edges 
from the file and uses them to build an Adjacency List representation of the graph.

# How to Run:

- Please install Eclipse IDE if it is not already installed. Download Eclipse IDE from: https://www.eclipse.org/downloads/
- The program requires "Java SE 12 or above" to run. 
   Please Download and install the latest Java Development Kit from: https://www.oracle.com/java/technologies/javase-downloads.html
- Copy the folder named 'SCC-Finder' and all its contents to your eclipse-workspace.
- Open Eclipse IDE and find the folder named 'Programming Assignment' inside your eclipse-workspace.
- Finally go inside the 'src' folder and run the file named 'SCC.java' to view the outputs.
