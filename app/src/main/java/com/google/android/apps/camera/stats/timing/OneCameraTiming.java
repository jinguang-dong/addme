package com.google.android.apps.camera.stats.timing;

import defpackage.meq;
import defpackage.mex;
import defpackage.pbn;
import defpackage.pbp;
import defpackage.pql;

/* compiled from: PG */
/* loaded from: classes.dex */
public class OneCameraTiming extends mex {
    public final pbn a;
    public pbp b;

    public OneCameraTiming(pql pqlVar, pbn pbnVar) {
        super(pqlVar, meq.values());
        this.b = pbp.a;
        this.a = pbnVar;
    }

    public long getOneCameraCreateNs() {
        return i(meq.ONECAMERA_CREATE);
    }

    public long getOneCameraCreatedNs() {
        return i(meq.ONECAMERA_CREATED);
    }
}
