package org.mohit.com;

/**
 * Created by Mohit on 4/18/2017.
 */
public class Triangle
{
    private String type;
    private int height;

    public Triangle(String type, int height)
    {
        this.type = type;
        this.height = height;
    }

    public String getType()
    {
        return type;
    }

    public int getHeight()
    {
        return height;
    }

//    public void setType(String type)
//    {
//        this.type = type;
//    }

    public void draw()
    {
        System.out.println(getType()+" Triangle is drawn with height "+getHeight());
    }
}
