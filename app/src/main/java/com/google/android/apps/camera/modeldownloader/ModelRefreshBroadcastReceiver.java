package com.google.android.apps.camera.modeldownloader;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.google.android.apps.camera.focusindicator.CIAk.YyLACfm;
import defpackage.hbp;
import defpackage.ink;
import defpackage.jsz;
import defpackage.pvv;
import defpackage.sgt;
import defpackage.sgv;
import defpackage.ske;
import defpackage.sxo;
import j$.util.Objects;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class ModelRefreshBroadcastReceiver extends BroadcastReceiver {
    public static final sgv a = sgv.g(YyLACfm.oOkKUYftxQFI);
    public hbp b;

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        ((jsz) ((ink) context.getApplicationContext()).d(jsz.class)).n(this);
        String action = intent.getAction();
        if (Objects.equals(action, "android.intent.action.MY_PACKAGE_REPLACED")) {
            ((sgt) a.c().M(3058)).v("ModelRefreshBroadcastReceiver received %s broadcast.", action);
            ske.W(this.b.o(), new pvv(1), sxo.a);
        }
    }
}
