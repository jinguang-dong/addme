package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class jxw extends gsn {
    final /* synthetic */ jxx a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jxw(jxx jxxVar) {
        super((int[]) null);
        this.a = jxxVar;
    }

    @Override // defpackage.gsn
    public final void e() {
        jxx jxxVar = this.a;
        synchronized (jxxVar.b) {
            if (jxxVar.a.p()) {
                jxxVar.c.d();
            }
        }
    }

    @Override // defpackage.gsn
    public final void f() {
        jxx jxxVar = this.a;
        synchronized (jxxVar.b) {
            if (jxxVar.a.q()) {
                jxxVar.c.f();
            }
        }
    }

    @Override // defpackage.gsn
    public final void j() {
        jxx jxxVar = this.a;
        synchronized (jxxVar.b) {
            jxxVar.a.h();
        }
    }

    @Override // defpackage.gsn
    public final void k() {
        jxx jxxVar = this.a;
        synchronized (jxxVar.b) {
            jxxVar.a.i();
        }
    }
}
