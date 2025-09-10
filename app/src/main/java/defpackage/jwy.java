package defpackage;

import android.os.Handler;
import android.os.Message;
import com.google.android.apps.camera.legacy.lightcycle.storage.LocalSessionStorage;
import com.google.android.apps.lightcycle.panorama.LightCycleNative;
import java.lang.ref.WeakReference;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class jwy extends Handler {
    private final WeakReference a;

    public jwy(jxa jxaVar) {
        this.a = new WeakReference(jxaVar);
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        jxa jxaVar = (jxa) this.a.get();
        if (jxaVar == null) {
            return;
        }
        switch (message.what) {
            case 101:
                jxaVar.b();
                return;
            case 102:
            case 103:
                return;
            case 104:
                LocalSessionStorage localSessionStorage = jxaVar.k;
                lta ltaVar = localSessionStorage.b.d;
                if (ltaVar.b()) {
                    String path = ltaVar.a().getPath();
                    long j = jxaVar.P.b / 1000000;
                    boolean z = true;
                    if (!jxaVar.E) {
                        Object obj = jeb.a;
                        if (LightCycleNative.GetNumCapturedTargets() > 0) {
                            z = false;
                        }
                    }
                    int i = (int) j;
                    synchronized (jeb.a) {
                        LightCycleNative.FinishCapture(z, path, path, i);
                        jeb.b = false;
                    }
                    new jfg(localSessionStorage, new oge(jxaVar, localSessionStorage, (char[]) null)).start();
                } else {
                    ((sgt) jxa.a.b().M(3114)).s("Could not create temporary mosaic file. Not able to stitch.");
                }
                jxaVar.H();
                return;
            case 105:
                jxaVar.H();
                return;
            default:
                throw new AssertionError(message.what);
        }
    }
}
