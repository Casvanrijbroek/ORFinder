package ORFinderAPP;

import java.util.ArrayList;

public class Query {
    /**
     * ArrayList containing ORFinder.ORFinderAPP.ORF resutls
     */
    private ArrayList<ORF> orfList;
    /**
     * Header of the result
     */
    private String header;
    /**
     * sequence of the result
     */
    private String sequence;

    /**
     * constructor of Querry
     * @param header
     * @param sequence
     */
    private Query(String header, String sequence){
        this.header = header;
        this.sequence = sequence;
    }

    /**
     * clear Arraylist orfList
     */
    protected void clearOrfList(){
        orfList = null;
    }

    /**
     * Gets sequence
     *
     * @return value of sequence
     */
    public String getSequence() {
        return sequence;
    }
}
