package defpackage;

import android.view.View;
import android.view.contentcapture.ContentCaptureSession;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class nt extends ujn implements uif {
    private final /* synthetic */ int a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nt(Object obj, int i) {
        super(0, obj, nu.class, "updateEnabledCallbacks", "updateEnabledCallbacks()V", 0);
        this.a = i;
    }

    @Override // defpackage.uif
    public final /* synthetic */ Object a() {
        int i = this.a;
        if (i == 0) {
            ((nu) this.e).f();
            return ufg.a;
        }
        if (i == 1) {
            ((nu) this.e).f();
            return ufg.a;
        }
        if (i == 2) {
            return Boolean.valueOf(((afg) this.e).d.e(7));
        }
        if (i == 3) {
            bju bjuVar = (bju) this.e;
            if (bjuVar.f == null || bjuVar.c.c() == bka.d) {
                bjuVar.b.a();
            }
            return ufg.a;
        }
        dbw dbwVar = null;
        if (i == 4) {
            View view = (View) this.e;
            view.setImportantForContentCapture(1);
            ContentCaptureSession contentCaptureSession = view.getContentCaptureSession();
            if (contentCaptureSession == null) {
                return null;
            }
            return new byz(contentCaptureSession, view);
        }
        if (i == 5) {
            bxv bxvVar = (bxv) this.e;
            Class cls = bxv.a;
            bxvVar.v();
            return ufg.a;
        }
        dco dcoVar = (dco) this.e;
        und undVar = dcoVar.b;
        if (undVar == null) {
            ujp.c("coroutineScope");
            undVar = null;
        }
        ung.k(undVar, null);
        cpn cpnVar = dcoVar.b().h;
        dbw dbwVar2 = dcoVar.i;
        if (dbwVar2 == null) {
            ujp.c("connectionManager");
        } else {
            dbwVar = dbwVar2;
        }
        dbwVar.c();
        return ufg.a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nt(Object obj, int i, char[] cArr) {
        super(0, obj, afg.class, "requestFocus", "requestFocus()Z", 0);
        this.a = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nt(Object obj, int i, short[] sArr) {
        super(0, obj, bju.class, "invalidateOwnerFocusState", "invalidateOwnerFocusState()V", 0);
        this.a = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nt(Object obj, int i, int[] iArr) {
        super(0, obj, byi.class, "getContentCaptureSessionCompat", "getContentCaptureSessionCompat(Landroid/view/View;)Landroidx/compose/ui/platform/coreshims/ContentCaptureSessionCompat;", 1);
        this.a = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nt(Object obj, int i, boolean[] zArr) {
        super(0, obj, bxv.class, "onClearFocusForOwner", "onClearFocusForOwner()V", 0);
        this.a = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nt(Object obj, int i, float[] fArr) {
        super(0, obj, dco.class, "onClosed", "onClosed()V", 0);
        this.a = i;
    }
}
