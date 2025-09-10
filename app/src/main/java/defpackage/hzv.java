package defpackage;

import com.google.googlex.gcam.PhysicalStabilityParams;
import com.google.googlex.gcam.PostShutterAfParams;

/* compiled from: PG */
/* loaded from: classes.dex */
final class hzv {
    public final PhysicalStabilityParams a;
    public final PostShutterAfParams b;

    public hzv() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof hzv) {
            hzv hzvVar = (hzv) obj;
            if (this.a.equals(hzvVar.a) && this.b.equals(hzvVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() ^ 1000003;
        return this.b.hashCode() ^ (iHashCode * 1000003);
    }

    public final String toString() {
        PostShutterAfParams postShutterAfParams = this.b;
        return "{" + this.a.toString() + ", " + postShutterAfParams.toString() + "}";
    }

    public hzv(PhysicalStabilityParams physicalStabilityParams, PostShutterAfParams postShutterAfParams) {
        physicalStabilityParams.getClass();
        this.a = physicalStabilityParams;
        postShutterAfParams.getClass();
        this.b = postShutterAfParams;
    }
}
