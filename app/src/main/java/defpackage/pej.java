package defpackage;

import android.hardware.camera2.CaptureRequest;
import java.util.Arrays;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class pej {
    public final CaptureRequest.Key a;
    public final Object b;

    public pej(CaptureRequest.Key key, Object obj) {
        key.getClass();
        this.a = key;
        obj.getClass();
        this.b = obj;
    }

    public final String a() {
        return this.a.getName();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof pej)) {
            return false;
        }
        pej pejVar = (pej) obj;
        return a.K(this.a.getName(), pejVar.a.getName()) && a.K(this.b, pejVar.b);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a.getName(), this.b});
    }

    public final String toString() {
        return String.format(Locale.ROOT, "%s: %s", this.a.getName(), this.b);
    }
}
