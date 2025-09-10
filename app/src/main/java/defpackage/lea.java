package defpackage;

import com.google.googlex.gcam.BurstSpec;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class lea extends ldx {
    public final pbn a;
    public final uem b;
    public final Map c;
    public final hbj d;
    private final Executor e;
    private final rwr f;

    public lea(iso isoVar, Executor executor, pbn pbnVar, hbj hbjVar, rwr rwrVar, uem uemVar) {
        super(isoVar, pbnVar);
        this.c = new HashMap();
        this.e = executor;
        this.a = pbnVar;
        this.d = hbjVar;
        this.f = rwrVar;
        this.b = uemVar;
    }

    @Override // defpackage.ldx, defpackage.hzi
    public final synchronized void b(iby ibyVar, lau lauVar) {
        ldz ldzVar;
        poj pojVarO;
        if (j(ibyVar) && (ldzVar = (ldz) this.c.get(ibyVar)) != null && (pojVarO = lauVar.o()) != null) {
            pdo pdoVarB = lauVar.b();
            pdoVarB.getClass();
            ldzVar.a.put(Long.valueOf(pdoVarB.b), pojVarO);
        }
        super.b(ibyVar, lauVar);
    }

    @Override // defpackage.ldx, defpackage.hzi
    public final synchronized void c(iby ibyVar, BurstSpec burstSpec, poe poeVar) {
        super.c(ibyVar, burstSpec, poeVar);
        if (j(ibyVar)) {
            this.c.put(ibyVar, new ldz(this));
        }
    }

    @Override // defpackage.ldx
    protected final synchronized void g(iby ibyVar) {
        super.g(ibyVar);
        ldz ldzVar = (ldz) this.c.remove(ibyVar);
        if (ldzVar != null) {
            ldzVar.close();
        }
    }

    @Override // defpackage.ldx
    protected final void h(final iby ibyVar, final poj pojVar, final long j) {
        if (!ibyVar.e()) {
            this.e.execute(new Runnable() { // from class: ldy
                /* JADX WARN: Removed duplicated region for block: B:55:0x0125 A[Catch: all -> 0x0191, TryCatch #2 {all -> 0x0191, blocks: (B:3:0x000a, B:5:0x001a, B:16:0x0065, B:32:0x0080, B:31:0x007d, B:35:0x0083, B:36:0x0084, B:42:0x00ac, B:46:0x00b7, B:53:0x00d5, B:55:0x0125, B:80:0x0179, B:58:0x013c, B:65:0x014e, B:78:0x0173, B:66:0x0151, B:67:0x0154, B:68:0x015b, B:70:0x015e, B:71:0x0161, B:73:0x0166, B:74:0x0169, B:76:0x016e, B:77:0x0171, B:6:0x001b, B:7:0x0027, B:8:0x0028, B:15:0x0062, B:25:0x0075, B:24:0x0072, B:28:0x0078), top: B:98:0x000a, outer: #6, inners: #1, #3, #7 }] */
                /* JADX WARN: Removed duplicated region for block: B:57:0x013b  */
                /* JADX WARN: Type inference failed for: r4v3, types: [java.lang.Object, lss] */
                @Override // java.lang.Runnable
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct code enable 'Show inconsistent code' option in preferences
                */
                public final void run() {
                    /*
                        Method dump skipped, instructions count: 422
                        To view this dump change 'Code comments level' option to 'DEBUG'
                    */
                    throw new UnsupportedOperationException("Method not decompiled: defpackage.ldy.run():void");
                }
            });
            return;
        }
        gzi gziVar = gzs.a;
        pojVar.close();
        ibyVar.a();
    }

    public final boolean j(iby ibyVar) {
        return this.f.a && ibyVar.m.equals(iao.PORTRAIT);
    }

    @Override // defpackage.ldx, defpackage.iam
    public final void o(iby ibyVar, mdr mdrVar) {
        ldz ldzVar;
        ibyVar.a();
        if (j(ibyVar)) {
            synchronized (this) {
                ldzVar = (ldz) this.c.remove(ibyVar);
            }
            if (ldzVar != null) {
                ibyVar.a();
                ldzVar.close();
            }
        }
    }
}
