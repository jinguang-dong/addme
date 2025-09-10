package defpackage;

import android.app.Application;
import android.os.Bundle;
import java.lang.reflect.Constructor;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class cxi extends cxr implements cxp {
    private Application a;
    private final cxp b;
    private Bundle c;
    private cwc d;
    private det e;

    public cxi() {
        this.b = new cxo();
    }

    @Override // defpackage.cxp
    public final cxm a(Class cls) {
        String canonicalName = cls.getCanonicalName();
        if (canonicalName != null) {
            return d(canonicalName, cls);
        }
        throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
    }

    @Override // defpackage.cxp
    public final cxm b(Class cls, cxy cxyVar) {
        String str = (String) cxyVar.a(cxs.a);
        if (str == null) {
            throw new IllegalStateException("VIEW_MODEL_KEY must always be provided by ViewModelProvider");
        }
        if (cxyVar.a(cxf.a) == null || cxyVar.a(cxf.b) == null) {
            if (this.d != null) {
                return d(str, cls);
            }
            throw new IllegalStateException("SAVED_STATE_REGISTRY_OWNER_KEY andVIEW_MODEL_STORE_OWNER_KEY must be provided in the creation extras tosuccessfully create a ViewModel.");
        }
        Application application = (Application) cxyVar.a(cxo.b);
        boolean zIsAssignableFrom = cvp.class.isAssignableFrom(cls);
        Constructor constructorB = (!zIsAssignableFrom || application == null) ? cxj.b(cls, cxj.b) : cxj.b(cls, cxj.a);
        return constructorB == null ? this.b.b(cls, cxyVar) : (!zIsAssignableFrom || application == null) ? cxj.a(cls, constructorB, cxf.a(cxyVar)) : cxj.a(cls, constructorB, application, cxf.a(cxyVar));
    }

    @Override // defpackage.cxp
    public final cxm c(ukx ukxVar, cxy cxyVar) {
        return b(ske.av(ukxVar), cxyVar);
    }

    public final cxm d(String str, Class cls) throws Exception {
        Application application;
        cwc cwcVar = this.d;
        if (cwcVar == null) {
            throw new UnsupportedOperationException("SavedStateViewModelFactory constructed with empty constructor supports only calls to create(modelClass: Class<T>, extras: CreationExtras).");
        }
        boolean zIsAssignableFrom = cvp.class.isAssignableFrom(cls);
        Constructor constructorB = (!zIsAssignableFrom || this.a == null) ? cxj.b(cls, cxj.b) : cxj.b(cls, cxj.a);
        if (constructorB == null) {
            if (this.a != null) {
                return this.b.a(cls);
            }
            if (cxq.c == null) {
                cxq.c = new cxq();
            }
            cxq.c.getClass();
            return cpe.e(cls);
        }
        det detVar = this.e;
        detVar.getClass();
        cxc cxcVar = new cxc(str, coi.B(detVar.a(str), this.c));
        cxcVar.b(detVar, cwcVar);
        cvz.d(detVar, cwcVar);
        cxm cxmVarA = (!zIsAssignableFrom || (application = this.a) == null) ? cxj.a(cls, constructorB, cxcVar.a) : cxj.a(cls, constructorB, application, cxcVar.a);
        cxmVarA.fd("androidx.lifecycle.savedstate.vm.tag", cxcVar);
        return cxmVarA;
    }

    @Override // defpackage.cxr
    public final void e(cxm cxmVar) throws NoSuchMethodException, SecurityException {
        cwc cwcVar = this.d;
        if (cwcVar != null) {
            det detVar = this.e;
            detVar.getClass();
            cvz.c(cxmVar, detVar, cwcVar);
        }
    }

    public cxi(Application application, deu deuVar, Bundle bundle) {
        cxo cxoVar;
        this.e = deuVar.getSavedStateRegistry();
        this.d = deuVar.getLifecycle();
        this.c = bundle;
        this.a = application;
        if (application != null) {
            if (cxo.a == null) {
                cxo.a = new cxo(application);
            }
            cxoVar = cxo.a;
            cxoVar.getClass();
        } else {
            cxoVar = new cxo();
        }
        this.b = cxoVar;
    }
}
