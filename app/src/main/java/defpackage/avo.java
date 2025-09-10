package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class avo {
    public final blp a;
    public final blp b;

    public avo(blp blpVar, blp blpVar2) {
        this.a = blpVar;
        this.b = blpVar2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof avo)) {
            return false;
        }
        avo avoVar = (avo) obj;
        return a.ao(this.a, avoVar.a) && a.ao(this.b, avoVar.b);
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + this.b.hashCode();
    }
}
