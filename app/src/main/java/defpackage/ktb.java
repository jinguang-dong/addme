package defpackage;

import com.google.ar.core.R;
import com.google.vr.audio.Cf.qcjAcSmlN;
import j$.util.function.Predicate$CC;
import java.util.function.Predicate;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class ktb {
    public static final sgv a = sgv.g("ktb");
    public static final sbc b = sbc.e("pano_photosphere", ksa.PHOTO_SPHERE, "pano_horizontal", ksa.HORIZONTAL_PHOTO_SPHERE, "pano_vertical", ksa.VERTICAL_PHOTO_SPHERE, "pano_wide", ksa.WIDE_ANGLE_PHOTO_SPHERE, qcjAcSmlN.jQenttkT, ksa.FISH_EYE_PHOTO_SPHERE);

    public static ksh a(boolean z, boolean z2, boolean z3) {
        int i = z ? R.drawable.quantum_gm_ic_do_not_disturb_white_24 : R.drawable.quantum_gm_ic_flash_off_white_24;
        int i2 = true != z ? R.string.cam_flash_off : R.string.cam_flash_off_alt;
        int i3 = (z3 || !z) ? R.string.flash_off_desc : R.string.auto_night_sight_in_time_lapse_off_desc;
        int i4 = true != z ? R.string.cam_flash_on : R.string.cam_flash_on_alt;
        int i5 = true != z ? R.string.flash_desc : R.string.more_light_desc;
        int i6 = true != z ? R.string.flash_options_desc : R.string.more_light_options_desc;
        int i7 = true != z ? R.drawable.quantum_gm_ic_flash_auto_white_24 : R.drawable.gs_night_sight_auto_vd_theme_24;
        int i8 = true != z ? R.string.cam_flash_auto : R.string.cam_flash_ns;
        int i9 = z ? z3 ? R.string.flash_ns_desc : R.string.auto_night_sight_in_time_lapse_on_desc : R.string.flash_auto_desc;
        ksa ksaVar = z3 ? ksa.PHOTO_FLASH_ON : ksa.VIDEO_FLASH_ON;
        ksa ksaVar2 = z ? ksa.PHOTO_FLASH_NS : ksa.PHOTO_FLASH_AUTO;
        ksa ksaVar3 = ksa.VIDEO_FLASH_NS;
        ksa ksaVar4 = z3 ? ksa.PHOTO_FLASH_OFF : ksa.VIDEO_FLASH_OFF;
        ksh kshVarM = ksi.m();
        kshVarM.h(i5);
        kshVarM.c(i6);
        kshVarM.b(ksaVar4, i, i2, i3);
        if (true != z3) {
            ksaVar2 = ksaVar3;
        }
        kshVarM.b(ksaVar2, i7, i8, i9);
        if (!z2) {
            return kshVarM;
        }
        kshVarM.b(ksaVar, R.drawable.quantum_gm_ic_flash_on_white_24, i4, R.string.flash_on_desc);
        return kshVarM;
    }

    public static ksh b(boolean z, boolean z2, boolean z3) {
        int i = z ? R.string.more_light_desc : R.string.illumination_desc;
        int i2 = true != z ? R.string.illumination_options_desc : R.string.more_light_options_desc;
        int i3 = true != z ? R.drawable.ic_lightbulb_off : R.drawable.quantum_gm_ic_do_not_disturb_white_24;
        int i4 = true != z ? R.string.illumination_off_option_desc : R.string.cam_flash_off_alt;
        int i5 = (z3 || !z) ? R.string.illumination_off_desc : R.string.auto_night_sight_in_time_lapse_off_desc;
        int i6 = true != z ? R.string.illumination_on_option_desc : R.string.illumination_on_alt;
        ksa ksaVar = z3 ? ksa.PHOTO_FLASH_ON : ksa.VIDEO_FLASH_ON;
        ksa ksaVar2 = z3 ? ksa.PHOTO_FLASH_NS : ksa.VIDEO_FLASH_NS;
        ksa ksaVar3 = z3 ? ksa.PHOTO_FLASH_OFF : ksa.VIDEO_FLASH_OFF;
        ksh kshVarM = ksi.m();
        kshVarM.h(i);
        kshVarM.c(i2);
        kshVarM.b(ksaVar3, i3, i4, i5);
        if (z) {
            kshVarM.b(ksaVar2, R.drawable.gs_night_sight_auto_vd_theme_24, R.string.cam_flash_ns, z3 ? R.string.flash_ns_desc : R.string.auto_night_sight_in_time_lapse_on_desc);
        }
        if (z2) {
            kshVarM.b(ksaVar, R.drawable.ic_lightbulb_on, i6, R.string.illumination_on_desc);
        }
        return kshVarM;
    }

    public static void c(our ourVar, fuf fufVar, owq owqVar, owq owqVar2, krj krjVar, krs krsVar) {
        iyl iylVar = new iyl(owqVar, krsVar, owqVar2, krjVar, 3);
        sxo sxoVar = sxo.a;
        ourVar.d(fufVar.e.dK(iylVar, sxoVar));
        ourVar.d(owqVar.dK(new kso(owqVar2, 2), sxoVar));
    }

    public static void d(ksh kshVar, final fuf fufVar, tzj tzjVar, krs krsVar, owq owqVar, final boolean z, rwc rwcVar, kcv kcvVar) {
        krp krpVar = new krp(owqVar, "ns", "ns", ksa.VIDEO_FLASH_NS, "off", ksa.VIDEO_FLASH_OFF);
        Predicate predicate = new Predicate() { // from class: ksx
            public final /* synthetic */ Predicate and(Predicate predicate2) {
                return Predicate$CC.$default$and(this, predicate2);
            }

            @Override // java.util.function.Predicate
            /* renamed from: negate */
            public final /* synthetic */ Predicate mo32negate() {
                return Predicate$CC.$default$negate(this);
            }

            public final /* synthetic */ Predicate or(Predicate predicate2) {
                return Predicate$CC.$default$or(this, predicate2);
            }

            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                krj krjVar = (krj) obj;
                sgv sgvVar = ktb.a;
                nkw nkwVarD = krjVar.d();
                return (nkwVarD.equals(nkw.TIME_LAPSE) && fufVar.a(nkwVarD)) && (z ? krjVar.s() : !krjVar.s());
            }
        };
        krd krdVar = new krd(kcvVar, tzjVar, 2);
        ksy ksyVar = new ksy(kcvVar, tzjVar, predicate, krsVar, 0);
        kshVar.a = krpVar;
        kshVar.n(krsVar);
        kshVar.b = predicate;
        kshVar.c = krdVar;
        kshVar.e = ksyVar;
        kshVar.h = new kdj(rwcVar, 3);
    }
}
