package defpackage;

import android.app.ActivityManager;
import android.content.Context;
import android.util.Log;
import java.util.concurrent.Executors;
import java.util.regex.Pattern;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class qxd implements rww {
    private final /* synthetic */ int a;

    public /* synthetic */ qxd(int i) {
        this.a = i;
    }

    @Override // defpackage.rww
    public final Object fr() {
        int i = this.a;
        int i2 = 2;
        if (i == 0) {
            Context context = qxf.a;
            return ske.B(Executors.newSingleThreadScheduledExecutor(new psh(i2)));
        }
        if (i == 1) {
            sgv sgvVar = lsa.a;
            return Pattern.compile("medres-([0-9]+)\\.jpg");
        }
        if (i != 2) {
            throw new IllegalStateException();
        }
        ActivityManager.RunningAppProcessInfo runningAppProcessInfo = new ActivityManager.RunningAppProcessInfo();
        try {
            ActivityManager.getMyMemoryState(runningAppProcessInfo);
            int i3 = runningAppProcessInfo.importance;
        } catch (RuntimeException e) {
            Log.w("PhenotypeProcessReaper", "Failed to retrieve memory state, not killing process.", e);
        }
        boolean z = runningAppProcessInfo.importance >= 400;
        return Boolean.valueOf(z);
    }
}
