package defpackage;

import j$.time.Duration;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class kwt {
    public tpc a = null;
    private final owf b;
    private final hyd c;
    private final hyh d;
    private final owf e;
    private final ibb f;
    private final owf g;

    public kwt(owf owfVar, hyd hydVar, hyh hyhVar, owf owfVar2, owf owfVar3, ibb ibbVar) {
        this.b = owfVar;
        this.g = owfVar3;
        this.c = hydVar;
        this.d = hyhVar;
        this.e = owfVar2;
        this.f = ibbVar;
    }

    public final void a(mdm mdmVar) {
        srk srkVar;
        if (this.f.f()) {
            tpc tpcVarM = srk.a.m();
            if (!tpcVarM.b.C()) {
                tpcVarM.o();
            }
            srk srkVar2 = (srk) tpcVarM.b;
            srkVar2.b |= 1;
            srkVar2.c = true;
            float f = ((ick) this.g.dL()).c;
            if (!tpcVarM.b.C()) {
                tpcVarM.o();
            }
            srk srkVar3 = (srk) tpcVarM.b;
            srkVar3.b |= 2;
            srkVar3.d = f;
            srkVar = (srk) tpcVarM.l();
        } else {
            srkVar = null;
        }
        tpc tpcVar = this.a;
        mdo mdoVar = (mdo) mdmVar;
        mdoVar.C = tpcVar != null ? (sse) tpcVar.l() : null;
        mdoVar.D = srkVar;
        hyh hyhVar = this.d;
        if (((Boolean) hyhVar.c.d).booleanValue()) {
            tpc tpcVarM2 = snr.a.m();
            boolean zBooleanValue = ((Boolean) hyhVar.b.dL()).booleanValue();
            if (!tpcVarM2.b.C()) {
                tpcVarM2.o();
            }
            snr snrVar = (snr) tpcVarM2.b;
            snrVar.b = 1 | snrVar.b;
            snrVar.c = zBooleanValue;
            boolean zBooleanValue2 = ((Boolean) hyhVar.d().dL()).booleanValue();
            if (!tpcVarM2.b.C()) {
                tpcVarM2.o();
            }
            snr snrVar2 = (snr) tpcVarM2.b;
            snrVar2.b |= 2;
            snrVar2.d = zBooleanValue2;
            float fFloatValue = ((Float) this.e.dL()).floatValue();
            if (!tpcVarM2.b.C()) {
                tpcVarM2.o();
            }
            snr snrVar3 = (snr) tpcVarM2.b;
            snrVar3.b |= 4;
            snrVar3.e = fFloatValue;
            mdoVar.s = (snr) tpcVarM2.l();
        }
    }

    public final void b(hxu hxuVar) {
        if (!hxuVar.l) {
            this.a = null;
            return;
        }
        this.a = sse.a.m();
        if (this.c.h) {
            tpc tpcVar = this.a;
            tpcVar.getClass();
            int i = true != hxuVar.m ? 4 : 3;
            if (!tpcVar.b.C()) {
                tpcVar.o();
            }
            sse sseVar = (sse) tpcVar.b;
            sseVar.c = i - 1;
            sseVar.b |= 1;
            tpc tpcVar2 = this.a;
            tpcVar2.getClass();
            long millis = ((Duration) this.b.dL()).toMillis();
            if (!tpcVar2.b.C()) {
                tpcVar2.o();
            }
            sse sseVar2 = (sse) tpcVar2.b;
            sseVar2.b |= 16;
            sseVar2.g = millis;
        }
    }
}
