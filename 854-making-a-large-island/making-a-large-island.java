class Solution {
    public int largestIsland(int[][] grid) {
        int n = grid.length;
        int[][] directions = {{1, 0}, {-1, 0}, {0, 1}, {0, -1}};
        int maxArea = 0;
        int index = 2;
        Map<Integer, Integer> areaMap = new HashMap<>();
        areaMap.put(0, 0);

        // First pass: mark each island with a unique index and calculate its area
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (grid[i][j] == 1) {
                    int area = dfs(grid, i, j, index, directions);
                    areaMap.put(index, area);
                    maxArea = Math.max(maxArea, area);
                    index++;
                }
            }
        }

        // Second pass: try to change each 0 to 1 and calculate the potential island area
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (grid[i][j] == 0) {
                    Set<Integer> seen = new HashSet<>();
                    int potentialArea = 1; // Change 0 to 1
                    for (int[] dir : directions) {
                        int x = i + dir[0];
                        int y = j + dir[1];
                        if (x >= 0 && x < n && y >= 0 && y < n && grid[x][y] > 1) {
                            int idx = grid[x][y];
                            if (!seen.contains(idx)) {
                                seen.add(idx);
                                potentialArea += areaMap.get(idx);
                            }
                        }
                    }
                    maxArea = Math.max(maxArea, potentialArea);
                }
            }
        }

        return maxArea;
    }

    private int dfs(int[][] grid, int i, int j, int index, int[][] directions) {
        int n = grid.length;
        int area = 1;
        grid[i][j] = index;
        for (int[] dir : directions) {
            int x = i + dir[0];
            int y = j + dir[1];
            if (x >= 0 && x < n && y >= 0 && y < n && grid[x][y] == 1) {
                area += dfs(grid, x, y, index, directions);
            }
        }
        return area;
    }
}
