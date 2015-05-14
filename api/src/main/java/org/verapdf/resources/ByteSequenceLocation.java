/**
 * 
 */
package org.verapdf.resources;

import java.net.URI;

/**
 * Encapsulates a location for a {@link ByteSequence}. The interface only
 * exposes two properties, the HTTP method that should be used and a URI that
 * can be resolved to the location.
 * 
 * @author <a href="mailto:carl@openpreservation.org">Carl Wilson</a>
 */
public interface ByteSequenceLocation {
    /**
     * @return a String value indicating the HTTP method used, and empty string
     *         should be considered the equivalent of "GET"
     */
    String getMethod();

    /**
     * @return a {@link URI} that will be a URL or a resolvable URN that can be
     *         used to locate the {@link ByteSequence}.
     */
    URI getLocation();
}
