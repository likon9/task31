package com.khrushchev.rectangle.validator;

import com.khrushchev.rectangle.entity.Point;
import com.khrushchev.rectangle.exception.RectangleException;
import org.testng.annotations.Test;

import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;

public class FigureValidatorTest {
    private Point pointOneFalse = new Point(1,2);
    private Point pointTwoFalse = new Point(1,2);
    private Point pointThereFalse = new Point(1,2);

    private Point pointOneTrue = new Point(1,1);
    private Point pointTwoTrue = new Point(1,5);
    private Point pointThereTrue = new Point(5,1);

    @Test
    public void LineValidator() throws RectangleException{
       boolean result =PointValidator.pointNotInOneLine(pointOneFalse,pointTwoFalse,pointThereFalse);
        assertFalse(result);
    }

    @Test
    public void notLineValidator() throws RectangleException{
        boolean result =PointValidator.pointNotInOneLine(pointOneTrue,pointTwoTrue,pointThereTrue);
        assertTrue(result);
    }

    @Test
    public void isRectangle() throws RectangleException{
        boolean result =PointValidator.isRectangle(pointOneTrue,pointTwoTrue,pointThereTrue);
        assertTrue(result);
    }

    @Test
    public void isNotRectangle() throws RectangleException{
        boolean result =PointValidator.isRectangle(pointOneFalse,pointTwoFalse,pointThereFalse);
        assertFalse(result);
    }

}
