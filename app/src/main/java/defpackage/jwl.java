package defpackage;

import android.hardware.camera2.CaptureRequest;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class jwl {
    public final CaptureRequest.Key a;
    private final CaptureRequest.Key b;

    public jwl(CaptureRequest.Key key, CaptureRequest.Key key2) {
        this.a = key;
        this.b = key2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jwl)) {
            return false;
        }
        jwl jwlVar = (jwl) obj;
        return a.ao(this.a, jwlVar.a) && a.ao(this.b, jwlVar.b);
    }

    public final int hashCode() {
        CaptureRequest.Key key = this.a;
        int iHashCode = key == null ? 0 : key.hashCode();
        CaptureRequest.Key key2 = this.b;
        return (iHashCode * 31) + (key2 != null ? key2.hashCode() : 0);
    }

    public final String toString() {
        return "SmoothyStabilizationExperimentalKeys(eisModeRequestKey=" + this.a + ", smoothyModeRequestKey=" + this.b + ")";
    }
}
