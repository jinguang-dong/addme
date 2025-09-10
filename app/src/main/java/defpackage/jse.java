package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class jse implements jsi {
    final /* synthetic */ jsf a;
    private final jsi b;
    private final long c;
    private rwc d;
    private rwc e;
    private boolean f;

    public jse(jsf jsfVar, long j, jsi jsiVar) {
        this.a = jsfVar;
        rvk rvkVar = rvk.a;
        this.d = rvkVar;
        this.e = rvkVar;
        this.f = false;
        this.b = jsiVar;
        this.c = j;
    }

    @Override // defpackage.jsi
    public final /* synthetic */ int a() {
        return -1;
    }

    @Override // defpackage.jsi
    public final long b() {
        long j;
        jsf jsfVar = this.a;
        synchronized (jsfVar) {
            jsfVar.d.add(this);
            this.b.b();
            j = this.c;
            if (j <= jsfVar.f || !jsfVar.e.get()) {
                d(jsfVar.f);
            }
        }
        return j;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Object, jsh] */
    /* JADX WARN: Type inference failed for: r2v15, types: [rwc] */
    /* JADX WARN: Type inference failed for: r2v20, types: [rwc] */
    /* JADX WARN: Type inference failed for: r3v3, types: [rwc] */
    /* JADX WARN: Type inference failed for: r7v3, types: [java.lang.Object, jsh] */
    public final void c() {
        rvk rvkVar;
        rvk rvkVar2;
        rvk rvkVarJ;
        rvk rvkVarJ2;
        jsf jsfVar = this.a;
        rvk rvkVarJ3 = rvk.a;
        synchronized (jsfVar) {
            if (this.f) {
                return;
            }
            if (this.e.h() && this.d.h()) {
                if (((Long) this.d.c()).longValue() <= this.c + jsfVar.c) {
                    rvkVarJ2 = rvkVarJ3;
                    rvkVarJ = rwc.j(jry.LONG_PRESS_TOO_SHORT);
                } else {
                    rvkVarJ = rvkVarJ3;
                    rvkVarJ3 = rwc.j(this.d.c());
                    rvkVarJ2 = rwc.j(jsl.LONG_SHOT_SHUTTER_RELEASE);
                }
                this.f = true;
                jsfVar.d.remove(this);
                rvk rvkVar3 = rvkVarJ;
                rvkVar = rvkVarJ3;
                rvkVarJ3 = rvkVarJ2;
                rvkVar2 = rvkVar3;
            } else {
                rvkVar = rvkVarJ3;
                rvkVar2 = rvkVar;
            }
            if (rvkVarJ3.h()) {
                jsf jsfVar2 = this.a;
                jsfVar2.a.b("Sending out end timestamp: ".concat(rvkVar.c().toString()));
                this.e.c().b(((Long) rvkVar.c()).longValue(), (jsl) rvkVarJ3.e(jsl.UNKNOWN));
            }
            if (rvkVar2.h()) {
                this.a.a.b("Cancelling long shot.");
                this.e.c().a((jry) rvkVar2.c());
            }
        }
    }

    public final void d(long j) {
        this.d = rwc.j(Long.valueOf(j));
        c();
    }

    @Override // defpackage.jsi
    public final void e(jsh jshVar) {
        this.e = rwc.j(jshVar);
        this.b.e(new jsd(this, 0));
        c();
    }
}
