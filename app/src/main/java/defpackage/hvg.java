package defpackage;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.opengl.Matrix;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class hvg implements SensorEventListener {
    public final SensorManager a;
    public final Sensor b;
    public final Sensor c;
    private long d;
    private int e;
    private final float[] g;
    private double j;
    private double k;
    private double l;
    private final hwr f = hwr.b();
    private final float[] h = new float[16];
    private final float[] i = new float[16];

    public hvg(SensorManager sensorManager, int i) {
        this.a = sensorManager;
        this.b = sensorManager.getDefaultSensor(1);
        this.c = sensorManager.getDefaultSensor(4);
        float[] fArr = new float[16];
        this.g = fArr;
        float[] fArr2 = new float[16];
        float[] fArr3 = new float[16];
        Matrix.setRotateM(fArr2, 0, 180.0f, 1.0f, 0.0f, 0.0f);
        Matrix.setRotateM(fArr3, 0, i, 0.0f, 0.0f, 1.0f);
        Matrix.multiplyMM(fArr, 0, fArr2, 0, fArr3, 0);
    }

    private final synchronized void c(float[] fArr, int i, long j) {
        if (this.d == 0) {
            this.f.e();
        }
        this.d = j;
        if (i == 1) {
            this.f.c(fArr, j);
        } else if (i == 4) {
            this.f.d(fArr, j);
        }
        double[] dArrH = this.f.h();
        for (int i2 = 0; i2 < 16; i2++) {
            this.h[i2] = (float) dArrH[i2];
        }
        float[] fArr2 = this.h;
        Matrix.rotateM(fArr2, 0, -90.0f, 1.0f, 0.0f, 0.0f);
        float[] fArr3 = this.i;
        Matrix.multiplyMM(fArr3, 0, this.g, 0, fArr2, 0);
        Matrix.rotateM(fArr3, 0, -this.e, 1.0f, 0.0f, 0.0f);
        if (this.e == 180) {
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

    public final synchronized hvf a() {
        return new hvf(this.j, this.l, this.k);
    }

    public final synchronized void b(mxm mxmVar) {
        this.e = mxmVar.e;
        this.f.e();
    }

    @Override // android.hardware.SensorEventListener
    public final void onAccuracyChanged(Sensor sensor, int i) {
        sensor.getClass();
    }

    @Override // android.hardware.SensorEventListener
    public final void onSensorChanged(SensorEvent sensorEvent) {
        sensorEvent.getClass();
        c(sensorEvent.values, sensorEvent.sensor.getType(), sensorEvent.timestamp);
    }
}
