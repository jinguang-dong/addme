package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class gbp implements pdm {
    public oyn a;
    public boolean b;
    public long c;
    public pdn d;
    public peo e;
    public final Object f = new Object();

    @Override // defpackage.pdm
    public final /* synthetic */ String a() {
        return "";
    }

    public final void b() {
        synchronized (this.f) {
            c();
            this.d = null;
            this.e = null;
        }
    }

    public final void c() {
        synchronized (this.f) {
            this.b = false;
            pdn pdnVar = this.d;
            if (pdnVar != null) {
                pdnVar.m(this);
            }
        }
    }

    @Override // defpackage.pdm
    public final void d(phc phcVar) {
        ojl.bB(phcVar, new fuh(this, 2));
    }
}
