package defpackage;

import android.os.SystemClock;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class esa implements Runnable, Comparable, erw, fbc {
    private boolean A;
    private int B;
    private int C;
    public epa c;
    public eqi d;
    public epb e;
    public int f;
    public int g;
    public esh h;
    public eqm i;
    public int j;
    public boolean k;
    public eqi l;
    public volatile erx m;
    public volatile boolean n;
    public int o;
    public final esj p;
    public eso q;
    private final cnj u;
    private Thread v;
    private eqi w;
    private Object x;
    private eqv y;
    private volatile boolean z;
    public final ery a = new ery();
    private final List s = new ArrayList();
    private final fbf t = new fbf();
    public final sxx r = new sxx();
    public final erz b = new erz();

    public esa(esj esjVar, cnj cnjVar) {
        this.p = esjVar;
        this.u = cnjVar;
    }

    private final int g() {
        return this.e.ordinal();
    }

    private final erx h() {
        int i = this.B;
        int i2 = i - 1;
        if (i == 0) {
            throw null;
        }
        if (i2 == 1) {
            return new esx(this.a, this);
        }
        if (i2 == 2) {
            ery eryVar = this.a;
            return new eru(eryVar.d(), eryVar, this);
        }
        if (i2 == 3) {
            return new etb(this.a, this);
        }
        if (i2 == 5) {
            return null;
        }
        throw new IllegalStateException("Unrecognized stage: ".concat(eoz.b(i)));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0243  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x0331  */
    /* JADX WARN: Removed duplicated region for block: B:210:0x01e9 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:213:0x01ed A[EDGE_INSN: B:213:0x01ed->B:93:0x01ed BREAK  A[LOOP:1: B:26:0x007c->B:91:0x01de], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x007e A[Catch: all -> 0x020d, TRY_LEAVE, TryCatch #12 {all -> 0x020d, blocks: (B:25:0x0073, B:27:0x007e, B:28:0x0085), top: B:198:0x0073 }] */
    /* JADX WARN: Removed duplicated region for block: B:91:0x01de A[LOOP:1: B:26:0x007c->B:91:0x01de, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:94:0x01ef A[Catch: all -> 0x0218, TRY_ENTER, TRY_LEAVE, TryCatch #15 {all -> 0x0218, blocks: (B:94:0x01ef, B:104:0x0212, B:105:0x0217), top: B:203:0x0063 }] */
    /* JADX WARN: Removed duplicated region for block: B:98:0x01fe A[Catch: all -> 0x020b, TRY_ENTER, TryCatch #9 {all -> 0x020b, blocks: (B:38:0x00c1, B:42:0x00d6, B:44:0x00dc, B:45:0x00df, B:47:0x00f5, B:49:0x0109, B:53:0x011a, B:56:0x012d, B:61:0x0148, B:64:0x0154, B:66:0x0158, B:68:0x0183, B:72:0x01a0, B:98:0x01fe, B:99:0x020a, B:67:0x017a, B:69:0x0190, B:70:0x019d, B:59:0x0142, B:88:0x01d8, B:50:0x010e, B:51:0x0117, B:82:0x01b9, B:83:0x01ca), top: B:195:0x00c1 }] */
    /* JADX WARN: Type inference failed for: r0v67, types: [eqi, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v5, types: [eqi, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v2, types: [eqa, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void i() throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 821
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.esa.i():void");
    }

    private final void j() {
        l();
        ess essVar = new ess("Failed to load resource", new ArrayList(this.s));
        eso esoVar = this.q;
        synchronized (esoVar) {
            esoVar.h = essVar;
        }
        synchronized (esoVar) {
            esoVar.b.a();
            if (esoVar.k) {
                esoVar.e();
            } else {
                esn esnVar = esoVar.a;
                if (esnVar.c()) {
                    throw new IllegalStateException("Received an exception without any callbacks to notify");
                }
                if (esoVar.i) {
                    throw new IllegalStateException("Already failed once");
                }
                esoVar.i = true;
                eqi eqiVar = esoVar.c;
                esn esnVarB = esnVar.b();
                esoVar.d(esnVarB.a() + 1);
                esoVar.n.k(esoVar, eqiVar, null);
                Iterator it = esnVarB.iterator();
                while (it.hasNext()) {
                    esm esmVar = (esm) it.next();
                    esmVar.a.execute(new esl(esoVar, esmVar.b, 1));
                }
                esoVar.c();
            }
        }
        if (this.b.c()) {
            c();
        }
    }

    private final void k() {
        this.v = Thread.currentThread();
        double d = fas.a;
        SystemClock.elapsedRealtimeNanos();
        boolean zC = false;
        while (!this.n && this.m != null && !(zC = this.m.c())) {
            this.B = e(this.B);
            this.m = h();
            if (this.B == 4) {
                f(2);
                return;
            }
        }
        if ((this.B == 6 || this.n) && !zC) {
            j();
        }
    }

    private final void l() {
        this.t.a();
        if (this.z) {
            List list = this.s;
            throw new IllegalStateException("Already notified", list.isEmpty() ? null : (Throwable) list.get(list.size() - 1));
        }
        this.z = true;
    }

    @Override // defpackage.erw
    public final void b(eqi eqiVar, Exception exc, eqv eqvVar, int i) {
        eqvVar.d();
        ess essVar = new ess("Fetching data failed", Collections.singletonList(exc));
        essVar.b(eqiVar, i, eqvVar.a());
        this.s.add(essVar);
        if (Thread.currentThread() != this.v) {
            f(2);
        } else {
            k();
        }
    }

    public final void c() {
        this.b.a();
        sxx sxxVar = this.r;
        sxxVar.b = null;
        sxxVar.c = null;
        sxxVar.a = null;
        ery eryVar = this.a;
        eryVar.c = null;
        eryVar.d = null;
        eryVar.m = null;
        eryVar.g = null;
        eryVar.j = null;
        eryVar.h = null;
        eryVar.n = null;
        eryVar.i = null;
        eryVar.o = null;
        eryVar.a.clear();
        eryVar.k = false;
        eryVar.b.clear();
        eryVar.l = false;
        this.z = false;
        this.c = null;
        this.d = null;
        this.i = null;
        this.e = null;
        this.q = null;
        this.B = 0;
        this.m = null;
        this.v = null;
        this.l = null;
        this.x = null;
        this.C = 0;
        this.y = null;
        this.n = false;
        this.s.clear();
        this.u.b(this);
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        esa esaVar = (esa) obj;
        int iG = g() - esaVar.g();
        return iG == 0 ? this.j - esaVar.j : iG;
    }

    @Override // defpackage.erw
    public final void d(eqi eqiVar, Object obj, eqv eqvVar, int i, eqi eqiVar2) throws Throwable {
        this.l = eqiVar;
        this.x = obj;
        this.y = eqvVar;
        this.C = i;
        this.w = eqiVar2;
        this.A = eqiVar != this.a.d().get(0);
        if (Thread.currentThread() == this.v) {
            i();
        } else {
            f(3);
        }
    }

    @Override // defpackage.fbc
    public final fbf dF() {
        return this.t;
    }

    public final int e(int i) {
        if (i == 0) {
            throw null;
        }
        int i2 = i - 1;
        if (i2 == 0) {
            if (this.h.b()) {
                return 2;
            }
            return e(2);
        }
        if (i2 == 1) {
            if (this.h.a()) {
                return 3;
            }
            return e(3);
        }
        if (i2 == 2) {
            return this.k ? 6 : 4;
        }
        if (i2 == 3 || i2 == 5) {
            return 6;
        }
        throw new IllegalArgumentException("Unrecognized stage: ".concat(eoz.b(i)));
    }

    public final void f(int i) {
        this.o = i;
        this.q.b().execute(this);
    }

    @Override // java.lang.Runnable
    public final void run() {
        eqv eqvVar = this.y;
        try {
            try {
                if (this.n) {
                    j();
                } else {
                    int i = this.o;
                    int i2 = i - 1;
                    if (i == 0) {
                        throw null;
                    }
                    if (i2 == 0) {
                        this.B = e(1);
                        this.m = h();
                        k();
                    } else if (i2 == 1) {
                        k();
                    } else {
                        if (i2 != 2) {
                            throw new IllegalStateException("Unrecognized run reason: ".concat(i != 1 ? i != 2 ? "DECODE_DATA" : "SWITCH_TO_SOURCE_SERVICE" : "INITIALIZE"));
                        }
                        i();
                    }
                }
            } catch (ert e) {
                throw e;
            } catch (Throwable th) {
                if (this.B != 5) {
                    this.s.add(th);
                    j();
                }
                if (!this.n) {
                    throw th;
                }
                throw th;
            }
        } finally {
            if (eqvVar != null) {
                eqvVar.d();
            }
        }
    }
}
