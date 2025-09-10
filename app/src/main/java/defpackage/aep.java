package defpackage;

import androidx.compose.ui.input.pointer.PointerInputEventHandler;

/* compiled from: PG */
/* loaded from: classes.dex */
final class aep implements PointerInputEventHandler {
    final /* synthetic */ aeq a;

    public aep(aeq aeqVar) {
        this.a = aeqVar;
    }

    @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
    public final Object invoke(bqc bqcVar, uhb uhbVar) {
        Object objU = e.u(bqcVar, new cor(this.a, (uhb) null, 1), uhbVar);
        return objU == uhi.a ? objU : ufg.a;
    }
}
