package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class dpr implements afz {
    private final afz a;
    private final afy b;
    private final dpq c;

    public dpr(afz afzVar, afy afyVar, int i) {
        this.a = afzVar;
        this.b = afyVar;
        this.c = new dpq(afyVar, i);
    }

    @Override // defpackage.afz
    public final afy a() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dpr)) {
            return false;
        }
        dpr dprVar = (dpr) obj;
        return a.ao(this.a, dprVar.a) && a.ao(this.b, dprVar.b);
    }

    @Override // defpackage.afz
    public final int hashCode() {
        return (this.a.hashCode() * 31) + this.b.hashCode();
    }
}
