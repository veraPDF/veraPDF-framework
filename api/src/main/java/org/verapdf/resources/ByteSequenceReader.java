package org.verapdf.resources;

import java.io.InputStream;

/**
 * Interface to read the contents of a {@link ByteSequence} at a
 * {@link ByteSequenceLocation}.
 * 
 * @author <a href="mailto:carl@openpreservation.org">Carl Wilson</a>
 */
public interface ByteSequenceReader {
    /**
     * @param location
     *            the {@link ByteSequenceLocation} to open a stream to.
     * @return an {@link InputStream} to the {@link ByteSequence} at the passed
     *         location.
     */
    public InputStream streamFromLocation(ByteSequenceLocation location);
}
