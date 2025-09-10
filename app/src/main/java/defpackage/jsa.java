package defpackage;

import com.google.android.apps.camera.backup.cNHl.ibINv;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class jsa implements jsi {
    public rwc c;
    public boolean d;
    public rwc e;
    public long f;
    final /* synthetic */ obu g;
    private final jsi h;
    private boolean j;
    private boolean k;
    private boolean l;
    private long m;
    private int n;
    private jsh o;
    public final jrz a = new jrz(this);
    private boolean i = false;
    public boolean b = false;

    public jsa(obu obuVar, jsi jsiVar) {
        this.g = obuVar;
        rvk rvkVar = rvk.a;
        this.c = rvkVar;
        this.d = false;
        this.e = rvkVar;
        this.j = false;
        this.k = false;
        this.l = false;
        this.m = 0L;
        this.f = 0L;
        this.n = -1;
        this.h = jsiVar;
    }

    @Override // defpackage.jsi
    public final int a() {
        return this.n;
    }

    @Override // defpackage.jsi
    public final synchronized long b() {
        this.i = true;
        d();
        return this.m;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, pbc] */
    public final synchronized void c() {
        this.g.b.b("Ending still pending microvideo sessions");
        this.l = true;
        d();
    }

    @Override // defpackage.jsi
    public final synchronized void e(jsh jshVar) {
        this.o = jshVar;
        this.a.a.set(this);
        d();
    }

    /* JADX WARN: Type inference failed for: r0v9, types: [java.lang.Object, pbc] */
    /* JADX WARN: Type inference failed for: r1v13, types: [java.lang.Object, pbc] */
    /* JADX WARN: Type inference failed for: r1v17, types: [java.lang.Object, pbc] */
    /* JADX WARN: Type inference failed for: r1v21, types: [java.lang.Object, pbc] */
    /* JADX WARN: Type inference failed for: r1v24, types: [java.lang.Object, pbc] */
    /* JADX WARN: Type inference failed for: r4v11, types: [java.lang.Object, pbc] */
    public final synchronized void d() {
        jsh jshVar;
        String str = ibINv.dKZfVIt;
        synchronized (this) {
            if (this.i && !this.j && !this.l) {
                jsi jsiVar = this.h;
                long jB = jsiVar.b();
                this.m = jB;
                this.g.b.b(str + jB);
                this.j = true;
                this.n = jsiVar.a();
            }
            if (this.l && (jshVar = this.o) != null) {
                if (this.j) {
                    jshVar.b(this.m + 3000000, jsl.MAX_LENGTH_AFTER_SHUTDOWN);
                    this.g.b.b("... ending max length later");
                } else {
                    this.g.b.b("... canceling since no start timestamp was requested");
                    jsh jshVar2 = this.o;
                    jshVar2.getClass();
                    jshVar2.a(jry.CANCEL_AFTER_SHUTDOWN);
                }
                this.o = null;
                this.a.a();
            }
            if (this.o != null && !this.k && !this.l) {
                this.g.b.b("Asking delegate muxer for trimming decision");
                this.h.e(new jsd(this, 1));
                this.k = true;
            }
            if (this.b && this.o != null) {
                rnt.L(!this.l);
                obu obuVar = this.g;
                String str2 = "Ending normally at " + this.f;
                ?? r1 = obuVar.b;
                r1.b(str2);
                jsh jshVar3 = this.o;
                jshVar3.getClass();
                jshVar3.b(this.f, (jsl) this.c.c());
                this.o = null;
                this.a.a();
                r1.b("Ended normally.");
            }
            if (!this.d || this.o == null) {
                return;
            }
            rnt.L(!this.l);
            jsh jshVar4 = this.o;
            jshVar4.getClass();
            jshVar4.a((jry) this.e.c());
            this.o = null;
            this.a.a();
            this.g.b.b("Cancelled normally.");
        }
    }
}
