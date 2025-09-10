package defpackage;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class mji implements SensorEventListener {
    final /* synthetic */ mkr a;
    final /* synthetic */ mjl b;

    public mji(mjl mjlVar, mkr mkrVar) {
        this.a = mkrVar;
        this.b = mjlVar;
    }

    @Override // android.hardware.SensorEventListener
    public final void onSensorChanged(SensorEvent sensorEvent) {
        if (sensorEvent.sensor.getType() == 4) {
            float f = sensorEvent.values[0];
            float f2 = sensorEvent.values[1];
            float f3 = sensorEvent.values[2];
            mjl mjlVar = this.b;
            double dSqrt = mjlVar.J;
            double d = 0.0d;
            float f4 = (f * f) + (f2 * f2) + (f3 * f3);
            if (dSqrt == 0.0d) {
                dSqrt = Math.sqrt(f4);
                mjlVar.J = dSqrt;
            }
            mjlVar.K = dSqrt;
            double dSqrt2 = Math.sqrt(f4);
            mjlVar.J = dSqrt2;
            double d2 = dSqrt2 - mjlVar.K;
            Object obj = mjlVar.b;
            double dAbs = Math.abs(d2);
            synchronized (obj) {
                long j = mjlVar.d;
                mjlVar.d = 1 + j;
                double[] dArr = mjlVar.c;
                dArr[(int) (j % 3)] = dAbs;
                for (int i = 0; i < 3; i++) {
                    d += dArr[i];
                }
            }
            mjl mjlVar2 = this.b;
            long millis = TimeUnit.NANOSECONDS.toMillis(sensorEvent.timestamp - mjlVar2.M);
            mjlVar2.L = millis;
            if (millis > 50) {
                mjlVar2.M = sensorEvent.timestamp;
            }
            if (mjlVar2.L <= 50 || d / 3.0d <= 0.014999999664723873d) {
                return;
            }
            if (((mii) mjlVar2.l.d).equals(mii.STATE_RECORDING)) {
                this.a.q.c();
            }
            mjlVar2.h(true);
            mjlVar2.f();
        }
    }

    @Override // android.hardware.SensorEventListener
    public final void onAccuracyChanged(Sensor sensor, int i) {
    }
}
