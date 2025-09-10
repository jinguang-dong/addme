package defpackage;

import com.google.android.apps.camera.moments.api.GroupPhotoUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class jsk implements hpb, jsi {
    private static final long g = Math.round(1.6666666666666666E7d);
    private final iso A;
    public final hpa a;
    public final long b;
    public final owq c;
    public final ltf d;
    public volatile long e;
    public final hbj f;
    private final List j;
    private final Executor k;
    private final rwc l;
    private final owf m;
    private final owf o;
    private final rwc p;
    private volatile lnl r;
    private volatile jsh s;
    private volatile long u;
    private paq v;
    private volatile int x;
    private final lnw y;
    private final lnw z;
    private rwc q = rvk.a;
    private int w = -1;
    private final AtomicBoolean h = new AtomicBoolean(false);
    private final AtomicBoolean i = new AtomicBoolean(true);
    private volatile long t = Long.MAX_VALUE;
    private final List n = new ArrayList();

    public jsk(hpa hpaVar, long j, List list, int i, Executor executor, iso isoVar, hbj hbjVar, rwc rwcVar, owf owfVar, owf owfVar2, owq owqVar, rwc rwcVar2, ltf ltfVar) {
        lnw lnwVar;
        this.a = hpaVar;
        this.b = j;
        this.j = list;
        this.x = i;
        this.k = executor;
        this.A = isoVar;
        this.f = hbjVar;
        this.l = rwcVar;
        this.o = owfVar;
        this.p = rwcVar2;
        this.d = ltfVar;
        if (hbjVar == null || !hbjVar.p(haa.R)) {
            this.y = new lnw(0.3f, 0.6f, null);
            lnwVar = new lnw(0.5f, 0.8f, null);
        } else if (hbjVar.p(gzz.g)) {
            this.y = new lnw(0.3f, 0.6f, null);
            lnwVar = new lnw(0.6f, 0.8f, null);
        } else {
            this.y = new lnw(0.3f, 0.6f, null);
            lnwVar = new lnw(0.6f, 0.8f, null);
        }
        this.z = lnwVar;
        this.m = owfVar2;
        this.c = owqVar;
    }

    private final int d(List list) {
        int size = list.size();
        do {
            size--;
            if (size <= 1) {
                break;
            }
        } while (((lnl) list.get(size)).c > this.b + g);
        this.r = (lnl) list.get(size);
        return size;
    }

    private final rwc f(lnl lnlVar) {
        lnl lnlVar2 = this.r;
        if (lnlVar2 != null && lnlVar != null) {
            g(lnlVar);
            long j = this.b;
            long j2 = lnlVar.c;
            if (j2 >= j) {
                long jMin = 1500000000;
                if (((Boolean) this.o.dL()).booleanValue()) {
                    if (((Integer) ((owq) ((rwg) this.p).a).dL()).intValue() >= 3) {
                        gzi gziVar = gzq.a;
                        jMin = Math.min(((Integer) r5.dL()).intValue() * 1000000000, 3000000000L);
                    }
                }
                this.u = jMin;
                this.c.a(Long.valueOf(this.u));
                if (j2 > j + this.u) {
                    jsl jslVar = jsl.MAX_LENGTH;
                    rwc.j(jslVar);
                    return rwc.j(jslVar);
                }
                for (jsq jsqVar : this.j) {
                    if (jsqVar.b(lnlVar, lnlVar2)) {
                        rwc.j(jsqVar.a());
                        return rwc.j(jsqVar.a());
                    }
                }
            }
        }
        return rvk.a;
    }

    private final synchronized void g(lnl lnlVar) {
        this.n.add(lnlVar);
    }

    private final void h(jsl jslVar) {
        if (jslVar.equals(jsl.ADAPTIVE_DISTANCE)) {
            this.t = Math.max(this.b, this.t - (hpi.j * 6));
        }
    }

    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Object, lny] */
    private final synchronized boolean i() {
        long j = this.r.c;
        ?? r2 = ((rwg) this.l).a;
        lnx lnxVarA = r2.a(j);
        if (lnxVarA == null) {
            return false;
        }
        Iterator it = this.n.iterator();
        float f = 0.0f;
        while (it.hasNext()) {
            lnx lnxVarA2 = r2.a(((lnl) it.next()).c);
            float f2 = lnxVarA2 == null ? 0.0f : lnxVarA2.b;
            if (f2 > f) {
                f = f2;
            }
        }
        return jri.a(f - lnxVarA.b, this.f.p(haa.o)) > 0.6f;
    }

    private final synchronized boolean j() {
        List list = this.n;
        int size = list.size();
        float f = 0.0f;
        float f2 = 0.0f;
        for (int i = 0; i < size; i++) {
            lnl lnlVar = (lnl) list.get(i);
            f += lnlVar.i;
            float f3 = lnlVar.q;
            if (f3 > f2) {
                f2 = f3;
            }
        }
        float size2 = f / list.size();
        lnw lnwVar = this.y;
        lnw lnwVar2 = this.z;
        hbj hbjVar = this.f;
        float fK = k(size2, lnwVar);
        float fK2 = k(size2, lnwVar2);
        if (hbjVar.p(haa.R) && size2 < 1.0E-9d) {
            fK2 = 0.8f;
            fK = 0.6f;
        }
        Iterator it = list.iterator();
        int i2 = 0;
        int i3 = 0;
        while (it.hasNext()) {
            float f4 = ((lnl) it.next()).q;
            if (f4 > 0.1f) {
                f4 /= f2;
            }
            if (f4 > fK) {
                i2++;
            } else {
                i3++;
            }
        }
        if (i2 == 0) {
            return true;
        }
        return ((float) i2) / ((float) (i3 + i2)) < fK2;
    }

    private static final float k(float f, lnw lnwVar) {
        float fMin = Math.min(Math.max((f - 1.0f) / 0.5f, 0.0f), 1.0f);
        return (lnwVar.b * (1.0f - fMin)) + (lnwVar.a * fMin);
    }

    @Override // defpackage.jsi
    public final int a() {
        return this.w;
    }

    @Override // defpackage.jsi
    public final long b() {
        List listD = this.a.d();
        if (listD.isEmpty()) {
            return TimeUnit.MICROSECONDS.convert(this.b, TimeUnit.NANOSECONDS) - 1500000;
        }
        int iD = d(listD);
        long j = this.r.c;
        int i = iD - 1;
        while (true) {
            if (i < 0) {
                this.q = rwc.j(jsl.MAX_LENGTH);
                break;
            }
            lnl lnlVar = (lnl) listD.get(i);
            long j2 = lnlVar.c;
            lnl lnlVar2 = this.r;
            if (lnlVar2 != null && lnlVar != null) {
                g(lnlVar);
                long j3 = this.b;
                if (j2 <= j3) {
                    if (j2 < j3 - 1500000000) {
                        this.q = rwc.j(jsl.MAX_LENGTH);
                    } else {
                        for (jsq jsqVar : this.j) {
                            if (jsqVar.b(lnlVar, lnlVar2)) {
                                this.q = rwc.j(jsqVar.a());
                            }
                        }
                    }
                    if (i <= iD) {
                        break;
                    }
                } else {
                    continue;
                }
            }
            i--;
            j = j2;
        }
        this.e = Math.min(Math.max(TimeUnit.MICROSECONDS.convert(j + (this.q.equals(rwc.j(jsl.ADAPTIVE_DISTANCE)) ? hpi.j * 6 : 0L), TimeUnit.NANOSECONDS), TimeUnit.MICROSECONDS.convert(r4, TimeUnit.NANOSECONDS) - 1500000), TimeUnit.MICROSECONDS.convert(this.b, TimeUnit.NANOSECONDS));
        this.w = GroupPhotoUtils.a(this.r);
        return this.e;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0062  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void c(defpackage.jsh r17, long r18, defpackage.jsl r20) {
        /*
            Method dump skipped, instructions count: 228
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jsk.c(jsh, long, jsl):void");
    }

    @Override // defpackage.jsi
    public final void e(jsh jshVar) {
        this.s = new jsj(this, jshVar);
        Executor executor = this.k;
        this.a.c(this, executor);
        this.v = this.m.dK(new glc(this, jshVar, 18, null), executor);
    }

    @Override // defpackage.hpb
    public final synchronized void ey(lnl lnlVar) {
        AtomicBoolean atomicBoolean = this.i;
        jsh jshVar = this.s;
        long j = this.e;
        if (!atomicBoolean.compareAndSet(true, false)) {
            rwc rwcVarF = f(lnlVar);
            if (!rwcVarF.h()) {
                this.t = lnlVar.c;
                return;
            } else {
                h((jsl) rwcVarF.c());
                c(jshVar, j, (jsl) rwcVarF.c());
                return;
            }
        }
        List listD = this.a.d();
        if (!listD.isEmpty()) {
            this.t = this.b;
            for (int iD = d(listD) + 1; iD < listD.size(); iD++) {
                lnl lnlVar2 = (lnl) listD.get(iD);
                rwc rwcVarF2 = f(lnlVar2);
                if (rwcVarF2.h()) {
                    h((jsl) rwcVarF2.c());
                    c(jshVar, j, (jsl) rwcVarF2.c());
                } else {
                    this.t = lnlVar2.c;
                }
            }
        }
    }
}
