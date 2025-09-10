package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class drk extends bne {
    final /* synthetic */ blp a;
    final /* synthetic */ bne b;
    private long c = 9205357640488583168L;
    private final bkn d = new bkn((byte[]) null);

    public drk(blp blpVar, bne bneVar) {
        this.a = blpVar;
        this.b = bneVar;
    }

    @Override // defpackage.bne
    public final long a() {
        return 9205357640488583168L;
    }

    @Override // defpackage.bne
    protected final void b(bmv bmvVar) {
        if (!a.q(bmvVar.m(), this.c)) {
            bkn bknVar = this.d;
            bknVar.k();
            blb.b(bknVar, this.a.a(bmvVar.m(), bmvVar.n(), bmvVar));
            this.c = bmvVar.m();
        }
        bkn bknVar2 = this.d;
        bne bneVar = this.b;
        bms bmsVarO = bmvVar.o();
        long jA = bmsVarO.a();
        bmsVarO.b().f();
        try {
            bmsVarO.c.k(bknVar2);
            bne.f(bneVar, bmvVar, bmvVar.m(), 0.0f, 6);
        } finally {
            bmsVarO.b().d();
            bmsVarO.h(jA);
        }
    }
}
