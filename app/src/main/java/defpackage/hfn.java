package defpackage;

import com.google.android.apps.camera.debugui.DebugCanvasView;

/* compiled from: PG */
/* loaded from: classes.dex */
public class hfn {
    public static final sgv a = sgv.g("hfn");
    public DebugCanvasView b;
    public final ojl c;
    private final hbj d;

    public hfn(hbj hbjVar) {
        this.d = hbjVar;
        int i = gyt.a;
        this.c = new hfm(this);
    }

    public final void a(DebugCanvasView debugCanvasView) {
        this.b = debugCanvasView;
        if (debugCanvasView != null) {
            debugCanvasView.setVisibility(4);
        }
    }

    public final void b() {
        int i = gyt.a;
    }

    public final void c() {
        DebugCanvasView debugCanvasView = this.b;
        if (debugCanvasView == null) {
            ((sgt) a.c().M(1229)).s("UI view not yet initialized");
        } else {
            debugCanvasView.setVisibility(4);
        }
    }
}
