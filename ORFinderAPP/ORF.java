package ORFinderAPP;

import java.util.ArrayList;

public class ORF {
    /**
     * Arraylist containing the results
     */
    private ArrayList<Result> resultList;
    /**
     * startPosition of the ORFinder.ORFinderAPP.ORF
     */
    private int startPosition;
    /**
     * stopPosition of the ORFinder.ORFinderAPP.ORF
     */
    private int stopPosition;

    /**
     * constructor of the ORFinder.ORFinderAPP.ORF
     * @param startPosition
     * @param stopPosition
     */
    public ORF(int startPosition, int stopPosition){
        setPositions(startPosition, stopPosition);
    }

    /**
     * Set start and stop position
     * @param startPosition
     * @param stopPosition
     */
    private void setPositions(int startPosition, int stopPosition){
        this.startPosition = startPosition;
        this.stopPosition = stopPosition;
    }

    /**
     * Gets resultList
     *
     * @return value of resultList
     */
    public ArrayList<Result> getResultList() {
        return resultList;
    }

    /**
     * Gets startPosition
     *
     * @return value of startPosition
     */
    public int getStartPosition() {
        return startPosition;
    }

    /**
     * Gets stopPosition
     *
     * @return value of stopPosition
     */
    public int getStopPosition() {
        return stopPosition;
    }

    /**
     * clear ArrayList resultList
     */
    public void clearResultList(){
        resultList = null;
    }
}
