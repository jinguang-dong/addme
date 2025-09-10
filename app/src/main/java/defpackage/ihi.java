package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import android.util.DisplayMetrics;
import android.view.WindowManager;
import com.google.android.apps.camera.hdrplus.postprocessing.flareremoval.jni.NativeFlareRemoval;
import com.google.ar.core.R;
import com.google.vr.audio.Cf.qcjAcSmlN;
import j$.util.Optional;
import java.io.File;
import org.chromium.net.UrlRequest;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ihi implements tzt {
    private final /* synthetic */ int a;
    private final Object b;

    public ihi(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    /* JADX WARN: Type inference failed for: r15v1, types: [java.lang.Object, tzx] */
    /* JADX WARN: Type inference failed for: r15v23, types: [java.lang.Object, tzx] */
    /* JADX WARN: Type inference failed for: r15v26, types: [java.lang.Object, tzx] */
    /* JADX WARN: Type inference failed for: r15v41, types: [java.lang.Object, tzx] */
    /* JADX WARN: Type inference failed for: r15v55, types: [java.lang.Object, tzx] */
    /* JADX WARN: Type inference failed for: r15v60, types: [java.lang.Object, tzx] */
    /* JADX WARN: Type inference failed for: r15v64, types: [java.lang.Object, tzx] */
    /* JADX WARN: Type inference failed for: r15v68, types: [java.lang.Object, tzx] */
    /* JADX WARN: Type inference failed for: r15v72, types: [java.lang.Object, tzx] */
    /* JADX WARN: Type inference failed for: r15v76, types: [java.lang.Object, tzx] */
    /* JADX WARN: Type inference failed for: r15v8, types: [java.lang.Object, tzx] */
    /* JADX WARN: Type inference failed for: r15v83, types: [java.lang.Object, tzx] */
    /* JADX WARN: Type inference failed for: r15v86, types: [java.lang.Object, tzx] */
    @Override // defpackage.uem, defpackage.uel
    public final /* synthetic */ Object a() {
        switch (this.a) {
            case 0:
                return ((rwc) this.b.a()).b(new hia(7));
            case 1:
                return ((cxb) this.b).a;
            case 2:
                Object sfmVar = ((hbj) this.b.a()).p(gzs.aa) ? new sfm(new pej(nvh.a, 1)) : sfd.a;
                sfmVar.getClass();
                return sfmVar;
            case 3:
                Context contextB = ((imm) this.b).b();
                File file = iht.a;
                File file2 = new File(contextB.getCacheDir(), qcjAcSmlN.FwnsJRgO);
                file2.mkdirs();
                return !file2.exists() ? Optional.empty() : Optional.of(file2);
            case 4:
                return new ihw((ihx) this.b.a());
            case 5:
                return new NativeFlareRemoval((pbn) this.b.a());
            case 6:
                rwc rwcVarB = ((jaf) this.b).b();
                ksh kshVarM = ksi.m();
                kshVarM.n(krs.IMAX_AUDIO);
                kshVarM.h(R.string.imax_audio_recording_desc);
                kshVarM.c(R.string.imax_audio_recording_desc);
                ksa ksaVar = ksa.IMAX_AUDIO_ON;
                kshVarM.m(ksa.IMAX_AUDIO_OFF, ksaVar);
                kshVarM.j(Integer.valueOf(R.string.imax_disable_audio_recording), Integer.valueOf(R.string.imax_enable_audio_recording));
                kshVarM.e(Integer.valueOf(R.string.imax_disable_audio_recording_desc), Integer.valueOf(R.string.imax_enable_audio_recording_desc));
                kshVarM.g(Integer.valueOf(R.drawable.quantum_gm_ic_mic_off_white_24), Integer.valueOf(R.drawable.quantum_gm_ic_mic_white_24));
                owq owqVar = (owq) ((rwg) rwcVarB).a;
                hia hiaVar = new hia(8);
                ksaVar.getClass();
                kshVarM.a = new own(owqVar, hiaVar, new fdz(ksaVar, 17));
                kshVarM.p(nkw.IMAX);
                return new sfm(kshVarM.a());
            case 7:
                return ((luo) this.b).a().m("pref_imax_audio_enabled_key", false);
            case 8:
                imi imiVar = (imi) this.b.a();
                imiVar.getClass();
                return imiVar;
            case 9:
                WindowManager windowManagerA = ((imp) this.b).a();
                DisplayMetrics displayMetrics = new DisplayMetrics();
                windowManagerA.getDefaultDisplay().getMetrics(displayMetrics);
                return displayMetrics;
            case 10:
                return new cxb(((imm) this.b).b(), (byte[]) null);
            case 11:
                SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(((imm) this.b).b());
                defaultSharedPreferences.getClass();
                return defaultSharedPreferences;
            case 12:
                gzg gzgVar = gza.a;
                return rvk.a;
            case 13:
                owf owfVarA = owb.a((owq) this.b.a());
                owfVarA.getClass();
                return owfVarA;
            case UrlRequest.Status.READING_RESPONSE /* 14 */:
                owf owfVarA2 = owb.a((owq) this.b.a());
                owfVarA2.getClass();
                return owfVarA2;
            case 15:
                owf owfVarA3 = owb.a((owq) this.b.a());
                owfVarA3.getClass();
                return owfVarA3;
            case 16:
                owf owfVarA4 = owb.a((owq) this.b.a());
                owfVarA4.getClass();
                return owfVarA4;
            case 17:
                owf owfVarA5 = owb.a((owq) this.b.a());
                owfVarA5.getClass();
                return owfVarA5;
            case 18:
                return new ipn(((inh) this.b).a());
            case 19:
                return new iua((pbn) this.b.a());
            default:
                hbj hbjVar = (hbj) this.b.a();
                hbjVar.getClass();
                iuh iuhVar = iuh.a;
                long j = uls.a;
                ulu uluVar = ulu.d;
                return new iud(ske.bc(new uev(iuhVar, new iuf(rnt.ae(new iue[]{new iue(ujp.j(1, uluVar), new iub(((Number) hbjVar.a(gzo.u).get()).intValue(), 14)), new iue(ujp.j(3, uluVar))}))), new uev(iuh.b, new iuf(rnt.ae(new iue[]{new iue(ujp.j(1, uluVar)), new iue(ujp.j(3, uluVar))}))), new uev(iuh.c, new iuf(rnt.ae(new iue[]{new iue(ujp.j(1, uluVar)), new iue(ujp.j(3, uluVar))}))), new uev(iuh.d, new iuf(ske.bj(new iue(ujp.j(3, uluVar), new iub(((Number) hbjVar.a(gzo.x).get()).intValue(), 6)))))));
        }
    }
}
