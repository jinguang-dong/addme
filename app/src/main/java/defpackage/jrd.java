package defpackage;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class jrd implements SensorEventListener, hld, png {
    public final SensorManager a;
    public final nnm b;
    public rwc c;
    public final pnk d;
    public final hms e;
    public final hms f;
    private final nng g;
    private final Sensor h;
    private final Sensor i;
    private final Executor j;
    private final pbn k;
    private final float[] l;
    private int m;
    private rwc n;

    public jrd(pnk pnkVar, SensorManager sensorManager, nnm nnmVar, hms hmsVar, hms hmsVar2, Executor executor, pbn pbnVar) {
        rvk rvkVar = rvk.a;
        this.c = rvkVar;
        this.m = 0;
        this.n = rvkVar;
        this.a = sensorManager;
        this.b = nnmVar;
        this.d = pnkVar;
        this.e = hmsVar;
        this.f = hmsVar2;
        this.j = executor;
        this.k = pbnVar;
        this.l = new float[3];
        this.g = new nng();
        this.h = sensorManager.getDefaultSensor(1);
        this.i = sensorManager.getDefaultSensor(4);
        sensorManager.getDefaultSensor(15);
        gzg gzgVar = gyy.a;
    }

    private final synchronized paq g() {
        Sensor sensor = this.h;
        SensorManager sensorManager = this.a;
        sensorManager.registerListener(this, sensor, 1);
        sensorManager.registerListener(this, this.i, 1);
        this.d.b(this);
        return new iew(this, 13);
    }

    private final synchronized void h(pjo pjoVar) {
        this.b.c(pjoVar);
        this.c = rvk.a;
    }

    @Override // defpackage.hld
    public final synchronized void b() {
        int i = this.m - 1;
        this.m = i;
        if (i == 0) {
            this.b.b();
            if (this.n.h()) {
                ((our) this.n.c()).close();
                this.n = rvk.a;
            }
        }
    }

    @Override // defpackage.hld
    public final synchronized void c(pjo pjoVar) {
        h(pjoVar);
        if (this.m == 0) {
            rnt.L(!this.n.h());
            our ourVar = new our();
            ourVar.d(g());
            this.n = rwc.j(ourVar);
        }
        this.m++;
    }

    @Override // defpackage.hld
    public final /* synthetic */ void d(pjo pjoVar, fee feeVar) {
        hgc.g(this, pjoVar);
    }

    public final synchronized void e() {
        double degrees;
        int i = this.d.a().e;
        float[] fArrG = this.b.g();
        float degrees2 = (float) Math.toDegrees(Math.asin(fArrG[6]));
        if (i == 90) {
            degrees = Math.toDegrees(Math.asin(-fArrG[5]));
        } else if (i == 180) {
            degrees = Math.toDegrees(Math.asin(-fArrG[4]));
        } else {
            degrees = -(i == 270 ? Math.toDegrees(Math.asin(-fArrG[5])) : Math.toDegrees(Math.asin(-fArrG[4])));
        }
        this.f.f(((Long) this.c.c()).longValue(), i, degrees2, (float) degrees);
    }

    public final synchronized void f() {
        float[] fArrG = this.b.g();
        double d = fArrG[0];
        double d2 = fArrG[5];
        double d3 = fArrG[10];
        double d4 = d + 1.0d;
        double dSqrt = Math.sqrt(Math.max(0.0d, d4 + d2 + d3)) * 0.5d;
        nng nngVar = this.g;
        nngVar.d = dSqrt;
        nngVar.a = Math.sqrt(Math.max(0.0d, (d4 - d2) - d3)) * 0.5d;
        double d5 = 1.0d - d;
        nngVar.b = Math.sqrt(Math.max(0.0d, (d5 + d2) - d3)) * 0.5d;
        double dSqrt2 = Math.sqrt(Math.max(0.0d, (d5 - d2) + d3)) * 0.5d;
        float f = fArrG[6] - fArrG[9];
        double d6 = nngVar.a;
        if ((f < 0.0f) != (d6 < 0.0d)) {
            d6 = -d6;
        }
        nngVar.a = d6;
        boolean z = fArrG[8] - fArrG[2] < 0.0f;
        double d7 = nngVar.b;
        if (z != (d7 < 0.0d)) {
            d7 = -d7;
        }
        nngVar.b = d7;
        if ((fArrG[1] - fArrG[4] < 0.0f) != (dSqrt2 < 0.0d)) {
            dSqrt2 = -dSqrt2;
        }
        nngVar.c = dSqrt2;
        float[] fArr = this.l;
        ojl.bd(nngVar, fArr);
        this.e.f(((Long) this.c.c()).longValue(), fArr);
    }

    @Override // android.hardware.SensorEventListener
    public final void onSensorChanged(SensorEvent sensorEvent) {
        this.j.execute(this.k.c("CameraPoseFeatureExtractor:onSensorChanged", new img(this, sensorEvent, 13, null)));
    }

    @Override // defpackage.png
    public final void a(pao paoVar) {
    }

    @Override // android.hardware.SensorEventListener
    public final void onAccuracyChanged(Sensor sensor, int i) {
    }
}
