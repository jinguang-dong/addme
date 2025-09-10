package defpackage;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.os.SystemClock;
import com.google.android.apps.camera.ui.hotshot.HotshotController;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class jfb implements SensorEventListener {
    final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public jfb(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    @Override // android.hardware.SensorEventListener
    public final void onAccuracyChanged(Sensor sensor, int i) {
        if (this.b != 1) {
            return;
        }
        hlw hlwVar = (hlw) this.a;
        if (hlwVar.e()) {
            hlwVar.onAccuracyChanged(sensor, i);
        }
    }

    @Override // android.hardware.SensorEventListener
    public final void onSensorChanged(SensorEvent sensorEvent) {
        double d;
        int i = this.b;
        if (i == 0) {
            if (sensorEvent.sensor.getType() == 1) {
                jfc jfcVar = (jfc) this.a;
                if (jfcVar.c) {
                    nnh nnhVar = jfcVar.b;
                    nnhVar.a = (sensorEvent.values[0] * 0.15f) + (nnhVar.a * 0.85f);
                    nnhVar.b = (sensorEvent.values[1] * 0.15f) + (nnhVar.b * 0.85f);
                    nnhVar.c = (sensorEvent.values[2] * 0.15f) + (nnhVar.c * 0.85f);
                } else {
                    jfcVar.b.a(sensorEvent.values[0], sensorEvent.values[1], sensorEvent.values[2]);
                    jfcVar.c = true;
                }
                jfcVar.i.c(sensorEvent.values, sensorEvent.timestamp);
                return;
            }
            if (sensorEvent.sensor.getType() == 2) {
                Object obj = this.a;
                float f = sensorEvent.values[0];
                float[] fArr = ((jfc) obj).d;
                fArr[0] = f;
                fArr[1] = sensorEvent.values[1];
                fArr[2] = sensorEvent.values[2];
                return;
            }
            if (sensorEvent.sensor.getType() == 4) {
                float[] fArr2 = sensorEvent.values;
                float f2 = fArr2[0];
                Object obj2 = this.a;
                jfc jfcVar2 = (jfc) obj2;
                float[] fArr3 = jfcVar2.g;
                fArr2[0] = f2 - fArr3[0];
                float[] fArr4 = sensorEvent.values;
                fArr4[1] = fArr4[1] - fArr3[1];
                float[] fArr5 = sensorEvent.values;
                fArr5[2] = fArr5[2] - fArr3[2];
                float f3 = (sensorEvent.values[0] * sensorEvent.values[0]) + (sensorEvent.values[1] * sensorEvent.values[1]) + (sensorEvent.values[2] * sensorEvent.values[2]);
                jfcVar2.l = f3;
                jfk jfkVar = jfcVar2.k;
                if (jfkVar != null) {
                    jfkVar.a(Float.valueOf(f3));
                }
                if (jfcVar2.e != 0) {
                    long j = sensorEvent.timestamp - jfcVar2.e;
                    synchronized (obj2) {
                        float[] fArr6 = ((jfc) obj2).f;
                        float f4 = j * 1.0E-9f;
                        fArr6[0] = fArr6[0] + (sensorEvent.values[0] * f4);
                        fArr6[1] = fArr6[1] + (sensorEvent.values[1] * f4);
                        fArr6[2] = fArr6[2] + (sensorEvent.values[2] * f4);
                        ((jfc) obj2).h++;
                    }
                }
                jfcVar2.e = sensorEvent.timestamp;
                ((jfc) this.a).i.d(sensorEvent.values, sensorEvent.timestamp);
                return;
            }
            return;
        }
        if (i == 1) {
            hlw hlwVar = (hlw) this.a;
            if (hlwVar.e()) {
                hlwVar.onSensorChanged(sensorEvent);
                return;
            }
            return;
        }
        if (i != 2) {
            if (sensorEvent.sensor.getType() == 4) {
                HotshotController hotshotController = (HotshotController) this.a;
                if (!hotshotController.C) {
                    hotshotController.M = false;
                    if (!hotshotController.v.get()) {
                        return;
                    }
                }
                if (SystemClock.elapsedRealtime() - hotshotController.N < 50) {
                    return;
                }
                hotshotController.N = SystemClock.elapsedRealtime();
                float f5 = sensorEvent.values[0];
                float f6 = sensorEvent.values[1];
                float f7 = sensorEvent.values[2];
                boolean z = Math.sqrt((double) (((f5 * f5) + (f6 * f6)) + (f7 * f7))) > 2.5d;
                if (hotshotController.C && !hotshotController.M) {
                    hotshotController.M = z;
                }
                if (hotshotController.v.get() && z) {
                    hotshotController.abortImageCaption();
                    return;
                }
                return;
            }
            return;
        }
        if (sensorEvent.sensor.getType() == 4) {
            float f8 = sensorEvent.values[0];
            float f9 = sensorEvent.values[1];
            float f10 = sensorEvent.values[2];
            Object obj3 = this.a;
            lhk lhkVar = (lhk) obj3;
            double dSqrt = lhkVar.u;
            float f11 = (f8 * f8) + (f9 * f9) + (f10 * f10);
            if (dSqrt == 0.0d) {
                dSqrt = Math.sqrt(f11);
                lhkVar.u = dSqrt;
            }
            lhkVar.v = dSqrt;
            double dSqrt2 = Math.sqrt(f11);
            lhkVar.u = dSqrt2;
            double d2 = dSqrt2 - lhkVar.v;
            Object obj4 = lhkVar.a;
            double dAbs = Math.abs(d2);
            synchronized (obj4) {
                long j2 = ((lhk) obj3).c;
                ((lhk) obj3).c = 1 + j2;
                double[] dArr = ((lhk) obj3).b;
                dArr[((int) j2) % 3] = dAbs;
                d = 0.0d;
                for (int i2 = 0; i2 < 3; i2++) {
                    d += dArr[i2];
                }
            }
            lhk lhkVar2 = (lhk) this.a;
            long millis = TimeUnit.NANOSECONDS.toMillis(sensorEvent.timestamp - lhkVar2.x);
            lhkVar2.w = millis;
            if (millis > 50) {
                lhkVar2.x = sensorEvent.timestamp;
            }
            if (lhkVar2.w <= 50 || d / 3.0d <= 0.014999999664723873d) {
                return;
            }
            if (lhkVar2.f()) {
                lhkVar2.c();
            }
            lhkVar2.u = 0.0d;
            lhkVar2.v = 0.0d;
        }
    }
}
