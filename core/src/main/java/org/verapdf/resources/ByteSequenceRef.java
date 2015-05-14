/**
 * 
 */
package org.verapdf.resources;

import java.util.Collections;
import java.util.Set;

import javax.ws.rs.core.MediaType;

/**
 * @author <a href="mailto:carl@openpreservation.org">Carl Wilson</a>
 * @version 0.0.1
 */
public class ByteSequenceRef implements ByteSequence {
    private final HexSHA1 id;
    private final long length;
    private final MediaType mediaType;
    private final Set<ByteSequenceLocation> locations;

    private ByteSequenceRef(final HexSHA1 id, final long length,
            final MediaType mediaType, final Set<ByteSequenceLocation> locations) {
        assert (id != null);
        assert (length >= 0);
        assert (mediaType != null);
        assert (locations != null);
        this.id = id;
        this.length = length;
        this.mediaType = mediaType;
        this.locations = Collections.unmodifiableSet(locations);
    }

    @Override
    public HexSHA1 getId() {
        return this.id;
    }

    @Override
    public long getLength() {
        return this.length;
    }

    @Override
    public MediaType getMediaType() {
        return this.mediaType;
    }

    @Override
    public Set<ByteSequenceLocation> getLocations() {
        return this.locations;
    }

}
