package defpackage;

import android.animation.AnimatorSet;
import android.content.Context;
import android.view.ViewGroup;
import android.widget.PopupWindow;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.apps.camera.ui.hotshot.HotshotController;
import com.google.android.apps.camera.ui.hotshot.HotshotView;
import com.google.android.apps.camera.ui.hotshot.jni.HotshotObjectDetector;
import com.google.android.apps.camera.ui.layout.MainActivityLayout;
import com.google.android.apps.camera.ui.modeslider.ModeSliderUi;
import com.google.android.apps.camera.ui.notificationchip.NotificationChipView;
import java.util.Iterator;
import java.util.concurrent.Executor;
import org.chromium.net.UrlRequest;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class mub implements Runnable {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ mub(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    /* JADX WARN: Type inference failed for: r12v30, types: [java.lang.Object, ndj] */
    /* JADX WARN: Type inference failed for: r12v61, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r12v65, types: [java.lang.Object, pbp] */
    @Override // java.lang.Runnable
    public final void run() {
        int i = 4;
        switch (this.b) {
            case 0:
                mud mudVar = (mud) this.a;
                mudVar.b.setVisibility(8);
                mudVar.m();
                return;
            case 1:
                ((mov) this.a).c();
                return;
            case 2:
                ((mud) this.a).n();
                return;
            case 3:
                ((mud) this.a).b.setVisibility(0);
                return;
            case 4:
                ((mue) this.a).a.setVisibility(0);
                return;
            case 5:
                ((mue) this.a).a.setVisibility(8);
                return;
            case 6:
                ((ViewGroup) this.a).setVisibility(0);
                return;
            case 7:
                HotshotController hotshotController = (HotshotController) this.a;
                if (hotshotController.P) {
                    mvk mvkVar = hotshotController.V;
                    Context context = hotshotController.e;
                    mvkVar.c();
                    if (mvkVar.d.ak("hotshot_prompt_edu") == 5) {
                        mvkVar.b(context, 3);
                        return;
                    }
                    return;
                }
                return;
            case 8:
                HotshotController hotshotController2 = (HotshotController) this.a;
                if (hotshotController2.P) {
                    mvk mvkVar2 = hotshotController2.V;
                    Context context2 = hotshotController2.e;
                    mvkVar2.c();
                    if (mvkVar2.d.ak("hotshot_first_time_edu") == 1) {
                        mvkVar2.b(context2, 1);
                        mvkVar2.b = true;
                    }
                }
                mwn mwnVar = hotshotController2.h;
                rwc rwcVar = mwnVar.b;
                if (!rwcVar.h()) {
                    ((sgt) mwn.a.b().M(5112)).s("startHotshot, view is not present.");
                    return;
                }
                if (rwcVar.h()) {
                    hbj hbjVar = mwnVar.e;
                    mwo mwoVar = mwo.ONLY_FOR_FACE;
                    if (hbjVar.p(gzt.c)) {
                        mwoVar = mwo.DRAW_RECTANGLE_FOR_KEY_SUBJECT;
                    } else if (hbjVar.p(gzt.b)) {
                        mwoVar = mwo.OBJECT_DETECTION_WITH_BORDER_GUIDANCE;
                    }
                    Object objC = rwcVar.c();
                    ((sgt) HotshotView.a.c().M(5105)).v("Set visual effect style %s", mwoVar);
                    HotshotView hotshotView = (HotshotView) objC;
                    if (!hotshotView.g.equals(mwoVar)) {
                        hotshotView.g = mwoVar;
                        hotshotView.c();
                    }
                }
                mwnVar.c(true);
                mwnVar.c = true;
                return;
            case 9:
                HotshotController hotshotController3 = (HotshotController) this.a;
                if (hotshotController3.t()) {
                    hotshotController3.m();
                    return;
                } else {
                    hotshotController3.n();
                    return;
                }
            case 10:
                this.a.b().sendAccessibilityEvent(8);
                return;
            case 11:
                Object obj = this.a;
                mwp mwpVar = (mwp) obj;
                if (mwpVar.e == null) {
                    mwpVar.e = new HotshotObjectDetector();
                }
                int i2 = mwpVar.h;
                if (i2 == 0) {
                    throw null;
                }
                if (i2 == 3) {
                    HotshotObjectDetector hotshotObjectDetector = mwpVar.e;
                    if (HotshotObjectDetector.b) {
                        if (hotshotObjectDetector.c != 0) {
                            ((sgt) HotshotObjectDetector.a.c().M(5148)).s("Previous handle was not released.");
                            HotshotObjectDetector.releaseHandle(hotshotObjectDetector.c);
                        }
                        hotshotObjectDetector.c = HotshotObjectDetector.createHandle();
                    } else {
                        ((sgt) HotshotObjectDetector.a.c().M(5149)).s("Library is not loaded. Ignore start()");
                    }
                }
                HotshotObjectDetector hotshotObjectDetector2 = mwpVar.e;
                Object objDL = mwpVar.c.dL();
                mvt mvtVar = mvt.START_ONLY_SALIENCY;
                long j = hotshotObjectDetector2.c;
                if (j == 0) {
                    ((sgt) HotshotObjectDetector.a.c().M(5146)).s("No handle, reject set mode request.");
                } else {
                    HotshotObjectDetector.setMode(j, objDL == mvtVar ? a.at(4) : a.at(3));
                }
                mwpVar.h = 1;
                if (mwpVar.f == null) {
                    mwpVar.f = mwpVar.b.b(new jqf(obj, i), (Executor) mwpVar.d.a());
                }
                mwpVar.g = false;
                return;
            case 12:
                Object obj2 = this.a;
                ((MainActivityLayout) obj2).invalidate();
                ((ConstraintLayout) obj2).requestLayout();
                return;
            case 13:
                myl mylVar = (myl) this.a;
                nbb nbbVar = mylVar.f;
                if (nbbVar != null) {
                    nbbVar.f(ltg.MEDIA_STORE);
                }
                luj lujVar = mylVar.g;
                lujVar.getClass();
                lujVar.d(luf.aN, false);
                ((sgt) myl.a.c().M(5173)).s("Mars not set up");
                return;
            case UrlRequest.Status.READING_RESPONSE /* 14 */:
                ((ModeSliderUi) this.a).b().a();
                return;
            case 15:
                Object obj3 = this.a;
                men menVar = men.a;
                gga ggaVar = (gga) obj3;
                mex mexVar = (mex) ggaVar.d;
                mexVar.j(menVar);
                tpc tpcVarM = sry.a.m();
                if (!tpcVarM.b.C()) {
                    tpcVarM.o();
                }
                Object obj4 = ggaVar.a;
                tph tphVar = tpcVarM.b;
                sry sryVar = (sry) tphVar;
                sryVar.c = ((nkw) obj4).v.T;
                sryVar.b |= 1;
                Object obj5 = ggaVar.c;
                if (!tphVar.C()) {
                    tpcVarM.o();
                }
                ssc sscVar = ((nkw) obj5).v;
                tph tphVar2 = tpcVarM.b;
                sry sryVar2 = (sry) tphVar2;
                sryVar2.d = sscVar.T;
                sryVar2.b |= 2;
                if (!tphVar2.C()) {
                    tpcVarM.o();
                }
                tph tphVar3 = tpcVarM.b;
                sry sryVar3 = (sry) tphVar3;
                sryVar3.g = 2;
                sryVar3.b |= 16;
                long j2 = mexVar.m;
                if (!tphVar3.C()) {
                    tpcVarM.o();
                }
                sry sryVar4 = (sry) tpcVarM.b;
                sryVar4.b = 4 | sryVar4.b;
                sryVar4.e = j2;
                long jI = mexVar.i(menVar);
                if (!tpcVarM.b.C()) {
                    tpcVarM.o();
                }
                Object obj6 = ggaVar.b;
                sry sryVar5 = (sry) tpcVarM.b;
                sryVar5.b = 8 | sryVar5.b;
                sryVar5.f = jI;
                sry sryVar6 = (sry) tpcVarM.l();
                tpc tpcVarM2 = sod.a.m();
                soc socVar = soc.MODE_SWITCH_ANIMATION_EVENT;
                if (!tpcVarM2.b.C()) {
                    tpcVarM2.o();
                }
                tph tphVar4 = tpcVarM2.b;
                sod sodVar = (sod) tphVar4;
                sodVar.f = socVar.aJ;
                sodVar.b |= 1;
                if (!tphVar4.C()) {
                    tpcVarM2.o();
                }
                sod sodVar2 = (sod) tpcVarM2.b;
                sryVar6.getClass();
                sodVar2.P = sryVar6;
                sodVar2.c |= 131072;
                ((mdy) obj6).I(tpcVarM2);
                return;
            case 16:
                Object obj7 = ((NotificationChipView) this.a).h.b;
                if (obj7 != null) {
                    ((AnimatorSet) obj7).start();
                    return;
                }
                return;
            case 17:
                ((PopupWindow) this.a).dismiss();
                return;
            case 18:
                Iterator it = this.a.iterator();
                while (it.hasNext()) {
                    ((nbn) it.next()).a();
                }
                return;
            case 19:
                ((nca) this.a).f();
                return;
            default:
                this.a.a();
                return;
        }
    }

    public mub(Object obj, int i, byte[] bArr) {
        this.b = i;
        this.a = obj;
    }
}
