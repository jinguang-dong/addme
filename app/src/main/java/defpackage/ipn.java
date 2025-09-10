package defpackage;

import android.hardware.SensorManager;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ipn implements owf {
    public static final sgv a = sgv.g("ipn");
    public final SensorManager b;
    private final AtomicReference c = new AtomicReference(Float.valueOf(0.0f));

    public ipn(SensorManager sensorManager) {
        this.b = sensorManager;
    }

    @Override // defpackage.owf
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Float dL() {
        Object obj = this.c.get();
        obj.getClass();
        return (Float) obj;
    }

    @Override // defpackage.owf
    public final paq dK(pau pauVar, Executor executor) {
        pauVar.getClass();
        executor.getClass();
        ipm ipmVar = new ipm(this.c, pauVar, executor);
        SensorManager sensorManager = this.b;
        sensorManager.registerListener(ipmVar, sensorManager.getDefaultSensor(36), 3);
        return new hty(this, ipmVar, 8, null);
    }
}
