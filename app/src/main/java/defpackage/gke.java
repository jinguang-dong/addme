package defpackage;

import android.view.Surface;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class gke {
    public final pas a;
    public final Surface b;

    public gke(pas pasVar, Surface surface) {
        this.a = pasVar;
        this.b = surface;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gke)) {
            return false;
        }
        gke gkeVar = (gke) obj;
        return a.ao(this.a, gkeVar.a) && a.ao(this.b, gkeVar.b);
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + this.b.hashCode();
    }

    public final String toString() {
        return "PendingSurface(size=" + this.a + ", surface=" + this.b + ")";
    }
}
