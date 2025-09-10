package defpackage;

import com.google.googlex.gcam.AeShotParams;
import com.google.googlex.gcam.FrameMetadata;
import com.google.googlex.gcam.SpatialGainMap;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class iap {
    public final Optional a;
    public final FrameMetadata b;
    public final SpatialGainMap c;
    public final AeShotParams d;
    public final float e;

    public iap() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof iap) {
            iap iapVar = (iap) obj;
            if (this.a.equals(iapVar.a) && this.b.equals(iapVar.b) && this.c.equals(iapVar.c) && this.d.equals(iapVar.d)) {
                if (Float.floatToIntBits(this.e) == Float.floatToIntBits(iapVar.e)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = ((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode();
        return Float.floatToIntBits(this.e) ^ (iHashCode * 1000003);
    }

    public final String toString() {
        AeShotParams aeShotParams = this.d;
        SpatialGainMap spatialGainMap = this.c;
        FrameMetadata frameMetadata = this.b;
        return "{" + this.a.toString() + ", " + frameMetadata.toString() + ", " + spatialGainMap.toString() + ", " + aeShotParams.toString() + ", " + this.e + "}";
    }

    public iap(Optional optional, FrameMetadata frameMetadata, SpatialGainMap spatialGainMap, AeShotParams aeShotParams, float f) {
        this.a = optional;
        this.b = frameMetadata;
        this.c = spatialGainMap;
        this.d = aeShotParams;
        this.e = f;
    }
}
