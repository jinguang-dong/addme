package defpackage;

import android.content.res.Resources;
import android.graphics.Rect;
import android.hardware.camera2.CaptureResult;
import com.google.android.apps.camera.ui.hotshot.HotshotController;
import com.google.ar.core.R;
import j$.time.Duration;
import j$.util.Collection;
import j$.util.Optional;
import java.util.ArrayList;
import java.util.Locale;
import java.util.concurrent.Executor;
import org.chromium.net.UrlRequest;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class mtd implements pau {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ mtd(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    /* JADX WARN: Type inference failed for: r0v50, types: [java.lang.Object, java.util.Collection] */
    /* JADX WARN: Type inference failed for: r11v49, types: [java.lang.Object, owq] */
    @Override // defpackage.pau
    public final void a(Object obj) throws Resources.NotFoundException {
        String string;
        mhh mhhVar;
        int i = 3;
        String quantityString = null;
        switch (this.b) {
            case 0:
                mtp mtpVar = (mtp) obj;
                mte mteVar = (mte) this.a;
                owf owfVar = mteVar.b;
                Object objDL = owfVar.dL();
                nkw nkwVar = nkw.NIGHT_SIGHT;
                if (objDL != nkwVar) {
                    Object objDL2 = owfVar.dL();
                    objDL2.getClass();
                    if (!mteVar.z((nkw) objDL2) || !((Boolean) mteVar.d.d().dL()).booleanValue()) {
                        return;
                    }
                }
                if (mtpVar == mtp.OFF || (owfVar.dL() == nkwVar && ((Optional) mteVar.e.dL()).isEmpty())) {
                    mteVar.m();
                    return;
                }
                if (mteVar.p != 5) {
                    mteVar.n();
                    return;
                }
                mteVar.q(Integer.valueOf(mte.B(mtpVar)));
                Resources resources = mteVar.g;
                String lowerCase = mtpVar.toString().toLowerCase(Locale.ROOT);
                lowerCase.getClass();
                String string2 = resources.getString(R.string.night_sight_entrypoint_desc, lowerCase);
                string2.getClass();
                mteVar.o(string2);
                owf owfVar2 = mteVar.e;
                if (((Optional) owfVar2.dL()).isPresent()) {
                    int iA = mte.A((Duration) ((Optional) owfVar2.dL()).get());
                    quantityString = resources.getQuantityString(R.plurals.capture_time_label_desc, iA, Integer.valueOf(iA));
                }
                mteVar.p(quantityString);
                return;
            case 1:
                Optional optional = (Optional) obj;
                mte mteVar2 = (mte) this.a;
                hyh hyhVar = mteVar2.d;
                if (((Boolean) hyhVar.d().dL()).booleanValue() || (mteVar2.b.dL() == nkw.NIGHT_SIGHT && !hyhVar.k())) {
                    owf owfVar3 = mteVar2.f;
                    if (owfVar3.dL() != mtp.OFF) {
                        Resources resources2 = mteVar2.g;
                        String lowerCase2 = ((mtp) owfVar3.dL()).toString().toLowerCase(Locale.ROOT);
                        lowerCase2.getClass();
                        String string3 = resources2.getString(R.string.night_sight_entrypoint_desc, lowerCase2);
                        string3.getClass();
                        mteVar2.o(string3);
                        if (optional.isEmpty()) {
                            mteVar2.s(null);
                            mteVar2.p(null);
                            return;
                        } else {
                            int iA2 = mte.A((Duration) optional.get());
                            Integer numValueOf = Integer.valueOf(iA2);
                            mteVar2.s(resources2.getString(R.string.time_remaining, numValueOf));
                            mteVar2.p(resources2.getQuantityString(R.plurals.capture_time_label_desc, iA2, numValueOf));
                            return;
                        }
                    }
                    return;
                }
                return;
            case 2:
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                mte mteVar3 = (mte) this.a;
                if (mteVar3.b.dL() != nkw.NIGHT_SIGHT) {
                    return;
                }
                if (!zBooleanValue) {
                    if (((Optional) mteVar3.e.dL()).isEmpty()) {
                        mteVar3.m();
                        return;
                    } else {
                        mteVar3.n();
                        return;
                    }
                }
                mteVar3.p = 6;
                mteVar3.s(null);
                String string4 = mteVar3.g.getString(R.string.astro_entrypoint_desc);
                string4.getClass();
                mteVar3.o(string4);
                mteVar3.p(null);
                mteVar3.q(Integer.valueOf(R.drawable.gs_astrophotography_mode_fill1_vd_theme_24));
                return;
            case 3:
                Boolean bool = (Boolean) obj;
                bool.booleanValue();
                mte mteVar4 = (mte) this.a;
                mteVar4.i.b(bool);
                if (mteVar4.y()) {
                    string = mteVar4.g.getString(R.string.manual_controls_entrypoint_selected_desc);
                    string.getClass();
                } else {
                    int i2 = mteVar4.p;
                    nkw nkwVar2 = nkw.UNINITIALIZED;
                    int i3 = i2 - 1;
                    if (i2 == 0) {
                        throw null;
                    }
                    if (i3 == 0) {
                        string = mteVar4.g.getString(R.string.manual_controls_entrypoint_desc);
                        string.getClass();
                    } else if (i3 == 1) {
                        string = mteVar4.g.getString(R.string.blur_entrypoint_desc);
                        string.getClass();
                    } else if (i3 == 2) {
                        string = mteVar4.g.getString(R.string.timelapse_entrypoint_desc);
                        string.getClass();
                    } else if (i3 == 3) {
                        string = mteVar4.g.getString(R.string.slo_mo_entrypoint_desc);
                        string.getClass();
                    } else if (i3 == 4) {
                        mtp mtpVar2 = (mtp) mteVar4.f.dL();
                        Resources resources3 = mteVar4.g;
                        String lowerCase3 = mtpVar2.toString().toLowerCase(Locale.ROOT);
                        lowerCase3.getClass();
                        string = resources3.getString(R.string.night_sight_entrypoint_desc, lowerCase3);
                        string.getClass();
                    } else {
                        if (i3 != 5) {
                            throw new uet();
                        }
                        string = mteVar4.g.getString(R.string.astro_entrypoint_desc);
                        string.getClass();
                    }
                }
                mteVar4.o(string);
                int i4 = mteVar4.p;
                nkw nkwVar3 = nkw.UNINITIALIZED;
                int i5 = i4 - 1;
                if (i4 == 0) {
                    throw null;
                }
                if (i5 == 4) {
                    Optional optional2 = (Optional) mteVar4.e.dL();
                    if (optional2.isPresent()) {
                        int iA3 = mte.A((Duration) optional2.get());
                        quantityString = mteVar4.g.getQuantityString(R.plurals.capture_time_label_desc, iA3, Integer.valueOf(iA3));
                    }
                }
                mteVar4.p(quantityString);
                return;
            case 4:
                mxm mxmVar = (mxm) obj;
                mte mteVar5 = (mte) this.a;
                mxm mxmVarA = mteVar5.a();
                mxmVarA.getClass();
                mteVar5.j.b(mxmVarA);
                mxmVar.getClass();
                mteVar5.k.b(mxmVar);
                return;
            case 5:
                mxj mxjVar = (mxj) obj;
                mxjVar.getClass();
                ((mte) this.a).l.b(mxjVar);
                return;
            case 6:
                boolean zBooleanValue2 = ((Boolean) obj).booleanValue();
                Object obj2 = this.a;
                if (zBooleanValue2) {
                    ((mte) obj2).u(false);
                    return;
                }
                mte mteVar6 = (mte) obj2;
                Object objDL3 = mteVar6.b.dL();
                objDL3.getClass();
                mteVar6.v((nkw) objDL3);
                return;
            case 7:
                float fFloatValue = ((Float) obj).floatValue();
                mte mteVar7 = (mte) this.a;
                if (((nkw) mteVar7.b.dL()).equals(nkw.AMBER)) {
                    mteVar7.s(String.valueOf(ukj.x(fFloatValue)));
                    return;
                }
                return;
            case 8:
                boolean zBooleanValue3 = ((Boolean) obj).booleanValue();
                mte mteVar8 = (mte) this.a;
                Object objDL4 = mteVar8.b.dL();
                objDL4.getClass();
                if (mteVar8.z((nkw) objDL4)) {
                    if (!zBooleanValue3 || mteVar8.f.dL() == mtp.OFF) {
                        mteVar8.m();
                        return;
                    } else {
                        mteVar8.n();
                        return;
                    }
                }
                return;
            case 9:
                ((HotshotController) this.a).o();
                return;
            case 10:
                int iOrdinal = ((mvt) obj).ordinal();
                Object obj3 = this.a;
                if (iOrdinal != 0) {
                    if (iOrdinal != 1) {
                        if (iOrdinal != 2) {
                            if (iOrdinal == 3) {
                                mwp mwpVar = (mwp) obj3;
                                if (mwpVar.h != 3) {
                                    mwpVar.h = 2;
                                    return;
                                }
                                return;
                            }
                            if (iOrdinal != 4) {
                                return;
                            }
                        }
                    }
                    ((mwp) obj3).a();
                    return;
                }
                ((Executor) ((mwp) obj3).d.a()).execute(new mub(obj3, 11));
                return;
            case 11:
                boolean zBooleanValue4 = ((Boolean) obj).booleanValue();
                mzk mzkVar = (mzk) this.a;
                sbp sbpVarJ = sbp.j(mzkVar.k.a);
                ArrayList arrayList = new ArrayList();
                sbp sbpVar = sex.a;
                arrayList.addAll(mzkVar.a(sbpVar));
                arrayList.addAll(mzkVar.b(sbpVar));
                sbp sbpVar2 = (sbp) Collection.EL.stream(arrayList).filter(new glx(sbpVarJ, 17)).collect(ryv.a);
                if (zBooleanValue4) {
                    mzkVar.e(sbpVar2);
                    mzkVar.f.f(false, false);
                    return;
                } else {
                    mzkVar.e(sbpVar);
                    mzkVar.f.f(true, true);
                    return;
                }
            case 12:
                if (((Boolean) obj).booleanValue()) {
                    ((njo) this.a).b.c();
                    return;
                }
                return;
            case 13:
                lah lahVar = (lah) obj;
                boolean z = lahVar.b;
                Object obj4 = this.a;
                if (!z) {
                    hie hieVar = ((njo) obj4).c;
                    hieVar.h(false);
                    hieVar.j(hhv.SINGLE);
                    return;
                }
                if (lahVar.a) {
                    njo njoVar = (njo) obj4;
                    hie hieVar2 = njoVar.c;
                    hieVar2.h(false);
                    if (njoVar.d.p(gyv.c)) {
                        hieVar2.j(hhv.SINGLE);
                        return;
                    } else {
                        hieVar2.j(hhv.DUAL_INDEPENDENT);
                        return;
                    }
                }
                njo njoVar2 = (njo) obj4;
                hie hieVar3 = njoVar2.c;
                hieVar3.j(hhv.SINGLE);
                hbj hbjVar = njoVar2.d;
                if (!hbjVar.p(gzs.aa) || hbjVar.p(gyv.c)) {
                    return;
                }
                hieVar3.h(true);
                return;
            case UrlRequest.Status.READING_RESPONSE /* 14 */:
                if (((Boolean) obj).booleanValue()) {
                    ((njo) this.a).e.d.a(true);
                    return;
                }
                return;
            case 15:
                if (((Boolean) obj).booleanValue()) {
                    hie hieVar4 = ((njo) this.a).c;
                    hieVar4.g();
                    hieVar4.i(false);
                    return;
                }
                return;
            case 16:
                njo njoVar3 = (njo) this.a;
                njoVar3.c.j((hhv) njoVar3.a.dL());
                return;
            case 17:
                jnp jnpVar = (jnp) ((njz) this.a).b.c();
                int iBE = qpt.bE(((Integer) obj).intValue()) - 1;
                if (iBE == 0) {
                    i = 1;
                } else if (iBE == 1) {
                    i = 2;
                }
                jnpVar.a = i;
                jnpVar.a();
                return;
            case 18:
                int iIntValue = ((Integer) obj).intValue();
                if (iIntValue == 0) {
                    mhhVar = mhh.OFF;
                } else if (iIntValue == 1) {
                    mhhVar = mhh.AUTO;
                } else {
                    if (iIntValue != 2) {
                        throw new AssertionError("Invalid Macro Focus state.");
                    }
                    mhhVar = mhh.ON;
                }
                njz njzVar = (njz) this.a;
                owq owqVar = njzVar.h;
                if (((mhh) owqVar.dL()).equals(mhhVar)) {
                    return;
                }
                owqVar.a(mhhVar);
                mdy mdyVar = njzVar.o;
                tpc tpcVarM = stv.a.m();
                int iOrdinal2 = mhhVar.ordinal();
                if (iOrdinal2 != 0) {
                    if (iOrdinal2 == 1) {
                        i = 4;
                    } else {
                        if (iOrdinal2 != 2) {
                            throw new RuntimeException(null, null);
                        }
                        i = 2;
                    }
                }
                if (!tpcVarM.b.C()) {
                    tpcVarM.o();
                }
                stv stvVar = (stv) tpcVarM.b;
                stvVar.c = i - 1;
                stvVar.b |= 1;
                ssc sscVar = ((nkw) njzVar.e.dL()).v;
                if (!tpcVarM.b.C()) {
                    tpcVarM.o();
                }
                tph tphVar = tpcVarM.b;
                stv stvVar2 = (stv) tphVar;
                stvVar2.d = sscVar.T;
                stvVar2.b |= 2;
                if (!tphVar.C()) {
                    tpcVarM.o();
                }
                stv stvVar3 = (stv) tpcVarM.b;
                stvVar3.e = 2;
                stvVar3.b |= 4;
                mdyVar.k(sbp.l((stv) tpcVarM.l()));
                if (mhhVar.equals(mhh.ON)) {
                    return;
                }
                njzVar.n.d(luf.r, Boolean.valueOf(mhh.b(mhhVar)));
                return;
            case 19:
                return;
            default:
                if (((Rect) ((pnx) obj).a(CaptureResult.SCALER_CROP_REGION)) == null) {
                    return;
                }
                ((qpt) this.a).aK();
                return;
        }
    }
}
