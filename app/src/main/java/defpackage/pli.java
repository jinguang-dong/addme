package defpackage;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class pli implements SensorEventListener {
    final /* synthetic */ plj a;
    private long b = 1;

    public pli(plj pljVar) {
        this.a = pljVar;
    }

    @Override // android.hardware.SensorEventListener
    public final void onSensorChanged(SensorEvent sensorEvent) {
        if (sensorEvent.sensor != null) {
            int type = sensorEvent.sensor.getType();
            plj pljVar = this.a;
            if (type == pljVar.a()) {
                float[] fArr = sensorEvent.values;
                synchronized (pljVar) {
                    pld pldVar = (pld) pljVar.a.get(pljVar.b);
                    long j = this.b;
                    this.b = 1 + j;
                    pldVar.d = j;
                    pldVar.e = sensorEvent.timestamp;
                    pldVar.f = fArr[0];
                    pldVar.g = fArr[1];
                    pldVar.h = fArr[2];
                    pljVar.b = (pljVar.b + 1) % 6000;
                }
            }
        }
    }

    @Override // android.hardware.SensorEventListener
    public final void onAccuracyChanged(Sensor sensor, int i) {
    }
}
