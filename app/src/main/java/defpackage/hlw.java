package defpackage;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hlw implements hlf, hld, hlc, hlk {
    public final hms a;
    private final hlf b;
    private final hlc c;
    private final hld d;
    private final hlk e;

    public hlw(hms hmsVar, hlf hlfVar, hlc hlcVar, hld hldVar, hlk hlkVar) {
        this.a = hmsVar;
        this.b = hlfVar;
        this.c = hlcVar;
        this.d = hldVar;
        this.e = hlkVar;
    }

    @Override // defpackage.hlc
    public final void a(pdk pdkVar, peo peoVar) {
        this.c.a(pdkVar, peoVar);
    }

    @Override // defpackage.hld
    public final void b() {
        this.d.b();
    }

    @Override // defpackage.hld
    public final void d(pjo pjoVar, fee feeVar) {
        this.d.d(pjoVar, feeVar);
    }

    @Override // defpackage.hlf
    public final boolean e() {
        return this.b.e();
    }

    @Override // defpackage.hlk
    public final Set f() {
        return this.e.f();
    }

    @Override // defpackage.hlk
    public final void g(Sensor sensor) {
        this.e.g(sensor);
    }

    @Override // defpackage.hlk
    public final void h(Sensor sensor) {
        this.e.h(sensor);
    }

    @Override // android.hardware.SensorEventListener
    public final void onAccuracyChanged(Sensor sensor, int i) {
        this.e.onAccuracyChanged(sensor, i);
    }

    @Override // android.hardware.SensorEventListener
    public final void onSensorChanged(SensorEvent sensorEvent) {
        this.e.onSensorChanged(sensorEvent);
    }

    @Override // defpackage.hld
    public final /* synthetic */ void c(pjo pjoVar) {
    }
}
