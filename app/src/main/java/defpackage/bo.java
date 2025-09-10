package defpackage;

import android.os.Handler;
import android.view.View;
import android.view.Window;

/* compiled from: PG */
/* loaded from: classes.dex */
final class bo extends bu implements clw, clx, dc, dd, cxt, nv, oh, deu, cl, cns {
    final /* synthetic */ bp a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bo(bp bpVar) {
        super(bpVar, bpVar, new Handler());
        this.a = bpVar;
    }

    @Override // defpackage.bu, defpackage.br
    public final View a(int i) {
        return this.a.findViewById(i);
    }

    @Override // defpackage.bu, defpackage.br
    public final boolean b() {
        Window window = this.a.getWindow();
        return (window == null || window.peekDecorView() == null) ? false : true;
    }

    @Override // defpackage.bu
    public final void e() {
        this.a.invalidateOptionsMenu();
    }

    @Override // defpackage.oh
    public final og eq() {
        return this.a.h;
    }

    @Override // defpackage.clw
    public final void er(cnh cnhVar) {
        this.a.er(cnhVar);
    }

    @Override // defpackage.clw
    public final void f(cnh cnhVar) {
        this.a.f(cnhVar);
    }

    @Override // defpackage.cwh
    public final cwc getLifecycle() {
        return this.a.d;
    }

    @Override // defpackage.deu
    public final det getSavedStateRegistry() {
        return this.a.getSavedStateRegistry();
    }

    @Override // defpackage.cxt
    public final cxb getViewModelStore$ar$class_merging() {
        return this.a.getViewModelStore$ar$class_merging();
    }

    @Override // defpackage.cl
    public final void g() {
    }
}
