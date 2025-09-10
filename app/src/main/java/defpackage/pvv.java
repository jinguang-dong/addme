package defpackage;

import android.util.Log;
import com.google.android.apps.camera.modeldownloader.ModelRefreshBroadcastReceiver;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class pvv implements syf {
    private final /* synthetic */ int a;

    public pvv(int i) {
        this.a = i;
    }

    /* JADX WARN: Type inference failed for: r2v4, types: [sgt, shi] */
    @Override // defpackage.syf
    public final void a(Throwable th) {
        int i = this.a;
        if (i == 0) {
            qbu.i("%s: Failed to commitToFlagSnapshot: %s", "MobileDataDownloadBuilder", th);
        } else if (i != 1) {
            Log.w("GLFence", "Cannot close fence, as there was an error retrieving it.", th);
        } else {
            ((sgt) ((sgt) ModelRefreshBroadcastReceiver.a.b().i(th)).M((char) 3056)).s("Failed to refresh MDD file group populators.");
        }
    }

    @Override // defpackage.syf
    public final /* synthetic */ void b(Object obj) {
        int i = this.a;
        if (i == 0) {
            int i2 = qbu.a;
        } else if (i != 1) {
            ((qjq) obj).close();
        } else {
            ((sgt) ModelRefreshBroadcastReceiver.a.c().M(3057)).s("Successfully refreshed MDD file group populators.");
        }
    }
}
