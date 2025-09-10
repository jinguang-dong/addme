package defpackage;

import android.hardware.camera2.CameraExtensionSession;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ru extends CameraExtensionSession.StateCallback {
    private final ta a;
    private final Executor b;
    private final umb c;
    private final umb d;
    private final tq e;
    private final byz f;

    public ru(ta taVar, tq tqVar, up upVar, byz byzVar, Executor executor) {
        this.a = taVar;
        this.e = tqVar;
        this.f = byzVar;
        this.b = executor;
        umc umcVar = umc.a;
        this.c = new umb(upVar, umcVar);
        this.d = new umb(null, umcVar);
    }

    private final void a() {
        up upVar = (up) this.c.a(null);
        if (upVar != null) {
            upVar.g();
        }
    }

    private final void b() throws Exception {
        a();
        this.e.g();
    }

    private final ro c(CameraExtensionSession cameraExtensionSession, byz byzVar) {
        umb umbVar = this.d;
        ro roVar = (ro) umbVar.a;
        if (roVar != null) {
            return roVar;
        }
        ro roVar2 = new ro(this.a, cameraExtensionSession, byzVar, this.b);
        if (umbVar.d(null, roVar2)) {
            return roVar2;
        }
        Object obj = umbVar.a;
        obj.getClass();
        return (ro) obj;
    }

    @Override // android.hardware.camera2.CameraExtensionSession.StateCallback
    public final void onClosed(CameraExtensionSession cameraExtensionSession) throws Exception {
        cameraExtensionSession.getClass();
        c(cameraExtensionSession, this.f);
        this.e.a.j();
        b();
    }

    @Override // android.hardware.camera2.CameraExtensionSession.StateCallback
    public final void onConfigureFailed(CameraExtensionSession cameraExtensionSession) throws Exception {
        cameraExtensionSession.getClass();
        c(cameraExtensionSession, this.f);
        this.e.a.k();
        b();
    }

    @Override // android.hardware.camera2.CameraExtensionSession.StateCallback
    public final void onConfigured(CameraExtensionSession cameraExtensionSession) {
        cameraExtensionSession.getClass();
        this.e.a.e(c(cameraExtensionSession, this.f));
        a();
    }
}
