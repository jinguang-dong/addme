package com.google.android.apps.camera.testing.prod;

import android.app.IntentService;
import android.content.Intent;
import defpackage.jea;
import defpackage.mhv;
import defpackage.mhx;
import defpackage.sgt;
import defpackage.sgv;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class ScorePrintService extends IntentService {
    private static final sgv a = sgv.g("com.google.android.apps.camera.testing.prod.ScorePrintService");

    public ScorePrintService() {
        super("CAM_ScorePrintService");
    }

    /* JADX WARN: Type inference failed for: r1v4, types: [java.lang.Object, tzx] */
    @Override // android.app.IntentService
    protected final void onHandleIntent(Intent intent) {
        if (intent == null) {
            ((sgt) a.c().M(4785)).s("No intent is given.");
            return;
        }
        mhx mhxVar = (mhx) ((mhv) getApplication()).h(new jea()).b.a();
        if (mhxVar == null) {
            ((sgt) a.c().M(4784)).s("The service isn't enabled.");
        } else {
            mhxVar.a(intent);
        }
    }
}
