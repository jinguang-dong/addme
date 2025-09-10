package defpackage;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.opengl.Matrix;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ilf implements SensorEventListener {
    public final SensorManager a;
    public final Sensor b;
    public final Sensor c;
    private final hwr d;
    private long e;
    private int f;
    private final float[] g;
    private final float[] h;
    private final float[] i;
    private double j;
    private double k;
    private double l;

    public ilf(SensorManager sensorManager, int i) {
        hwr hwrVarB = hwr.b();
        this.e = 0L;
        this.f = 0;
        float[] fArr = new float[16];
        this.g = fArr;
        this.h = new float[16];
        this.i = new float[16];
        this.j = 0.0d;
        this.k = 0.0d;
        this.l = 0.0d;
        this.d = hwrVarB;
        this.a = sensorManager;
        this.b = sensorManager.getDefaultSensor(1);
        this.c = sensorManager.getDefaultSensor(4);
        float[] fArr2 = new float[16];
        float[] fArr3 = new float[16];
        Matrix.setRotateM(fArr2, 0, 180.0f, 1.0f, 0.0f, 0.0f);
        Matrix.setRotateM(fArr3, 0, i, 0.0f, 0.0f, 1.0f);
        Matrix.multiplyMM(fArr, 0, fArr2, 0, fArr3, 0);
    }

    public final synchronized double a() {
        return this.l;
    }

    public final synchronized double b() {
        return this.j;
    }

    public final synchronized double c() {
        return this.k;
    }

    public final synchronized void d(int i) {
        this.f = i;
        this.d.e();
    }

    public final synchronized void e(float[] fArr) {
        float[] fArr2 = this.i;
        fArr[0] = fArr2[0];
        fArr[1] = fArr2[1];
        fArr[2] = fArr2[2];
        fArr[3] = fArr2[4];
        fArr[4] = fArr2[5];
        fArr[5] = fArr2[6];
        fArr[6] = fArr2[8];
        fArr[7] = fArr2[9];
        fArr[8] = fArr2[10];
    }

    final synchronized void f(float[] fArr, int i, long j) {
        if (this.e == 0) {
            this.d.e();
        }
        this.e = j;
        if (i == 1) {
            this.d.c(fArr, j);
        } else if (i == 4) {
            this.d.d(fArr, j);
        }
        double[] dArrH = this.d.h();
        for (int i2 = 0; i2 < 16; i2++) {
            this.h[i2] = (float) dArrH[i2];
        }
        float[] fArr2 = this.h;
        Matrix.rotateM(fArr2, 0, -90.0f, 1.0f, 0.0f, 0.0f);
        float[] fArr3 = this.i;
        Matrix.multiplyMM(fArr3, 0, this.g, 0, fArr2, 0);
        Matrix.rotateM(fArr3, 0, -this.f, 1.0f, 0.0f, 0.0f);
        if (this.f == 180) {
            Matrix.rotateM(fArr3, 0, 180.0f, 1.0f, 0.0f, 0.0f);
        }
        double d = fArr3[2];
        double d2 = fArr3[10];
        double d3 = 0.0d;
        if (Math.hypot(d, d2) >= 0.1d) {
            double degrees = (-90.0d) - Math.toDegrees(Math.atan2(d2, d));
            if (degrees < 0.0d) {
                degrees += 360.0d;
            }
            d3 = degrees >= 360.0d ? degrees - 360.0d : degrees;
        }
        this.l = d3;
        this.k = Math.toDegrees(Math.asin(fArr3[6]));
        this.j = Math.toDegrees(Math.asin(fArr3[5]));
    }

    @Override // android.hardware.SensorEventListener
    public final void onSensorChanged(SensorEvent sensorEvent) {
        f(sensorEvent.values, sensorEvent.sensor.getType(), sensorEvent.timestamp);
    }

    @Override // android.hardware.SensorEventListener
    public final void onAccuracyChanged(Sensor sensor, int i) {
    }
}
