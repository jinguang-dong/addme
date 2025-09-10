package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import android.util.Log;
import java.util.List;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ezt implements ezn {
    private final Object b;
    private final ezr c;
    private final ezp d;
    private final Context e;
    private final epa f;
    private final Object g;
    private final Class h;
    private final ezk i;
    private final int j;
    private final int k;
    private final epb l;
    private final faa m;
    private final List n;
    private final Executor o;
    private esw p;
    private esk q;
    private long r;
    private Drawable s;
    private Drawable t;
    private int u;
    private int v;
    private boolean w;
    private RuntimeException x;
    private volatile ree z;
    private final fbf a = new fbf();
    private int y = 1;

    public ezt(Context context, epa epaVar, Object obj, Object obj2, Class cls, ezk ezkVar, int i, int i2, epb epbVar, faa faaVar, ezr ezrVar, List list, ezp ezpVar, ree reeVar, Executor executor) {
        this.b = obj;
        this.e = context;
        this.f = epaVar;
        this.g = obj2;
        this.h = cls;
        this.i = ezkVar;
        this.j = i;
        this.k = i2;
        this.l = epbVar;
        this.m = faaVar;
        this.c = ezrVar;
        this.n = list;
        this.d = ezpVar;
        this.z = reeVar;
        this.o = executor;
        if (this.x == null && epaVar.g.d(eoz.class)) {
            this.x = new RuntimeException("Glide request origin trace");
        }
    }

    private static int h(int i, float f) {
        if (i == Integer.MIN_VALUE) {
            return Integer.MIN_VALUE;
        }
        return Math.round(f * i);
    }

    private final Drawable i() {
        if (this.t == null) {
            ezk ezkVar = this.i;
            Drawable drawable = ezkVar.e;
            this.t = null;
            int i = ezkVar.f;
            if (i > 0) {
                this.t = o(i);
            }
        }
        return this.t;
    }

    private final Drawable o(int i) {
        Resources.Theme theme = this.i.q;
        if (theme == null) {
            theme = this.e.getTheme();
        }
        Context context = this.e;
        return exw.a(context, context, i, theme);
    }

    private final void p() {
        if (this.w) {
            throw new IllegalStateException("You can't start or clear loads in RequestListener or Target callbacks. If you're trying to start a fallback request when a load fails, use RequestBuilder#error(RequestBuilder). Otherwise consider posting your into() or clear() calls to the main thread using a Handler instead.");
        }
    }

    private final boolean q() {
        ezp ezpVar = this.d;
        return ezpVar == null || ezpVar.h(this);
    }

    private final void r() {
        ezp ezpVar = this.d;
        if (ezpVar != null) {
            ezpVar.a().j();
        }
    }

    private final void s(ess essVar) {
        this.a.a();
        synchronized (this.b) {
            int i = this.f.d;
            Log.w("Glide", "Load failed for [" + String.valueOf(this.g) + "] with dimensions [" + this.u + "x" + this.v + "]", essVar);
            List listA = essVar.a();
            int size = listA.size();
            for (int i2 = 0; i2 < size; i2++) {
            }
            this.q = null;
            this.y = 5;
            ezp ezpVar = this.d;
            if (ezpVar != null) {
                ezpVar.d(this);
            }
            this.w = true;
            try {
                List<ezr> list = this.n;
                if (list != null) {
                    for (ezr ezrVar : list) {
                        r();
                        ezrVar.k(essVar);
                    }
                }
                ezr ezrVar2 = this.c;
                if (ezrVar2 != null) {
                    r();
                    ezrVar2.k(essVar);
                }
                if (q()) {
                    if (this.s == null) {
                        this.s = null;
                        int i3 = this.i.d;
                        if (i3 > 0) {
                            this.s = o(i3);
                        }
                    }
                    Drawable drawableI = this.s;
                    if (drawableI == null) {
                        drawableI = i();
                    }
                    this.m.c(drawableI);
                }
            } finally {
                this.w = false;
            }
        }
    }

    public final Object a() {
        this.a.a();
        return this.b;
    }

    @Override // defpackage.ezn
    public final void b() {
        synchronized (this.b) {
            p();
            this.a.a();
            double d = fas.a;
            this.r = SystemClock.elapsedRealtimeNanos();
            if (this.g == null) {
                int i = this.j;
                int i2 = this.k;
                if (fax.l(i, i2)) {
                    this.u = i;
                    this.v = i2;
                }
                s(new ess("Received null model"));
                return;
            }
            int i3 = this.y;
            if (i3 == 2) {
                throw new IllegalArgumentException("Cannot restart a running request");
            }
            if (i3 == 4) {
                g(this.p, 5);
                return;
            }
            List<ezr> list = this.n;
            if (list != null) {
                for (ezr ezrVar : list) {
                    if (ezrVar instanceof ezm) {
                        throw null;
                    }
                }
            }
            this.y = 3;
            int i4 = this.j;
            int i5 = this.k;
            if (fax.l(i4, i5)) {
                e(i4, i5);
            } else {
                this.m.i(this);
            }
            int i6 = this.y;
            if ((i6 == 2 || i6 == 3) && q()) {
                this.m.d(i());
            }
        }
    }

    @Override // defpackage.ezn
    public final void c() {
        synchronized (this.b) {
            p();
            fbf fbfVar = this.a;
            fbfVar.a();
            if (this.y == 6) {
                return;
            }
            p();
            fbfVar.a();
            this.m.j(this);
            esk eskVar = this.q;
            esw eswVar = null;
            if (eskVar != null) {
                synchronized (eskVar.c) {
                    eskVar.a.h(eskVar.b);
                }
                this.q = null;
            }
            esw eswVar2 = this.p;
            if (eswVar2 != null) {
                this.p = null;
                eswVar = eswVar2;
            }
            ezp ezpVar = this.d;
            if (ezpVar == null || ezpVar.g(this)) {
                this.m.b(i());
            }
            this.y = 6;
            if (eswVar != null) {
                ((esq) eswVar).f();
            }
        }
    }

    public final void d(ess essVar) {
        s(essVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x00b4 A[Catch: all -> 0x017b, TryCatch #0 {, blocks: (B:31:0x00b4, B:33:0x00c5, B:35:0x0167, B:34:0x00cf, B:37:0x0169, B:14:0x006a, B:16:0x0078, B:18:0x007d, B:26:0x00a1, B:21:0x008b, B:23:0x0091, B:24:0x0096), top: B:51:0x006a, outer: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0169 A[Catch: all -> 0x017b, DONT_GENERATE, TRY_LEAVE, TryCatch #0 {, blocks: (B:31:0x00b4, B:33:0x00c5, B:35:0x0167, B:34:0x00cf, B:37:0x0169, B:14:0x006a, B:16:0x0078, B:18:0x007d, B:26:0x00a1, B:21:0x008b, B:23:0x0091, B:24:0x0096), top: B:51:0x006a, outer: #1 }] */
    /* JADX WARN: Type inference failed for: r11v5, types: [etx, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r13v11, types: [cnj, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r14v6, types: [cnj, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void e(int r26, int r27) {
        /*
            Method dump skipped, instructions count: 385
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ezt.e(int, int):void");
    }

    @Override // defpackage.ezn
    public final void f() {
        synchronized (this.b) {
            if (n()) {
                c();
            }
        }
    }

    public final void g(esw eswVar, int i) throws Throwable {
        boolean zA;
        this.a.a();
        esw eswVar2 = null;
        try {
            try {
                synchronized (this.b) {
                    try {
                        this.q = null;
                        if (eswVar == null) {
                            d(new ess("Expected to receive a Resource<R> with an object of " + this.h.toString() + " inside, but instead got null."));
                            return;
                        }
                        Object objC = eswVar.c();
                        if (objC == null || !this.h.isAssignableFrom(objC.getClass())) {
                            this.p = null;
                            d(new ess("Expected to receive an object of " + this.h.toString() + " but instead got " + String.valueOf(objC != null ? objC.getClass() : "") + "{" + String.valueOf(objC) + "} inside Resource{" + eswVar.toString() + "}." + (objC != null ? "" : " To indicate failure return a null Resource object, rather than a Resource object containing null data.")));
                        } else {
                            ezp ezpVar = this.d;
                            if (ezpVar == null || ezpVar.i(this)) {
                                r();
                                this.y = 4;
                                this.p = eswVar;
                                if (this.f.d <= 3) {
                                    objC.getClass().getSimpleName();
                                    eoz.a(i);
                                    String.valueOf(this.g);
                                    double d = fas.a;
                                    SystemClock.elapsedRealtimeNanos();
                                    double d2 = fas.a;
                                }
                                if (ezpVar != null) {
                                    ezpVar.e(this);
                                }
                                this.w = true;
                                try {
                                    List<ezr> list = this.n;
                                    if (list != null) {
                                        zA = false;
                                        for (ezr ezrVar : list) {
                                            ezrVar.m(objC);
                                            if (ezrVar instanceof ezm) {
                                                zA |= ((ezm) ezrVar).a();
                                            }
                                        }
                                    } else {
                                        zA = false;
                                    }
                                    ezr ezrVar2 = this.c;
                                    if (ezrVar2 != null) {
                                        ezrVar2.m(objC);
                                    }
                                    if (!zA) {
                                        this.m.l(objC);
                                    }
                                    return;
                                } finally {
                                    this.w = false;
                                }
                            }
                            this.p = null;
                            this.y = 4;
                        }
                        ((esq) eswVar).f();
                    } catch (Throwable th) {
                        th = th;
                        eswVar = null;
                        try {
                            throw th;
                        } catch (Throwable th2) {
                            th = th2;
                            eswVar2 = eswVar;
                            if (eswVar2 != null) {
                                ((esq) eswVar2).f();
                            }
                            throw th;
                        }
                    }
                }
            } catch (Throwable th3) {
                th = th3;
            }
        } catch (Throwable th4) {
            th = th4;
        }
    }

    @Override // defpackage.ezn
    public final boolean j() {
        boolean z;
        synchronized (this.b) {
            z = this.y == 4;
        }
        return z;
    }

    @Override // defpackage.ezn
    public final boolean k() {
        boolean z;
        synchronized (this.b) {
            z = this.y == 6;
        }
        return z;
    }

    @Override // defpackage.ezn
    public final boolean l() {
        boolean z;
        synchronized (this.b) {
            z = this.y == 4;
        }
        return z;
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x0059  */
    @Override // defpackage.ezn
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean m(defpackage.ezn r15) {
        /*
            r14 = this;
            boolean r0 = r15 instanceof defpackage.ezt
            r1 = 0
            if (r0 != 0) goto L6
            return r1
        L6:
            java.lang.Object r0 = r14.b
            monitor-enter(r0)
            int r2 = r14.j     // Catch: java.lang.Throwable -> L6f
            int r3 = r14.k     // Catch: java.lang.Throwable -> L6f
            java.lang.Object r4 = r14.g     // Catch: java.lang.Throwable -> L6f
            java.lang.Class r5 = r14.h     // Catch: java.lang.Throwable -> L6f
            ezk r6 = r14.i     // Catch: java.lang.Throwable -> L6f
            epb r7 = r14.l     // Catch: java.lang.Throwable -> L6f
            java.util.List r14 = r14.n     // Catch: java.lang.Throwable -> L6f
            if (r14 == 0) goto L1e
            int r14 = r14.size()     // Catch: java.lang.Throwable -> L6f
            goto L1f
        L1e:
            r14 = r1
        L1f:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L6f
            ezt r15 = (defpackage.ezt) r15
            java.lang.Object r8 = r15.b
            monitor-enter(r8)
            int r0 = r15.j     // Catch: java.lang.Throwable -> L6c
            int r9 = r15.k     // Catch: java.lang.Throwable -> L6c
            java.lang.Object r10 = r15.g     // Catch: java.lang.Throwable -> L6c
            java.lang.Class r11 = r15.h     // Catch: java.lang.Throwable -> L6c
            ezk r12 = r15.i     // Catch: java.lang.Throwable -> L6c
            epb r13 = r15.l     // Catch: java.lang.Throwable -> L6c
            java.util.List r15 = r15.n     // Catch: java.lang.Throwable -> L6c
            if (r15 == 0) goto L3a
            int r15 = r15.size()     // Catch: java.lang.Throwable -> L6c
            goto L3b
        L3a:
            r15 = r1
        L3b:
            monitor-exit(r8)     // Catch: java.lang.Throwable -> L6c
            if (r2 != r0) goto L6b
            if (r3 != r9) goto L6b
            char[] r0 = defpackage.fax.a
            if (r4 != 0) goto L47
            if (r10 != 0) goto L6b
            goto L59
        L47:
            boolean r0 = r4 instanceof defpackage.evd
            if (r0 == 0) goto L52
            evd r4 = (defpackage.evd) r4
            boolean r0 = r4.a()
            goto L56
        L52:
            boolean r0 = r4.equals(r10)
        L56:
            if (r0 != 0) goto L59
            goto L6b
        L59:
            boolean r0 = r5.equals(r11)
            if (r0 == 0) goto L6b
            boolean r0 = r6.equals(r12)
            if (r0 == 0) goto L6b
            if (r7 != r13) goto L6b
            if (r14 != r15) goto L6b
            r14 = 1
            return r14
        L6b:
            return r1
        L6c:
            r14 = move-exception
            monitor-exit(r8)     // Catch: java.lang.Throwable -> L6c
            throw r14
        L6f:
            r14 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L6f
            throw r14
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ezt.m(ezn):boolean");
    }

    @Override // defpackage.ezn
    public final boolean n() {
        boolean z;
        synchronized (this.b) {
            int i = this.y;
            z = true;
            if (i != 2 && i != 3) {
                z = false;
            }
        }
        return z;
    }

    public final String toString() {
        Object obj;
        Class cls;
        synchronized (this.b) {
            obj = this.g;
            cls = this.h;
        }
        return super.toString() + "[model=" + String.valueOf(obj) + ", transcodeClass=" + cls.toString() + "]";
    }
}
