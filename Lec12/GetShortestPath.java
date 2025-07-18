public class GetShortestPath {
    public static void main(String[] args) {
        String path = "WNEENESENNN";
        float shortestDistance = GetShortest(path);
        System.out.println("Shortest distance from the origin: " + shortestDistance);
    }

    public static float GetShortest(String path) {
        int x = 0, y = 0;
        for (int i = 0; i < path.length(); i++) {
            char dir = path.charAt(i);
            if (dir == 'N') {
                y++;
            } else if (dir == 'S') {
                y--;
            } else if (dir == 'E') {
                x++;
            } else {
                x--;
            }

        }
        return (float) Math.sqrt(x * x + y * y);
    }
}
