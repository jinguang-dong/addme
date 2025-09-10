package defpackage;

import android.content.ComponentCallbacks2;
import android.content.res.Configuration;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bym implements ComponentCallbacks2 {
    final /* synthetic */ Configuration a;
    final /* synthetic */ ocq b;

    public bym(Configuration configuration, ocq ocqVar) {
        this.a = configuration;
        this.b = ocqVar;
    }

    @Override // android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        ocq ocqVar = this.b;
        Configuration configuration2 = this.a;
        int iUpdateFrom = configuration2.updateFrom(configuration);
        Iterator it = ((HashMap) ocqVar.a).entrySet().iterator();
        while (it.hasNext()) {
            caq caqVar = (caq) ((WeakReference) ((Map.Entry) it.next()).getValue()).get();
            if (caqVar == null || Configuration.needNewResources(iUpdateFrom, caqVar.b)) {
                it.remove();
            }
        }
        configuration2.setTo(configuration);
    }

    @Override // android.content.ComponentCallbacks
    @ueo
    public final void onLowMemory() {
        this.b.av();
    }

    @Override // android.content.ComponentCallbacks2
    public final void onTrimMemory(int i) {
        this.b.av();
    }
}
