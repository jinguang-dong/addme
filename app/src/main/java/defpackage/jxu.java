package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class jxu extends gsn {
    final /* synthetic */ jxv a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jxu(jxv jxvVar) {
        super((int[]) null);
        this.a = jxvVar;
    }

    @Override // defpackage.gsn
    public final void e() {
        jxv jxvVar = this.a;
        synchronized (jxvVar.d) {
            if (jxvVar.c.p()) {
                jxvVar.b.d();
            }
        }
    }

    @Override // defpackage.gsn
    public final void f() {
        jxv jxvVar = this.a;
        synchronized (jxvVar.d) {
            if (jxvVar.c.q()) {
                jxvVar.b.f();
            }
        }
    }

    @Override // defpackage.gsn
    public final void j() {
        jxv jxvVar = this.a;
        synchronized (jxvVar.d) {
            jxvVar.c.h();
        }
    }

    @Override // defpackage.gsn
    public final void k() {
        jxv jxvVar = this.a;
        synchronized (jxvVar.d) {
            jxvVar.c.i();
        }
    }
}
