package defpackage;

import android.view.View;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class gwg implements PointerInputEventHandler {
    final /* synthetic */ gwv a;
    final /* synthetic */ azr b;
    final /* synthetic */ Object c;
    private final /* synthetic */ int d;

    public gwg(azr azrVar, gwv gwvVar, View view, int i) {
        this.d = i;
        this.b = azrVar;
        this.a = gwvVar;
        this.c = view;
    }

    @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
    public final Object invoke(bqc bqcVar, uhb uhbVar) {
        if (this.d != 0) {
            Object objU = e.u(bqcVar, new gwf(this.b, this.a, (View) this.c, (uhb) null, 0), uhbVar);
            return objU == uhi.a ? objU : ufg.a;
        }
        Object obj = this.c;
        gwv gwvVar = this.a;
        Object objU2 = e.u(bqcVar, new niw(new aet(gwvVar, obj, 17, null), new gvx(obj, 2), new au(obj, this.b, gwvVar, 8), null, 1, null), uhbVar);
        uhi uhiVar = uhi.a;
        if (objU2 != uhiVar) {
            objU2 = ufg.a;
        }
        return objU2 == uhiVar ? objU2 : ufg.a;
    }

    public gwg(gwv gwvVar, azr azrVar, azr azrVar2, int i) {
        this.d = i;
        this.a = gwvVar;
        this.c = azrVar;
        this.b = azrVar2;
    }
}
