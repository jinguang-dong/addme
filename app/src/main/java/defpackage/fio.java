package defpackage;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.hardware.camera2.CaptureRequest;
import android.os.Handler;
import android.os.SystemClock;
import android.view.View;
import android.widget.TextView;
import com.google.android.apps.camera.camcorder.ui.modeslider.recordspeed.RecordSpeedSlider;
import com.google.android.apps.camera.camerafatalerror.CameraFatalErrorTrackerDatabase;
import com.google.ar.core.ImageMetadata;
import com.google.ar.core.R;
import j$.util.function.Consumer$CC;
import java.util.function.Consumer;
import org.chromium.net.UrlRequest;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class fio implements Consumer {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ fio(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    /* JADX WARN: Type inference failed for: r11v40, types: [java.lang.Object, java.util.Set] */
    @Override // java.util.function.Consumer
    /* renamed from: accept */
    public final void d(Object obj) throws Resources.NotFoundException, NumberFormatException {
        hck hckVarB;
        nfh nfhVar;
        int i = 5;
        switch (this.b) {
            case 0:
                ((fig) this.a).g((fjk) obj);
                break;
            case 1:
                lss lssVarA = ((fip) this.a).C.a((ltd) obj);
                if (lssVarA != null) {
                    lssVarA.ab();
                    break;
                }
                break;
            case 2:
                jod.i();
                break;
            case 3:
                lsu lsuVar = (lsu) obj;
                ltg ltgVar = lsuVar.a.c;
                Object obj2 = this.a;
                ltd ltdVarA = ltd.a();
                if (ltgVar == ltg.MARS_STORE) {
                    pos posVar = lsuVar.b;
                    nzf nzfVarA = lsy.a();
                    nzfVarA.h(posVar.b());
                    nzfVarA.g(ltf.COTTAGE);
                    hckVarB = ((fje) obj2).i.a(ltdVarA, nzfVarA.e(), ltgVar, false);
                } else {
                    hckVarB = ((fje) obj2).i.b(lsuVar.b.b(), ltdVarA, ltgVar);
                }
                hbw hbwVar = ((fje) obj2).m;
                hbwVar.v(hckVarB);
                hbwVar.s();
                break;
            case 4:
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                tpc tpcVar = (tpc) this.a;
                if (!tpcVar.b.C()) {
                    tpcVar.o();
                }
                szw szwVar = (szw) tpcVar.b;
                szw szwVar2 = szw.a;
                szwVar.b |= 16;
                szwVar.c = zBooleanValue;
                break;
            case 5:
                TextView textView = ((fke) this.a).i;
                textView.getClass();
                textView.setText((CharSequence) obj);
                break;
            case 6:
                ((imi) this.a).f((nan) obj);
                break;
            case 7:
                ((imi) this.a).a((nan) obj);
                break;
            case 8:
                if (((tfc) obj) == tfc.NONE) {
                    Object obj3 = this.a;
                    long jElapsedRealtime = SystemClock.elapsedRealtime();
                    tpc tpcVar2 = ((flw) obj3).g;
                    if (!tpcVar2.b.C()) {
                        tpcVar2.o();
                    }
                    spf spfVar = (spf) tpcVar2.b;
                    spf spfVar2 = spf.a;
                    spfVar.b |= 16;
                    spfVar.g = jElapsedRealtime;
                    break;
                }
                break;
            case 9:
                String str = (String) obj;
                tpc tpcVar3 = (tpc) this.a;
                if (!tpcVar3.b.C()) {
                    tpcVar3.o();
                }
                spf spfVar3 = (spf) tpcVar3.b;
                spf spfVar4 = spf.a;
                str.getClass();
                spfVar3.b |= ImageMetadata.SHADING_MODE;
                spfVar3.w = str;
                break;
            case 10:
                long jLongValue = ((Long) obj).longValue();
                tpc tpcVar4 = (tpc) this.a;
                if (!tpcVar4.b.C()) {
                    tpcVar4.o();
                }
                spf spfVar5 = (spf) tpcVar4.b;
                spf spfVar6 = spf.a;
                spfVar5.b |= 2097152;
                spfVar5.x = jLongValue;
                break;
            case 11:
                szx szxVar = ((tee) obj).b;
                tpc tpcVarM = spa.a.m();
                spb spbVar = spb.a;
                tpc tpcVarM2 = spbVar.m();
                int i2 = szxVar.c;
                if (!tpcVarM2.b.C()) {
                    tpcVarM2.o();
                }
                tph tphVar = tpcVarM2.b;
                spb spbVar2 = (spb) tphVar;
                spbVar2.b |= 1;
                spbVar2.c = i2;
                int i3 = szxVar.e;
                if (!tphVar.C()) {
                    tpcVarM2.o();
                }
                tph tphVar2 = tpcVarM2.b;
                spb spbVar3 = (spb) tphVar2;
                spbVar3.b |= 4;
                spbVar3.e = i3;
                int i4 = szxVar.d;
                if (!tphVar2.C()) {
                    tpcVarM2.o();
                }
                spb spbVar4 = (spb) tpcVarM2.b;
                spbVar4.b |= 2;
                spbVar4.d = i4;
                spb spbVar5 = (spb) tpcVarM2.l();
                if (!tpcVarM.b.C()) {
                    tpcVarM.o();
                }
                spa spaVar = (spa) tpcVarM.b;
                spbVar5.getClass();
                spaVar.c = spbVar5;
                spaVar.b |= 1;
                tpc tpcVarM3 = spbVar.m();
                int i5 = szxVar.f;
                if (!tpcVarM3.b.C()) {
                    tpcVarM3.o();
                }
                tph tphVar3 = tpcVarM3.b;
                spb spbVar6 = (spb) tphVar3;
                spbVar6.b = 1 | spbVar6.b;
                spbVar6.c = i5;
                int i6 = szxVar.h;
                if (!tphVar3.C()) {
                    tpcVarM3.o();
                }
                tph tphVar4 = tpcVarM3.b;
                spb spbVar7 = (spb) tphVar4;
                spbVar7.b |= 4;
                spbVar7.e = i6;
                int i7 = szxVar.g;
                if (!tphVar4.C()) {
                    tpcVarM3.o();
                }
                spb spbVar8 = (spb) tpcVarM3.b;
                spbVar8.b |= 2;
                spbVar8.d = i7;
                spb spbVar9 = (spb) tpcVarM3.l();
                if (!tpcVarM.b.C()) {
                    tpcVarM.o();
                }
                Object obj4 = this.a;
                spa spaVar2 = (spa) tpcVarM.b;
                spbVar9.getClass();
                spaVar2.d = spbVar9;
                spaVar2.b |= 2;
                spa spaVar3 = (spa) tpcVarM.l();
                tpc tpcVar5 = ((flw) obj4).g;
                if (!tpcVar5.b.C()) {
                    tpcVar5.o();
                }
                spf spfVar7 = (spf) tpcVar5.b;
                spf spfVar8 = spf.a;
                spaVar3.getClass();
                tpw tpwVar = spfVar7.y;
                if (!tpwVar.c()) {
                    spfVar7.y = tph.v(tpwVar);
                }
                spfVar7.y.add(spaVar3);
                break;
            case 12:
                this.a.add(new pej((CaptureRequest.Key) obj, true));
                break;
            case 13:
                Object obj5 = this.a;
                gln glnVar = (gln) obj5;
                ocq ocqVar = glnVar.x;
                String str2 = (String) obj;
                if (ocqVar.ai(str2) == 0) {
                    int i8 = glnVar.n;
                    glnVar.i.m(i8);
                    View childAt = glnVar.i.getChildAt(i8);
                    if (!((Boolean) glnVar.a.get(i8)).booleanValue() && childAt != null) {
                        RecordSpeedSlider recordSpeedSlider = glnVar.i;
                        ryo ryoVar = recordSpeedSlider.b;
                        recordSpeedSlider.m(i8);
                        String str3 = (String) ryoVar.b(Integer.valueOf(i8)).get(2);
                        childAt.requestLayout();
                        glnVar.j.close();
                        int dimensionPixelSize = childAt.getResources().getDimensionPixelSize(R.dimen.record_speed_slider_tooltip_padding);
                        int iOrdinal = glnVar.p.ordinal();
                        if (iOrdinal == 0) {
                            nfhVar = new nfh(str3);
                            nfhVar.o(childAt);
                            nfhVar.h();
                        } else if (iOrdinal == 1) {
                            nfhVar = new nfh(str3);
                            nfhVar.i(childAt, dimensionPixelSize);
                            nfhVar.h();
                        } else if (iOrdinal == 2) {
                            nfhVar = new nfh(str3);
                            nfhVar.g(childAt, dimensionPixelSize);
                            nfhVar.h();
                        }
                        nfhVar.j();
                        nfhVar.k();
                        nfhVar.l();
                        nfhVar.c = 300;
                        nfhVar.d = 3800;
                        nfhVar.k = 5;
                        nfhVar.e(new cmu(obj5, i8, 10, null), glnVar.e);
                        nfhVar.e = false;
                        nfhVar.l = glnVar.u;
                        glnVar.j = nfhVar.a();
                        glnVar.t.j().d(glnVar.j);
                    }
                    ocqVar.ak(str2);
                    break;
                }
                break;
            case UrlRequest.Status.READING_RESPONSE /* 14 */:
                got gotVar = (got) this.a;
                Object obj6 = gotVar.b;
                gpf gpfVar = (gpf) obj;
                gpb gpbVarY = ((CameraFatalErrorTrackerDatabase) gotVar.c).y();
                cxb cxbVar = (cxb) obj6;
                int iQ = cxbVar.q();
                if (gpfVar == gpf.BACK_UNOPENABLE || gpfVar == gpf.FRONT_UNOPENABLE || gpfVar == gpf.UNOPENABLE) {
                    iQ = cxbVar.s();
                }
                dei.a(((gpe) gpbVarY).a, false, true, new bgx(gpfVar, iQ, i));
                break;
            case 15:
                ((gso) obj).d((gpr) this.a);
                break;
            case 16:
                ((gso) obj).d((gpr) this.a);
                break;
            case 17:
                ((gpq) this.a).c = (Drawable) obj;
                break;
            case 18:
                long j = ((mdq) obj).a;
                Long lValueOf = Long.valueOf(j);
                tpc tpcVarM4 = sod.a.m();
                soc socVar = soc.SHOTLOSS_EVENT;
                if (!tpcVarM4.b.C()) {
                    tpcVarM4.o();
                }
                sod sodVar = (sod) tpcVarM4.b;
                sodVar.f = socVar.aJ;
                sodVar.b |= 1;
                tpc tpcVarM5 = stl.a.m();
                tpc tpcVarM6 = stk.a.m();
                lValueOf.getClass();
                if (!tpcVarM6.b.C()) {
                    tpcVarM6.o();
                }
                stk stkVar = (stk) tpcVarM6.b;
                stkVar.b = 1 | stkVar.b;
                stkVar.c = j;
                if (!tpcVarM5.b.C()) {
                    tpcVarM5.o();
                }
                stl stlVar = (stl) tpcVarM5.b;
                stk stkVar2 = (stk) tpcVarM6.l();
                stkVar2.getClass();
                tpw tpwVar2 = stlVar.b;
                if (!tpwVar2.c()) {
                    stlVar.b = tph.v(tpwVar2);
                }
                stlVar.b.add(stkVar2);
                if (!tpcVarM4.b.C()) {
                    tpcVarM4.o();
                }
                Object obj7 = this.a;
                sod sodVar2 = (sod) tpcVarM4.b;
                stl stlVar2 = (stl) tpcVarM5.l();
                stlVar2.getClass();
                sodVar2.ag = stlVar2;
                sodVar2.d |= 64;
                ((heb) obj7).j.I(tpcVarM4);
                break;
            case 19:
                ((hvp) this.a).e.postDelayed((Runnable) obj, hvp.a.toMillis());
                break;
            default:
                ((Handler) this.a).removeCallbacks((Runnable) obj);
                break;
        }
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        switch (this.b) {
        }
        return Consumer$CC.$default$andThen(this, consumer);
    }
}
