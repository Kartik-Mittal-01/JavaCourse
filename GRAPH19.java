
public class GRAPH19 {

    public void FloodFillUtil(int image[][], int sr, int sc, boolean vis[][], int color, int orgColor) {
        if (sr < 0 || sc < 0 || sr >= image.length || sc >= image[0].length || vis[sr][sc] || image[sr][sc] != orgColor) {
            return;
        }
        image[sr][sc] = color;
        vis[sr][sc] = true;
        FloodFillUtil(image, sr - 1, sc, vis, color, orgColor);
        FloodFillUtil(image, sr + 1, sc, vis, color, orgColor);
        FloodFillUtil(image, sr, sc - 1, vis, color, orgColor);
        FloodFillUtil(image, sr, sc + 1, vis, color, orgColor);
    }

    public int[][] FloodFill(int image[][], int sr, int sc, int color) {
        boolean vis[][] = new boolean[image.length][image[0].length];
        FloodFillUtil(image, sr, sc, vis, color, image[sr][sc]);
        return image;
    }

    public static void main(String[] args) {

        // FLOOD FILL ALGORITHM
    }
}
