package defpackage;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class lrg implements SensorEventListener {
    final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public lrg(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    @Override // android.hardware.SensorEventListener
    public final void onSensorChanged(SensorEvent sensorEvent) {
        sbp sbpVarJ;
        if (this.b != 0) {
            ((hms) this.a).f(sensorEvent.timestamp, sensorEvent.values);
            return;
        }
        int type = sensorEvent.sensor.getType();
        Object obj = this.a;
        lrh lrhVar = (lrh) obj;
        if (type == lrhVar.c.getType()) {
            float[] fArr = lrhVar.f;
            SensorManager.getRotationMatrixFromVector(fArr, sensorEvent.values);
            float[] fArr2 = lrhVar.g;
            SensorManager.remapCoordinateSystem(fArr, 1, 3, fArr2);
            float[] fArr3 = lrhVar.h;
            SensorManager.getOrientation(fArr2, fArr3);
            float f = (fArr3[0] * 57.29578f) % 360.0f;
            if (f < 0.0f) {
                f += 360.0f;
            }
            float f2 = fArr3[1] * 57.29578f;
            float f3 = (fArr3[2] * 57.29578f) % 360.0f;
            if (f3 < 0.0f) {
                f3 += 360.0f;
            }
            lrf lrfVar = new lrf(f, f2, f3);
            synchronized (lrhVar.e) {
                sbpVarJ = sbp.j(((lrh) obj).i);
            }
            int size = sbpVarJ.size();
            for (int i = 0; i < size; i++) {
                ((lre) sbpVarJ.get(i)).g(lrfVar);
            }
        }
    }

    @Override // android.hardware.SensorEventListener
    public final void onAccuracyChanged(Sensor sensor, int i) {
    }
}
