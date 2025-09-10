package defpackage;

import com.google.android.apps.camera.ui.preference.StorageStatusPreference;
import java.util.concurrent.ScheduledExecutorService;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class mgf {
    public final mgi a;
    public final ScheduledExecutorService b;
    public final out c;
    public StorageStatusPreference d;
    public mgn e;
    public final mgp f;
    public final mdy g;
    public final hbj h;
    private final hkk i;

    public mgf(mgi mgiVar, mgp mgpVar, hkk hkkVar, ScheduledExecutorService scheduledExecutorService, out outVar, mdy mdyVar, hbj hbjVar) {
        this.a = mgiVar;
        this.f = mgpVar;
        this.i = hkkVar;
        this.b = scheduledExecutorService;
        this.c = outVar;
        this.g = mdyVar;
        this.h = hbjVar;
    }

    public final void a() {
        mgn mgnVar = this.e;
        if (mgnVar != null) {
            mgc mgcVarF = this.i.f(mgnVar);
            StorageStatusPreference storageStatusPreference = this.d;
            int i = mgcVarF.a;
            int i2 = mgcVarF.b;
            storageStatusPreference.a = mgnVar.b;
            storageStatusPreference.b = mgnVar.c;
            storageStatusPreference.c = i;
            storageStatusPreference.d = i2;
            storageStatusPreference.a();
        }
    }
}
