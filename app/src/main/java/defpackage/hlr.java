package defpackage;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes.dex */
final class hlr implements hlk {
    final /* synthetic */ hls a;

    public hlr(hls hlsVar) {
        this.a = hlsVar;
    }

    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Object, java.util.List] */
    @Override // defpackage.hlk
    public final Set f() {
        HashSet hashSet = new HashSet();
        Iterator it = this.a.d.iterator();
        while (it.hasNext()) {
            hashSet.addAll(((hlk) it.next()).f());
        }
        return hashSet;
    }

    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Object, java.util.List] */
    @Override // defpackage.hlk
    public final void g(Sensor sensor) {
        for (hlk hlkVar : this.a.d) {
            if (hlkVar.f().contains(sensor)) {
                hlkVar.g(sensor);
            }
        }
    }

    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Object, java.util.List] */
    @Override // defpackage.hlk
    public final void h(Sensor sensor) {
        for (hlk hlkVar : this.a.d) {
            if (hlkVar.f().contains(sensor)) {
                hlkVar.h(sensor);
            }
        }
    }

    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Object, java.util.List] */
    @Override // android.hardware.SensorEventListener
    public final void onAccuracyChanged(Sensor sensor, int i) {
        for (hlk hlkVar : this.a.d) {
            if (hlkVar.f().contains(sensor)) {
                hlkVar.onAccuracyChanged(sensor, i);
            }
        }
    }

    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Object, java.util.List] */
    @Override // android.hardware.SensorEventListener
    public final void onSensorChanged(SensorEvent sensorEvent) {
        for (hlk hlkVar : this.a.d) {
            if (hlkVar.f().contains(sensorEvent.sensor)) {
                hlkVar.onSensorChanged(sensorEvent);
            }
        }
    }
}
