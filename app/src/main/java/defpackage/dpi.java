package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class dpi {
    public final blp a;
    public final blp b;

    public dpi(blp blpVar, blp blpVar2) {
        this.a = blpVar;
        this.b = blpVar2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof dpi)) {
            return false;
        }
        dpi dpiVar = (dpi) obj;
        return a.ao(this.a, dpiVar.a) && a.ao(this.b, dpiVar.b);
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + this.b.hashCode();
    }
}
