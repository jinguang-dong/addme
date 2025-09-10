package defpackage;

import android.os.Bundle;
import java.util.Arrays;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class cxf {
    public static final cxx a = new cxe();
    public static final cxx b = new cxe();
    public static final cxx c = new cxe();

    public static final cxb a(cxy cxyVar) {
        deu deuVar = (deu) cxyVar.a(a);
        if (deuVar == null) {
            throw new IllegalArgumentException("CreationExtras must have a value by `SAVED_STATE_REGISTRY_OWNER_KEY`");
        }
        cxt cxtVar = (cxt) cxyVar.a(b);
        if (cxtVar == null) {
            throw new IllegalArgumentException("CreationExtras must have a value by `VIEW_MODEL_STORE_OWNER_KEY`");
        }
        Bundle bundle = (Bundle) cxyVar.a(c);
        String str = (String) cxyVar.a(cxs.a);
        if (str == null) {
            throw new IllegalArgumentException("CreationExtras must have a value by `VIEW_MODEL_KEY`");
        }
        des desVarD = deuVar.getSavedStateRegistry().d();
        Bundle bundle2 = null;
        cxg cxgVar = desVarD instanceof cxg ? (cxg) desVarD : null;
        if (cxgVar == null) {
            throw new IllegalStateException("enableSavedStateHandles() wasn't called prior to createSavedStateHandle() call");
        }
        Map map = b(cxtVar).a;
        cxb cxbVar = (cxb) map.get(str);
        if (cxbVar != null) {
            return cxbVar;
        }
        cxgVar.b();
        Bundle bundle3 = cxgVar.a;
        if (bundle3 != null && bundle3.containsKey(str)) {
            Bundle bundle4 = bundle3.getBundle(str);
            if (bundle4 == null) {
                bundle4 = coe.g((uev[]) Arrays.copyOf(new uev[0], 0));
            }
            bundle3.remove(str);
            if (bundle3.isEmpty()) {
                cxgVar.a = null;
            }
            bundle2 = bundle4;
        }
        cxb cxbVarB = coi.B(bundle2, bundle);
        map.put(str, cxbVarB);
        return cxbVarB;
    }

    public static final cxh b(cxt cxtVar) {
        cxd cxdVar = new cxd();
        cxy cxyVarD = cqh.d(cxtVar);
        cxyVarD.getClass();
        gno gnoVar = new gno(cxtVar.getViewModelStore$ar$class_merging(), cxdVar, cxyVarD);
        int i = ukb.a;
        return (cxh) gnoVar.j(new uji(cxh.class), "androidx.lifecycle.internal.SavedStateHandlesVM");
    }

    public static final void c(deu deuVar) {
        cwb cwbVar = deuVar.getLifecycle().a;
        if (cwbVar != cwb.b && cwbVar != cwb.c) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        if (deuVar.getSavedStateRegistry().d() == null) {
            cxg cxgVar = new cxg(deuVar.getSavedStateRegistry(), (cxt) deuVar);
            deuVar.getSavedStateRegistry().b("androidx.lifecycle.internal.SavedStateHandlesProvider", cxgVar);
            deuVar.getLifecycle().a(new dep(cxgVar, 1));
        }
    }
}
