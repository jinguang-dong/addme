package defpackage;

import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class fpx implements enq {
    final /* synthetic */ fpy a;

    public fpx(fpy fpyVar) {
        this.a = fpyVar;
    }

    @Override // defpackage.enq
    public final void a(int i) {
        ((sgt) fpy.a.c().M(308)).s("cameraExceptionCallback.onCameraError");
        Iterator it = this.a.g.iterator();
        while (it.hasNext()) {
            ((enr) it.next()).a(i);
        }
    }

    @Override // defpackage.enq
    public final void b(RuntimeException runtimeException, String str, int i, int i2) {
        ((sgt) fpy.a.c().M(309)).s("cameraExceptionCallback.onCameraException");
        Iterator it = this.a.g.iterator();
        while (it.hasNext()) {
            ((enr) it.next()).b(runtimeException, str, i, i2);
        }
    }

    @Override // defpackage.enq
    public final void c(RuntimeException runtimeException) {
        ((sgt) fpy.a.c().M(310)).s("cameraExceptionCallback.onDispatchThreadException");
        Iterator it = this.a.g.iterator();
        while (it.hasNext()) {
            ((enr) it.next()).c(runtimeException);
        }
    }
}
