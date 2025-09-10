package defpackage;

import android.content.Intent;
import android.content.res.Resources;
import com.google.android.apps.camera.ui.hotshot.HotshotController;
import com.google.android.apps.camera.ui.layout.MainActivityLayout;
import com.google.ar.core.R;
import j$.util.Collection;
import j$.util.Optional;
import j$.util.stream.Collectors;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import org.chromium.net.UrlRequest;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class mix implements pau {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ mix(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    /* JADX WARN: Type inference failed for: r13v10, types: [java.lang.Object, ndj] */
    /* JADX WARN: Type inference failed for: r13v13, types: [java.lang.Object, ndj] */
    @Override // defpackage.pau
    public final void a(Object obj) throws Resources.NotFoundException {
        int i = 3;
        switch (this.b) {
            case 0:
                float fFloatValue = ((Float) obj).floatValue();
                mje mjeVar = (mje) this.a;
                mjeVar.s.a(Float.valueOf(fFloatValue * mjeVar.Y));
                return;
            case 1:
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                Object obj2 = this.a;
                boolean z = zBooleanValue && ((mje) obj2).z.l();
                ree reeVar = ((mje) obj2).af;
                if (((AtomicBoolean) reeVar.g).get()) {
                    ((kcs) reeVar.e).a(false);
                    return;
                }
                if (z) {
                    reeVar.c.aB();
                    ((kcs) reeVar.e).a(true);
                } else {
                    reeVar.c.aC();
                    ((kcs) reeVar.e).a(false);
                }
                ((kqy) reeVar.b).g(z, R.drawable.gs_night_sight_auto_vd_theme_24, R.string.cam_more_light_ns, "UpdateIndicator", krs.BACK_TIMELAPSE_MORE_LIGHT);
                return;
            case 2:
                kqw kqwVar = (kqw) obj;
                ((pfu) this.a).n(jea.v(kqwVar.a, kqwVar.c));
                return;
            case 3:
                mje mjeVar2 = (mje) this.a;
                pfu pfuVar = mjeVar2.aa;
                pfuVar.getClass();
                mjeVar2.m(pfuVar);
                return;
            case 4:
                if (((Boolean) obj).booleanValue()) {
                    mjl mjlVar = (mjl) this.a;
                    cxb cxbVar = mjlVar.T;
                    if (fdo.r(cxbVar)) {
                        mjlVar.g();
                        if (cxbVar.g() != null) {
                            Intent intentG = cxbVar.g();
                            intentG.getClass();
                            fdo.e(intentG);
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            case 5:
                Object obj3 = this.a;
                mjl mjlVar2 = (mjl) obj3;
                if (mjlVar2.l.d != mii.STATE_IDLE) {
                    return;
                }
                mjlVar2.s.a(true);
                jea.A(mjlVar2.j, mjlVar2.R, mjlVar2.V, mjlVar2.Y);
                mjlVar2.D.h(new mjh(obj3, i), true);
                return;
            case 6:
                mjl mjlVar3 = (mjl) this.a;
                Boolean bool = (Boolean) obj;
                if (((mii) mjlVar3.l.d).equals(mii.STATE_IDLE) && bool.booleanValue()) {
                    mjlVar3.f.set(true);
                    return;
                }
                return;
            case 7:
                List list = (List) obj;
                boolean zBooleanValue2 = ((Boolean) list.get(0)).booleanValue();
                boolean zBooleanValue3 = ((Boolean) list.get(1)).booleanValue();
                mmk mmkVar = (mmk) this.a;
                AtomicBoolean atomicBoolean = mmkVar.a;
                if (atomicBoolean.get() != zBooleanValue3) {
                    atomicBoolean.set(zBooleanValue3);
                }
                mmkVar.b.set(zBooleanValue2);
                if (list.size() > 2) {
                    boolean zBooleanValue4 = ((Boolean) list.get(2)).booleanValue();
                    boolean zBooleanValue5 = ((Boolean) list.get(3)).booleanValue();
                    AtomicBoolean atomicBoolean2 = mmkVar.c;
                    if (atomicBoolean2.get() != zBooleanValue5) {
                        atomicBoolean2.set(zBooleanValue5);
                    }
                    mmkVar.d.set(zBooleanValue4);
                }
                mmkVar.g.m(mmkVar.a());
                rwc rwcVar = mmkVar.e;
                if (rwcVar.h()) {
                    ((ntr) rwcVar.c()).h(mmkVar.a());
                    return;
                }
                return;
            case 8:
                mni mniVar = (mni) this.a;
                rjh rjhVar = mniVar.c;
                if (rjhVar != null) {
                    if (((muj) mniVar.b.dL()).b == 5) {
                        rjhVar.a().e = mniVar.c();
                    } else {
                        rjhVar.a().e = -1;
                        rjhVar.a().ar(3);
                    }
                    if (rjhVar.isShowing()) {
                        rjhVar.dismiss();
                        rjhVar.show();
                        return;
                    }
                    return;
                }
                return;
            case 9:
                nkw nkwVar = (nkw) obj;
                mte mteVar = (mte) this.a;
                mteVar.v(nkwVar);
                nkw nkwVar2 = nkw.UNINITIALIZED;
                int iOrdinal = nkwVar.ordinal();
                if (iOrdinal == 5) {
                    String strB = mteVar.o.b(nkw.SLOW_MOTION);
                    mteVar.p = 4;
                    mteVar.s(strB);
                    String string = mteVar.g.getString(R.string.slo_mo_entrypoint_desc);
                    string.getClass();
                    mteVar.o(string);
                    mteVar.p(null);
                    mteVar.q(Integer.valueOf(R.drawable.gs_slow_motion_video_vd_theme_48));
                    return;
                }
                if (iOrdinal == 13) {
                    if (!mteVar.q.p(gym.au)) {
                        mteVar.m();
                        return;
                    }
                    Float f = (Float) mteVar.c.dL();
                    mteVar.p = 2;
                    f.getClass();
                    mteVar.s(String.valueOf(ukj.x(f.floatValue())));
                    String string2 = mteVar.g.getString(R.string.blur_entrypoint_desc);
                    string2.getClass();
                    mteVar.o(string2);
                    mteVar.p(null);
                    mteVar.q(Integer.valueOf(R.drawable.gs_blur_on_fill1_vd_theme_48));
                    return;
                }
                if (iOrdinal == 10) {
                    if (((Optional) mteVar.e.dL()).isPresent()) {
                        mteVar.n();
                        return;
                    } else {
                        mteVar.m();
                        return;
                    }
                }
                if (iOrdinal != 11) {
                    mteVar.m();
                    return;
                }
                String strC = mteVar.o.c();
                mteVar.p = 3;
                mteVar.s(strC);
                String string3 = mteVar.g.getString(R.string.timelapse_entrypoint_desc);
                string3.getClass();
                mteVar.o(string3);
                mteVar.p(null);
                mteVar.q(Integer.valueOf(R.drawable.gs_fast_forward_vd_theme_48));
                return;
            case 10:
                ((mud) this.a).l();
                return;
            case 11:
                ((HotshotController) this.a).o();
                return;
            case 12:
                ((HotshotController) this.a).o();
                return;
            case 13:
                ((HotshotController) this.a).o();
                return;
            case UrlRequest.Status.READING_RESPONSE /* 14 */:
                HotshotController hotshotController = (HotshotController) this.a;
                if (hotshotController.s()) {
                    hotshotController.r(hotshotController.K);
                    return;
                }
                return;
            case 15:
                ((HotshotController) this.a).f();
                return;
            case 16:
                ((mwt) this.a).a((mwv) obj);
                return;
            case 17:
                naj najVar = (naj) obj;
                mzk mzkVar = (mzk) this.a;
                mzkVar.i(najVar);
                mzkVar.k(najVar.b);
                return;
            case 18:
                Object obj4 = this.a;
                Integer num = (Integer) obj;
                synchronized (((ngk) obj4).b) {
                    ngp ngpVar = ((ngk) obj4).g;
                    if (ngpVar == null) {
                        return;
                    }
                    if (((ngk) obj4).j != ngpVar.a && ((ngk) obj4).k == num.intValue()) {
                        ((sgt) ngk.a.c().M(5373)).E("%s sensor orientation(%d) is not changed, wait for next callback.", ((ngk) obj4).g.a, num);
                        return;
                    }
                    ((ngk) obj4).j = ((ngk) obj4).g.a;
                    ((ngk) obj4).k = num.intValue();
                    MainActivityLayout mainActivityLayout = ((ngk) obj4).c;
                    pas pasVar = ((ngk) obj4).g.b;
                    mainActivityLayout.m(pasVar.a, pasVar.b, num);
                    return;
                }
            case 19:
                ltw ltwVar = (ltw) obj;
                njz njzVar = (njz) this.a;
                if (njzVar.l.f()) {
                    return;
                }
                if (ltwVar == ltw.AUTO) {
                    tzj tzjVar = njzVar.d;
                    if (((mbj) tzjVar.a()).m()) {
                        return;
                    }
                    ((nqp) njzVar.j.a()).n();
                    mbj mbjVar = (mbj) tzjVar.a();
                    ovx ovxVar = (ovx) mbjVar.b;
                    rnt.O(ovxVar.d == fuu.DISABLED, "Cannot transition to IDLE from %s", ovxVar.d);
                    mbjVar.k(fuu.b);
                    if (njzVar.m.t()) {
                        return;
                    }
                    ((mbj) tzjVar.a()).j();
                    return;
                }
                tzj tzjVar2 = njzVar.d;
                if (((mbj) tzjVar2.a()).m()) {
                    ((nqp) njzVar.j.a()).j();
                    mbj mbjVar2 = (mbj) tzjVar2.a();
                    ovx ovxVar2 = (ovx) mbjVar2.b;
                    Object obj5 = ovxVar2.d;
                    fuu fuuVar = fuu.b;
                    rnt.O(obj5 == fuuVar, "Cannot transition to DISABLED from %s", ovxVar2.d);
                    mbjVar2.k(fuu.DISABLED);
                    if (njzVar.m.t()) {
                        return;
                    }
                    ((mbj) tzjVar2.a()).h();
                    return;
                }
                return;
            default:
                sbp sbpVar = (sbp) obj;
                ((nph) this.a).j(sbpVar);
                Collection.EL.stream(sbpVar).map(new mcx(8)).collect(Collectors.joining(","));
                return;
        }
    }
}
