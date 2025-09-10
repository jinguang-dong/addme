package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class dkh implements dkf {
    private final dme a;
    private float b = Float.NaN;

    public dkh(dme dmeVar) {
        this.a = dmeVar;
    }

    @Override // defpackage.dkf
    public final float a() {
        dlr dlrVar = (dlr) ske.bD(this.a.k().d);
        if (dlrVar == null || dlrVar.a != 0) {
            return Float.NaN;
        }
        float f = dlrVar.d;
        if (Float.isNaN(this.b)) {
            this.b = f;
        }
        return this.b - f;
    }

    @Override // defpackage.dkf
    public final float b() {
        throw null;
    }

    @Override // defpackage.dkf
    public final boolean c() {
        return this.a.k().e > 0;
    }

    @Override // defpackage.dkf
    public final boolean d() {
        return this.a.e();
    }

    @Override // defpackage.dkf
    public final boolean e() {
        dme dmeVar = this.a;
        if (dmeVar.k().e > 0) {
            return dmeVar.c() || dmeVar.d();
        }
        return false;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TransformingLazyColumnStateScrollInfoProvider(isScrollAwayValid=");
        sb.append(c());
        sb.append(", isScrollable=");
        sb.append(e());
        sb.append(",isScrollInProgress=");
        sb.append(d());
        sb.append(", anchorItemOffset=");
        sb.append(a());
        sb.append(", lastItemOffset=");
        dlq dlqVarK = this.a.k();
        long jC = dlqVarK.c() & 4294967295L;
        dlr dlrVar = (dlr) ske.bG(dlqVarK.d);
        float fK = 0.0f;
        if (dlrVar != null) {
            if (dlrVar.a == dlqVarK.e - 1) {
                fK = ukc.k((((int) jC) - dlrVar.d) - dlrVar.b(), 0.0f);
            }
        }
        sb.append(fK);
        sb.append(')');
        return sb.toString();
    }
}
