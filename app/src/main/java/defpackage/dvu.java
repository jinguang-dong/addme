package defpackage;

import android.net.Uri;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class dvu {
    public final Uri a;
    public final boolean b;

    public dvu(Uri uri, boolean z) {
        this.a = uri;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!a.ao(getClass(), obj != null ? obj.getClass() : null)) {
            return false;
        }
        obj.getClass();
        dvu dvuVar = (dvu) obj;
        return a.ao(this.a, dvuVar.a) && this.b == dvuVar.b;
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + a.o(this.b);
    }
}
