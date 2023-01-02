package ModelElements;

import Staff.Angle3D;
import Staff.Point3D;

/**
 * класс источник света
 */
public class Flash {

    public Point3D Location;
    public Angle3D Angle;
    public java.awt.Color Color;
    public float Power;

    /**
     * изменение угла источника света
     * @param angleAction
     */
    public void rotate (Angle3D angleAction)
    {
    }

    /**
     * изменение местоположения источника света
     * @param pointAction
     */
    public void move (Point3D pointAction)
    {
    }
}
