package main;
// A Java program for Dijkstra's
// single source shortest path
// algorithm. The program is for
// adjacency matrix representation
// of the graph.

class DijkstrasAlgorithm {

	public static final int NO_PARENT = -1;
	public static int start;
	public static int[] shorter;
	public static int[] mothers;

	// Function that implements Dijkstra's
	// single source shortest path
	// algorithm for a graph represented
	// using adjacency matrix
	// representation
	public static void dijkstra(int[][] adjacencyMatrix,
										int startVertex)
	{
		int nVertices = adjacencyMatrix.length;

		// shortestDistances[i] will hold the
		// shortest distance from src to i
		int[] shortestDistances = new int[nVertices];

		// added[i] will true if vertex i is
		// included / in shortest path tree
		// or shortest distance from src to
		// i is finalized
		boolean[] added = new boolean[nVertices];

		// Initialize all distances as
		// INFINITE and added[] as false
		for (int vertexIndex = 0; vertexIndex < nVertices;
											vertexIndex++)
		{
			shortestDistances[vertexIndex] = Integer.MAX_VALUE;
			added[vertexIndex] = false;
		}
		
		// Distance of source vertex from
		// itself is always 0
		shortestDistances[startVertex] = 0;

		// Parent array to store shortest
		// path tree
		int[] parents = new int[nVertices];

		// The starting vertex does not
		// have a parent
		parents[startVertex] = NO_PARENT;

		// Find shortest path for all
		// vertices
		for (int i = 1; i < nVertices; i++)
		{

			// Pick the minimum distance vertex
			// from the set of vertices not yet
			// processed. nearestVertex is
			// always equal to startNode in
			// first iteration.
			int nearestVertex = -1;
			int shortestDistance = Integer.MAX_VALUE;
			for (int vertexIndex = 0;
					vertexIndex < nVertices;
					vertexIndex++)
			{
				if (!added[vertexIndex] &&
					shortestDistances[vertexIndex] <
					shortestDistance)
				{
					nearestVertex = vertexIndex;
					shortestDistance = shortestDistances[vertexIndex];
				}
			}

			// Mark the picked vertex as
			// processed
			added[nearestVertex] = true;

			// Update dist value of the
			// adjacent vertices of the
			// picked vertex.
			for (int vertexIndex = 0;
					vertexIndex < nVertices;
					vertexIndex++)
			{
				int edgeDistance = adjacencyMatrix[nearestVertex][vertexIndex];
				
				if (edgeDistance > 0
					&& ((shortestDistance + edgeDistance) <
						shortestDistances[vertexIndex]))
				{
					parents[vertexIndex] = nearestVertex;
					shortestDistances[vertexIndex] = shortestDistance +
													edgeDistance;
				}
			}
		}
		start = startVertex;
		shorter = shortestDistances;
		mothers = parents;
		//printSolution(start, shorter, mothers);
		//printSolution(startVertex, shortestDistances, parents);
	}

	// A utility function to print
	// the constructed distances
	// array and shortest paths
	public static void printSolution(int startVertex,
									int[] distances,
									int[] parents)
	{
		int nVertices = distances.length;
		System.out.print("Vertex\t Distance\tPath");
		
		for (int vertexIndex = 0;
				vertexIndex < nVertices;
				vertexIndex++)
		{
			if (vertexIndex != startVertex)
			{
				System.out.print("\n" + startVertex + " -> ");
				System.out.print(vertexIndex + " \t\t ");
				System.out.print(distances[vertexIndex] + "\t\t");
				printPath(vertexIndex, parents);
			}
		}
	}

	// Function to print shortest path
	// from source to currentVertex
	// using parents array
	public static void printPath(int currentVertex,
								int[] parents)
	{
		
		// Base case : Source node has
		// been processed
		if (currentVertex == NO_PARENT)
		{
			return;
		}
		printPath(parents[currentVertex], parents);
		int[][] classMatching = {
			{0, 0},
            {1, 1000},
            {2, 1003},
            {3, 1004},
            {4, 1005},
            {5, 1006},
            {6, 1007},
            {7, 1009},
            {8, 1010},
            {9, 1011},
            {10, 1012},
            {11, 1013},
            {12, 1014},
            {13, 1015},
            {14, 1016},
            {15, 1017},
            {16, 1018},
            {17, 1019},
            {18, 1024},
            {19, 1025},
            {20, 1026},
            {21, 1027},
            {22, 1034},
            {23, 1035},
            {24, 1036},
            {25, 1037},
            {26, 1038},
            {27, 1039},
            {28, 1040},
            {29, 1041},
            {30, 1042},
            {31, 1043},
            {32, 1044},
            {33, 1045},
            {34, 1047},
            {35, 1048},
            {36, 1049},
            {37, 1050},
            {38, 1051},
            {39, 1054},
            {40, 1062},
            {41, 1065},
            {42, 1066},
            {43, 1067},
            {44, 1068},
            {45, 1071},
            {46, 1075},
            {47, 1076},
            {48, 1077},
            {49, 1078},
            {50, 1079},
            {51, 1080},
            {52, 1081},
            {53, 1201},
            {54, 1203},
            {55, 1204},
            {56, 1205},
            {57, 1206},
            {58, 1210},
            {59, 1215},
            {60, 1244},
            {61, 1249},
            {62, 1250},
            {63, 1251},
            {64, 1401},
            {65, 1403},
            {66, 1404},
            {67, 1410},
            {68, 1411},
            {69, 1412},
            {70, 1413},
            {71, 1414},
            {72, 1417},
            {73, 1420},
            {74, 1422},
            {75, 1425},
            {76, 1501},
            {77, 1502},
            {78, 1509},
            {79, 1510},
            {80, 1511}
        };
		if(currentVertex>34) System.out.print(classMatching[currentVertex-34][1] + " ");
		else System.out.print(currentVertex + " ");
	}

		// Driver Code
	public static void main(String[] args)
	{
		
	}
}

// This code is contributed by Harikrishnan Rajan
