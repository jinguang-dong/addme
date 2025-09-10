package defpackage;

import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class jmh implements pdm {
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    private final /* synthetic */ int d;

    public /* synthetic */ jmh(AtomicInteger atomicInteger, pdn pdnVar, ovx ovxVar, int i) {
        this.d = i;
        this.c = atomicInteger;
        this.b = pdnVar;
        this.a = ovxVar;
    }

    @Override // defpackage.pdm
    public final /* synthetic */ String a() {
        return "";
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, pdn] */
    /* JADX WARN: Type inference failed for: r6v1, types: [java.lang.Object, java.util.concurrent.Executor] */
    @Override // defpackage.pdm
    public final void d(phc phcVar) {
        pdk pdkVarA;
        if (this.d == 0) {
            jmi jmiVar = new jmi(phcVar, this.b, 0);
            if (((jml) this.a).b.get() || (pdkVarA = phcVar.a()) == null) {
                return;
            }
            pdkVarA.j(new jmk(this.c, jmiVar, pdkVarA));
            return;
        }
        AtomicInteger atomicInteger = (AtomicInteger) this.c;
        int i = atomicInteger.get();
        ?? r2 = this.b;
        int iB = r2.b();
        if (iB <= 3 && iB != i) {
            ((sgt) ivg.a.c().M(2349)).y("Not enough frames in ZSL ring: %s in %s", iB, r2.i().d());
        } else if (iB > 3 && i <= 3) {
            r2.i().d();
        }
        ((ovx) this.a).a(Boolean.valueOf(iB > 3));
        atomicInteger.set(iB);
    }

    public /* synthetic */ jmh(jml jmlVar, job jobVar, Executor executor, int i) {
        this.d = i;
        this.a = jmlVar;
        this.b = jobVar;
        this.c = executor;
    }
}
