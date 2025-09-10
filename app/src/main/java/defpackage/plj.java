package defpackage;

import android.hardware.Sensor;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes2.dex */
public abstract class plj implements plc {
    public final List a = new ArrayList(6000);
    public int b;
    public final mwq c;
    private final SensorManager d;
    private final Set e;
    private final SensorEventListener f;
    private final Sensor g;

    public plj(SensorManager sensorManager) {
        this.d = sensorManager;
        this.g = sensorManager.getDefaultSensor(a());
        for (int i = 0; i < 6000; i++) {
            this.a.add(new pld(104, 1, a(), 0L, -1L, 0.0f, 0.0f, 0.0f));
        }
        this.b = 0;
        this.f = new pli(this);
        this.e = new HashSet();
        this.c = new mwq(new pat() { // from class: plg
            @Override // defpackage.pat
            public final Object a() {
                return new pld();
            }
        }, 6000);
    }

    private final synchronized void d() {
        this.d.unregisterListener(this.f);
    }

    private final synchronized void e() {
        this.d.registerListener(this.f, this.g, 0);
    }

    @Override // defpackage.plc
    public abstract int a();

    @Override // defpackage.plc
    public final synchronized plb b(String str) {
        plh plhVar;
        Set set = this.e;
        if (set.isEmpty()) {
            e();
        }
        plhVar = new plh(this, str);
        set.add(plhVar);
        return plhVar;
    }

    public final synchronized void c(plb plbVar) {
        Set set = this.e;
        if (set.remove(plbVar) && set.isEmpty()) {
            d();
        }
    }
}
