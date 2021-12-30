package my.smartdec.detect.app;

import my.smartdec.detect.DocumentTreeBasic;
import my.smartdec.detect.DocumentTreeCached;
import my.smartdec.detect.ParseTreeCached;
import my.smartdec.detect.SearchableTree;
import my.smartdec.detect.SearchableTreeDefault;
import my.smartdec.detect.SourceFile;

import javax.xml.parsers.DocumentBuilder;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Path;

/**
 *
 */
public final class TreeFactoryDefault implements TreeFactory {


    /**
     *
     */
    private final DocumentBuilder builder;
    /**
     *
     */
    private final Charset charset;
    /**
     *
     */
    private final SourceLanguage sourceLanguage;

    /**
     * @param db builder
     * @param ch charset
     * @param language language
     */
    public TreeFactoryDefault(
            final DocumentBuilder db,
            final Charset ch,
            final SourceLanguage language
    ) {
        this.builder = db;
        this.charset = ch;
        this.sourceLanguage = language;
    }

    /**
     * @param db builder
     * @param language language
     */
    public TreeFactoryDefault(
            final DocumentBuilder db,
            final SourceLanguage language
    ) {
        this(db, StandardCharsets.UTF_8, language);
    }

    @Override
    public SearchableTree tree(final Path path) {
        return new SearchableTreeDefault(
                new DocumentTreeCached(
                        new DocumentTreeBasic(
                                new ParseTreeCached(
                                        sourceLanguage.createParseTree(
                                                new SourceFile(
                                                        path,
                                                        this.charset
                                                )
                                        )
                                ),
                                this.builder,
                                sourceLanguage.getRuleNames()
                        )
                )
        );
    }
}
