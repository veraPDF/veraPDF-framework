/**
 * 
 */
package org.verapdf.resources;

import java.util.Set;

import javax.ws.rs.NotFoundException;

/**
 * @author <a href="mailto:carl@openpreservation.org">Carl Wilson</a>
 * @version 0.0.1
 */
public interface Resource {
    /**
     * @return the {@link HexSHA1} id of this Resource, guaranteed to be found
     *         by id in the {@link Set} of {@link ByteSequence}s returned by
     *         {@link Resource#getRepresentationIds()}
     */
    public HexSHA1 getId();

    /**
     * @return the {@link HexSHA1} id of the Metadata item considered to be the
     *         root for this Resource, or {@link HexSHA1#NULL_SHA1_VALUE} if no
     *         metadata resources are present.
     */
    public HexSHA1 getRootMetadataId();

    /**
     * @return The {@link Set} of @ HexSHA1} IDs for {@link ByteSequence}
     *         representations of this Resource.
     */
    public Set<HexSHA1> getRepresentationIds();

    /**
     * @param requestedId
     *            the {@link HexSHA1} of the representation to return.
     * @return the {@link ByteSequence} matching the HexSHA1 value if found.
     * @throws NotFoundException
     *             if this resource doesn't hold a representation matching the
     *             requestedId.
     */
    public ByteSequence retrieveRepresentation(final HexSHA1 requestedId)
            throws NotFoundException;

    /**
     * @return The {@link Set} of @ HexSHA1} IDs for {@link ByteSequence}
     *         metadata representations of this of this Resource.
     */
    public Set<HexSHA1> getMetadataRepresentationIds();

    /**
     * @param requestedId
     *            the {@link HexSHA1} of the metadata representation to return.
     * @return the {@link ByteSequence} matching the HexSHA1 value if found.
     * @throws NotFoundException
     *             if this resource doesn't hold a metadata representation
     *             matching the requestedId.
     */
    public ByteSequence retrieveMetadataRepresentation(final HexSHA1 requestedId)
            throws NotFoundException;
}
