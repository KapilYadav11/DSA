//Problem Statement: Given an array of integers asteroids, where each integer represents an asteroid in a row, determine the state of the asteroids after all collisions. In this array, the absolute value represents the size of the asteroid, and the sign represents its direction (positive meaning right and negative meaning left). All asteroids move at the same speed.

import java.util.*;;

public class AsteroidCollision {
    public int[] findAsteroidCollision(int[] asteroids){
        int n = asteroids.length;
        List<Integer> s = new ArrayList<>();
        for(int i = 0; i < n; i++){
            if(asteroids[i] > 0){
                s.add(asteroids[i]);
            } else{
                while (!s.isEmpty() && s.get(s.size() - 1) > 0 && s.get(s.size() - 1) < Math.abs(asteroids[i])) {
                    s.remove(s.size() - 1);
                }

                if(!s.isEmpty() && s.get(s.size() - 1) == Math.abs(asteroids[i])){
                    s.remove(s.size() - 1);
                }

                else if (s.isEmpty() || s.get(s.size() - 1) < 0) {
                    s.add(asteroids[i]);
                }
            }
        }

        int[] result = new int[s.size()];
        for(int i = 0; i < s.size(); i++){
            result[i] = s.get(i);
        }
        return result;
    }
    public static void main(String [] args){
        AsteroidCollision sol = new AsteroidCollision();
        int[] asteroids = {10,20, -10};
        int[] ans = sol.findAsteroidCollision(asteroids);
        System.out.print("The state of asteroids after collisions is: ");
        for (int i = 0; i < ans.length; i++) {
            System.out.print(ans[i] + " ");
        }

    }
}
