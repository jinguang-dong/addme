package defpackage;

import com.google.android.apps.camera.debugui.DebugCanvasView;

/* compiled from: PG */
/* loaded from: classes.dex */
final class hfm extends ojl {
    final /* synthetic */ hfn a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hfm(hfn hfnVar) {
        super((short[]) null);
        this.a = hfnVar;
    }

    @Override // defpackage.ojl
    public final void a(poe poeVar) {
        DebugCanvasView debugCanvasView = this.a.b;
        if (debugCanvasView == null) {
            ((sgt) hfn.a.c().M(1206)).s("UI view not yet initialized");
        } else {
            debugCanvasView.d = false;
        }
    }

    @Override // defpackage.ojl
    public final void dT(pnx pnxVar) {
    }
}
