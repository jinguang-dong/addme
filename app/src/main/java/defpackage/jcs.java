package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class jcs extends ndp {
    final /* synthetic */ hyh a;
    final /* synthetic */ jcv b;

    public jcs(jcv jcvVar, hyh hyhVar) {
        this.a = hyhVar;
        this.b = jcvVar;
    }

    @Override // defpackage.ndp, defpackage.ndo
    public final void a() {
        jcv jcvVar = this.b;
        if (jcvVar.U == null) {
            ((sgt) jcv.a.b().M(2656)).s("Not taking picture because there's no active camera.");
            return;
        }
        if (jcvVar.e()) {
            return;
        }
        jcvVar.K.g();
        if (jcvVar.q.h()) {
            return;
        }
        int i = ((ltw) jcvVar.r.dL()).h;
        if (i > 0) {
            jcvVar.d(i, false);
        } else {
            jcvVar.n();
        }
    }

    @Override // defpackage.ndp, defpackage.ndo
    public final void b(boolean z) {
        jth jthVar;
        if (z || !((Boolean) this.a.b.dL()).booleanValue() || (jthVar = this.b.U) == null) {
            return;
        }
        ((Boolean) ((ovx) jthVar.i().a).d).booleanValue();
    }

    @Override // defpackage.ndp, defpackage.ndo
    public final void c() {
        this.b.Q.K.j();
    }

    @Override // defpackage.ndp, defpackage.ndo
    public final void d() {
        jcv jcvVar = this.b;
        jcvVar.K.e();
        jcvVar.Q.K.i();
    }
}
