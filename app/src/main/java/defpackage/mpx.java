package defpackage;

import android.os.Handler;
import android.view.Window;
import android.view.WindowManager;
import com.google.android.apps.camera.ui.gridlines.GridLinesUi;
import com.google.android.apps.camera.ui.wirers.PreviewOverlay;
import com.google.ar.core.R;
import org.chromium.net.UrlRequest;

/* compiled from: PG */
/* loaded from: classes.dex */
public class mpx extends mpg {
    public final owq a;
    public final fvu b;
    public final mzz c;
    public final hyf d;
    public final lra e;
    public final ffq f;
    public final uem g;
    public final gnt h;
    public final nas i;
    public final int j;
    public pka k;
    public pka l;
    public final hbj m;
    private final Window n;
    private final ndj o;
    private final mts p;
    private final Handler q;
    private final uem r;

    public mpx(owq owqVar, uem uemVar, Window window, fvu fvuVar, ndj ndjVar, mzz mzzVar, mts mtsVar, hyf hyfVar, lra lraVar, Handler handler, ffq ffqVar, uem uemVar2, gnt gntVar, nas nasVar, hbj hbjVar) {
        this.a = owqVar;
        this.n = window;
        this.b = fvuVar;
        this.o = ndjVar;
        this.j = window.getAttributes().rotationAnimation;
        this.c = mzzVar;
        this.p = mtsVar;
        this.d = hyfVar;
        this.e = lraVar;
        this.q = handler;
        this.f = ffqVar;
        this.g = uemVar2;
        this.h = gntVar;
        this.i = nasVar;
        this.r = uemVar;
        this.m = hbjVar;
    }

    public final void A(nkw nkwVar) {
        nkw nkwVar2 = nkw.UNINITIALIZED;
        switch (nkwVar.ordinal()) {
            case 1:
                n();
                break;
            case 2:
                r();
                break;
            case 3:
                m();
                break;
            case 4:
                h();
                break;
            case 5:
                p();
                break;
            case 6:
                o();
                break;
            case 10:
                l();
                break;
            case 11:
                q();
                break;
            case 13:
                t();
                break;
            case UrlRequest.Status.READING_RESPONSE /* 14 */:
                e();
                break;
            case 15:
                k();
                break;
            case 16:
                j();
                break;
            case 17:
                f();
                break;
            case 18:
                d();
                break;
            case 19:
                s();
                break;
        }
    }

    public final void B(nkw nkwVar) {
        a.I(ixg.a(nkwVar));
        z();
        v().d = true;
        mzz mzzVar = this.c;
        mzzVar.x(nkwVar);
        G(nkwVar);
        mzzVar.n();
        y();
    }

    public final void C(nkw nkwVar) {
        a.I(ixg.a(nkwVar));
        v().d = false;
    }

    public final void D() {
        y();
        this.c.n();
        v().d = true;
        z();
    }

    public final void E() {
        this.e.e();
        v().d = false;
    }

    public final void F(int i) {
        Window window = this.n;
        WindowManager.LayoutParams attributes = window.getAttributes();
        attributes.rotationAnimation = i;
        window.setAttributes(attributes);
    }

    public final void G(nkw nkwVar) {
        this.a.a(nkwVar);
        this.o.aw(nkwVar);
        this.b.y(nkwVar);
    }

    public final GridLinesUi u() {
        return (GridLinesUi) ((ocq) ((mwq) this.r.a()).b).c(R.id.grid_lines);
    }

    public final PreviewOverlay v() {
        return (PreviewOverlay) ((ocq) ((mwq) this.r.a()).b).c(R.id.preview_overlay);
    }

    public final void w() {
        this.p.d(false);
        nql.b();
    }

    public final void x() {
        u().setVisibility(4);
    }

    public final void y() {
        this.p.d(true);
        nql.c();
    }

    public final void z() {
        this.q.postDelayed(new lac(this, 20), 250L);
    }
}
