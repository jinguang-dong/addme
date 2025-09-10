package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ul extends byi {
    public final us a;
    public final List b;
    public final boolean c;
    public final uiq d;
    private final wb e;

    public ul(us usVar, List list, wb wbVar, boolean z, uiq uiqVar) {
        super((char[]) null);
        this.a = usVar;
        this.b = list;
        this.e = wbVar;
        this.c = z;
        this.d = uiqVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ul)) {
            return false;
        }
        ul ulVar = (ul) obj;
        return a.ao(this.a, ulVar.a) && a.ao(this.b, ulVar.b) && a.ao(this.e, ulVar.e) && this.c == ulVar.c && a.ao(this.d, ulVar.d);
    }

    public final int hashCode() {
        return (((((((this.a.hashCode() * 31) + 1) * 31) + this.e.hashCode()) * 31) + a.o(this.c)) * 31) + this.d.hashCode();
    }

    public final String toString() {
        return "RequestOpen(virtualCamera=" + this.a + ", sharedCameraIds=" + this.b + ", graphListener=" + this.e + ", isPrewarm=" + this.c + ", isForegroundObserver=" + this.d + ')';
    }
}
