package defpackage;

import android.content.ContentResolver;
import android.content.Context;
import android.graphics.Rect;
import android.util.DisplayMetrics;
import android.view.ViewStub;
import android.widget.FrameLayout;
import com.google.android.apps.camera.bottombar.BottomBar;
import com.google.android.apps.camera.ui.layout.MainActivityLayout;
import com.google.android.apps.camera.ui.modeswitcher.ModeSwitcher;
import com.google.android.apps.camera.ui.shutterbutton.ShutterButton;
import com.google.android.apps.camera.ui.shutterbutton.ShutterButtonProgressOverlay;
import com.google.android.apps.camera.ui.views.GradientBar;
import com.google.android.apps.camera.ui.views.ViewfinderCover;
import com.google.android.apps.camera.ui.zoomlock.ZoomLockView;
import com.google.ar.core.R;
import j$.util.Collection;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ngw {
    public final Object a;
    public final Object b;
    public final Object c;
    public final Object d;
    public final Object e;
    public final Object f;
    public final Object g;
    public final Object h;
    public final Object i;
    public final Object j;
    public final Object k;
    public final Object l;
    public final Object m;
    public final Object n;
    public final Object o;

    public ngw(jtd jtdVar, syu syuVar, ipt iptVar, DisplayMetrics displayMetrics, lqo lqoVar, qyc qycVar, nkw nkwVar, owf owfVar, gnt gntVar, rwc rwcVar, rwc rwcVar2, fgs fgsVar, fhe fheVar, syu syuVar2, kgn kgnVar) {
        this.g = jtdVar;
        this.n = syuVar;
        this.h = iptVar;
        this.c = displayMetrics;
        this.e = lqoVar;
        this.k = qycVar;
        this.a = nkwVar;
        this.o = owfVar;
        this.l = gntVar;
        this.i = rwcVar;
        this.m = rwcVar2;
        this.f = fgsVar;
        this.b = fheVar;
        this.d = syuVar2;
        this.j = kgnVar;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, uem] */
    /* JADX WARN: Type inference failed for: r10v0, types: [java.lang.Object, uem] */
    /* JADX WARN: Type inference failed for: r11v0, types: [java.lang.Object, uem] */
    /* JADX WARN: Type inference failed for: r12v0, types: [java.lang.Object, uem] */
    /* JADX WARN: Type inference failed for: r13v0, types: [java.lang.Object, uem] */
    /* JADX WARN: Type inference failed for: r14v0, types: [java.lang.Object, uem] */
    /* JADX WARN: Type inference failed for: r15v0, types: [java.lang.Object, uem] */
    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, uem] */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, uem] */
    /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object, uem] */
    /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Object, uem] */
    /* JADX WARN: Type inference failed for: r8v0, types: [java.lang.Object, uem] */
    /* JADX WARN: Type inference failed for: r9v0, types: [java.lang.Object, uem] */
    public final kxs a(kun kunVar, kvy kvyVar, lfc lfcVar) {
        pbn pbnVar = (pbn) this.j.a();
        pbnVar.getClass();
        pfu pfuVar = (pfu) this.b.a();
        pfuVar.getClass();
        lcu lcuVar = (lcu) this.a.a();
        lcuVar.getClass();
        lcu lcuVar2 = (lcu) this.l.a();
        lcuVar2.getClass();
        kxm kxmVarB = ((kxn) this.f).a();
        hxv hxvVarB = ((hxw) this.n).a();
        owf owfVar = (owf) this.d.a();
        owfVar.getClass();
        kxv kxvVar = (kxv) this.g.a();
        kxvVar.getClass();
        let letVar = (let) this.h.a();
        letVar.getClass();
        kxp kxpVar = (kxp) this.k.a();
        kxpVar.getClass();
        owf owfVar2 = (owf) this.c.a();
        owfVar2.getClass();
        hbj hbjVar = (hbj) this.o.a();
        hbjVar.getClass();
        kvg kvgVar = (kvg) this.m.a();
        kvgVar.getClass();
        ((jho) this.e.a()).getClass();
        kunVar.getClass();
        kvyVar.getClass();
        lfcVar.getClass();
        return new kxs(pbnVar, pfuVar, lcuVar, lcuVar2, kxmVarB, hxvVarB, owfVar, kxvVar, letVar, this.i, kxpVar, owfVar2, hbjVar, kvgVar, kunVar, kvyVar, lfcVar);
    }

    public final nkw b() {
        return ((gfq) this.h).a();
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, pjp] */
    public final nms c() {
        pjr pjrVarD = d();
        pjrVarD.getClass();
        ?? r1 = this.n;
        if (!r1.containsKey(pjrVarD)) {
            ?? r2 = this.m;
            r1.put(pjrVarD, new nms(r2, r2.a(pjrVarD), (hbj) this.a));
        }
        return (nms) r1.get(pjrVarD);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, pjp] */
    public final pjr d() {
        pka pkaVarA = ((gnt) this.e).a();
        Object obj = this.a;
        return ((hfy) this.o).a(this.d, (hbj) obj, pkaVarA);
    }

    public final pjr e() {
        return c().g().j();
    }

    public final pjr f() {
        pjr pjrVarD = d();
        if (pjrVarD == null) {
            return null;
        }
        pkc pkcVar = (pkc) this.d;
        pjo pjoVarA = pkcVar.a(pjrVarD);
        if (pjoVarA.l() == pka.FRONT) {
            hbj hbjVar = (hbj) this.a;
            if (hbjVar.p(gza.a)) {
                ArrayList arrayList = new ArrayList();
                Iterator it = ((pjn) pjoVarA).b.iterator();
                while (it.hasNext()) {
                    arrayList.add(Integer.valueOf(pkcVar.a((pjr) it.next()).g()));
                }
                if (arrayList.isEmpty() || Collection.EL.stream(arrayList).distinct().count() != 1) {
                    return ((kgn) this.i).a();
                }
            } else if (hbjVar.p(gym.ah)) {
                Rect rect = new Rect(0, 0, 0, 0);
                pjn pjnVar = (pjn) pjoVarA;
                pjrVarD = pjnVar.a;
                for (pjr pjrVar : pjnVar.b) {
                    pjo pjoVarA2 = pkcVar.a(pjrVar);
                    if (pjoVarA2.i().right > rect.right) {
                        rect = pjoVarA2.i();
                        pjrVarD = pjrVar;
                    }
                }
            }
        }
        return pjrVarD;
    }

    public final pjr g() {
        return c().e().j();
    }

    public ngw(gnt gntVar, kgn kgnVar, pkc pkcVar, hbj hbjVar, hfy hfyVar, ggx ggxVar, gkf gkfVar, cxb cxbVar, ContentResolver contentResolver, Context context, gfq gfqVar, qqq qqqVar, fwp fwpVar, pjp pjpVar) {
        this.n = new HashMap();
        this.e = gntVar;
        this.i = kgnVar;
        this.d = pkcVar;
        this.a = hbjVar;
        this.o = hfyVar;
        this.k = ggxVar;
        this.b = cxbVar;
        this.c = contentResolver;
        this.f = context;
        this.h = gfqVar;
        this.j = gkfVar;
        this.g = qqqVar;
        this.l = fwpVar;
        this.m = pjpVar;
    }

    public ngw(uem uemVar, uem uemVar2, uem uemVar3, uem uemVar4, uem uemVar5, uem uemVar6, uem uemVar7, uem uemVar8, uem uemVar9, uem uemVar10, uem uemVar11, uem uemVar12, uem uemVar13, uem uemVar14, uem uemVar15) {
        uemVar.getClass();
        this.j = uemVar;
        this.b = uemVar2;
        uemVar3.getClass();
        this.a = uemVar3;
        uemVar4.getClass();
        this.l = uemVar4;
        uemVar5.getClass();
        this.f = uemVar5;
        uemVar6.getClass();
        this.n = uemVar6;
        uemVar7.getClass();
        this.d = uemVar7;
        uemVar8.getClass();
        this.g = uemVar8;
        uemVar9.getClass();
        this.h = uemVar9;
        uemVar10.getClass();
        this.i = uemVar10;
        uemVar11.getClass();
        this.k = uemVar11;
        uemVar12.getClass();
        this.c = uemVar12;
        uemVar13.getClass();
        this.o = uemVar13;
        uemVar14.getClass();
        this.m = uemVar14;
        uemVar15.getClass();
        this.e = uemVar15;
    }

    public ngw(ocq ocqVar, pbn pbnVar) {
        out.a();
        this.j = ocqVar;
        pbnVar.f("CameraUi#getViews");
        MainActivityLayout mainActivityLayout = (MainActivityLayout) ocqVar.c(R.id.activity_root_view);
        this.c = mainActivityLayout;
        this.a = (ViewStub) ocqVar.c(R.id.camera_frame_bottom_layout_stub);
        this.b = (ViewStub) ocqVar.c(R.id.camera_frame_overlay_layout_stub);
        this.d = (FrameLayout) ocqVar.c(R.id.viewfinder_frame);
        this.e = (ViewfinderCover) ocqVar.c(R.id.viewfinder_cover);
        this.i = (ModeSwitcher) ocqVar.c(R.id.mode_switcher);
        this.k = (ShutterButton) ocqVar.c(R.id.shutter_button);
        this.h = ocqVar.c(R.id.timer_widget);
        BottomBar bottomBar = (BottomBar) ocqVar.c(R.id.bottom_bar);
        this.f = bottomBar;
        GradientBar gradientBar = (GradientBar) ocqVar.c(R.id.gradient_bar);
        this.l = gradientBar;
        this.g = bottomBar.o;
        this.m = (ShutterButtonProgressOverlay) ocqVar.c(R.id.shutter_progress_overlay);
        this.n = (ZoomLockView) ocqVar.c(R.id.zoom_lock_view);
        this.o = (ViewStub) ocqVar.c(R.id.stub_options_panel);
        pbnVar.h("CameraUi#registerBottomBar");
        mxk mxkVar = mxk.TO_RIGHT;
        mainActivityLayout.l(bottomBar, mxkVar);
        mainActivityLayout.i(bottomBar, mxkVar);
        mainActivityLayout.k(gradientBar);
        pbnVar.g();
    }
}
