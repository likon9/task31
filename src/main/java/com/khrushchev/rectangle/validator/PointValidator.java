package com.khrushchev.rectangle.validator;

import com.khrushchev.rectangle.entity.Point;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class PointValidator {

    private static Logger logger = LogManager.getLogger();

    public static boolean pointNotInOneLine(Point pointOne, Point pointTwo, Point pointThere){
        if (pointOne.getX()== pointTwo.getX()&&pointOne.getX()== pointThere.getX()){
            if (pointOne.getY()== pointTwo.getY()&&pointOne.getY()== pointThere.getY()){
                logger.info("Points are on the same line");
                return false;
            }
        }
        logger.info("Points are not on the same line");
            return true;
    }

    public static boolean isRectangle(Point pointOne, Point pointTwo, Point pointThere){
        if (pointOne.getY() == pointTwo.getY() && pointTwo.getX() == pointThere.getX() && pointOne.getY()!=pointThere.getY() && pointOne.getY()!= pointTwo.getY()){
            logger.info("Is rectangle");
            return true;
        }
        else if (pointThere.getY()== pointTwo.getY()&&pointTwo.getX()== pointOne.getX() && pointThere.getY()!= pointOne.getY() && pointTwo.getX()!=pointThere.getX()){
            logger.info("Is rectangle");
            return true;
        }

       else if (pointTwo.getY()== pointOne.getY()&&pointOne.getX()== pointThere.getX() && pointThere.getY()!= pointOne.getY() && pointTwo.getX()!=pointThere.getX()){
            logger.info("Is rectangle");
            return true;
        }

        else if (pointThere.getY()== pointOne.getY()&&pointOne.getX()== pointTwo.getX()  && pointThere.getY()!= pointTwo.getY() && pointTwo.getX()!=pointThere.getX()){
            logger.info("Is rectangle");
            return true;
        }

        else if (pointOne.getY()== pointThere.getY()&&pointThere.getX()== pointTwo.getX()  && pointThere.getY()!= pointTwo.getY() && pointOne.getX()!=pointThere.getX()){
            logger.info("Is rectangle");
            return true;
        }
        else if (pointTwo.getY()== pointThere.getY()&&pointThere.getX()== pointOne.getX() && pointThere.getY()!= pointOne.getY() && pointTwo.getX()!=pointThere.getX()){
            logger.info("Is rectangle");
            return true;
        }
        else {
            logger.info("Is not rectangle");
            return false;
        }
    }

}
