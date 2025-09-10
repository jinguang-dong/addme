package com.google.android.apps.camera.debug.shottracker.db;

import defpackage.dcf;
import defpackage.dcq;
import defpackage.her;
import defpackage.hew;
import defpackage.hex;
import defpackage.hfa;
import defpackage.hfc;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ShotDatabase_Impl extends ShotDatabase {
    private volatile her k;
    private volatile hfa l;

    @Override // defpackage.dco
    protected final dcf a() {
        return new dcf(this, new HashMap(0), new HashMap(0), "shots", "shot_log");
    }

    @Override // defpackage.dco
    protected final /* synthetic */ dcq c() {
        return new hex(this);
    }

    @Override // defpackage.dco
    protected final Map g() {
        HashMap map = new HashMap();
        map.put(her.class, Collections.EMPTY_LIST);
        map.put(hfa.class, Collections.EMPTY_LIST);
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

    @Override // com.google.android.apps.camera.debug.shottracker.db.ShotDatabase
    public final her w() {
        her herVar;
        if (this.k != null) {
            return this.k;
        }
        synchronized (this) {
            if (this.k == null) {
                this.k = new hew(this);
            }
            herVar = this.k;
        }
        return herVar;
    }

    @Override // com.google.android.apps.camera.debug.shottracker.db.ShotDatabase
    public final hfa x() {
        hfa hfaVar;
        if (this.l != null) {
            return this.l;
        }
        synchronized (this) {
            if (this.l == null) {
                this.l = new hfc(this);
            }
            hfaVar = this.l;
        }
        return hfaVar;
    }
}
