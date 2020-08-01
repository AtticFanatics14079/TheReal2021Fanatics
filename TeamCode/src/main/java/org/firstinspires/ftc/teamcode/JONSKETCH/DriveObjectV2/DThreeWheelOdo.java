package org.firstinspires.ftc.teamcode.JONSKETCH.DriveObjectV2;

public class DThreeWheelOdo implements Odometry, DriveObject{

    double x, y, heading;
    int partNum;
    DOThread thread = new NullThread();

    public void set(double value) {
        //Do nothing
    }

    public int getPartNum() {
        return partNum;
    }

    public double[] get() {
        return new double[0];
    }

    public void setHardware(double value) {
        //Do nothing
    }

    public double[] getHardware() {
        return new double[0];
    }

    public void endThreads() {
        thread.Stop();
    }

    public Point getPosition() {
        return new Point(x, y, heading);
    }

    public void setPosition(Point newPos) {
        x = newPos.x;
        y = newPos.y;
        heading = newPos.heading;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public double getHeading() {
        return heading;
    }
}