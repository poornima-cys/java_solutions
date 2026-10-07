class Solution {
  public:
    void dfs(int i, int j, int oc, vector<vector<int>>& image, vector<vector<bool>>& visited, int nc) {
        if(i < 0 || j < 0 || i > image.size() - 1 || j > image[0].size() - 1) return;
        if(image[i][j] != oc) return;
        if(visited[i][j] == true) return;
        visited[i][j] = true;
        image[i][j] = nc;
        dfs(i, j + 1, oc, image, visited, nc);
        dfs(i + 1, j, oc, image, visited, nc);
        dfs(i, j - 1, oc, image, visited, nc);
        dfs(i - 1, j, oc, image, visited, nc);
    }
    vector<vector<int>> floodFill(vector<vector<int>>& image, int sr, int sc,
                                  int newColor) {
        int n = image.size();
        int m = image[0].size();
        vector<vector<bool>>visited(n, vector<bool>(m, false));
        int oc = image[sr][sc];
        dfs(sr, sc, oc, image, visited, newColor);
        return image;
    }
};