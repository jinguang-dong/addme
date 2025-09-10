package defpackage;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.Intent;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.google.android.apps.camera.processing.ProcessingService;
import java.util.concurrent.TimeUnit;
import org.chromium.net.UrlRequest;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class lgc implements Runnable {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ lgc(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        lgo lgoVar;
        switch (this.b) {
            case 0:
                Object obj = this.a;
                ((lgd) obj).g.lock();
                try {
                    if (((lgd) obj).f) {
                        ((lgd) obj).e.unload();
                    }
                    return;
                } finally {
                }
            case 1:
                Object obj2 = this.a;
                synchronized (((lgb) obj2).g) {
                    if (((lgb) obj2).l) {
                        ((sgt) lgb.a.c().M(4109)).s("init() called on an already initialized PortraitController.");
                        return;
                    }
                    synchronized (((lgb) obj2).f) {
                        lge lgeVar = ((lgb) obj2).p;
                        if (lgeVar != null && (lgoVar = ((lgb) obj2).m) != null) {
                            if (lgeVar.a() == 0) {
                                ((sgt) lgb.a.c().M(4108)).s("Expected portrait segmenter to be initialized, but it wasn't. Initializing again.");
                                lgeVar.b();
                            }
                            if (lgoVar.a() == 0 && ((lgb) obj2).q.p(hak.D)) {
                                ((sgt) lgb.a.c().M(4107)).s("Expected portrait relighting processor to be initialized, but it wasn't. Initializing again.");
                                lgoVar.d();
                            }
                            ((lgb) obj2).l = true;
                        }
                    }
                    return;
                }
            case 2:
                Object obj3 = this.a;
                ((lgd) obj3).g.lock();
                try {
                    if (((lgd) obj3).f) {
                        ((lgd) obj3).e.reload();
                    }
                    return;
                } finally {
                }
            case 3:
                ((lgf) this.a).a.b(nkw.PORTRAIT);
                return;
            case 4:
                lgh lghVar = ((lgg) this.a).a;
                if (lghVar.d.booleanValue()) {
                    lghVar.c(300L);
                    return;
                } else {
                    lghVar.a();
                    return;
                }
            case 5:
                ((ovx) this.a).a(true);
                return;
            case 6:
                ((ovx) this.a).a(false);
                return;
            case 7:
                Object obj4 = this.a;
                lhk lhkVar = (lhk) obj4;
                if (lhkVar.s.indexOfChild(lhkVar.o) == -1) {
                    return;
                }
                nan nanVar = lhkVar.k;
                if (nanVar != null) {
                    lhkVar.y.a(nanVar);
                }
                lhkVar.o.setAlpha(0.0f);
                lhkVar.o.setVisibility(0);
                lhkVar.p.setAlpha(0.0f);
                lhkVar.p.bringToFront();
                lhkVar.l = ObjectAnimator.ofFloat(lhkVar.o, (Property<View, Float>) View.ALPHA, 0.0f, 1.0f).setDuration(5000L);
                lhkVar.l.start();
                lhk.g();
                lhkVar.m = lhkVar.e.schedule(new lgc(obj4, 14), 300L, TimeUnit.SECONDS);
                return;
            case 8:
                Object obj5 = this.a;
                ((lhk) obj5).d.c(new lgc(obj5, 7));
                return;
            case 9:
                lhk lhkVar2 = (lhk) this.a;
                TextView textView = lhkVar2.n;
                if (textView == null || lhkVar2.j.indexOfChild(textView) == -1) {
                    return;
                }
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) lhkVar2.n.getLayoutParams();
                int i = layoutParams.topMargin;
                if (i - lhkVar2.t >= 30) {
                    layoutParams.topMargin = i - 30;
                } else {
                    layoutParams.topMargin = i + 30;
                }
                lhkVar2.n.setLayoutParams(layoutParams);
                return;
            case 10:
                Object obj6 = this.a;
                lhk lhkVar3 = (lhk) obj6;
                ViewGroup viewGroup = lhkVar3.q;
                if (viewGroup == null || viewGroup.indexOfChild(lhkVar3.j) != -1) {
                    lhkVar3.j.setAlpha(0.0f);
                    lhkVar3.j.bringToFront();
                    lhkVar3.j.setVisibility(0);
                    lhkVar3.l = ObjectAnimator.ofFloat(lhkVar3.j, (Property<FrameLayout, Float>) View.ALPHA, 0.0f, 1.0f).setDuration(3000L);
                    lhkVar3.l.start();
                    lhkVar3.m = lhkVar3.e.scheduleAtFixedRate(new lgc(obj6, 13), 60L, 60L, TimeUnit.SECONDS);
                    return;
                }
                return;
            case 11:
                lhk lhkVar4 = (lhk) this.a;
                lhkVar4.h.unregisterListener(lhkVar4.g, lhkVar4.f);
                return;
            case 12:
                lhk lhkVar5 = (lhk) this.a;
                lhkVar5.h.registerListener(lhkVar5.g, lhkVar5.f, 3);
                return;
            case 13:
                Object obj7 = this.a;
                ((lhk) obj7).d.c(new lgc(obj7, 9));
                return;
            case UrlRequest.Status.READING_RESPONSE /* 14 */:
                Object obj8 = this.a;
                ((lhk) obj8).d.c(new lgc(obj8, 10));
                return;
            case 15:
                ((lho) this.a).a.a.a();
                return;
            case 16:
                ((our) this.a).close();
                return;
            case 17:
                Context context = (Context) this.a;
                context.startForegroundService(new Intent(context, (Class<?>) ProcessingService.class));
                return;
            case 18:
                Object obj9 = this.a;
                synchronized (((ProcessingService) obj9).f) {
                    ((ProcessingService) obj9).g = true;
                    if (((ProcessingService) obj9).h) {
                        ((ProcessingService) obj9).c();
                    }
                }
                return;
            case 19:
                int i2 = ProcessingService.u;
                throw new RuntimeException((Throwable) this.a);
            default:
                Object obj10 = this.a;
                lmb lmbVar = (lmb) obj10;
                if (lmbVar.a.decrementAndGet() == 0) {
                    synchronized (lmbVar.c) {
                        ((lmb) obj10).a();
                    }
                    return;
                }
                return;
        }
    }

    public lgc(lmb lmbVar, int i) {
        this.b = i;
        this.a = lmbVar;
    }
}
