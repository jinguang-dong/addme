package defpackage;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ipm implements SensorEventListener {
    public final pau a;
    private final AtomicReference b;
    private final Executor c;

    public ipm(AtomicReference atomicReference, pau pauVar, Executor executor) {
        this.b = atomicReference;
        this.a = pauVar;
        this.c = executor;
    }

    @Override // android.hardware.SensorEventListener
    public final void onAccuracyChanged(Sensor sensor, int i) {
        sensor.getClass();
    }

    @Override // android.hardware.SensorEventListener
    public final void onSensorChanged(SensorEvent sensorEvent) {
        sensorEvent.getClass();
        float[] fArr = sensorEvent.values;
        fArr.getClass();
        if (fArr.length == 0) {
            ((sgt) ipn.a.c().M(2213)).s("Hinge sensor reports zero-length value. Ignoring");
            return;
        }
        float f = sensorEvent.values[0];
        this.b.set(Float.valueOf(f));
        this.c.execute(new jbj(this, f, 1));
    }
}
