public class RatInAMaza {
    public static void FindPath(int[][] mze , int x , int y, int n , boolean[][] visited , String path , List<String> paths){
        if(x == n-1 && y==n-1){
            paths.add(path);
            return;
        }

        int[] dx = {1 , 0 , -1 , 0};
        int[] dy = {0 , 1 , 0 , -1};

        char[] move = {'D' , 'R' , 'U' , 'L'};

        for(int i=0 ; i<4 ; i++){
            int newX = x + dx[i];
            int newY = y + dy[i];

            if(isSafe(newX , newY , n , mze , visited)){
                visited [newX][newY] = true;
                FindPath(mze, newX, newY, n, visited, path+move[i], path);
                visited[newX][newY] = false;
            }
        }
    }

    public static boolean isSafe(int x , int y , int n , int[][] maze , boolean[][] visited ){
        return x>=0 && y>=0 && x<n && y<n && maze[x][y]==1 && !visited[x][y] ;
    }

    public static List<String> findPath(int[][] mze){
        List<String> path = 
    }
    public static void main(String[] args) {
        int[][] maze = {
            {1,0,0,0},
            {1,1,0,1},
            {0,1,0,1},
            {1,1,}
        }
        
    }
}
