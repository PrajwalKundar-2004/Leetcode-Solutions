class Solution {

    public int minSpeedOnTime(int[] dist, double hour) {

        int low = 1;
        int high = 10000000;

        double time;
        double val;
        boolean flag = false;

        while(low < high) {

            time = 0;
            val = 0;

            int mid = (low + high) / 2;

            for(int i = 0; i < dist.length; i++) {

                if(i == dist.length - 1) {
                    val = val + ((double) dist[i] / mid);
                } else {
                    val = val + Math.ceil((double) dist[i] / mid);
                }
            }

            time = val;

            if(time <= hour) {
                high = mid;
                flag = true;
            } else {
                low = mid + 1;
            }
        }

        val = 0;

        for(int i = 0; i < dist.length; i++) {

            if(i == dist.length - 1) {
                val += (double) dist[i] / low;
            } else {
                val += Math.ceil((double) dist[i] / low);
            }
        }

        if(val <= hour) {
            return low;
        }

        return -1;
    }
}