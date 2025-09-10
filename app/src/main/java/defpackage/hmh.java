package defpackage;

import com.google.android.apps.camera.filmstrip.transition.FilmstripTransitionLayout;
import com.google.ar.core.R;
import j$.util.Optional;
import java.util.ArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;
import org.chromium.net.UrlRequest;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hmh implements tzt {
    private final tzx a;
    private final /* synthetic */ int b;

    public hmh(tzx tzxVar, int i) {
        this.b = i;
        this.a = tzxVar;
    }

    @Override // defpackage.uem, defpackage.uel
    public final /* synthetic */ Object a() {
        switch (this.b) {
            case 0:
                hlg hlgVar = (hlg) this.a.a();
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                if (!Pattern.matches("feature\\.[a-z0-9\\-]+\\.[a-z0-9\\-]+\\.[a-z0-9\\-]+(:\\d+)?", "feature.acmi.camera.motion-sharpness")) {
                    throw new IllegalArgumentException("Feature with bad type name 'feature.acmi.camera.motion-sharpness'!");
                }
                arrayList.add(hlgVar);
                return hgc.f("feature.acmi.camera.motion-sharpness", arrayList, arrayList2);
            case 1:
                return hgc.e((hlg) this.a.a());
            case 2:
                hmx hmxVar = new hmx((hlg) this.a.a());
                hmxVar.c(TimeUnit.MINUTES);
                hmxVar.b = 30;
                hmxVar.a = 3;
                hmxVar.c = 5;
                hmxVar.b();
                return hmxVar.a();
            case 3:
                hmx hmxVar2 = new hmx((hlg) this.a.a());
                hmxVar2.c(TimeUnit.MINUTES);
                hmxVar2.b = 30;
                hmxVar2.a = 1;
                hmxVar2.c = 5;
                hmxVar2.b();
                return hmxVar2.a();
            case 4:
                hlg hlgVar2 = (hlg) this.a.a();
                ArrayList arrayList3 = new ArrayList();
                ArrayList arrayList4 = new ArrayList();
                if (!Pattern.matches("feature\\.[a-z0-9\\-]+\\.[a-z0-9\\-]+\\.[a-z0-9\\-]+(:\\d+)?", "feature.acmi.imu.frame-straightness")) {
                    throw new IllegalArgumentException("Feature with bad type name 'feature.acmi.imu.frame-straightness'!");
                }
                arrayList3.add(hlgVar2);
                return hgc.f("feature.acmi.imu.frame-straightness", arrayList3, arrayList4);
            case 5:
                hmx hmxVar3 = new hmx((hlg) this.a.a());
                hmxVar3.c(TimeUnit.MINUTES);
                hmxVar3.b = 50;
                hmxVar3.a = 3;
                hmxVar3.c = 5;
                hmxVar3.b();
                return hmxVar3.a();
            case 6:
                return (FilmstripTransitionLayout) ((ngy) this.a).a().c(R.id.filmstrip_transition_layout);
            case 7:
                return new hpa(null);
            case 8:
                return new cxb(((kup) this.a).a());
            case 9:
                return new hpt((hps) this.a.a(), TimeUnit.NANOSECONDS.convert(500L, TimeUnit.MICROSECONDS));
            case 10:
                return !((hbj) this.a.a()).p(gzb.e) ? rvk.a : rwc.j(ojl.bZ("ff-analysis"));
            case 11:
                return new hrm((Executor) this.a.a());
            case 12:
                return Boolean.valueOf(((hbj) this.a.a()).p(gyo.f));
            case 13:
                luj lujVar = (luj) this.a.a();
                lujVar.getClass();
                owq owqVarA = lujVar.a(luf.M);
                ksa ksaVar = ksa.SERENGETI_NS_OFF;
                ksa ksaVar2 = ksa.SERENGETI_NS_AUTO;
                ksa ksaVar3 = ksa.SERENGETI_NS_ON;
                krp krpVar = new krp(owqVarA, "auto", "off", ksaVar, "auto", ksaVar2, "on", ksaVar3);
                ksh kshVarM = ksi.m();
                kshVarM.n(krs.SERENGETI_NIGHT_SIGHT);
                kshVarM.a = krpVar;
                kshVarM.h(R.string.night_sight);
                kshVarM.c(R.string.night_sight);
                kshVarM.b = new hsj(0);
                kshVarM.b(ksaVar, R.drawable.gs_block_vd_theme_24, R.string.night_sight_off, R.string.night_sight_off_desc);
                kshVarM.b(ksaVar2, R.drawable.gs_night_sight_auto_vd_theme_24, R.string.night_sight_auto, R.string.night_sight_auto_desc);
                kshVarM.b(ksaVar3, R.drawable.gs_clear_night_vd_theme_24, R.string.night_sight_on, R.string.night_sight_on_desc);
                return kshVarM.a();
            case UrlRequest.Status.READING_RESPONSE /* 14 */:
                owq owqVar = (owq) this.a.a();
                owqVar.getClass();
                owf owfVarA = owb.a(owqVar);
                owfVarA.getClass();
                return owfVarA;
            case 15:
                return ((ngx) this.a).a().c;
            case 16:
                hbj hbjVar = (hbj) this.a.a();
                hbjVar.getClass();
                hbjVar.p(gzp.k);
                return Optional.empty();
            case 17:
                owf owfVar = (owf) this.a.a();
                owfVar.getClass();
                owf owfVarH = owl.h(owfVar, new hia(2));
                owfVarH.getClass();
                return owfVarH;
            case 18:
                return new iso((hbj) this.a.a(), hmp.b(), (char[]) null);
            case 19:
                return new ezh((hbj) this.a.a());
            default:
                gzi gziVar = gzq.a;
                sfd sfdVar = sfd.a;
                sfdVar.getClass();
                return sfdVar;
        }
    }
}
