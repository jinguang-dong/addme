package com.google.android.apps.camera.camerafatalerror;

import com.google.android.apps.camera.jni.saliency.tLp.KsvNaXS;
import defpackage.dcf;
import defpackage.dcq;
import defpackage.gom;
import defpackage.got;
import defpackage.gox;
import defpackage.gpb;
import defpackage.gpe;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class CameraFatalErrorTrackerDatabase_Impl extends CameraFatalErrorTrackerDatabase {
    private volatile gox k;
    private volatile got l;
    private volatile gpb m;

    @Override // defpackage.dco
    protected final /* synthetic */ dcq c() {
        return new gom(this);
    }

    @Override // defpackage.dco
    protected final Map g() {
        HashMap map = new HashMap();
        map.put(gox.class, Collections.EMPTY_LIST);
        map.put(got.class, Collections.EMPTY_LIST);
        map.put(gpb.class, Collections.EMPTY_LIST);
        return map;
    }

    @Override // defpackage.dco
    public final Set h() {
        return new HashSet();
    }

    @Override // defpackage.dco
    public final List u() {
        return new ArrayList();
    }

    @Override // com.google.android.apps.camera.camerafatalerror.CameraFatalErrorTrackerDatabase
    public final got w() {
        got gotVar;
        if (this.l != null) {
            return this.l;
        }
        synchronized (this) {
            if (this.l == null) {
                this.l = new got(this);
            }
            gotVar = this.l;
        }
        return gotVar;
    }

    @Override // com.google.android.apps.camera.camerafatalerror.CameraFatalErrorTrackerDatabase
    public final gox x() {
        gox goxVar;
        if (this.k != null) {
            return this.k;
        }
        synchronized (this) {
            if (this.k == null) {
                this.k = new gox(this);
            }
            goxVar = this.k;
        }
        return goxVar;
    }

    @Override // com.google.android.apps.camera.camerafatalerror.CameraFatalErrorTrackerDatabase
    public final gpb y() {
        gpb gpbVar;
        if (this.m != null) {
            return this.m;
        }
        synchronized (this) {
            if (this.m == null) {
                this.m = new gpe(this);
            }
            gpbVar = this.m;
        }
        return gpbVar;
    }

    @Override // defpackage.dco
    protected final dcf a() {
        return new dcf(this, new HashMap(0), new HashMap(0), "FatalErrorCounts", KsvNaXS.dBkkgwwWSTopFT, "HardwareHelpDialogCounts");
    }
}
