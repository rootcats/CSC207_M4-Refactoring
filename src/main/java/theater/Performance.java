package theater;

/**
 * Class representing a performance of a play.
 */
public class Performance {

    private final String playID;
    private final int audience;

    public Performance(String playID, int audience) {
        this.playID = playID;
        this.audience = audience;
    }

    /**
     * Returns the id of the play.
     *
     * @return play id
     */
    public String getPlayId() {
        return playID;
    }

    /**
     * Returns the size of audience.
     *
     * @return the size of audience
     */
    public int getAudience() {
        return audience;
    }
}
