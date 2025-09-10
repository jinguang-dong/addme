package defpackage;

import android.os.Trace;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Objects;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class pgs {
    public static final Object a = new Object();
    public boolean b;
    public boolean c;
    public boolean d;
    private final pfr e;
    private final pgq f;
    private final pgn g;
    private final our h;
    private final pbn i;
    private final pbc j;
    private final pmv m;
    private final pit n;
    private int l = 1;
    private Set k = new HashSet();

    public pgs(qrh qrhVar, pez pezVar, pgn pgnVar, pgq pgqVar, pfr pfrVar, pit pitVar, our ourVar, pbn pbnVar, pbc pbcVar, pmv pmvVar, pit pitVar2) {
        this.f = pgqVar;
        this.g = pgnVar;
        this.n = pitVar;
        this.e = pfrVar;
        this.h = ourVar;
        this.i = pbnVar;
        this.j = pbcVar.a("RequestQueue");
        this.m = pmvVar;
        pgr pgrVar = new pgr(this, 1);
        pgr pgrVar2 = new pgr(this, 0);
        ourVar.d(qrhVar.b(pgrVar));
        pezVar.c(pgrVar);
        pitVar2.c(pgrVar);
        pgnVar.d(pgrVar2);
        pgr pgrVar3 = new pgr(this, 2);
        rnt.M(pgqVar.a == null, "Session closed listener was set multiple times!");
        pgqVar.a = pgrVar3;
    }

    private final void c(Set set) {
        if (set != null) {
            Iterator it = set.iterator();
            while (it.hasNext()) {
                pgf pgfVar = (pgf) it.next();
                this.j.h("Failed to submit ".concat(String.valueOf(String.valueOf(pgfVar))));
                pgfVar.g();
            }
        }
    }

    final void a() {
        boolean z;
        pit pitVar = this.n;
        synchronized (pitVar) {
            Object obj = a;
            synchronized (obj) {
                if (this.h.b() || !pitVar.g(this.e) || this.l == 2) {
                    return;
                }
                this.l = 2;
                this.j.b("RequestQueue startCamera");
                this.i.f("RequestQueue startCamera");
                Object obj2 = this.m.b;
                if (((vp) obj2).c.a()) {
                    throw new IllegalStateException(a.bz(obj2, "Cannot start ", " after calling close()"));
                }
                Objects.toString(obj2);
                Trace.beginSection(obj2.toString().concat("#start"));
                Objects.toString(obj2);
                ((vp) obj2).a.b();
                sl slVar = ((vp) obj2).e;
                synchronized (slVar.a) {
                    slVar.d();
                }
                Trace.endSection();
                synchronized (obj) {
                    if (this.d) {
                        z = false;
                    } else {
                        z = true;
                        this.b = true;
                        this.c = true;
                    }
                }
                if (z) {
                    b();
                }
                this.i.g();
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x008d A[Catch: all -> 0x00fb, TryCatch #4 {all -> 0x00fb, blocks: (B:24:0x002e, B:26:0x0040, B:31:0x0083, B:35:0x008a, B:37:0x008d, B:39:0x0096, B:40:0x009e, B:42:0x00a4, B:43:0x00b0, B:45:0x00be, B:47:0x00f0, B:46:0x00c2, B:49:0x00f7, B:27:0x0041, B:29:0x004d, B:30:0x0082), top: B:69:0x002e, outer: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00f7 A[Catch: all -> 0x00fb, TRY_LEAVE, TryCatch #4 {all -> 0x00fb, blocks: (B:24:0x002e, B:26:0x0040, B:31:0x0083, B:35:0x008a, B:37:0x008d, B:39:0x0096, B:40:0x009e, B:42:0x00a4, B:43:0x00b0, B:45:0x00be, B:47:0x00f0, B:46:0x00c2, B:49:0x00f7, B:27:0x0041, B:29:0x004d, B:30:0x0082), top: B:69:0x002e, outer: #1 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void b() {
        /*
            Method dump skipped, instructions count: 282
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.pgs.b():void");
    }
}
