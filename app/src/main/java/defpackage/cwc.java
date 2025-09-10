package defpackage;

import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Objects;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class cwc {
    public cwb a;
    public final pfl b;
    private os c;
    private final WeakReference d;
    private int e;
    private boolean f;
    private boolean g;
    private final ArrayList h;
    private final utl i;

    public cwc() {
        this.b = new pfl((char[]) null, (byte[]) null, (byte[]) null);
    }

    private final cwb e(cwg cwgVar) {
        os osVar = this.c;
        ov ovVar = osVar.c(cwgVar) ? ((ov) osVar.a.get(cwgVar)).d : null;
        Object obj = ovVar != null ? ((cwi) ovVar.b).a : null;
        ArrayList arrayList = this.h;
        return cok.i(cok.i(this.a, (cwb) obj), arrayList.isEmpty() ? null : (cwb) arrayList.get(arrayList.size() - 1));
    }

    private final void f(cwb cwbVar) {
        if (this.a == cwbVar) {
            return;
        }
        cwh cwhVar = (cwh) this.d.get();
        cwb cwbVar2 = this.a;
        cwbVar2.getClass();
        cwbVar.getClass();
        if (cwbVar2 == cwb.b && cwbVar == cwb.a) {
            throw new IllegalStateException("State must be at least '" + cwb.c + "' to be moved to '" + cwbVar + "' in component " + cwhVar);
        }
        cwb cwbVar3 = cwb.a;
        if (cwbVar2 == cwbVar3 && cwbVar2 != cwbVar) {
            throw new IllegalStateException("State is '" + cwbVar3 + "' and cannot be moved to `" + cwbVar + "` in component " + cwhVar);
        }
        this.a = cwbVar;
        if (this.f || this.e != 0) {
            this.g = true;
            return;
        }
        this.f = true;
        i();
        this.f = false;
        if (this.a == cwbVar3) {
            this.c = new os();
        }
    }

    private final void g() {
        this.h.remove(r1.size() - 1);
    }

    private final void h(cwb cwbVar) {
        this.h.add(cwbVar);
    }

    private static void j(String str) {
        if (!op.g().h()) {
            throw new IllegalStateException(a.bw(str, "Method ", " must be called on the main thread"));
        }
    }

    public final void a(cwg cwgVar) {
        Object obj;
        cwh cwhVar;
        cwgVar.getClass();
        j("addObserver");
        cwb cwbVar = this.a;
        cwb cwbVar2 = cwb.a;
        if (cwbVar != cwbVar2) {
            cwbVar2 = cwb.b;
        }
        cwi cwiVar = new cwi(cwgVar, cwbVar2);
        os osVar = this.c;
        ov ovVarA = osVar.a(cwgVar);
        if (ovVarA != null) {
            obj = ovVarA.b;
        } else {
            osVar.a.put(cwgVar, osVar.d(cwgVar, cwiVar));
            obj = null;
        }
        if (((cwi) obj) == null && (cwhVar = (cwh) this.d.get()) != null) {
            boolean z = this.e != 0 || this.f;
            cwb cwbVarE = e(cwgVar);
            this.e++;
            while (((cwb) cwiVar.a).compareTo(cwbVarE) < 0 && this.c.c(cwgVar)) {
                h((cwb) cwiVar.a);
                cvz cvzVar = cwa.Companion;
                cwa cwaVarB = cvz.b((cwb) cwiVar.a);
                if (cwaVarB == null) {
                    Object obj2 = cwiVar.a;
                    Objects.toString(obj2);
                    throw new IllegalStateException("no event up from ".concat(String.valueOf(obj2)));
                }
                cwiVar.a(cwhVar, cwaVarB);
                g();
                cwbVarE = e(cwgVar);
            }
            if (!z) {
                i();
            }
            this.e--;
        }
    }

    public final void b(cwa cwaVar) {
        cwaVar.getClass();
        j("handleLifecycleEvent");
        f(cwaVar.a());
    }

    public final void c(cwg cwgVar) {
        cwgVar.getClass();
        j("removeObserver");
        this.c.b(cwgVar);
    }

    public final void d(cwb cwbVar) {
        cwbVar.getClass();
        j("setCurrentState");
        f(cwbVar);
    }

    public cwc(cwh cwhVar) {
        this();
        this.c = new os();
        cwb cwbVar = cwb.b;
        this.a = cwbVar;
        this.h = new ArrayList();
        this.d = new WeakReference(cwhVar);
        this.i = utm.a(cwbVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x002f, code lost:
    
        r6.g = false;
        r6.i.e(r6.a);
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0038, code lost:
    
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void i() {
        /*
            Method dump skipped, instructions count: 326
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cwc.i():void");
    }
}
