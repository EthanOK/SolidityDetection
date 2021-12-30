package my.smartdec.detect.app;

import my.smartdec.detect.SearchableTree;

import java.nio.file.Path;

/**
 *
 */
public interface TreeFactory {

    /**
     * @param path source
     * @return tree
     */
    SearchableTree tree(Path path);
}
