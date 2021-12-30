package my.smartdec.detect;

import java.util.stream.Stream;

/**
 *
 */
public interface Rule {

    /**
     * @return id
     */
    String id();

    /**
     * @return patterns
     */
    Stream<Pattern> patterns();
}
