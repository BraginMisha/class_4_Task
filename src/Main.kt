fun main(args: Array<String>) {

    val triangle = Triangle(2.0,1.0, 6.0, 3.0, 9.0, 2.0);
    val cenetr = triangle.getCircleCenter()
    println(cenetr);
}
class Triangle (val x1 : Double, val y1 : Double, val x2 : Double, val y2 : Double, val x3 : Double, val y3 : Double)
{
    val pont1 = Point(x1,y1);
    val pont2 = Point(x2,y2);
    val pont3 = Point(x3,y3);

    private val m1x = (pont1.x + pont2.x) / 2
    private val m1y = (pont1.y + pont2.y) / 2
    private val m2x = (pont2.x + pont3.x) / 2
    private val m2y = (pont2.y + pont3.y) / 2

    private val k1 = -(pont2.x - pont1.x) / (pont2.y - pont1.y)
    private val k2 = -(pont3.x - pont2.x) / (pont3.y - pont2.y)

    fun getCircleCenter(): Pair<Double, Double> {
        val centerX = (k1 * m1x - k2 * m2x + m2y - m1y) / (k1 - k2)
        val centerY = k1 * (centerX - m1x) + m1y
        return Pair(centerX, centerY)
    }

}

class Point(val x1: Double, val y1:Double)
{
    public final val x = x1;
    public final val y = y1;
}