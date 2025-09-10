package defpackage;

import android.graphics.Rect;
import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CameraDevice;
import androidx.coordinatorlayout.widget.pcp.OPuAVreQM;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class elx extends CameraDevice.StateCallback {
    final /* synthetic */ emb a;

    public elx(emb embVar) {
        this.a = embVar;
    }

    @Override // android.hardware.camera2.CameraDevice.StateCallback
    public final void onError(CameraDevice cameraDevice, int i) {
        eny enyVar = emd.a;
        StringBuilder sb = new StringBuilder("Camera device '");
        emb embVar = this.a;
        sb.append(embVar.b);
        sb.append("' encountered error code '");
        sb.append(i);
        sb.append('\'');
        enz.a(enyVar, sb.toString());
        emw emwVar = embVar.a;
        if (emwVar != null) {
            int i2 = embVar.b;
            emwVar.c(i2, embVar.c(i2));
        }
    }

    @Override // android.hardware.camera2.CameraDevice.StateCallback
    public final void onOpened(CameraDevice cameraDevice) throws CameraAccessException {
        emb embVar = this.a;
        embVar.d = cameraDevice;
        if (embVar.a != null) {
            try {
                emd emdVar = embVar.p;
                CameraCharacteristics cameraCharacteristics = emdVar.e.getCameraCharacteristics(embVar.c);
                embVar.e = new elu(emdVar, emdVar, embVar.b, emdVar.b().b(embVar.b), cameraCharacteristics);
                embVar.q = new oyw((byte[]) null);
                embVar.f = (Rect) cameraCharacteristics.get(CameraCharacteristics.SENSOR_INFO_ACTIVE_ARRAY_SIZE);
                embVar.g = ((Integer) cameraCharacteristics.get(CameraCharacteristics.INFO_SUPPORTED_HARDWARE_LEVEL)).intValue() == 2;
                embVar.a(2);
                embVar.a.b(embVar.e);
            } catch (CameraAccessException unused) {
                emb embVar2 = this.a;
                emw emwVar = embVar2.a;
                int i = embVar2.b;
                emwVar.c(i, embVar2.c(i));
            }
        }
    }

    @Override // android.hardware.camera2.CameraDevice.StateCallback
    public final void onDisconnected(CameraDevice cameraDevice) {
        enz.c(emd.a, "Camera device '" + this.a.b + OPuAVreQM.kFIok);
    }
}
