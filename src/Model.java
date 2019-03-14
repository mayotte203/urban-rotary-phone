public class Model {
    public String computeSquare(String widthString, String heightString)
    {
        int width = 0;
        int height = 0;
        try {
            width = Integer.parseInt(heightString);
            height = Integer.parseInt(widthString);
        }
        catch (NumberFormatException e)
        {
            width = 0;
            height = 0;
        }
        if(width < 0 || height < 0)
        {
            width = 0;
            height = 0;
        }
        return "" + (width * height);
    }
    public String computePerimeter(String widthString, String heightString)
    {
        int width = 0;
        int height = 0;
        try {
            width = Integer.parseInt(heightString);
            height = Integer.parseInt(widthString);
        }
        catch (NumberFormatException e)
        {
            width = 0;
            height = 0;
        }
        if(width < 0 || height < 0)
        {
            width = 0;
            height = 0;
        }
        return "" + 2 * (width + height);
    }
}
