package com.ravi.practice.datastructures;

import java.util.ArrayDeque;
import java.util.Queue;
class Runner {
	private static final int[] rowsCombination = { -1, -1, -1, 0, 1, 0, 1, 1 };
	private static final int[] colsCombination = { -1, 1, 0, -1, -1, 1, 0, 1 };

	public static void BFS(char[][] inputMatrix, boolean[][] processedMatrix, int i, int j) {
		Queue<NumberOfIslands> q = new ArrayDeque<>();
		q.add(new NumberOfIslands(i, j));
        processedMatrix[i][j] = true;

		// Iterate till queue is not empty
		while (!q.isEmpty()) {
			int x = q.peek().x;
			int y = q.peek().y;
			q.poll();
			// Iterate and check all 8 possible movements from a particular coordinate (x,y)
			for (int k = 0; k < 8; k++) {
				// If already visited or, has water i.e, '_', then skip
				if (isSafe(inputMatrix, x + rowsCombination[k], y + colsCombination[k], processedMatrix)) {
					processedMatrix[x + rowsCombination[k]][y + colsCombination[k]] = true;
					q.add(new NumberOfIslands(x + rowsCombination[k], y + colsCombination[k]));
				}
			}
		}
	}

	public static boolean isSafe(char[][] inputMatrix, int x, int y, boolean[][] processedMatrix) {
		boolean isSafe = (x >= 0) && (x < processedMatrix.length) && (y >= 0) && (y < processedMatrix[0].length)
				&& (inputMatrix[x][y] == '*' && !processedMatrix[x][y]);
		return isSafe;
	}

	public static void main(String[] args) {
		char[][] inputMatrix = { { '*', '_', '*', '_', '_', '_', '*', '*', '*', '*' }, { '_', '_', '*', '_', '*', '_', '*', '_', '_', '_' },
				{ '*', '*', '*', '*', '_', '_', '*', '_', '_', '_' }, { '*', '_', '_', '*', '_', '*', '_', '_', '_', '_' }, { '*', '*', '*', '*', '_', '_', '_', '*', '*', '*' },
				{ '_', '*', '_', '*', '_', '_', '*', '*', '*', '*' }, { '_', '_', '_', '_', '_', '*', '*', '*', '_', '_' }, { '_', '_', '_', '*', '_', '_', '*', '*', '*', '_' },
				{ '*', '_', '*', '_', '*', '_', '_', '*', '_', '_' }, { '*', '*', '*', '*', '_', '_', '_', '*', '*', '*' } };
		int m = inputMatrix.length;
		int n = inputMatrix[0].length;

		boolean[][] processedMatrix = new boolean[m][n];

		int islands = 0;
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				if (inputMatrix[i][j] == '*' && !processedMatrix[i][j]) {
					BFS(inputMatrix, processedMatrix, i, j);
					islands++;
				}
			}
		}

		System.out.print("Number of islands are : " + islands);
	}

}
