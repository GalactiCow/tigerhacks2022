package main;
import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;
import main.DijkstrasAlgorithm;

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
        int offset = 34;
        int[][] classMatching = {
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
        int[][][] adjList = {
                    { {1,1} }, //Indexed at 1, 0 is dummy

            /*1. */{ {0,1}, {2,15},{offset+1, 1},{offset+2, 5},{offset+3, 3},{offset+4, 5},{offset+5, 15} },
            /*2. */{ {1,15}, {3, 20}, {offset+18, 2}, {offset+19, 11} },
            /*3. */{ {2, 20}, {4, 10}, {15, 35}, {18, 20}, {offset+18, 18}, {offset+19, 9}, {offset+20, 7}, {offset+21, 15}, {offset+17, 7}, {offset+16, 7}, {offset+15, 17}, {offset+14, 17}, {offset+12, 32}, {offset+13, 30} },
            /*4. */{ {3, 10}, {5, 10}, {27, 30}, {offset+52, 12}, {offset+51, 20}, {offset+50, 25} },
            /*5. */{ {4, 10}, {14, 30}, {6, 30}, {20, 15}, {offset+55, 3}, {offset+53, 4}, {offset+54, 30}, {offset+56, 14}, {offset+57, 18}, {offset+41, 5}, {offset+42, 13}, {offset+43, 18} },
            /*6. */{ {5, 30}, {7, 10}, {11, 30}, {21, 10}, {offset+58, 1}, {offset+59, 29}, {offset+57, 14}, {offset+56, 16} },
            /*7. */{ {6, 10}, {8, 20}, {offset+73, 10} },
            /*8. */{ {7, 20}, {9, 30}, {19, 30}, {offset+74, 5}, {offset+75, 25}, {offset+72, 15} },
            /*9. */{ {8, 30}, {10, 20}, {offset+66, 7}, {offset+65, 6}, {offset+71, 7}, {offset+64, 10} },
            /*10.*/ { {9, 20}, {offset+67, 1}, {offset+68, 2}, {offset+69, 5}, {offset+70, 3} },
            /*11.*/ { {12, 5}, {13, 30}, {6, 30}, {offset+59, 2}, {offset+58, 28} },
            /*12.*/ { {11, 5} },
            /*13.*/ { {14, 2}, {11, 30}, {offset+54, 1} },
            /*14.*/ { {13, 2}, {5, 30}, {offset+54, 1}, {offset+53, 25}, {offset+55, 28} },
            /*15.*/ { {3, 35}, {33, 10}, {34, 10}, {offset+6, 8}, {offset+7, 6}, {offset+8, 4}, {offset+9, 2}, {offset+12, 5}, {offset+13, 8}, {offset+14, 17}, {offset+15, 17}, {offset+16, 24}, {offset+17, 24} },
            /*16.*/ { {17, 20}, {offset+23, 9}, {offset+24, 8}, {offset+25, 1}, {offset+26, 4}, {offset+27, 6}, {offset+28, 9}, {offset+29, 10}, {offset+31, 13}, {offset+32, 15}, {offset+30, 12}, {offset+33, 18} },
            /*17.*/ { {16, 20}, {18, 20}, {offset+35, 1}, {offset+34, 6}, {offset+36, 3}, {offset+37, 7}, {offset+39, 2}, {offset+38, 13}, {offset+33, 2}, {offset+32, 6}, {offset+31, 10}, {offset+30, 11}, {offset+28, 13}, {offset+29, 13}, {offset+27, 15}, {offset+26, 16}, {offset+25, 19} },
            /*18.*/ { {3, 20}, {28, 10}, {17, 20}, {offset+38, 7}, {offset+40, 9}, {offset+39, 9}, {offset+37, 12}, {offset+36, 16}, {offset+35, 19}, {offset+22, 2}, {offset+21, 7}, {offset+20, 17}  },
            /*19.*/ { {8, 30}, {offset+75, 7}, {offset+74, 12} },
            /*20.*/  {{5,10}, {26,10}, {21, 30}, {offset+41, 8}, {offset+42, 5}, {offset+43, 2}, {offset+44, 3}, {offset+60, 28}},
            /*21.*/ { {20, 30}, {22, 10}, {6,10}, {offset+60, 2}},
            /*22.*/ { {21, 10}, {23, 8}},
            /*23*/ { {24, 8}, {25, 10}, {offset+79, 7}, {offset+80, 6}},
            /*24*/ {{ 31, 40}, {offset+62, 10}, {offset+63, 10}, {offset+60, 15}, {offset+61, 16}},
            /*25.*/ { {23, 10}, {offset+78, 1}, {offset+79, 4}, {offset+80, 3}, {offset+76, 16}, {offset+77, 16}  },
            /*26.*/ { {20, 10}, {27, 10}, {31, 5}, {offset+45, 2}, {offset+48, 2}, {offset+44, 8} },
            /*27.*/ { {26, 10}, {30, 10}, {4, 30}, {offset+50, 3}, {offset+51, 10}, {offset+52, 18}, {offset+49, 4}, {offset+47, 8} },
            /*28.*/ { {27, 10}, {18, 10}, {29, 10}, {offset+22, 8} },
            /*29.*/ { {28, 10} },
            /*30*/ {{27, 10}, {32, 10}, {offset+49, 7}, {offset+47, 2},},
            /*31*/ {{32, 1}, {26, 5}},
            /*32.*/ { {31, 1}, {30, 10}, {offset+46, 9} },
            /*33.*/ { {1, 20}, {15, 10}, {offset+5, 5}, {offset+4, 9}, {offset+6, 2}, {offset+7, 6}, {offset+8, 7} },
            /*34.*/ { {15, 10}, {offset+10, 8}, {offset+11, 7} },
            /*offset+1.*/ { {1, 1} },
            /*offset+2.*/ { {1, 5} },
            /*offset+3.*/ { {1, 3} },
            /*offset+4.*/ { {1, 5} },
            /*offset+5.*/ { {1, 15}, {33, 5} },
            /*offset+6.*/ { {15, 8}, {33, 2} },
            /*offset+7.*/ { {15, 6}, {33, 6} },
            /*offset+8.*/ { {15, 4}, {33, 7} },
            /*offset+9.*/ { {15, 2} },
            /*offset+10.*/ { {34, 8} },
            /*offset+11.*/ { {34, 7} },
            /*offset+12.*/ { {3, 32}, {15, 5} },
            /*offset+13.*/ { {3, 30}, {15, 8} },
            /*offset+14.*/ { {3, 17}, {15, 17} },
            /*offset+15.*/ { {3, 17}, {15, 17} },
            /*offset+16.*/ { {3, 7}, {15, 24} },
            /*offset+17.*/ { {3, 7}, {15, 24} },
            /*offset+18.*/ { {2, 2}, {3, 18} },
            /*offset+19.*/ { {2, 11}, {3, 9} },
            /*offset+20.*/ { {3, 7}, {18, 17} },
            /*offset+21.*/ { {3, 15}, {18, 7} },
            /*offset+22.*/ { {18, 2}, {28, 8} },
            /*offset+23.*/ { {16, 9} },
            /*offset+24.*/ { {16, 8} },
            /*offset+25.*/ { {16, 1},  {17,19} },
            /*offset+26.*/ { {16, 4}, {17, 16} },
            /*offset+27.*/ { {16, 6}, {17, 15} },
            /*offset+28.*/ { {16, 9}, {17,13} },
            /*offset+29.*/ { {16, 10}, {17, 13} },
            /*offset+30.*/ { {16, 12}, {17, 11} },
            /*offset+31.*/ { {16, 13}, {17, 10} },
            /*offset+32.*/ { {16, 15}, {17, 6} },
            /*offset+33.*/ { {16, 18}, {17, 2} },
            /*offset+34.*/ { {17, 6} },
            /*offset+35.*/ { {17, 1}, {18, 19} },
            /*offset+36.*/ { {17, 3}, {18, 16} },
            /*offset+37.*/ { {17, 7}, {18, 12} },
            /*offset+38.*/ { {17, 13}, {18, 7} },
            /*offset+39.*/ { {17, 2}, {18, 9} },
            /*offset+40.*/ { {18, 9} },
            /*offset+41*/ { {5, 5}, {20, 8} },
            /*offset+42*/ { {5, 13}, {20, 5} },
            /*offset+43*/ { {5, 18}, {20, 2} },
            /*offset+44*/ { {20, 3}, {26, 8} },
            /*offset+45*/ { {26, 2} },
            /*offset+46*/ { {32, 9} },
            /*offset+47.*/ { {27, 8}, {30, 2} },
            /*offset+48.*/ { {26, 2} },
            /*offset+49.*/ { {27, 4}, {30, 7} },
            /*offset+50.*/ { {4, 25}, {27, 3} },
            /*offset+51.*/ { {4, 20}, {27, 10} },
            /*offset+52.*/ { {4, 12}, {27, 18} },
            /*offset+53.*/ { {5, 4}, {14, 25} },
            /*offset+54.*/ { {5, 30}, {13, 1}, {14, 1} },
            /*offset+55.*/ { {5, 3}, {14, 28} },
            /*offset+56.*/ { {5, 14}, {6, 16} },
            /*offset+57.*/ { {5, 18}, {6, 14} },
            /*offset+58.*/ { {6, 1}, {11, 28} },
            /*offset+59.*/ { {6, 29}, {11, 2} },
            /*offset+60.*/ { {21, 2}, {24, 15} },
            /*offset+61.*/ { {24, 16} },
            /*offset+62.*/ { {24, 10} },
            /*offset+63.*/ { {24, 10} },
            /*offset+64.*/ { {9, 10} },
            /*offset+65.*/ { {9, 6} },
            /*offset+66.*/ { {9, 7} },
            /*offset+67.*/ { {10, 1} },
            /*offset+68.*/ { {10, 2} },
            /*offset+69.*/ { {10, 5} },
            /*offset+70.*/ { {10, 3} },
            /*offset+71.*/ { {9, 7} },
            /*offset+72.*/ { {8, 15} },
            /*offset+73.*/ { {7 ,10} },
            /*offset+74.*/ { {8, 5}, {19, 12} },
            /*offset+75.*/ { {8, 25}, {19, 7} },
            /*offset+76.*/ { {25, 16} },
            /*offset+77.*/ { {25, 16} },
            /*offset+78.*/ { {25, 1} },
            /*offset+79.*/ { {23, 7}, {25, 4} },
            /*offset+80.*/ { {23, 6}, {25, 3} }
        };
        //System.out.println(Arrays.deepToString(adjListToMatrix(115, adjList)).replace("],", "],\n"));
        int[][] adjacencyMatrix = adjListToMatrix(115, adjList);


        //Scanner scanner = new Scanner(System.in);
        int input1 = -1;
        int input2 = -1;
        boolean flag = true;
        //System.out.println("Enter a starting node: ");
        do {
            try {
                Scanner scanner = new Scanner(System.in);
                System.out.println("Enter a starting node: ");
                input1 = scanner.nextInt();
                if (input1 < 1 || input1 > 114) {
                    throw new IllegalArgumentException();
                }
                System.out.println("Enter an ending node: ");
                input2 = scanner.nextInt();
                if (input2 < 1 || input2 > 114) {
                    throw new IllegalArgumentException();
                }
                if (input2 == input1) {
                    throw new RuntimeException();
                }
                scanner.close();
                flag=false;
            }
            catch(InputMismatchException e) {
                // Accept integers only.
                System.out.println("Please enter an integer value only.");
                flag = true;
            } catch (IllegalArgumentException e2) {
                System.out.println("Please enter an integer in the range 1 - 114.");
                flag = true;
            } catch (RuntimeException e3) {
                System.out.println("Please enter unique values for starting and ending nodes.");
                flag = true;
            }
        }
        while(flag);

        DijkstrasAlgorithm.dijkstra(adjacencyMatrix, input1);

        System.out.println("\n*** Solution ***");
        DijkstrasAlgorithm.printPath(input2, DijkstrasAlgorithm.mothers);

	}
}