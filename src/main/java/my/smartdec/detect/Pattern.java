package my.smartdec.detect;

/**
 *
 */
public interface Pattern extends Query {

    /**
     * @return id
     */
    String id();

    /**
     * @return severity
     */
    int severity();
}
