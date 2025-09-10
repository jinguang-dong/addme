package defpackage;

import androidx.compose.ui.input.pointer.PointerInputEventHandler;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class bqg implements PointerInputEventHandler, ujl {
    private final /* synthetic */ uiu a;

    public bqg(uiu uiuVar) {
        this.a = uiuVar;
    }

    @Override // defpackage.ujl
    public final uep a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof PointerInputEventHandler) && (obj instanceof ujl)) {
            return a.ao(this.a, ((ujl) obj).a());
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
    public final /* synthetic */ Object invoke(bqc bqcVar, uhb uhbVar) {
        return this.a.a(bqcVar, uhbVar);
    }
}
