package defpackage;

import android.os.Bundle;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class jgb implements jgs {
    public final /* synthetic */ Bundle a;
    public final /* synthetic */ jgt b;
    private final /* synthetic */ int c;

    public /* synthetic */ jgb(jgt jgtVar, Bundle bundle, int i) {
        this.c = i;
        this.b = jgtVar;
        this.a = bundle;
    }

    @Override // defpackage.jgs
    public final void a(jhh jhhVar) {
        int i = this.c;
        if (i == 0) {
            if (jhhVar instanceof jfw) {
                jgt.G(jhhVar, this.a);
                ((jfw) jhhVar).a();
                return;
            }
            return;
        }
        if (i != 1) {
            if (jhhVar instanceof jgw) {
                jgt.G(jhhVar, this.a);
                ((jgw) jhhVar).w();
                return;
            }
            return;
        }
        if (jhhVar instanceof fdy) {
            Bundle bundleG = jgt.G(jhhVar, this.a);
            bundleG.getClass();
            fdy fdyVar = (fdy) jhhVar;
            if (bundleG.containsKey("PermissionsCheckerImpl.permissionsRequestCount")) {
                fdyVar.d.addAndGet(bundleG.getInt("PermissionsCheckerImpl.permissionsRequestCount"));
            }
        }
    }
}
