package defpackage;

import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.Executor;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes.dex */
public class lev implements pdm, paq {
    public static final sgv a = sgv.g("lev");
    public final hzs b;
    public final lat c;
    public final pdn d;
    public final HashSet e = new HashSet();
    public final ovo f;
    public final pfl g;
    private final Supplier h;

    public lev(hzs hzsVar, lat latVar, ovo ovoVar, Supplier supplier, pfl pflVar, pdn pdnVar) {
        this.b = hzsVar;
        this.c = latVar;
        this.d = pdnVar;
        this.f = ovoVar;
        this.h = supplier;
        this.g = pflVar;
    }

    @Override // defpackage.pdm
    public final /* synthetic */ String a() {
        return "";
    }

    @Override // defpackage.paq, java.lang.AutoCloseable
    public final void close() {
        HashSet hashSet = this.e;
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            this.b.u((pjr) it.next());
        }
        hashSet.clear();
    }

    @Override // defpackage.pdm
    public final void d(phc phcVar) {
        if (((Boolean) this.h.get()).booleanValue()) {
            ojl.bB(phcVar, new pec() { // from class: leu
                @Override // defpackage.pec
                public final void a(pdk pdkVar) {
                    final mvn mvnVar = new mvn(new paq[]{pdkVar}, 14);
                    lev levVar = this.a;
                    final sxo sxoVar = sxo.a;
                    final ovo ovoVar = levVar.f;
                    new Executor() { // from class: ovn
                        @Override // java.util.concurrent.Executor
                        public final void execute(Runnable runnable) {
                            ovoVar.a(runnable).c(mvnVar, sxoVar);
                        }
                    }.execute(new img(levVar, pdkVar, 20));
                }
            });
        }
    }
}
