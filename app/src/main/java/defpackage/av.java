package defpackage;

import android.animation.ValueAnimator;
import android.app.LocaleManager;
import android.content.ComponentName;
import android.content.Context;
import android.os.LocaleList;
import android.os.Looper;
import android.os.SystemClock;
import android.support.v7.widget.ActionBarOverlayLayout;
import android.support.v7.widget.StaggeredGridLayoutManager;
import android.view.Menu;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;
import android.view.Window;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import org.chromium.net.UrlRequest;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class av implements Runnable {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ av(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    /* JADX WARN: Type inference failed for: r14v5, types: [java.lang.Object, java.util.List] */
    @Override // java.lang.Runnable
    public final void run() {
        Context contextA;
        Object systemService = null;
        switch (this.b) {
            case 0:
                uif uifVar = (uif) ((uka) this.a).a;
                if (uifVar != null) {
                    uifVar.a();
                    return;
                }
                return;
            case 1:
                cr.b(this.a, 4);
                return;
            case 2:
                Object obj = this.a;
                Iterator it = ((aw) obj).a.iterator();
                while (it.hasNext()) {
                    ((ax) it.next()).a.f((de) obj);
                }
                return;
            case 3:
                bb bbVar = (bb) this.a;
                bbVar.a.onDismiss(bbVar.c);
                return;
            case 4:
                bm bmVar = (bm) this.a;
                bmVar.Z.b.X(bmVar.i);
                bmVar.i = null;
                return;
            case 5:
                Object obj2 = this.a;
                bm bmVar2 = (bm) obj2;
                if (bmVar2.S == null || !bmVar2.k().s) {
                    return;
                }
                if (bmVar2.B == null) {
                    bmVar2.k().s = false;
                    return;
                } else if (Looper.myLooper() != bmVar2.B.d.getLooper()) {
                    bmVar2.B.d.postAtFrontOfQueue(new av(obj2, 6, null));
                    return;
                } else {
                    bmVar2.o(true);
                    return;
                }
            case 6:
                ((bm) this.a).o(false);
                return;
            case 7:
                dh dhVar = (dh) this.a;
                if (dhVar.b.isEmpty()) {
                    return;
                }
                dhVar.f();
                return;
            case 8:
                ArrayList arrayList = ((ch) this.a).j;
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                    ((cd) arrayList.get(i)).a();
                }
                return;
            case 9:
                Object obj3 = this.a;
                int i2 = dz.b;
                Context context = (Context) obj3;
                ComponentName componentName = new ComponentName(context, "android.support.v7.app.AppLocalesMetadataHolderService");
                if (context.getPackageManager().getComponentEnabledSetting(componentName) != 1) {
                    ye yeVar = new ye(dz.d);
                    while (true) {
                        if (yeVar.hasNext()) {
                            dz dzVar = (dz) ((WeakReference) yeVar.next()).get();
                            if (dzVar != null && (contextA = dzVar.a()) != null) {
                                systemService = contextA.getSystemService("locale");
                            }
                        }
                    }
                    if ((systemService != null ? cmr.b(((LocaleManager) systemService).getApplicationLocales()) : cmr.a).b.a.isEmpty()) {
                        String strA = ah.a(context);
                        Object systemService2 = context.getSystemService("locale");
                        if (systemService2 != null) {
                            ((LocaleManager) systemService2).setApplicationLocales(LocaleList.forLanguageTags(strA));
                        }
                    }
                    context.getPackageManager().setComponentEnabledSetting(componentName, 1, 1);
                }
                dz.c = true;
                return;
            case 10:
                eo eoVar = (eo) this.a;
                eoVar.p.showAtLocation(eoVar.o, 55, 0, 0);
                eoVar.A();
                if (!eoVar.J()) {
                    eoVar.o.setAlpha(1.0f);
                    eoVar.o.setVisibility(0);
                    return;
                }
                eoVar.o.setAlpha(0.0f);
                ejs ejsVarM = con.m(eoVar.o);
                ejsVarM.j(1.0f);
                eoVar.I = ejsVarM;
                eoVar.I.l(new ec(this));
                return;
            case 11:
                Object obj4 = this.a;
                Menu menuV = ((eu) obj4).v();
                Menu menu = true != (menuV instanceof gb) ? null : menuV;
                if (menu != null) {
                    ((gb) menu).s();
                }
                try {
                    menuV.clear();
                    Window.Callback callback = ((eu) obj4).a;
                    if (!callback.onCreatePanelMenu(0, menuV) || !callback.onPreparePanel(0, null, menuV)) {
                        menuV.clear();
                    }
                    if (menu != null) {
                        ((gb) menu).r();
                        return;
                    }
                    return;
                } finally {
                }
            case 12:
                ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) this.a;
                actionBarOverlayLayout.b();
                actionBarOverlayLayout.i = actionBarOverlayLayout.c.animate().translationY(0.0f).setListener(actionBarOverlayLayout.j);
                return;
            case 13:
                ActionBarOverlayLayout actionBarOverlayLayout2 = (ActionBarOverlayLayout) this.a;
                actionBarOverlayLayout2.b();
                actionBarOverlayLayout2.i = actionBarOverlayLayout2.c.animate().translationY(-actionBarOverlayLayout2.c.getHeight()).setListener(actionBarOverlayLayout2.j);
                return;
            case UrlRequest.Status.READING_RESPONSE /* 14 */:
                jh jhVar = (jh) this.a;
                jhVar.b = null;
                jhVar.drawableStateChanged();
                return;
            case 15:
                jk jkVar = (jk) this.a;
                int i3 = jkVar.q;
                if (i3 == 1) {
                    jkVar.p.cancel();
                } else if (i3 != 2) {
                    return;
                }
                jkVar.q = 3;
                ValueAnimator valueAnimator = jkVar.p;
                valueAnimator.setFloatValues(((Float) valueAnimator.getAnimatedValue()).floatValue(), 0.0f);
                valueAnimator.setDuration(500L);
                valueAnimator.start();
                return;
            case 16:
                ViewParent parent = ((jl) this.a).c.getParent();
                if (parent != null) {
                    parent.requestDisallowInterceptTouchEvent(true);
                    return;
                }
                return;
            case 17:
                jl jlVar = (jl) this.a;
                jlVar.d();
                View view = jlVar.c;
                if (view.isEnabled() && !view.isLongClickable() && jlVar.b()) {
                    view.getParent().requestDisallowInterceptTouchEvent(true);
                    long jUptimeMillis = SystemClock.uptimeMillis();
                    MotionEvent motionEventObtain = MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0);
                    view.onTouchEvent(motionEventObtain);
                    motionEventObtain.recycle();
                    jlVar.d = true;
                    return;
                }
                return;
            case 18:
                ((jz) this.a).q();
                return;
            case 19:
                jz jzVar = (jz) this.a;
                jh jhVar2 = jzVar.e;
                if (jhVar2 == null || !jhVar2.isAttachedToWindow() || jzVar.e.getCount() <= jzVar.e.getChildCount() || jzVar.e.getChildCount() > jzVar.k) {
                    return;
                }
                jzVar.q.setInputMethodMode(2);
                jzVar.s();
                return;
            default:
                ((StaggeredGridLayoutManager) this.a).J();
                return;
        }
    }

    public av(Object obj, int i, byte[] bArr) {
        this.b = i;
        this.a = obj;
    }
}
