package defpackage;

import android.hardware.camera2.CaptureRequest;
import com.google.android.apps.camera.stats.ViewfinderJankSession;
import com.google.ar.core.R;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.Executor;
import org.chromium.net.UrlRequest;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class kln implements tzt {
    private final tzx a;
    private final tzx b;
    private final /* synthetic */ int c;

    public kln(tzx tzxVar, tzx tzxVar2, int i) {
        this.c = i;
        this.a = tzxVar;
        this.b = tzxVar2;
    }

    @Override // defpackage.uem, defpackage.uel
    public final /* synthetic */ Object a() {
        switch (this.c) {
            case 0:
                syu syuVarJ = ske.J((syu) this.a.a(), (syu) this.b.a());
                jku jkuVar = new jku(6);
                sxo sxoVar = sxo.a;
                return swf.i(swz.i(syuVarJ, jkuVar, sxoVar), Throwable.class, new jku(7), sxoVar);
            case 1:
                return new fst(((fth) this.a).b(), (syu) this.b.a());
            case 2:
                return new fst(((fth) this.a).b(), (syu) this.b.a());
            case 3:
                owq owqVar = (owq) this.b.a();
                our ourVar = (our) this.a.a();
                ovx ovxVar = new ovx(90);
                ourVar.d(ovxVar.dK(owqVar, sxo.a));
                return ovxVar;
            case 4:
                final szh szhVar = (szh) this.a.a();
                final tzx tzxVar = this.b;
                return new frf(new Runnable() { // from class: kne
                    @Override // java.lang.Runnable
                    public final void run() {
                        szhVar.e(((knh) tzxVar).a());
                    }
                }, "taker", 0);
            case 5:
                kuj kujVar = (kuj) this.a.a();
                knk knkVar = (knk) this.b.a();
                sbp sbpVar = knm.a;
                kujVar.o(knkVar);
                knkVar.getClass();
                return knkVar;
            case 6:
                return ((fuf) this.a.a()).a ? rwc.j((ldl) this.b.a()) : rvk.a;
            case 7:
                pfu pfuVar = (pfu) this.a.a();
                rwc rwcVar = (rwc) this.b.a();
                pfuVar.getClass();
                return rwcVar.b(new kve(pfuVar, 1));
            case 8:
                peo peoVarB = ((pfu) this.a.a()).a.b((peq) this.b.a());
                return peoVarB == null ? rvk.a : rwc.j(peoVarB);
            case 9:
                tzx tzxVar2 = this.a;
                mwq mwqVarA = ((luo) this.b).a();
                hbj hbjVar = (hbj) tzxVar2.a();
                kpa kpaVar = kov.a;
                if (hbjVar.p(gzs.aa)) {
                    kpa kpaVar2 = kov.a;
                    return new kpb(owp.a(kpaVar2.d), kpaVar2);
                }
                kpa kpaVar3 = kov.a;
                return new kpb(mwqVarA.o("pref_camera_hdr_plus_key", kpaVar3.d), kpaVar3);
            case 10:
                return new kpy((mdy) this.b.a(), (out) this.a.a());
            case 11:
                mes mesVar = (mes) this.b.a();
                our ourVar2 = (our) this.a.a();
                ViewfinderJankSession viewfinderJankSession = (ViewfinderJankSession) mesVar.a();
                ourVar2.d(viewfinderJankSession);
                return viewfinderJankSession;
            case 12:
                return new kqc(((hco) this.b).a(), (hdm) this.a.a());
            case 13:
                return new krl();
            case UrlRequest.Status.READING_RESPONSE /* 14 */:
                luj lujVar = (luj) this.b.a();
                hbj hbjVar2 = (hbj) this.a.a();
                sgv sgvVar = ktb.a;
                ksh kshVarM = ksi.m();
                kshVarM.n(krs.PHOTO_SPHERE);
                kshVarM.h(R.string.photosphere_type);
                kshVarM.c(R.string.photosphere_type_desc);
                kshVarM.m(ksa.PHOTO_SPHERE, ksa.HORIZONTAL_PHOTO_SPHERE, ksa.VERTICAL_PHOTO_SPHERE, ksa.WIDE_ANGLE_PHOTO_SPHERE, ksa.FISH_EYE_PHOTO_SPHERE);
                kshVarM.j(Integer.valueOf(R.string.panorama), Integer.valueOf(R.string.panorama_horizontal), Integer.valueOf(R.string.panorama_vertical), Integer.valueOf(R.string.panorama_wide), Integer.valueOf(R.string.panorama_fish_eye));
                kshVarM.e(Integer.valueOf(R.string.panorama_desc), Integer.valueOf(R.string.panorama_horizontal_desc), Integer.valueOf(R.string.panorama_vertical_desc), Integer.valueOf(R.string.panorama_wide_desc), Integer.valueOf(R.string.panorama_fish_eye_desc));
                kshVarM.g(Integer.valueOf(R.drawable.quantum_ic_panorama_photosphere_white_24), Integer.valueOf(R.drawable.quantum_gm_ic_panorama_horizontal_white_24), Integer.valueOf(R.drawable.quantum_gm_ic_panorama_vertical_white_24), Integer.valueOf(R.drawable.quantum_gm_ic_panorama_wide_angle_white_24), Integer.valueOf(R.drawable.quantum_gm_ic_panorama_fish_eye_white_24));
                luu luuVar = luf.aM;
                kshVarM.a = new krp(lujVar.a(luuVar), (String) luuVar.d(hbjVar2), ktb.b);
                kshVarM.p(nkw.PHOTO_SPHERE);
                return kshVarM.a();
            case 15:
                return new kub((pbn) this.b.a(), (hbj) this.a.a());
            case 16:
                return new kue((kub) this.b.a(), (Executor) this.a.a(), 0);
            case 17:
                return new mwq((hbj) this.a.a(), (luj) this.b.a(), (char[]) null);
            case 18:
                Set<pej> set = (Set) this.b.a();
                pjo pjoVarA = ((kiv) this.a).a();
                HashSet hashSet = new HashSet();
                Iterator it = pjoVarA.B().iterator();
                while (it.hasNext()) {
                    hashSet.add(((CaptureRequest.Key) it.next()).getName());
                }
                scl sclVar = new scl();
                if (!set.isEmpty()) {
                    for (pej pejVar : set) {
                        if (hashSet.contains(pejVar.a.getName())) {
                            sclVar.d(pejVar);
                        }
                    }
                }
                scn scnVarG = sclVar.g();
                scnVarG.getClass();
                return scnVarG;
            case 19:
                Object sfmVar = ((hef) this.a).b().booleanValue() ? new sfm((fcr) this.b.a()) : sfd.a;
                sfmVar.getClass();
                return sfmVar;
            default:
                pfu pfuVar2 = (pfu) this.a.a();
                rwc rwcVar2 = (rwc) this.b.a();
                return rwcVar2.h() ? rwc.j(pfuVar2.d((peo) rwcVar2.c())) : rvk.a;
        }
    }

    public kln(tzx tzxVar, tzx tzxVar2, int i, float[] fArr) {
        this.c = i;
        this.b = tzxVar;
        this.a = tzxVar2;
    }
}
