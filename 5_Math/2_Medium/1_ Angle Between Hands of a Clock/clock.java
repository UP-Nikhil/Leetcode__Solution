// https://leetcode.com/problems/angle-between-hands-of-a-clock/description/
public class clock {
    public double angleClock(int hour, int minutes) {
        if (hour == 12) {
            hour = 0;
        }
        double minute_A = minutes * 6;
        double hour_A = hour * 30 + minutes * 0.5;
        double angle = Math.abs(hour_A - minute_A);
        return Math.min(angle, 360 - angle);
    }
}
