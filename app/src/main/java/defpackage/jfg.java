package defpackage;

import android.preference.PreferenceManager;
import com.google.android.apps.camera.legacy.lightcycle.storage.LocalSessionStorage;
import com.google.android.apps.lightcycle.panorama.LightCycleNative;
import java.io.File;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class jfg extends Thread {
    final /* synthetic */ LocalSessionStorage a;
    final /* synthetic */ oge b;

    public jfg(LocalSessionStorage localSessionStorage, oge ogeVar) {
        this.a = localSessionStorage;
        this.b = ogeVar;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        if (!new File(this.a.e).exists()) {
            ((sgt) jfh.a.b().M(2720)).s("The storage directory does not exist.");
        }
        oge ogeVar = this.b;
        jxa jxaVar = (jxa) ogeVar.a;
        if (!jxaVar.E) {
            jeu jeuVar = new jeu((LocalSessionStorage) ogeVar.b, jxaVar.X, jxaVar.V, jxaVar.W);
            jeuVar.c(new jwv(ogeVar, jxaVar.k.e, jeuVar));
            jxaVar.P.a(jeuVar);
            return;
        }
        String str = ((LocalSessionStorage) ogeVar.b).e;
        Object obj = jeb.a;
        float fCalibrateFieldOfViewDeg = LightCycleNative.CalibrateFieldOfViewDeg(str);
        if (fCalibrateFieldOfViewDeg > 0.0f) {
            PreferenceManager.getDefaultSharedPreferences(jxaVar.n).edit().putFloat("photoSphereCalibratedFieldOfView", fCalibrateFieldOfViewDeg).apply();
        }
    }
}
