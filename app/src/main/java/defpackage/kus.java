package defpackage;

import android.app.ActivityManager;
import android.net.Uri;
import com.google.android.libraries.performance.primes.transmitter.clearcut.ClearcutMetricSnapshotTransmitter;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class kus implements rww {
    private final /* synthetic */ int a;

    public /* synthetic */ kus(int i) {
        this.a = i;
    }

    @Override // defpackage.rww
    public final Object fr() {
        switch (this.a) {
            case 0:
                return a.af();
            case 1:
                return Uri.parse("asset:/centaur_manifest_config_default_variant.pb");
            case 2:
                return rvk.a;
            case 3:
                int i = qsr.a;
                long j = qsp.b;
                if (j == 0) {
                    synchronized (qsp.class) {
                        j = qsp.b;
                        if (j == 0) {
                            Float.valueOf(60.0f).getClass();
                            long jCeil = (long) Math.ceil(1.0E9d / 60.0f);
                            qsp.b = jCeil;
                            j = jCeil;
                        }
                    }
                }
                return Long.valueOf(j);
            case 4:
                return qtx.a();
            case 5:
                rww rwwVar = ClearcutMetricSnapshotTransmitter.a;
                return Boolean.valueOf(ActivityManager.isUserAMonkey() ? true : ActivityManager.isRunningInUserTestHarness());
            case 6:
                return new uza();
            case 7:
                return new nzj("", 0L);
            default:
                return a.af();
        }
    }
}
