/**
 * 
 */
package org.verapdf.resources;

import org.verapdf.resources.HexSHA1;

/**
 * @author <a href="mailto:carl@openpreservation.org">Carl Wilson</a>
 * @version 0.0.1
 */
public final class HexSHA1Ref implements HexSHA1 {
    /** Static constant for empty hash String */
    public final static HexSHA1 NULL_SHA1 = new HexSHA1Ref();
    
    private final String value;
    
    private HexSHA1Ref() {
        this(HexSHA1.NULL_SHA1_VALUE);
    }
    
    private HexSHA1Ref(final String value) {
        assert(value != null);
        this.value = value;
    }

    @Override
    public String getValue() {
        return this.value;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((this.value == null) ? 0 : this.value.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (!(obj instanceof HexSHA1)) {
            return false;
        }
        HexSHA1 other = (HexSHA1) obj;
        if (this.value == null) {
            if (other.getValue() != null) {
                return false;
            }
        } else if (!this.value.equals(other.getValue())) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return this.value;
    }
}
