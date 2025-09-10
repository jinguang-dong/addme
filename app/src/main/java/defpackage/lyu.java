package defpackage;

import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes.dex */
public class lyu implements lxi {
    public static final sgv a = sgv.g("lyu");
    public static final lyt b = new lys();
    public final Executor c;
    public final owf d;
    public pjo f;
    public mxm g;
    public long h;
    public boolean i;
    public int j;
    public final pit l;
    private final boolean m;
    public final Object e = new Object();
    private pka n = pka.BACK;
    public lyt k = b;

    public lyu(pit pitVar, Executor executor, owf owfVar, boolean z) {
        this.l = pitVar;
        this.c = executor;
        this.d = owfVar;
        this.m = z;
        this.i = z;
    }

    public final void a(boolean z) {
        boolean z2 = false;
        if (this.m && z) {
            z2 = true;
        }
        this.i = z2;
    }

    @Override // defpackage.lxi
    public final void e(pjo pjoVar) {
        this.n = pjoVar.l();
        this.c.execute(new lor(this, pjoVar, 6));
    }

    @Override // defpackage.lxi
    public final void g(phc phcVar, peo peoVar) {
        if (this.n.equals(pka.BACK)) {
            ojl.bB(phcVar, new kuq(this, peoVar, 2));
        }
    }

    @Override // defpackage.lxi
    public final void f(poe poeVar) {
    }
}
