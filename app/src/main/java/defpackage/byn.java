package defpackage;

import android.content.ComponentCallbacks2;
import android.content.res.Configuration;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class byn implements ComponentCallbacks2 {
    final /* synthetic */ pfl a;

    public byn(pfl pflVar) {
        this.a = pflVar;
    }

    @Override // android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        this.a.w();
    }

    @Override // android.content.ComponentCallbacks
    @ueo
    public final void onLowMemory() {
        this.a.w();
    }

    @Override // android.content.ComponentCallbacks2
    public final void onTrimMemory(int i) {
        this.a.w();
    }
}
