package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class iyt implements enq {
    final /* synthetic */ iyu a;

    public iyt(iyu iyuVar) {
        this.a = iyuVar;
    }

    private final void d() {
        iyu iyuVar = this.a;
        if (iyuVar.q) {
            return;
        }
        iyuVar.q = true;
        if (iyuVar.t) {
            iyuVar.i("CameraActivityController: Fatal error during onPause!");
        } else {
            iyuVar.c.g();
        }
    }

    @Override // defpackage.enq
    public final void a(int i) {
        ((sgt) iyu.a.b().M(2525)).t("Camera error callback. error=%d", i);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [sgt, shi] */
    @Override // defpackage.enq
    public final void b(RuntimeException runtimeException, String str, int i, int i2) {
        ((sgt) ((sgt) iyu.a.b().i(runtimeException)).M((char) 2526)).s("Camera Exception");
        int i3 = sbp.d;
        mdy mdyVar = this.a.O;
        sbp sbpVar = sex.a;
        mdyVar.t(5, str, runtimeException, i, i2, 0, sbpVar, sbpVar, pbw.CAMERA_ERROR_CODE_UNKNOWN, false);
        d();
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [sgt, shi] */
    @Override // defpackage.enq
    public final void c(RuntimeException runtimeException) {
        ((sgt) ((sgt) iyu.a.b().i(runtimeException)).M((char) 2527)).s("DispatchThread Exception");
        int i = sbp.d;
        mdy mdyVar = this.a.O;
        sbp sbpVar = sex.a;
        mdyVar.t(6, null, runtimeException, -1, -1, 0, sbpVar, sbpVar, pbw.CAMERA_ERROR_CODE_UNKNOWN, false);
        d();
    }
}
