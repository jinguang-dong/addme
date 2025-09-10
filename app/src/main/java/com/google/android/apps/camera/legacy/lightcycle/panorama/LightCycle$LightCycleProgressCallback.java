package com.google.android.apps.camera.legacy.lightcycle.panorama;

import com.google.android.apps.camera.legacy.lightcycle.storage.LocalSessionStorage;
import defpackage.jea;
import defpackage.jeb;
import defpackage.jet;
import defpackage.jeu;
import defpackage.par;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class LightCycle$LightCycleProgressCallback {
    private LightCycle$LightCycleProgressCallback() {
    }

    public static void onProgress(int i, int i2) {
        Map map = jeb.c;
        Integer numValueOf = Integer.valueOf(i);
        if (map.containsKey(numValueOf)) {
            jet jetVar = (jet) map.get(numValueOf);
            jeu jeuVar = jetVar.d;
            AtomicBoolean atomicBoolean = jeuVar.b;
            synchronized (atomicBoolean) {
                if (atomicBoolean.get()) {
                    return;
                }
                LocalSessionStorage localSessionStorage = jeuVar.a;
                localSessionStorage.b.c(par.c(i2));
                long length = jetVar.c.length();
                if (length != jetVar.a) {
                    localSessionStorage.b.O();
                    jetVar.a = length;
                }
                jeuVar.h();
            }
        }
    }

    public /* synthetic */ LightCycle$LightCycleProgressCallback(jea jeaVar) {
        this();
    }
}
