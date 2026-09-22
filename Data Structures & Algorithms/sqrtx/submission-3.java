class Solution {
    public int mySqrt(int x) {
        
        if (x == 0) return 0;
        
        double this_y = x;

        double y = this_y - ((this_y*this_y) - x)/(2*this_y);
        double diff = y  - this_y;

        if (diff<0) diff = -diff;

        while (diff > 0.01){
            this_y = y;
            y = this_y - ((this_y*this_y) - x)/(2*this_y);
            diff = y  - this_y;
            if (diff<0) diff = -diff;
        }

        return (int)y;
    }
}