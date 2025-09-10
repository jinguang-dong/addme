package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class lsc extends lrw {
    public final ida c;
    public rwc d;
    private final owf e;
    private final boolean f;
    private boolean g;

    public lsc(lrm lrmVar, ida idaVar, owf owfVar, llm llmVar, owf owfVar2, String str, fse fseVar, lsw lswVar, rwc rwcVar, boolean z) {
        super(lrmVar.a(z ? ltf.HI_RES : ((Boolean) owfVar2.dL()).booleanValue() ? ltf.TAXI : ltf.m, str, fseVar, lswVar, llmVar, rwcVar, kfl.a().a(), lswVar.b));
        this.d = rvk.a;
        this.g = false;
        this.c = idaVar;
        this.e = owfVar;
        this.f = z;
    }

    @Override // defpackage.lrw, defpackage.lss
    public final void I() {
        J("interruptSession");
        this.g = true;
        i().b();
    }

    public final poe O() {
        return h().b;
    }

    public final void P() {
        K();
        r().g();
    }

    @Override // defpackage.lrw, defpackage.lss
    public final void S() {
        super.S();
        L();
        lru lruVarI = i();
        jja jjaVarA = jjb.a();
        jjaVarA.a = m();
        jjaVarA.c = (Float) this.e.dL();
        jjaVarA.b(this.f);
        jjaVarA.c(true);
        lruVarI.c(jjaVarA.a());
    }

    @Override // defpackage.lrw, defpackage.lss
    public final boolean ai() {
        return this.g;
    }

    @Override // defpackage.lrw, defpackage.lss
    public final syu u(byte[] bArr, mfo mfoVar) {
        bArr.getClass();
        J("saveAndFinish");
        if (N().m()) {
            M("Ignoring saveAndFinish. CaptureSession has been deleted or canceled.");
            return s();
        }
        N().p(2, 3);
        mfoVar.c = g().b();
        mfoVar.d = false;
        mfoVar.e = kpa.a;
        N().q(3);
        B().execute(new dwq(this, bArr, x(mfoVar), mfoVar, 10, null));
        return s();
    }
}
