package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class dru implements dpj {
    private final dme a;
    private final dpq b;
    private final boolean c;
    private float d;
    private int e;

    public dru(dme dmeVar, dpq dpqVar, boolean z) {
        this.a = dmeVar;
        this.b = dpqVar;
        this.c = z;
    }

    private final float c(dlq dlqVar) {
        int i;
        dlr dlrVar = (dlr) ske.bD(dlqVar.d);
        if (dlrVar == null) {
            return 0.0f;
        }
        int i2 = dlrVar.a;
        if (i2 == 0) {
            i = this.a.k().i;
            i2 = 0;
        } else {
            i = 0;
        }
        return i2 - (ukc.o(dlrVar.d - i, 0) / ukc.n(dlrVar.b() + i, 1));
    }

    private final float d(dlq dlqVar) {
        dlr dlrVar = (dlr) ske.bG(dlqVar.d);
        if (dlrVar == null) {
            return 0.0f;
        }
        dme dmeVar = this.a;
        int i = dmeVar.k().e - 1;
        int i2 = dlrVar.a;
        int i3 = i2 == i ? dmeVar.k().j : 0;
        return i2 + (ukc.p(((int) (dlqVar.c() & 4294967295L)) - dlrVar.d, 0, dlrVar.b() + i3) / ukc.n(dlrVar.b() + i3, 1));
    }

    @Override // defpackage.dpj
    public final float a() {
        dlq dlqVarK = this.a.k();
        if (!dlqVarK.d.isEmpty()) {
            float fC = c(dlqVarK);
            float fD = (dlqVarK.e - d(dlqVarK)) + fC;
            if (fD != 0.0f) {
                return fC / fD;
            }
        }
        return 0.0f;
    }

    @Override // defpackage.dpj
    public final float b() {
        dme dmeVar = this.a;
        dlq dlqVarK = dmeVar.k();
        int i = dlqVarK.e;
        if (i == 0) {
            return 0.0f;
        }
        if (this.e != i) {
            this.e = i;
            this.d = ukc.m((d(dlqVarK) - c(dlqVarK)) / i, 0.3f, 0.7f);
        }
        float f = this.d;
        dpq dpqVar = this.b;
        return drc.a(f, dpqVar != null ? Float.valueOf(dpqVar.b()) : null, dmeVar, this.c);
    }

    public final boolean equals(Object obj) {
        dru druVar = obj instanceof dru ? (dru) obj : null;
        return a.ao(druVar != null ? druVar.a : null, this.a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
