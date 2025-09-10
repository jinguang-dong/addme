package defpackage;

import android.hardware.camera2.CameraCharacteristics;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hwv {
    public final boolean a;
    public final boolean b;
    public final Object c;

    public hwv(bvm bvmVar, boolean z, boolean z2) {
        this.c = bvmVar;
        this.b = z;
        this.a = z2;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [inu, java.lang.Object] */
    public final synchronized void a(plb plbVar) {
        plbVar.b(this.c.a() + 1, Long.MAX_VALUE, new hwu(this, 0));
    }

    public hwv(inu inuVar, kgw kgwVar, pjo pjoVar) {
        this.c = inuVar;
        this.a = pjoVar.l() == pka.BACK;
        Integer num = (Integer) kgwVar.m(CameraCharacteristics.SENSOR_INFO_TIMESTAMP_SOURCE);
        this.b = num != null && num.equals(1);
    }
}
