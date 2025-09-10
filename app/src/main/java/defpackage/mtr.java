package defpackage;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.os.Vibrator;

/* compiled from: PG */
/* loaded from: classes.dex */
final class mtr implements SensorEventListener {
    final /* synthetic */ owf a;
    final /* synthetic */ Vibrator b;
    final /* synthetic */ fvu c;
    final /* synthetic */ mts d;

    public mtr(mts mtsVar, owf owfVar, Vibrator vibrator, fvu fvuVar) {
        this.a = owfVar;
        this.b = vibrator;
        this.c = fvuVar;
        this.d = mtsVar;
    }

    @Override // android.hardware.SensorEventListener
    public final void onSensorChanged(SensorEvent sensorEvent) {
        if (((Boolean) this.a.dL()).booleanValue()) {
            long[] jArr = mts.a;
            return;
        }
        this.d.b.z = 2;
        Vibrator vibrator = this.b;
        if (vibrator.hasVibrator()) {
            vibrator.vibrate(mts.a, -1);
        }
        this.c.x();
    }

    @Override // android.hardware.SensorEventListener
    public final void onAccuracyChanged(Sensor sensor, int i) {
    }
}
