package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class jap implements Runnable {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Object c;
    private final /* synthetic */ int d;

    public /* synthetic */ jap(Object obj, boolean z, boolean z2, int i) {
        this.d = i;
        this.c = obj;
        this.a = z;
        this.b = z2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.d != 0) {
            boolean z = this.b;
            ((fqy) this.c).h(this.a, z);
            return;
        }
        jbc jbcVar = (jbc) this.c;
        pbn pbnVar = jbcVar.d;
        pbnVar.f("CaptureModule#takePictureNow#done");
        pbnVar.f(ezh.ai("PhotoPictureTaker#done"));
        jbcVar.ai = null;
        jbcVar.S.a(false);
        iyu iyuVar = jbcVar.an;
        iyuVar.K.f();
        if (this.a) {
            pbnVar.g();
        } else {
            rwc rwcVar = jbcVar.q;
            if (rwcVar.h() && ((Boolean) jbcVar.U.b.dL()).booleanValue()) {
                ((fty) rwcVar.c()).c();
            } else if (this.b) {
                jbcVar.ax.c();
            }
            jbcVar.k(jbcVar.N.e());
            pbnVar.g();
            if (!jbcVar.aB.l()) {
                jbcVar.l.m(true);
            }
            if (rwcVar.h()) {
                ((fty) rwcVar.c()).k();
            }
            rwc rwcVar2 = jbcVar.ag;
            if (rwcVar2.h() && ((hko) rwcVar2.c()).i()) {
                rwc rwcVar3 = jbcVar.r;
                if (rwcVar3.h() && !((Boolean) ((hwb) rwcVar3.c()).c.dL()).booleanValue()) {
                    ((hko) rwcVar2.c()).e();
                }
            }
            jbcVar.v.c();
        }
        jbcVar.ae.a(false);
        jbcVar.I = false;
        jbcVar.aC.j();
        rwc rwcVar4 = jbcVar.aa;
        if (rwcVar4.h()) {
            mgq mgqVar = (mgq) rwcVar4.c();
            nkw nkwVar = iyuVar.p;
            jbcVar.ab.k();
            mgqVar.a();
        }
        pbnVar.g();
    }
}
