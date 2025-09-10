package defpackage;

import android.os.Bundle;
import java.util.Arrays;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class cxg implements des {
    public Bundle a;
    private final det b;
    private boolean c;
    private final ues d;

    public cxg(det detVar, cxt cxtVar) {
        detVar.getClass();
        this.b = detVar;
        this.d = new uez(new apa(cxtVar, 12));
    }

    private final cxh c() {
        return (cxh) this.d.a();
    }

    @Override // defpackage.des
    public final Bundle a() {
        Bundle bundleG = coe.g((uev[]) Arrays.copyOf(new uev[0], 0));
        Bundle bundle = this.a;
        if (bundle != null) {
            bundleG.putAll(bundle);
        }
        for (Map.Entry entry : c().a.entrySet()) {
            String str = (String) entry.getKey();
            Bundle bundleA = ((cxb) entry.getValue()).a().a();
            if (!bundleA.isEmpty()) {
                dev.a(bundleG, str, bundleA);
            }
        }
        this.c = false;
        return bundleG;
    }

    public final void b() {
        if (this.c) {
            return;
        }
        Bundle bundleA = this.b.a("androidx.lifecycle.internal.SavedStateHandlesProvider");
        Bundle bundleG = coe.g((uev[]) Arrays.copyOf(new uev[0], 0));
        Bundle bundle = this.a;
        if (bundle != null) {
            bundleG.putAll(bundle);
        }
        if (bundleA != null) {
            bundleG.putAll(bundleA);
        }
        this.a = bundleG;
        this.c = true;
        c();
    }
}
