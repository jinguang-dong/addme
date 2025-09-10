package defpackage;

import android.hardware.camera2.CaptureRequest;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class jwk {
    public final CaptureRequest.Key a;

    public jwk(CaptureRequest.Key key) {
        this.a = key;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof jwk) && a.ao(this.a, ((jwk) obj).a);
    }

    public final int hashCode() {
        CaptureRequest.Key key = this.a;
        if (key == null) {
            return 0;
        }
        return key.hashCode();
    }

    public final String toString() {
        return "SerengetiExperimentalKeys(panoCaptureIntentKey=" + this.a + ")";
    }
}
