package defpackage;

import android.animation.TimeInterpolator;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.PointF;
import android.os.Process;
import android.os.Trace;
import android.transition.AutoTransition;
import android.transition.TransitionManager;
import android.view.ViewStub;
import com.google.android.apps.camera.async.tt.CpuSets;
import com.google.android.apps.camera.autotimer.analysis.jni.wVCD.HHdu;
import com.google.android.apps.camera.ui.layout.MainActivityLayout;
import com.google.android.apps.camera.ui.widget.ReviewImageView;
import com.google.ar.core.Camera;
import com.google.ar.core.Config;
import com.google.ar.core.Pose;
import com.google.ar.core.R;
import com.google.ar.core.Session;
import j$.util.Collection;
import j$.util.stream.Collector;
import j$.util.stream.Stream;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.Iterator;
import java.util.List;
import org.chromium.net.UrlRequest;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class fjw implements Runnable {
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;
    private final /* synthetic */ int c;

    public fjw(frn frnVar, Runnable runnable, int i) {
        this.c = i;
        this.b = runnable;
        this.a = frnVar;
    }

    public /* synthetic */ fjw(Object obj, Object obj2, int i) {
        this.c = i;
        this.a = obj;
        this.b = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v32, types: [java.lang.Object, java.lang.Runnable] */
    /* JADX WARN: Type inference failed for: r9v36, types: [emw, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v41, types: [java.lang.Object, java.lang.Runnable] */
    @Override // java.lang.Runnable
    public final void run() throws IllegalAccessException, NoSuchMethodException, Resources.NotFoundException, SecurityException, IllegalArgumentException, InvocationTargetException {
        AutoCloseable itiVar;
        boolean z = true;
        switch (this.c) {
            case 0:
                fjz fjzVar = (fjz) this.a;
                if (fjzVar.s()) {
                    fjzVar.y.setVisibility(4);
                    TransitionManager.beginDelayedTransition(fjzVar.y, new AutoTransition().setDuration(500L).setInterpolator((TimeInterpolator) new cvn()));
                    fjzVar.l.c(fjzVar.y);
                    fjzVar.y.setVisibility(0);
                    return;
                }
                mxm mxmVar = (mxm) this.b;
                if (mxmVar.equals(mxm.LANDSCAPE) || mxmVar.equals(mxm.REVERSE_LANDSCAPE)) {
                    fjzVar.y.setVisibility(4);
                    TransitionManager.beginDelayedTransition(fjzVar.y, new AutoTransition().setDuration(500L).setInterpolator((TimeInterpolator) new cvn()));
                    fjzVar.k.c(fjzVar.y);
                    fjzVar.y.setVisibility(0);
                    return;
                }
                fjzVar.y.setVisibility(4);
                TransitionManager.beginDelayedTransition(fjzVar.y, new AutoTransition().setDuration(500L).setInterpolator((TimeInterpolator) new cvn()));
                fjzVar.j.c(fjzVar.y);
                fjzVar.y.setVisibility(0);
                return;
            case 1:
                ((fje) this.a).e((fkf) this.b);
                return;
            case 2:
                ((Camera) ((fok) this.a).a).getProjectionMatrix((float[]) this.b, 0, 0.1f, 100.0f);
                return;
            case 3:
                ((Camera) ((fok) this.a).a).getViewMatrix((float[]) this.b, 0);
                return;
            case 4:
                ((Pose) ((fok) this.a).a).toMatrix((float[]) this.b, 0);
                return;
            case 5:
                ((Pose) ((fok) this.a).a).getTransformedAxis(1, 1.0f, (float[]) this.b, 0);
                return;
            case 6:
                ((Session) ((fok) this.b).a).configure((Config) ((fok) this.a).a);
                return;
            case 7:
                this.a.a(((pjr) this.b).a());
                return;
            case 8:
                fql fqlVar = ((fqi) this.a).b;
                Object obj = this.b;
                Iterator it = fqlVar.iterator();
                while (it.hasNext()) {
                    fqk fqkVar = (fqk) it.next();
                    try {
                        fqkVar.a((Throwable) obj);
                    } catch (Throwable th) {
                        ((sgt) ((sgt) fqi.a.b().i(th)).M(341)).E("%s failed to handle %s", fqkVar, obj);
                    }
                }
                return;
            case 9:
                ((frn) this.a).a.execute(this.b);
                return;
            case 10:
                boolean zB = ((fto) this.a).b();
                ?? r9 = this.b;
                if (zB) {
                    int iMyTid = Process.myTid();
                    jal jalVarA = CpuSets.a(iMyTid);
                    if (jalVarA == null) {
                        ((sgt) fto.a.c().M(374)).v(HHdu.RGzZiYVIw, Thread.currentThread().getName());
                        itiVar = new fhf(7);
                    } else {
                        Trace.beginSection("LimitCpuSet");
                        itiVar = new iti(iMyTid, jalVarA, (int) (z ? 1 : 0));
                    }
                } else {
                    itiVar = new fhf(6);
                }
                try {
                    r9.run();
                    return;
                } finally {
                    itiVar.close();
                }
            case 11:
                fxm fxmVar = (fxm) this.a;
                fxmVar.F.g((Throwable) this.b, fxmVar.b);
                return;
            case 12:
                ((fxm) this.a).d.c((oyu) this.b);
                return;
            case 13:
                ((fxm) this.a).d.c((oyu) this.b);
                return;
            case UrlRequest.Status.READING_RESPONSE /* 14 */:
                fyb fybVar = (fyb) this.b;
                fybVar.a.b((Bitmap) this.a);
                fybVar.b.h(fybVar.a.getContext().getString(R.string.video_accessibility_peek));
                return;
            case 15:
                MainActivityLayout mainActivityLayout = (MainActivityLayout) ((ngw) this.b).c;
                ((ViewStub) mainActivityLayout.findViewById(R.id.camera_intent_layout_stub)).inflate();
                ReviewImageView reviewImageView = (ReviewImageView) mainActivityLayout.findViewById(R.id.intent_review_imageview);
                reviewImageView.getClass();
                ((fyb) this.a).a = reviewImageView;
                return;
            case 16:
                out.a();
                gaw gawVar = (gaw) this.b;
                oxh oxhVar = gawVar.c;
                sxx sxxVarA = gnr.a();
                sxxVarA.d(oxhVar);
                oxj oxjVar = gawVar.d;
                sxxVarA.e(oxjVar);
                sxxVarA.b = gawVar.W;
                rwc rwcVarJ = rwc.j(sxxVarA.c());
                fyd fydVar = (fyd) this.a;
                fydVar.o.a(rwcVarJ);
                Stream map = Collection.EL.stream(gawVar.A).map(new fik(19)).filter(new fla(6)).map(new fik(20));
                Collector collector = ryv.a;
                fydVar.m.a(Boolean.valueOf(((sbp) map.collect(collector)).size() > 1));
                sbp sbpVar = gawVar.z;
                List listA = fyd.a(gawVar.y);
                List listA2 = fyd.a(sbpVar);
                boolean zE = oxjVar.e();
                boolean zF = oxhVar.f();
                int i = 2;
                sbp sbpVar2 = (sbp) Collection.EL.stream(listA).map(new gbm(i)).collect(collector);
                glu gluVar = fydVar.j;
                gluVar.g = sbpVar2;
                if (listA2.contains(ltt.FPS_AUTO)) {
                    hbj hbjVar = gluVar.l;
                    gzi gziVar = gym.a;
                }
                gluVar.h = (sbp) Collection.EL.stream(listA2).map(new gbm(i)).collect(collector);
                gluVar.i = zE;
                owq owqVar = gluVar.b;
                if (zF != ((Boolean) ((ovx) owqVar).d).booleanValue()) {
                    owqVar.a(Boolean.valueOf(zF));
                }
                if (!((Boolean) gluVar.c.dL()).booleanValue() || ((pka) ((ovx) gluVar.e).d).equals(pka.FRONT)) {
                    gluVar.t();
                }
                gluVar.j = false;
                krj krjVar = gluVar.k;
                if (krjVar != null) {
                    krjVar.m(false, krs.FPS);
                }
                fydVar.n.a(oxjVar);
                ghr ghrVar = fydVar.g;
                ghrVar.c(ghrVar.f);
                return;
            case 17:
                Object obj2 = ((ejt) this.a).a;
                fyq fyqVar = (fyq) this.b;
                PointF pointF = (PointF) obj2;
                fyqVar.e(pointF, false);
                fyqVar.e(pointF, true);
                return;
            case 18:
                Object obj3 = this.a;
                Object obj4 = ((fze) obj3).d;
                Object obj5 = this.b;
                synchronized (obj4) {
                    try {
                        ((fze) obj3).h.b((qaq) obj5);
                    } catch (IOException e) {
                        ((sgt) ((sgt) fze.a.b().i(e)).M(599)).s("Failed to write to piped audio buffer.");
                    }
                }
                return;
            case 19:
                ((fze) ((fzp) this.a).a).f(((qaq) this.b).r());
                return;
            default:
                Object obj6 = this.a;
                Object obj7 = ((fzs) obj6).d;
                Object obj8 = this.b;
                synchronized (obj7) {
                    try {
                        ((fzs) obj6).g.b((qaq) obj8);
                    } catch (IOException e2) {
                        ((sgt) ((sgt) fzs.a.b().i(e2)).M(625)).s("Failed to write to piped audio buffer.");
                    }
                }
                return;
        }
    }

    public /* synthetic */ fjw(Object obj, Object obj2, int i, byte[] bArr) {
        this.c = i;
        this.b = obj;
        this.a = obj2;
    }
}
