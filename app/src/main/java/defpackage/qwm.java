package defpackage;

import android.content.Context;
import com.google.android.libraries.performance.primes.transmitter.clearcut.ClearcutMetricSnapshotTransmitter;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class qwm {
    public final Context a;
    public final rww b;
    public final boolean c;
    public final qwi d;
    public final ClearcutMetricSnapshotTransmitter e;

    public qwm(Context context, rwc rwcVar, qwi qwiVar, ClearcutMetricSnapshotTransmitter clearcutMetricSnapshotTransmitter) {
        this.a = context;
        this.b = rnt.y(new nxi(context, 15));
        this.c = ((Boolean) rwcVar.e(false)).booleanValue();
        this.d = qwiVar;
        this.e = clearcutMetricSnapshotTransmitter;
    }
}
