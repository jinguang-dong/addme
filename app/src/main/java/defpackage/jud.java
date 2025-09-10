package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class jud extends gsn {
    final /* synthetic */ jue a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jud(jue jueVar) {
        super((int[]) null);
        this.a = jueVar;
    }

    @Override // defpackage.gsn
    public final void b() {
        jue jueVar = this.a;
        if (jueVar.f.p(gym.U)) {
            synchronized (jueVar.d) {
                jueVar.b.e();
            }
        }
    }

    @Override // defpackage.gsn
    public final void e() {
        jue jueVar = this.a;
        synchronized (jueVar.d) {
            if (jueVar.b.p()) {
                jueVar.c.d();
            }
        }
    }

    @Override // defpackage.gsn
    public final void f() {
        jue jueVar = this.a;
        synchronized (jueVar.d) {
            if (jueVar.b.q()) {
                jueVar.c.f();
            }
        }
    }

    @Override // defpackage.gsn
    public final void j() {
        jue jueVar = this.a;
        synchronized (jueVar.d) {
            jueVar.b.h();
        }
    }

    @Override // defpackage.gsn
    public final void k() {
        jue jueVar = this.a;
        synchronized (jueVar.d) {
            jueVar.b.i();
        }
    }
}
