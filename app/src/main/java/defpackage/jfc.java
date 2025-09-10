package defpackage;

import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.opengl.Matrix;
import android.os.HandlerThread;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class jfc {
    public HandlerThread n;
    public final fpy p;
    public SensorManager a = null;
    public final nnh b = new nnh();
    public boolean c = false;
    public final float[] d = new float[3];
    public long e = 0;
    public final float[] f = new float[3];
    public final float[] g = {0.0f, 0.0f, 0.0f};
    public int h = 0;
    public final hwr i = hwr.b();
    private final float[] q = new float[16];
    public float j = 90.0f;
    public jfk k = null;
    public float l = 0.0f;
    public boolean m = false;
    private double[] r = new double[16];
    public final SensorEventListener o = new jfb(this, 0);

    public jfc(fpy fpyVar) {
        this.p = fpyVar;
    }

    public final double a() {
        return this.i.a();
    }

    public final void b() {
        Arrays.fill(this.g, 0.0f);
    }

    public final void c(double d) {
        if (d < 0.0d) {
            d += 360.0d;
        }
        if (d > 360.0d) {
            d -= 360.0d;
        }
        this.i.f(d);
    }

    public final void d() {
        this.m = false;
        HandlerThread handlerThread = this.n;
        if (handlerThread != null) {
            handlerThread.quit();
        }
        this.n = null;
        SensorManager sensorManager = this.a;
        if (sensorManager != null) {
            sensorManager.unregisterListener(this.o);
        }
    }

    public final float[] e() {
        float[] fArr;
        synchronized (this) {
            float[] fArr2 = this.f;
            fArr = (float[]) fArr2.clone();
            fArr2[0] = 0.0f;
            fArr2[1] = 0.0f;
            fArr2[2] = 0.0f;
            this.h = 0;
        }
        return fArr;
    }

    public final float[] f() {
        hwr hwrVar = this.i;
        if (hwrVar.g()) {
            this.r = hwrVar.h();
        }
        float[] fArr = new float[16];
        for (int i = 0; i < 16; i++) {
            fArr[i] = (float) this.r[i];
        }
        Matrix.rotateM(fArr, 0, 90.0f, 1.0f, 0.0f, 0.0f);
        float[] fArr2 = new float[16];
        Matrix.setIdentityM(fArr2, 0);
        Matrix.rotateM(fArr2, 0, this.j, 0.0f, 0.0f, 1.0f);
        float[] fArr3 = this.q;
        Matrix.multiplyMM(fArr3, 0, fArr2, 0, fArr, 0);
        return fArr3;
    }
}
