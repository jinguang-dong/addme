package defpackage;

import android.opengl.Matrix;
import com.google.android.apps.lightcycle.panorama.LightCycleNative;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class jei extends Thread {
    final /* synthetic */ jej a;

    public jei(jej jejVar) {
        this.a = jejVar;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        synchronized (jeb.a) {
            if (!jeb.b.booleanValue()) {
                throw new IllegalStateException("State is not ready.");
            }
            LightCycleNative.UndoAddImage();
        }
        jej jejVar = this.a;
        jer jerVar = jejVar.d;
        jerVar.a();
        if (jejVar.F.c() == 0) {
            jerVar.d();
            if (jejVar.G == 6) {
                float[] fArr = new float[16];
                Matrix.setIdentityM(fArr, 0);
                jerVar.b(fArr);
            }
            jeq jeqVar = jejVar.h;
            jeqVar.g = false;
            jeqVar.h = false;
            jeqVar.f = 0;
            jejVar.F.F.b = -1.0d;
            jejVar.n = true;
            if (!jejVar.w) {
                jejVar.e.c(jejVar.x);
            }
        }
        if (jejVar.w) {
            jejVar.e.d(true, jejVar.F.n);
        }
    }
}
