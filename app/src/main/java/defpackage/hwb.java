package defpackage;

import android.os.Handler;
import android.os.Looper;

/* compiled from: PG */
/* loaded from: classes.dex */
public class hwb {
    private static final sgv p = sgv.g("hwb");
    public final owf a;
    public final owq b;
    public final owq c;
    public final owf d;
    public final owq e;
    public final owq f;
    public final hyh g;
    public final owf h;
    public final out i;
    public final ndj j;
    public final Handler k;
    public final hwh l;
    public long m = 1500;
    public long n = -1;
    public final hbj o;
    private final owf q;
    private final kqy r;

    public hwb(ndj ndjVar, owq owqVar, owq owqVar2, owq owqVar3, owq owqVar4, owq owqVar5, kqy kqyVar, luj lujVar, owf owfVar, hwh hwhVar, owf owfVar2, hyh hyhVar, hbj hbjVar, out outVar) {
        this.j = ndjVar;
        this.b = owqVar;
        this.c = owqVar2;
        this.f = owqVar3;
        this.d = owqVar4;
        this.i = outVar;
        this.h = owfVar;
        this.e = owqVar5;
        this.a = owfVar2;
        this.g = hyhVar;
        this.r = kqyVar;
        this.q = lujVar.a(luf.aO);
        this.l = hwhVar;
        this.o = hbjVar;
        gzi gziVar = gzq.a;
        this.k = new Handler(Looper.getMainLooper());
    }

    public final void a() {
        owq owqVar = this.f;
        if (((Boolean) owqVar.dL()).booleanValue()) {
            this.j.x();
            owqVar.a(false);
            this.l.a();
            this.r.k(qpt.bD(((Integer) ((ovx) this.q).d).intValue()), true);
        }
    }

    public final void b() {
        nkw nkwVar = nkw.UNINITIALIZED;
        owf owfVar = this.a;
        if (((nkw) owfVar.dL()).ordinal() != 1) {
            ((sgt) p.c().M(1634)).v("Finishing squad shutter called in mode %s", owfVar.dL());
            return;
        }
        ndj ndjVar = this.j;
        ndjVar.q();
        owq owqVar = this.f;
        owqVar.a(false);
        gzi gziVar = gzq.a;
        if (c()) {
            ndjVar.q();
        }
        owqVar.a(false);
        this.l.b();
    }

    public final boolean c() {
        return ((Integer) this.d.dL()).intValue() >= ((Integer) this.o.a(gzq.c).orElse(3)).intValue();
    }
}
