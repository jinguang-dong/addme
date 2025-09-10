package defpackage;

import android.app.Application;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class cz implements cvw, deu, cxt {
    public cwc a = null;
    public byz b = null;
    private final bm c;
    private final Runnable d;
    private final cxb e;

    public cz(bm bmVar, cxb cxbVar, Runnable runnable) {
        this.c = bmVar;
        this.e = cxbVar;
        this.d = runnable;
    }

    final void a(cwa cwaVar) {
        this.a.b(cwaVar);
    }

    final void b() {
        if (this.a == null) {
            this.a = new cwc(this);
            byz byzVarK = coe.k(this);
            this.b = byzVarK;
            byzVarK.W();
            this.d.run();
        }
    }

    @Override // defpackage.cvw
    public final cxy getDefaultViewModelCreationExtras() {
        Application application;
        bm bmVar = this.c;
        Context applicationContext = bmVar.requireContext().getApplicationContext();
        while (true) {
            if (!(applicationContext instanceof ContextWrapper)) {
                application = null;
                break;
            }
            if (applicationContext instanceof Application) {
                application = (Application) applicationContext;
                break;
            }
            applicationContext = ((ContextWrapper) applicationContext).getBaseContext();
        }
        cxz cxzVar = new cxz();
        if (application != null) {
            cxzVar.b(cxo.b, application);
        }
        cxzVar.b(cxf.a, bmVar);
        cxzVar.b(cxf.b, this);
        Bundle bundle = bmVar.l;
        if (bundle != null) {
            cxzVar.b(cxf.c, bundle);
        }
        return cxzVar;
    }

    @Override // defpackage.cvw
    public final cxp getDefaultViewModelProviderFactory() {
        throw null;
    }

    @Override // defpackage.cwh
    public final cwc getLifecycle() {
        b();
        return this.a;
    }

    @Override // defpackage.deu
    public final det getSavedStateRegistry() {
        b();
        return (det) this.b.a;
    }

    @Override // defpackage.cxt
    public final cxb getViewModelStore$ar$class_merging() {
        b();
        return this.e;
    }
}
