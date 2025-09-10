package defpackage;

import android.hardware.Sensor;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.os.Handler;
import android.os.HandlerThread;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class jfa extends HandlerThread {
    Handler a;
    final /* synthetic */ jfc b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jfa(jfc jfcVar) {
        super("sensor thread");
        this.b = jfcVar;
        this.a = null;
    }

    @Override // android.os.HandlerThread
    protected final void onLooperPrepared() {
        this.a = new Handler(getLooper());
        jfc jfcVar = this.b;
        SensorManager sensorManager = jfcVar.a;
        Sensor defaultSensor = sensorManager.getDefaultSensor(1);
        SensorEventListener sensorEventListener = jfcVar.o;
        sensorManager.registerListener(sensorEventListener, defaultSensor, 1, this.a);
        SensorManager sensorManager2 = jfcVar.a;
        sensorManager2.registerListener(sensorEventListener, sensorManager2.getDefaultSensor(4), 1, this.a);
        SensorManager sensorManager3 = jfcVar.a;
        sensorManager3.registerListener(sensorEventListener, sensorManager3.getDefaultSensor(2), 3, this.a);
    }
}
