package defpackage;

import com.google.googlex.gcam.FrameMetadata;
import com.google.googlex.gcam.RawWriteView;
import com.google.googlex.gcam.SpatialGainMap;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class tht {
    public final RawWriteView a;
    public final FrameMetadata b;
    public final SpatialGainMap c;
    public final Runnable d;

    public tht() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof tht) {
            tht thtVar = (tht) obj;
            if (this.a.equals(thtVar.a) && this.b.equals(thtVar.b) && this.c.equals(thtVar.c) && this.d.equals(thtVar.d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = ((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode();
        return this.d.hashCode() ^ (iHashCode * 1000003);
    }

    public final String toString() {
        Runnable runnable = this.d;
        SpatialGainMap spatialGainMap = this.c;
        FrameMetadata frameMetadata = this.b;
        return "{" + this.a.toString() + ", " + frameMetadata.toString() + ", " + spatialGainMap.toString() + ", " + runnable.toString() + "}";
    }

    public tht(RawWriteView rawWriteView, FrameMetadata frameMetadata, SpatialGainMap spatialGainMap, Runnable runnable) {
        this.a = rawWriteView;
        this.b = frameMetadata;
        this.c = spatialGainMap;
        this.d = runnable;
    }
}
