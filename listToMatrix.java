import java.util.Arrays;
class listToMatrix {
    public static int[][] adjListToMatrix(int n, int[][][] adjList) {
        int[][] matrix = new int[n][n];
		for(int i = 0; i < n; i++) {
			for (int j = 0; j < adjList[i].length;j++) {
				matrix[i][adjList[i][j][0]] = adjList[i][j][1];
			}
		}
		return matrix;
    }
    public static void main(String[] args)
	{
        int[][][] adjList = {
            {{1,4},{7,8}},
            {{0,4},{2,8},{7,11}},
            {{1,8},{3,7},{5,4},{8,2}},
            {{2,7},{4,9},{5,14}},
            {{3,9},{5,10}},
            {{2,4},{4,10},{6,2}},
            {{3,14},{5,2},{7,1},{8,6}},
            {{0,8},{1,11},{6,1},{8,7}},
            {{2,2},{6,6},{7,7}}
        };
        System.out.println(Arrays.deepToString(adjListToMatrix(9, adjList)).replace("],", "],\n"));
	}
}