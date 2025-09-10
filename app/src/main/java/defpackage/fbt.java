package defpackage;

import android.content.res.ColorStateList;
import android.graphics.Color;
import android.graphics.PointF;
import android.graphics.RectF;
import android.os.SystemClock;
import android.os.VibrationEffect;
import android.widget.PopupWindow;
import com.google.android.apps.camera.ui.views.ViewfinderCover;
import com.google.android.material.card.MaterialCardView;
import com.google.ar.core.R;
import j$.util.Map;
import j$.util.Optional;
import j$.util.function.Predicate$CC;
import java.util.List;
import java.util.Map;
import java.util.function.Predicate;
import org.chromium.net.UrlRequest;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class fbt implements pau {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ fbt(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    /* JADX WARN: Type inference failed for: r0v31, types: [fda, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v37, types: [fel, java.lang.Object] */
    @Override // defpackage.pau
    public final void a(Object obj) {
        fda fdaVar;
        nan nanVar;
        spi spiVar;
        int i;
        int i2 = 11;
        int i3 = 10;
        int i4 = 9;
        int i5 = 3;
        boolean z = false;
        int i6 = 1;
        switch (this.b) {
            case 0:
                ((fbv) this.a).e();
                return;
            case 1:
                fbv fbvVar = (fbv) this.a;
                if (!((Boolean) ((ovx) fbvVar.u.j).d).booleanValue() || (fdaVar = fbvVar.r) == null) {
                    return;
                }
                fdaVar.g();
                return;
            case 2:
                int iOrdinal = ((fcx) obj).ordinal();
                Object obj2 = this.a;
                if (iOrdinal == 1) {
                    ((fbv) obj2).r.e();
                    return;
                }
                if (iOrdinal == 2) {
                    ((fbv) obj2).r.g();
                    return;
                } else if (iOrdinal == 3) {
                    ((fbv) obj2).r.f();
                    return;
                } else {
                    if (iOrdinal != 4) {
                        return;
                    }
                    ((fbv) obj2).r.h();
                    return;
                }
            case 3:
                Object obj3 = this.a;
                mmf mmfVar = (mmf) obj;
                synchronized (obj3) {
                    if (mmfVar.c() && ((fce) obj3).h && ((fce) obj3).b.d() && ((fce) obj3).e()) {
                        nnw nnwVar = ((fce) obj3).i;
                        RectF rectF = mmfVar.c;
                        PointF pointFB = nnwVar.b(new PointF(rectF.centerX(), rectF.centerY()));
                        ((fce) obj3).h(rwc.j(new PointF(((fce) obj3).a.a().equals(pka.FRONT) ? 1.0f - pointFB.x : pointFB.x, pointFB.y)), (int) ((fce) obj3).j.a);
                        return;
                    }
                    return;
                }
            case 4:
                Object obj4 = this.a;
                mmf mmfVar2 = (mmf) obj;
                synchronized (obj4) {
                    if (mmfVar2.c() && ((fce) obj4).h && ((fce) obj4).b.d() && ((fce) obj4).e()) {
                        nnw nnwVar2 = ((fce) obj4).i;
                        RectF rectF2 = mmfVar2.c;
                        PointF pointFB2 = nnwVar2.b(new PointF(rectF2.centerX(), rectF2.centerY()));
                        ((fce) obj4).g(rwc.j(new PointF(((fce) obj4).a.a().equals(pka.FRONT) ? 1.0f - pointFB2.x : pointFB2.x, pointFB2.y)), ((fce) obj4).k.a());
                        return;
                    }
                    return;
                }
            case 5:
                fcx fcxVar = (fcx) obj;
                boolean zEquals = fcxVar.equals(fcx.AE_LOCKED);
                ?? r0 = this.a;
                if (zEquals) {
                    r0.e();
                    return;
                } else {
                    if (fcxVar.equals(fcx.AE_UNLOCKED)) {
                        r0.h();
                        return;
                    }
                    return;
                }
            case 6:
                fcx fcxVar2 = (fcx) obj;
                boolean zEquals2 = fcxVar2.equals(fcx.AE_LOCKED);
                Object obj5 = this.a;
                if (zEquals2) {
                    ((fcv) obj5).e.e();
                    return;
                } else {
                    if (fcxVar2.equals(fcx.AE_UNLOCKED)) {
                        ((fcv) obj5).e.h();
                        return;
                    }
                    return;
                }
            case 7:
                this.a.e((goi) obj);
                return;
            case 8:
                MaterialCardView materialCardView = ((fif) this.a).g;
                Optional map = ((Optional) obj).map(new fik(i6));
                float[] fArr = fkn.POSITION_BAD_COLOR.c;
                ColorStateList colorStateListValueOf = ColorStateList.valueOf(((Integer) map.orElse(Integer.valueOf(Color.rgb(fArr[0], fArr[1], fArr[2])))).intValue());
                rjr rjrVar = materialCardView.l;
                if (rjrVar.n != colorStateListValueOf) {
                    rjrVar.n = colorStateListValueOf;
                    rjrVar.i();
                }
                materialCardView.invalidate();
                return;
            case 9:
                Object obj6 = this.a;
                fiv fivVar = (fiv) obj6;
                fne fneVar = (fne) obj;
                if (((fne) fivVar.k.getAndSet(fneVar)).a() && fneVar.b() && ((fqf) obj6).t) {
                    ((ViewfinderCover) fivVar.l.e).o(nkw.COTTAGE, new fem(obj6, i2));
                    return;
                }
                return;
            case 10:
                List list = (List) obj;
                boolean zBooleanValue = ((Boolean) list.get(0)).booleanValue();
                boolean zBooleanValue2 = ((Boolean) list.get(1)).booleanValue();
                if (zBooleanValue && !zBooleanValue2) {
                    z = true;
                }
                ((fiv) ((iiz) this.a).b).k(z);
                return;
            case 11:
                boolean zBooleanValue3 = ((Boolean) obj).booleanValue();
                Object obj7 = this.a;
                if (!zBooleanValue3) {
                    fje fjeVar = (fje) obj7;
                    fjeVar.h.b();
                    fjeVar.c.p(true);
                    return;
                }
                fje fjeVar2 = (fje) obj7;
                fjc fjcVar = fjeVar2.h;
                if (fjcVar.a != null && fjcVar.c != null && fjcVar.d != null) {
                    ktx ktxVar = fjcVar.e;
                    ktxVar.c(fjcVar);
                    fjcVar.c(ktxVar.a(), false);
                    fjcVar.a.setVisibility(0);
                    fjcVar.c.showAtLocation(fjcVar.d, 48, 0, 0);
                }
                fjeVar2.c.p(false);
                return;
            case 12:
                if (((Boolean) obj).booleanValue()) {
                    return;
                }
                ((fje) this.a).c(fjl.BY_DISTANCE);
                return;
            case 13:
                if (((Boolean) obj).booleanValue()) {
                    return;
                }
                ((fje) this.a).c(fjl.BY_AVAILABILITY);
                return;
            case UrlRequest.Status.READING_RESPONSE /* 14 */:
                fjz fjzVar = (fjz) this.a;
                PopupWindow popupWindow = fjzVar.c;
                if (popupWindow == null || !popupWindow.isShowing()) {
                    return;
                }
                fjzVar.q((mxm) fjzVar.m.dL());
                return;
            case 15:
                List list2 = (List) obj;
                Optional optional = (Optional) list2.get(0);
                nkw nkwVar = (nkw) list2.get(1);
                final boolean zBooleanValue4 = ((Boolean) list2.get(2)).booleanValue();
                final boolean zBooleanValue5 = ((Boolean) list2.get(3)).booleanValue();
                Object obj8 = this.a;
                if (nkwVar != nkw.COTTAGE) {
                    ((fks) obj8).d(null);
                    return;
                }
                synchronized (obj8) {
                    Optional optionalFilter = optional.filter(new Predicate() { // from class: fkr
                        public final /* synthetic */ Predicate and(Predicate predicate) {
                            return Predicate$CC.$default$and(this, predicate);
                        }

                        @Override // java.util.function.Predicate
                        /* renamed from: negate */
                        public final /* synthetic */ Predicate mo32negate() {
                            return Predicate$CC.$default$negate(this);
                        }

                        public final /* synthetic */ Predicate or(Predicate predicate) {
                            return Predicate$CC.$default$or(this, predicate);
                        }

                        @Override // java.util.function.Predicate
                        public final boolean test(Object obj9) {
                            tfc tfcVar = (tfc) obj9;
                            VibrationEffect vibrationEffect = fks.a;
                            if (tfcVar == tfc.NONE) {
                                return zBooleanValue4 && !zBooleanValue5;
                            }
                            return true;
                        }
                    });
                    sbv sbvVar = ((fks) obj8).b;
                    sbvVar.getClass();
                    nanVar = (nan) optionalFilter.map(new fiy(sbvVar, i5)).orElse(null);
                }
                ((fks) obj8).d(nanVar);
                return;
            case 16:
                Optional optional2 = (Optional) obj;
                fks fksVar = (fks) this.a;
                boolean zBooleanValue6 = ((Boolean) fksVar.c.map(new fik(i4)).orElse(false)).booleanValue();
                boolean zBooleanValue7 = ((Boolean) optional2.map(new fik(i3)).orElse(false)).booleanValue();
                if (zBooleanValue6 && zBooleanValue7) {
                    fksVar.d.c(R.raw.all_in_success);
                    fksVar.e.h(fks.a);
                }
                fksVar.c = optional2;
                return;
            case 17:
                ((flw) this.a).b((Optional) obj);
                return;
            case 18:
                if (((Boolean) obj).booleanValue()) {
                    Object obj9 = this.a;
                    if (((fly) obj9).d.compareAndSet(false, true)) {
                        synchronized (obj9) {
                            tpc tpcVar = ((fly) obj9).h;
                            long jElapsedRealtime = SystemClock.elapsedRealtime();
                            if (!tpcVar.b.C()) {
                                tpcVar.o();
                            }
                            spk spkVar = (spk) tpcVar.b;
                            spk spkVar2 = spk.a;
                            spkVar.b |= 2;
                            spkVar.d = jElapsedRealtime;
                        }
                        return;
                    }
                    return;
                }
                return;
            case 19:
                fne fneVar2 = (fne) obj;
                boolean zC = fneVar2.c();
                Object obj10 = this.a;
                if (zC) {
                    return;
                }
                synchronized (obj10) {
                    tpc tpcVar2 = ((fly) obj10).h;
                    boolean zB = fneVar2.b();
                    if (!tpcVar2.b.C()) {
                        tpcVar2.o();
                    }
                    spk spkVar3 = (spk) tpcVar2.b;
                    spk spkVar4 = spk.a;
                    spkVar3.b |= 8;
                    spkVar3.f = zB;
                }
                return;
            default:
                Optional optional3 = (Optional) obj;
                boolean zIsEmpty = optional3.isEmpty();
                Object obj11 = this.a;
                if (zIsEmpty || (spiVar = (spi) fly.b.get(Integer.valueOf(((fpj) optional3.get()).a))) == null) {
                    return;
                }
                synchronized (obj11) {
                    tpc tpcVar3 = ((fly) obj11).i;
                    if ((((spj) tpcVar3.b).b & 1) == 0) {
                        tpc tpcVarM = sph.a.m();
                        long jElapsedRealtime2 = SystemClock.elapsedRealtime();
                        if (!tpcVarM.b.C()) {
                            tpcVarM.o();
                        }
                        tph tphVar = tpcVarM.b;
                        sph sphVar = (sph) tphVar;
                        sphVar.b |= 2;
                        sphVar.d = jElapsedRealtime2;
                        if (!tphVar.C()) {
                            tpcVarM.o();
                        }
                        sph sphVar2 = (sph) tpcVarM.b;
                        sphVar2.c = spiVar.g;
                        sphVar2.b |= 1;
                        switch (((fpj) optional3.get()).b) {
                            case UNKNOWN:
                                i = 1;
                                break;
                            case EXCESSIVE_MOTION:
                                i = 2;
                                break;
                            case INSUFFICIENT_FEATURES:
                                i = 3;
                                break;
                            case INSUFFICIENT_LIGHT:
                                i = 4;
                                break;
                            case INITIALIZING:
                                i = 5;
                                break;
                            case NOT_RELIABLE_TOO_FEW_LANDMARKS:
                                i = 9;
                                break;
                            case NOT_RELIABLE_LANDMARKS_TOO_FAR:
                                i = 10;
                                break;
                            case NOT_RELIABLE_MISSING_MAP:
                                i = 11;
                                break;
                            case PERSISTENT_NOT_RELIABLE:
                                i = 7;
                                break;
                            case TRACKING:
                                i = 8;
                                break;
                            default:
                                throw new RuntimeException(null, null);
                        }
                        if (!tpcVarM.b.C()) {
                            tpcVarM.o();
                        }
                        sph sphVar3 = (sph) tpcVarM.b;
                        sphVar3.e = i - 1;
                        sphVar3.b |= 4;
                        sph sphVar4 = (sph) tpcVarM.l();
                        if (!tpcVar3.b.C()) {
                            tpcVar3.o();
                        }
                        spj spjVar = (spj) tpcVar3.b;
                        sphVar4.getClass();
                        spjVar.c = sphVar4;
                        spjVar.b |= 1;
                    }
                    Map map2 = ((fly) obj11).c;
                    map2.put(spiVar, Integer.valueOf(((Integer) Map.EL.getOrDefault(map2, spiVar, 0)).intValue() + 1));
                }
                return;
        }
    }
}
