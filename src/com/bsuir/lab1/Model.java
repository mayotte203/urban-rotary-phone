public class Model {
    public String computeSquare(Integer width, Integer height)
    {
        if(width <= 0 || height <= 0)
        {
            width = 0;
            height = 0;
        }
        return "" + (width * height);
    }
    public String computePerimeter(Integer width, Integer height)
    {
        if(width <= 0 || height <= 0)
        {
            width = 0;
            height = 0;
        }
        return "" + 2 * (width + height);
    }
}
