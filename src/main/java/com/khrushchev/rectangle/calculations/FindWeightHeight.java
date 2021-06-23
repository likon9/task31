package com.khrushchev.rectangle.calculations;

import com.khrushchev.rectangle.entity.Point;
import com.khrushchev.rectangle.exception.RectangleException;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class FindWeightHeight {

    private static Logger logger = LogManager.getLogger();

    public double findWeight(Point pointOne, Point pointTwo, Point pointThere) throws RectangleException {
        double weight;
        if(pointOne.getY()==pointTwo.getY())
        {
            weight = Math.abs(pointOne.getX()-pointTwo.getX());
        }
        else if(pointThere.getY()==pointTwo.getY())
        {
            weight = Math.abs(pointThere.getX()-pointTwo.getX());
        }
        else if(pointOne.getY()==pointThere.getY())
        {
            weight = Math.abs(pointOne.getX()-pointThere.getX());
        }
        else {
            throw new RectangleException("Not valid points");
        }
        return weight;
    }

    public double findHeight(Point pointOne, Point pointTwo, Point pointThere) throws RectangleException {
        double height;
        if(pointOne.getX()==pointTwo.getX())
        {
            height = Math.abs(pointOne.getY()-pointTwo.getY());
        }
        else if(pointThere.getX()==pointTwo.getX())
        {
            height = Math.abs(pointThere.getY()-pointTwo.getY());
        }
        else if(pointOne.getX()==pointThere.getX())
        {
            height = Math.abs(pointOne.getY()-pointThere.getY());
        }
        else {
            throw new RectangleException("Not valid points");
        }
        return height;
    }

}
