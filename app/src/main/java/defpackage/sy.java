package defpackage;

import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CameraExtensionSession;
import android.hardware.camera2.CaptureRequest;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class sy implements ri {
    private final sz a;
    private final CaptureRequest b;
    private final Map c;
    private final boolean d;
    private final rb e;

    public sy(sz szVar, CaptureRequest captureRequest, Map map, boolean z, rb rbVar) {
        captureRequest.getClass();
        rbVar.getClass();
        this.a = szVar;
        this.b = captureRequest;
        this.c = map;
        this.d = z;
        this.e = rbVar;
    }

    public final rb a() {
        return this.e;
    }

    public final Map b() {
        return this.c;
    }

    @Override // defpackage.ri
    public final Object c(ukx ukxVar) {
        Object objC;
        int i = ukb.a;
        if (a.ao(ukxVar, new uji(CaptureRequest.class))) {
            return this.b;
        }
        if (a.ao(ukxVar, new uji(CameraCaptureSession.class))) {
            Object objC2 = this.a.c(new uji(CameraCaptureSession.class));
            if (objC2 == null) {
                return null;
            }
            return objC2;
        }
        if (!a.ao(ukxVar, new uji(CameraExtensionSession.class)) || (objC = this.a.c(new uji(CameraExtensionSession.class))) == null) {
            return null;
        }
        return objC;
    }

    public final boolean d() {
        return this.d;
    }
}
