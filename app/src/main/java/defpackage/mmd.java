package defpackage;

import com.pairip.VMRunner;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class mmd implements mmb {
    private static final float[] a = qib.d().f();
    private final hws b;
    private final hpa c;
    private final hpj d;
    private final owf e;
    private final pbn f;
    private lnl g;
    private qib h;
    private pas i;

    public mmd(hws hwsVar, owf owfVar, hpj hpjVar, hpa hpaVar, pbn pbnVar) {
        this.b = hwsVar;
        this.e = owfVar;
        this.d = hpjVar;
        this.c = hpaVar;
        this.f = pbnVar;
        hpjVar.i("trk-eis-gyro-metadata");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final qib e(lnl lnlVar) {
        Float[] fArr;
        qib qibVarD = qib.d();
        if (lnlVar == null) {
            return this.h;
        }
        pnx pnxVar = lnlVar.a;
        return (pnxVar == null || (fArr = (Float[]) pnxVar.a(kgx.f)) == null || fArr.length < 4) ? qibVarD : new qib(fArr[0].floatValue() * (this.i.a / fArr[2].floatValue()), fArr[1].floatValue() * (this.i.b / fArr[3].floatValue()));
    }

    private final void f() {
        this.g = null;
        this.h = null;
    }

    @Override // defpackage.mmb
    public final synchronized void a() {
        f();
    }

    @Override // defpackage.mmb
    public final boolean b() {
        lnl lnlVarB = this.c.b();
        return lnlVarB != null && lnlVarB.d > 50000000 && ((long) lnlVarB.f) > 350;
    }

    @Override // defpackage.mmb
    public synchronized boolean c(pas pasVar, long j) {
        return ((Boolean) VMRunner.invoke("fMECoXB9KaNwqQNa", new Object[]{this, pasVar, Long.valueOf(j)})).booleanValue();
    }

    @Override // defpackage.paq, java.lang.AutoCloseable
    public final synchronized void close() {
        f();
        this.d.j("trk-eis-gyro-metadata");
    }

    @Override // defpackage.mmb
    public final synchronized float[] d(long j) {
        hws hwsVar = this.b;
        if (hwsVar.c()) {
            lnl lnlVar = this.g;
            if (lnlVar == null) {
                this.g = this.c.b();
                return a;
            }
            lnl lnlVarA = this.c.a(j);
            if (lnlVarA != null) {
                qib qibVarA = hwsVar.a(lnlVar, lnlVarA);
                if (this.e.dL() == fhc.ACTIVE) {
                    qib qibVarE = e(lnlVarA);
                    if (this.h == null) {
                        this.h = qibVarE;
                    }
                    qib qibVar = this.h;
                    if (qibVarE != null && qibVar != null) {
                        float fA = qibVarE.a() - qibVar.a();
                        float fB = qibVarE.b() - qibVar.b();
                        float fA2 = qibVarA.a() - fA;
                        float fB2 = qibVarA.b() - fB;
                        float[] fArr = new float[9];
                        for (int i = 0; i < 9; i++) {
                            fArr[i] = qibVarA.c[i];
                        }
                        fArr[2] = fA2;
                        fArr[5] = fB2;
                        qibVarA = qib.c(fArr);
                    }
                    this.h = qibVarE;
                }
                this.g = lnlVarA;
                if (qibVarA != null) {
                    return qibVarA.f();
                }
            }
        }
        return a;
    }
}
