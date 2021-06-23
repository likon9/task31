package com.khrushchev.rectangle.calculations;

import com.khrushchev.rectangle.exception.RectangleException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class FindAreaSquare {

    private static Logger logger = LogManager.getLogger();

    public double findAreaOfRectangle(double weight, double height) throws RectangleException {
        if(weight <=0 || height<=0)
        {
            throw new RectangleException("Invalid parameter value");
        }
        double area;
        area = 2 * weight + 2 * height;
        logger.info("Area is find");
        return area;
    }

    public double findSquareOfRectangle(double weight, double height) throws RectangleException {
        if(weight <=0 || height<=0)
        {
            throw new RectangleException("Invalid parameter value");
        }
        double square;
        square = weight * height;
        logger.info("Square is find");
        return square;
    }
}
