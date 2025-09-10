package defpackage;

import java.util.Iterator;
import java.util.WeakHashMap;

/* compiled from: PG */
/* loaded from: classes.dex */
final class qne implements qnd {
    private final qnl a;
    private final uem b;
    private final uem c;
    private final uem d;
    private final sjp e;

    /* JADX WARN: Type inference failed for: r2v2, types: [sgt, shi] */
    public qne(qnl qnlVar, uem uemVar, uem uemVar2, uem uemVar3, rwc rwcVar, sjp sjpVar) {
        this.a = qnlVar;
        this.b = uemVar;
        this.c = uemVar2;
        this.d = uemVar3;
        this.e = sjpVar;
        if (((Boolean) rwcVar.e(Boolean.FALSE)).booleanValue()) {
            return;
        }
        try {
            WeakHashMap weakHashMap = rsa.a;
            Iterator it = ((tzz) uemVar).a().iterator();
            while (it.hasNext()) {
                ((qqs) it.next()).cA();
            }
        } catch (RuntimeException e) {
            ((sgt) ((sgt) qnj.a.c().i(e)).M((char) 5682)).s("Primes failed to initialize");
            qnl qnlVar2 = this.a;
            if (qnlVar2.a) {
                return;
            }
            qnlVar2.a = true;
        }
    }

    @Override // defpackage.qnd
    public final void a() {
        this.e.c();
    }

    @Override // defpackage.qnd
    public final void b() {
        ((qrq) this.c.a()).k();
    }

    @Override // defpackage.qnd
    public final void c() {
        ((qtq) this.d.a()).a();
    }
}
