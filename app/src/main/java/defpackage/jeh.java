package defpackage;

import android.os.Handler;
import android.os.SystemClock;
import com.google.android.apps.lightcycle.panorama.LightCycleNative;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class jeh implements emu {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public jeh(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    @Override // defpackage.emu
    public final void a(boolean z, ena enaVar) {
        if (this.b != 0) {
            ((Handler) ((as) this.a).c).post(new fie(this, z, enaVar, 1));
            return;
        }
        jej jejVar = (jej) this.a;
        jeq jeqVar = jejVar.h;
        jfc jfcVar = jeqVar.b;
        if (jfcVar != null) {
            jfcVar.b();
            jfcVar.e();
            jeqVar.c = SystemClock.elapsedRealtimeNanos();
            float f = jfcVar.j;
            Object obj = jeb.a;
            LightCycleNative.StartGyroCalibration(f);
            jeqVar.g = true;
            jeqVar.h = false;
        }
        jejVar.v = false;
    }
}
