package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class lsb extends lrw {
    public rwc c;
    private final pbn d;
    private final kfl e;
    private boolean f;

    public lsb(lrm lrmVar, llm llmVar, pbn pbnVar, ltf ltfVar, String str, fse fseVar, lsw lswVar, rwc rwcVar, kfl kflVar) {
        super(lrmVar.a(ltfVar, str, fseVar, lswVar, llmVar, rwcVar, kflVar, lswVar.b));
        this.c = rvk.a;
        this.f = false;
        this.d = pbnVar;
        this.e = kflVar;
    }

    @Override // defpackage.lrw, defpackage.lss
    public final void E() {
        if (N().n() || N().m()) {
            M("finish. Ignoring as session was already finished.");
            return;
        }
        J("finish");
        N().r(2, 3);
        r().g();
    }

    @Override // defpackage.lrw, defpackage.lss
    public final void I() {
        J("interruptSession");
        this.f = true;
        i().b();
    }

    @Override // defpackage.lrw, defpackage.lss
    public final void Z(pas pasVar) {
        pbn pbnVar = this.d;
        pbnVar.f("MultiImageCaptureSession#startEmpty");
        super.Z(pasVar);
        super.S();
        L();
        lru lruVarI = i();
        jja jjaVarA = jjb.a();
        jjaVarA.a = m();
        jjaVarA.c(this.e.l);
        lruVarI.c(jjaVarA.a());
        pbnVar.g();
    }

    @Override // defpackage.lrw, defpackage.lss
    public final boolean ai() {
        return this.f;
    }
}
