 

/**
 * Created by dan on 6/14/17.
 */
public class PredicateUtilities {
    /**
     * @param x
     * @param y
     * @return true if `x` is greater than `y`
     */
    public Boolean isGreaterThan(int x, int y) {
         boolean retVal = false;
          
          if(x > y){
            retVal= true;
        } 
         
        return retVal;
        
      }

    /**
     * @param x
     * @param y
     * @return true if `x` is less than `y`
     */
    public Boolean isLessThan(int x, int y) {
        boolean retVal = false;
        
        
        if(x < y) {
          retVal=true;
        }
        
        return retVal;
    }

    /**
     * @param x
     * @param y
     * @return true if `x` is greater than or equal to `y`
     */
    public Boolean isGreaterThanOrEqualTo(int x, int y) {
        boolean retVal =false;
        
        if(x >= y){
         retVal= true;
        }
        
        
        
        
         return retVal ;
    }

    /**
     * @param x
     * @param y
     * @return true if `x` is less than or equal to `y`
     */
    public Boolean isLessThanOrEqualTo(int x, int y) {
         boolean retVal = false;
         
         if(x <= y) {
            retVal = true; 
         }
        
        return retVal;
    }
    
    
       /**
      * @return true
     */
    public Boolean returnTrue() {
         boolean retVal = true;
         return retVal;
    }

    /**
     * @return false
     */
    public Boolean returnFalse() {
        boolean a = false; 
        return a;
    }
}