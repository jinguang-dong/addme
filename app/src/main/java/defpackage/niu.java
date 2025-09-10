package defpackage;

import android.view.View;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class niu implements PointerInputEventHandler {
    final /* synthetic */ azr a;
    final /* synthetic */ nhy b;
    final /* synthetic */ View c;
    final /* synthetic */ azr d;
    final /* synthetic */ gox e;

    public niu(azr azrVar, gox goxVar, nhy nhyVar, View view, azr azrVar2) {
        this.a = azrVar;
        this.e = goxVar;
        this.b = nhyVar;
        this.c = view;
        this.d = azrVar2;
    }

    @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
    public final Object invoke(bqc bqcVar, uhb uhbVar) throws Throwable {
        Object objE = ajq.e(bqcVar, ajq.a, new htq(this.a, this.e, bqcVar, this.b, this.c, this.d, 2), uhbVar);
        return objE == uhi.a ? objE : ufg.a;
    }
}
