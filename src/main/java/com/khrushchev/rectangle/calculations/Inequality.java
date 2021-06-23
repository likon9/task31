package com.khrushchev.rectangle.calculations;

import com.khrushchev.rectangle.entity.Rectangle;
import com.khrushchev.rectangle.exception.RectangleException;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Inequality {
    private static Logger logger = LogManager.getLogger();

    public double inequalityArea(double firstArea,double secondArea) throws RectangleException {
        if(firstArea<=0||secondArea<=0){
            throw new RectangleException("Not valid area");
        }
        double result;
        result = firstArea-secondArea;
        logger.info("Difference area found");
        return result;
    }

    public double inequalitySquare(double firstSquare,double secondSquare) throws RectangleException {
        if(firstSquare<=0||secondSquare<=0){
            throw new RectangleException("Not valid square");
        }
        double result;
        result = firstSquare-secondSquare;
        logger.info("Difference square found");
        return result;
    }
}
