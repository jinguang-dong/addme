package defpackage;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import java.util.Collections;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hlm implements hlk {
    final /* synthetic */ Sensor a;
    final /* synthetic */ SensorEventListener b;

    public hlm(Sensor sensor, SensorEventListener sensorEventListener) {
        this.a = sensor;
        this.b = sensorEventListener;
    }

    @Override // defpackage.hlk
    public final Set f() {
        return Collections.singleton(this.a);
    }

    @Override // android.hardware.SensorEventListener
    public final void onSensorChanged(SensorEvent sensorEvent) {
        this.b.onSensorChanged(sensorEvent);
    }

    @Override // defpackage.hlk
    public final void g(Sensor sensor) {
    }

    @Override // defpackage.hlk
    public final void h(Sensor sensor) {
    }

    @Override // android.hardware.SensorEventListener
    public final void onAccuracyChanged(Sensor sensor, int i) {
    }
}
