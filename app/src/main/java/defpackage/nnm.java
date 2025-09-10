package defpackage;

import android.hardware.SensorEvent;
import android.opengl.Matrix;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class nnm {
    private final pbn b;
    private final float[] c = new float[16];
    private final float[] d = new float[16];
    private boolean e = false;
    private boolean f = false;
    private boolean g = false;
    private final float[] h = new float[16];
    private final ovx i = new ovx(Optional.empty());
    private final hwr a = hwr.b();

    public nnm(pbn pbnVar) {
        this.b = pbnVar;
        gzg gzgVar = gyy.a;
    }

    private final synchronized void h() {
        pbn pbnVar = this.b;
        pbnVar.f("CameraPoseUtils#updateCameraPose");
        hwr hwrVar = this.a;
        double[] dArrH = hwrVar.h();
        int i = 0;
        for (int i2 = 0; i2 < 16; i2++) {
            if (Double.isNaN(dArrH[i2])) {
                hwrVar.e();
                return;
            }
            this.c[i2] = (float) dArrH[i2];
        }
        float[] fArr = this.c;
        Matrix.rotateM(fArr, 0, -90.0f, 1.0f, 0.0f, 0.0f);
        Matrix.multiplyMM(this.d, 0, this.h, 0, fArr, 0);
        float[] fArrG = g();
        float fAsin = (float) Math.asin(fArrG[5]);
        float f = (float) (-Math.asin(fArrG[4]));
        if (Math.abs(fAsin) <= Math.abs(f)) {
            if (Math.abs(fAsin) >= Math.abs(f)) {
                this.i.a(Optional.empty());
                this.e = this.f;
                pbnVar.g();
            }
            i = f < 0.0f ? 90 : 270;
        } else if (fAsin < 0.0f) {
            i = 180;
        }
        this.i.a(Optional.of(pao.b(i)));
        this.e = this.f;
        pbnVar.g();
    }

    public final owf a() {
        return owb.a(this.i);
    }

    public final synchronized void b() {
        this.a.e();
        this.g = false;
    }

    public final synchronized void c(pjo pjoVar) {
        this.f = pjoVar.l() == pka.FRONT;
        this.g = true;
        Matrix.setRotateM(this.h, 0, 180.0f, 1.0f, 0.0f, 0.0f);
        if (this.a.g()) {
            h();
        }
    }

    public final synchronized boolean d() {
        return this.e;
    }

    public final synchronized boolean e() {
        return this.g;
    }

    public final synchronized boolean f(SensorEvent sensorEvent) {
        if (this.g) {
            sensorEvent.sensor.getType();
            if (sensorEvent.sensor.getType() == 1) {
                pbn pbnVar = this.b;
                pbnVar.f("CameraPoseUtils#SENSOR_ACCELEROMETER");
                this.a.c((float[]) sensorEvent.values.clone(), sensorEvent.timestamp);
                pbnVar.g();
            } else if (sensorEvent.sensor.getType() == 4) {
                pbn pbnVar2 = this.b;
                pbnVar2.f("CameraPoseUtils#SENSOR_GYROSCOPE");
                this.a.d((float[]) sensorEvent.values.clone(), sensorEvent.timestamp);
                pbnVar2.g();
            }
            if (this.a.g()) {
                h();
                return true;
            }
        }
        return false;
    }

    public final synchronized float[] g() {
        return this.d;
    }
}
