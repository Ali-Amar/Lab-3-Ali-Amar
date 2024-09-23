/* Copyright (c) 2007-2016 MIT 6.005 course staff, all rights reserved.
 * Redistribution of original or derived work requires permission of course staff.
 */
package rules;

/**
 * RulesOf6005 represents the collaboration policy of 6.005 as described by the
 * general information on Stellar.
 */
public class RulesOf6005 {
     
    public static boolean mayUseCodeInAssignment(boolean writtenByYourself, boolean availableToOthers, 
            boolean writtenAsCourseWork, boolean citingYourSource, boolean implementationRequired) {

        // If you wrote the code yourself, you can use it.
        if (writtenByYourself) {
            return true;
        }

        // If the code is not available to others, you can use it.
        if (!availableToOthers) {
            return true;
        }

        // If the code was written as part of a 6.005 assignment in the current or past semesters, 
        // you can use it if you cite your source.
        if (writtenAsCourseWork && citingYourSource) {
            return true;
        }

        // If the assignment specifically requires implementation, you may also be allowed to use it.
        if (implementationRequired) {
            return false; // Modify logic as needed based on your policy
        }

        // If none of the above conditions are met, you should not use the code.
        return false;
    }
   
    /**
     * Main method of the class.
     * 
     * Runs the mayUseCodeInAssignment method.
     * 
     * @param args unused
     */
    public static void main(String[] args) {
        System.out.println("You may certainly use code you wrote yourself: " +
            RulesOf6005.mayUseCodeInAssignment(true, false, true, true, true));
    }
}
