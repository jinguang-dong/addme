package defpackage;

import android.content.res.Resources;
import com.google.ar.core.R;
import j$.time.Instant;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class mnt {
    public final nak a;
    private final ndj b;
    private final gtx c;
    private nkw d = nkw.UNINITIALIZED;
    private final gnt e;
    private final owf f;
    private final mzz g;
    private final fvu h;
    private final owq i;
    private final mbj j;
    private final imi k;
    private final jhn l;
    private final krj m;
    private final hbj n;

    public mnt(mbj mbjVar, ndj ndjVar, gtx gtxVar, nak nakVar, imi imiVar, hbj hbjVar, jhn jhnVar, gnt gntVar, owf owfVar, krj krjVar, mzz mzzVar, fvu fvuVar, owq owqVar) {
        this.j = mbjVar;
        this.b = ndjVar;
        this.c = gtxVar;
        this.a = nakVar;
        this.k = imiVar;
        this.n = hbjVar;
        this.l = jhnVar;
        this.e = gntVar;
        this.f = owfVar;
        this.m = krjVar;
        this.g = mzzVar;
        this.h = fvuVar;
        this.i = owqVar;
    }

    private final void f() {
        boolean z = true;
        if (this.d != nkw.PHOTO && this.d != nkw.PORTRAIT) {
            z = false;
        }
        rnt.L(z);
        this.b.aw(this.d);
    }

    private final void g(float f, long j) {
        nak nakVar = this.a;
        jhn jhnVar = this.l;
        if (!jhnVar.a()) {
            nakVar.g(f);
            return;
        }
        if (j + 300 >= 2250) {
            long epochMilli = Instant.now().toEpochMilli();
            if (f == 0.0f) {
                jhnVar.b = epochMilli;
                return;
            }
            if (epochMilli - jhnVar.b > 2000) {
                if (!jhnVar.c) {
                    jhnVar.c = true;
                    f = 0.0f;
                }
                nakVar.h(jhnVar.a, f);
                if (f == 1.0f) {
                    jhnVar.c = false;
                }
            }
        }
    }

    private final void h() throws Resources.NotFoundException {
        this.i.a(false);
        this.m.j();
        this.g.m(true);
        this.h.m(true);
    }

    public final paq a(nkw nkwVar) {
        this.d = nkwVar;
        nak nakVar = this.a;
        nakVar.c(this.k);
        return nakVar;
    }

    public final void b(boolean z) {
        this.b.x();
        this.c.h();
        this.a.f();
        h();
        if (z) {
            return;
        }
        f();
    }

    public final void c() {
        f();
        h();
    }

    public final void d(float f, long j, kow kowVar) {
        owf owfVar = this.f;
        boolean zA = kowVar.a();
        boolean zBooleanValue = ((Boolean) owfVar.dL()).booleanValue();
        ndj ndjVar = this.b;
        gnt gntVar = this.e;
        ndjVar.L((int) (100.0f * f), j, zA, gntVar.j(), zBooleanValue, Optional.empty(), Optional.empty());
        if (this.n.p(gyp.m)) {
            if (f == 0.0f) {
                this.c.i(new jbv(this, 2));
            }
            if (this.c.n() || this.l.a() || this.d == nkw.PORTRAIT || gntVar.j()) {
                g(f, j);
            }
        } else {
            g(f, j);
        }
        if (f == 1.0f) {
            f();
            this.c.h();
            this.a.f();
        }
    }

    public final void e() {
        this.j.c(R.raw.longexposure_start);
        this.b.ag();
        this.i.a(true);
        this.m.k();
        this.g.m(false);
        this.h.m(false);
    }
}
