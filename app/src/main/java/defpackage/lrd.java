package defpackage;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes.dex */
public class lrd implements SensorEventListener {
    private static final sgv f = sgv.g("lrd");
    public final SensorManager b;
    public final Sensor c;
    public final Sensor d;
    public final Executor e;
    public int a = -1;
    private final float[] g = new float[3];
    private final float[] h = new float[3];
    private final float[] i = new float[16];

    public lrd(SensorManager sensorManager, Executor executor) {
        this.b = sensorManager;
        this.e = executor;
        this.c = sensorManager.getDefaultSensor(1);
        this.d = sensorManager.getDefaultSensor(2);
    }

    @Override // android.hardware.SensorEventListener
    public final void onSensorChanged(SensorEvent sensorEvent) {
        float[] fArr;
        int type = sensorEvent.sensor.getType();
        if (type == 1) {
            fArr = this.g;
        } else {
            if (type != 2) {
                ((sgt) f.c().M(4324)).v("Unexpected sensor type %s", sensorEvent.sensor.getName());
                return;
            }
            fArr = this.h;
        }
        System.arraycopy(sensorEvent.values, 0, fArr, 0, 3);
        float[] fArr2 = this.i;
        SensorManager.getRotationMatrix(fArr2, new float[3], this.g, this.h);
        SensorManager.getOrientation(fArr2, new float[3]);
        int i = ((int) ((r0[0] * 180.0f) / 3.141592653589793d)) % 360;
        this.a = i;
        if (i < 0) {
            this.a = i + 360;
        }
    }

    @Override // android.hardware.SensorEventListener
    public final void onAccuracyChanged(Sensor sensor, int i) {
    }
}
