/**
 * 
 */
package org.openpreservation.verapdf.core;

import nl.jqno.equalsverifier.EqualsVerifier;

import org.junit.Test;
import org.verapdf.resources.HexSHA1Ref;

/**
 * Few tests, really just testing the equals contract for a single
 * string value. Not much to go wrong here.
 * 
 * @author <a href="mailto:carl@openpreservation.org">Carl Wilson</a>
 */
@SuppressWarnings("static-method")
public class HexSHA1RefTest {

    /**
     * Test the hash and equals contract for the class using EqualsVerifier
     */
    @Test
    public void testEqualsContract() {
        EqualsVerifier.forClass(HexSHA1Ref.class).verify();
    }
}
