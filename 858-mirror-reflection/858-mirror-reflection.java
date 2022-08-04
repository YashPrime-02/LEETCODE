class Solution {
    public int mirrorReflection(int p, int q) {
        int x = p;
        int y = q;
        int yDir = 1;
        
        while(true) {
            if(x == p && y == 0) return 0;
            if(x == p && y == p) return 1;
            if(x == 0 && y == p) return 2;
            
            // Bounce the ray
            x = x > 0 ? 0 : p;
            y = y + q * yDir;
            if (y > p) {
                y = p - (y - p);
                yDir = -1;
            } else if (y < 0) {
                y = -y;
                yDir = 1;
            }
        }
    }
}