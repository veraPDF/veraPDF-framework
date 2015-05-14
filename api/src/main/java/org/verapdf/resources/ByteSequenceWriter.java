package org.verapdf.resources;

import java.io.InputStream;

/**
 * Interface to write a {@link ByteSequence} to a {@link ByteSequenceLocation}.
 * 
 * @author <a href="mailto:carl@openpreservation.org">Carl Wilson</a>
 */
public interface ByteSequenceWriter {
    /**
     * @param sequenceStream
     *            an {@link InputStream} to the {@link ByteSequence} to be
     *            written to the location.
     * @param location
     *            a {@link ByteSequenceLocation} tp write the content to.
     */
    public void writeByteSequence(InputStream sequenceStream,
            ByteSequenceLocation location);

}
