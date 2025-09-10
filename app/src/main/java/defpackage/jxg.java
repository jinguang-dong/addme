package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class jxg extends gsn {
    final /* synthetic */ jxi a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jxg(jxi jxiVar) {
        super((int[]) null);
        this.a = jxiVar;
    }

    @Override // defpackage.gsn
    public final void e() {
        jxi jxiVar = this.a;
        synchronized (jxiVar.e) {
            if (jxiVar.a.p()) {
                jxiVar.b.d();
            }
        }
    }

    @Override // defpackage.gsn
    public final void f() {
        jxi jxiVar = this.a;
        synchronized (jxiVar.e) {
            if (jxiVar.a.q()) {
                jxiVar.b.f();
            }
        }
    }

    @Override // defpackage.gsn
    public final void j() {
        jxi jxiVar = this.a;
        synchronized (jxiVar.e) {
            jxiVar.a.h();
        }
    }

    @Override // defpackage.gsn
    public final void k() {
        jxi jxiVar = this.a;
        synchronized (jxiVar.e) {
            jxiVar.a.i();
        }
    }
}
