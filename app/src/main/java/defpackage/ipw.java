package defpackage;

import android.content.Context;
import android.hardware.camera2.CameraCharacteristics;
import android.media.MediaFormat;
import androidx.wear.ambient.AmbientMode;
import com.google.android.apps.camera.moments.FastMomentsHdrImpl;
import com.google.android.play.core.install.rwb.GAQqzWiWWcYOgy;
import com.google.googlex.gcam.Gcam;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import org.chromium.net.UrlRequest;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ipw implements tzt {
    private final tzx a;
    private final tzx b;
    private final tzx c;
    private final tzx d;
    private final tzx e;
    private final /* synthetic */ int f;

    public ipw(tzx tzxVar, tzx tzxVar2, tzx tzxVar3, tzx tzxVar4, tzx tzxVar5, int i) {
        this.f = i;
        this.a = tzxVar;
        this.b = tzxVar2;
        this.c = tzxVar3;
        this.d = tzxVar4;
        this.e = tzxVar5;
    }

    public ipw(tzx tzxVar, tzx tzxVar2, tzx tzxVar3, tzx tzxVar4, tzx tzxVar5, int i, byte[] bArr) {
        this.f = i;
        this.c = tzxVar;
        this.b = tzxVar2;
        this.d = tzxVar3;
        this.e = tzxVar4;
        this.a = tzxVar5;
    }

    @Override // defpackage.uem, defpackage.uel
    public final /* synthetic */ Object a() {
        Object objH;
        Object objUnmodifiableSet;
        switch (this.f) {
            case 0:
                return new ipv((owf) this.a.a(), (owf) this.b.a(), (owf) this.c.a(), (gnt) this.d.a(), (out) this.e.a());
            case 1:
                return new ipq(((ixz) this.c).a(), (gnt) this.b.a(), (msh) this.d.a(), (out) this.e.a(), (owf) this.a.a());
            case 2:
                owf owfVar = (owf) this.a.a();
                owf owfVar2 = (owf) this.e.a();
                pjp pjpVarA = ((pab) this.d).a();
                pjo pjoVarA = ((kiv) this.b).a();
                gzg gzgVar = gza.a;
                boolean zBooleanValue = ((Boolean) owfVar.dL()).booleanValue();
                pjo pjoVar = null;
                if (zBooleanValue && owfVar2.dL() == iqh.URANUS && pjoVarA.l().equals(pka.FRONT)) {
                    if (!pjoVarA.M()) {
                        return null;
                    }
                    Iterator it = pjoVarA.C().iterator();
                    while (it.hasNext()) {
                        pjo pjoVarA2 = pjpVarA.a((pjr) it.next());
                        Integer num = (Integer) pjoVarA2.m(CameraCharacteristics.LENS_POSE_REFERENCE);
                        if (num != null && !num.equals(0)) {
                            pjoVar = pjoVarA2;
                        }
                    }
                }
                return pjoVar;
            case 3:
                tzx tzxVar = this.a;
                jgt jgtVarA = ((ixv) this.c).a();
                out outVar = (out) tzxVar.a();
                tzx tzxVar2 = this.b;
                tzx tzxVar3 = this.e;
                tzj tzjVarB = tzs.b(this.d);
                tzj tzjVarB2 = tzs.b(tzxVar3);
                if (((iso) tzxVar2.a()).a()) {
                    mwq mwqVar = (mwq) tzjVarB.a();
                    mwqVar.getClass();
                    objH = scn.H(new hed(mwqVar, 3), new hrg(outVar, jgtVarA, tzjVarB2, 2));
                } else {
                    objH = sfd.a;
                }
                objH.getClass();
                return objH;
            case 4:
                tzx tzxVar4 = this.b;
                tzx tzxVar5 = this.d;
                tzx tzxVar6 = this.a;
                nkw nkwVarA = ((nkv) this.c).a();
                final tzj tzjVarB3 = tzs.b(tzxVar6);
                tzj tzjVarB4 = tzs.b(tzxVar5);
                final syw sywVar = (syw) tzxVar4.a();
                final pbn pbnVar = (pbn) this.e.a();
                nkw nkwVar = nkw.PHOTO;
                if (nkwVarA != nkwVar && nkwVarA != nkw.IMAGE_INTENT) {
                    return frh.a;
                }
                if (nkwVarA != nkwVar) {
                    tzjVarB3 = tzjVarB4;
                }
                return new fre() { // from class: jao
                    @Override // defpackage.fre
                    public final /* synthetic */ int a() {
                        return 0;
                    }

                    @Override // defpackage.fre
                    public final syu b() {
                        final pbn pbnVar2 = pbnVar;
                        final tzj tzjVar = tzjVarB3;
                        return sywVar.submit(new Callable() { // from class: jan
                            @Override // java.util.concurrent.Callable
                            public final Object call() {
                                pbn pbnVar3 = pbnVar2;
                                pbnVar3.f("PhotoModeStartup");
                                pbnVar3.f("get");
                                mcw mcwVar = (mcw) tzjVar.a();
                                pbnVar3.h("run");
                                mcwVar.run();
                                pbnVar3.g();
                                pbnVar3.g();
                                return Boolean.TRUE;
                            }
                        });
                    }

                    @Override // defpackage.fre
                    public final /* synthetic */ String c() {
                        return gsn.Z(this);
                    }
                };
            case 5:
                jho jhoVar = (jho) this.e.a();
                return !jhoVar.b ? new fhm(5) : new jht(((ixu) this.c).a(), (owf) this.b.a(), ((ims) this.d).b(), jhoVar, (ovx) this.a.a(), 0);
            case 6:
                tzx tzxVar7 = this.b;
                tzx tzxVar8 = this.c;
                tzx tzxVar9 = this.a;
                tzx tzxVar10 = this.e;
                tzj tzjVarB5 = tzs.b(tzxVar7);
                tzj tzjVarB6 = tzs.b(tzxVar8);
                tzj tzjVarB7 = tzs.b(tzxVar9);
                tzs.b(tzxVar10);
                hbj hbjVar = (hbj) this.d.a();
                ArrayList arrayList = new ArrayList();
                gzi gziVar = gzo.a;
                arrayList.add((jiw) tzjVarB5.a());
                if (hbjVar.p(gzo.aw)) {
                    arrayList.add((jiw) tzjVarB6.a());
                }
                if (hbjVar.p(gzo.av)) {
                    arrayList.add((jiw) tzjVarB7.a());
                }
                return new jik(arrayList);
            case 7:
                owq owqVar = (owq) this.a.a();
                owf owfVar3 = (owf) this.d.a();
                fdq fdqVarA = ((ixw) this.b).a();
                out outVar2 = (out) this.e.a();
                boolean zP = ((hbj) this.c.a()).p(gym.au);
                gzi gziVar2 = hak.a;
                Object sfmVar = !zP ? sfd.a : new sfm(new fpb(owfVar3, fdqVarA, owqVar, outVar2, 5));
                sfmVar.getClass();
                return sfmVar;
            case 8:
                return new jka((out) this.c.a(), (owf) this.b.a(), (owq) this.a.a(), (mdy) this.e.a(), (mwq) this.d.a());
            case 9:
                return new jmw((owq) this.b.a(), (owd) this.a.a(), (hbj) this.d.a(), (hyh) this.c.a(), (luj) this.e.a());
            case 10:
                tzx tzxVar11 = this.b;
                tzx tzxVar12 = this.e;
                return new qqq(this.d, tzy.b(this.c), tzy.b(this.a), tzy.b(tzxVar12), tzy.b(tzxVar11), (char[]) null);
            case 11:
                hbj hbjVar2 = (hbj) this.c.a();
                MediaFormat mediaFormatCreateAudioFormat = MediaFormat.createAudioFormat(GAQqzWiWWcYOgy.asRoctVCmF, 48000, 2);
                mediaFormatCreateAudioFormat.setInteger("aac-profile", 2);
                mediaFormatCreateAudioFormat.setInteger("bitrate", 128000);
                mediaFormatCreateAudioFormat.setInteger("max-input-size", hph.a * 10);
                mediaFormatCreateAudioFormat.setInteger("oo.muxer.force_sequential", 1);
                mediaFormatCreateAudioFormat.getClass();
                rwc rwcVar = (rwc) this.b.a();
                rwc rwcVar2 = (rwc) this.d.a();
                return new jom(hbjVar2, mediaFormatCreateAudioFormat, rwcVar, rwcVar2, (Executor) this.e.a());
            case 12:
                tzx tzxVar13 = this.a;
                tzx tzxVar14 = this.c;
                iso isoVarA = ((hfg) this.b).a();
                qyc qycVarA = ((kil) tzxVar14).a();
                final jqb jqbVar = (jqb) tzxVar13.a();
                final pbn pbnVar2 = (pbn) this.e.a();
                final tzx tzxVar15 = this.d;
                try {
                    pbnVar2.f("MICRO_GyroModule#providesShutdownTasks");
                    Object sfmVar2 = (isoVarA.m() && qycVarA.a) ? new sfm(new klr() { // from class: jqi
                        @Override // defpackage.klr, java.lang.Runnable
                        public final void run() {
                            pbn pbnVar3 = pbnVar2;
                            pbnVar3.f("MICRO_GyroModule#stopGyroCapture");
                            ((hpa) tzxVar15.a()).f(jqbVar);
                            pbnVar3.g();
                        }
                    }) : sfd.a;
                    pbnVar2.g();
                    sfmVar2.getClass();
                    return sfmVar2;
                } catch (Throwable th) {
                    pbnVar2.g();
                    throw th;
                }
            case 13:
                mni mniVar = (mni) this.b.a();
                ocq ocqVar = (ocq) this.e.a();
                tzx tzxVar16 = this.a;
                Context contextB = ((imm) this.d).b();
                return new kgn(mniVar, ocqVar, contextB);
            case UrlRequest.Status.READING_RESPONSE /* 14 */:
                return new qqq((pkc) this.e.a(), ((imr) this.a).a(), (hfy) this.d.a(), (gnt) this.b.a(), (hbj) this.c.a());
            case 15:
                return new FastMomentsHdrImpl(((pba) this.a).a(), (Gcam) this.d.a(), (Executor) this.b.a(), (tgp) this.c.a(), (fto) this.e.a());
            case 16:
                boolean zBooleanValue2 = ((Boolean) this.b.a()).booleanValue();
                kai kaiVar = (kai) this.c.a();
                hbj hbjVar3 = (hbj) this.d.a();
                HashSet hashSet = new HashSet();
                if (hbjVar3 != null) {
                    gzi gziVar3 = gzz.a;
                }
                if (zBooleanValue2) {
                    tzx tzxVar17 = this.e;
                    tzx tzxVar18 = this.a;
                    gzi gziVar4 = haa.a;
                    kaiVar.getClass();
                    hashSet.add(new jxr(kaiVar, 6));
                    kao kaoVar = (kao) tzxVar18.a();
                    kaoVar.getClass();
                    hashSet.add(new jxr(kaoVar, 7));
                    kao kaoVar2 = (kao) tzxVar17.a();
                    kaoVar2.getClass();
                    hashSet.add(new jxr(kaoVar2, 7));
                    kaiVar.getClass();
                    hashSet.add(new jxr(kaiVar, 8));
                    objUnmodifiableSet = DesugarCollections.unmodifiableSet(hashSet);
                } else {
                    objUnmodifiableSet = sfd.a;
                }
                objUnmodifiableSet.getClass();
                return objUnmodifiableSet;
            case 17:
                lny lnyVar = (lny) this.e.a();
                return new kal(lnyVar, ((hfg) this.d).a(), ((pba) this.a).a(), (hbj) this.c.a());
            case 18:
                return new kcv((owf) this.c.a(), (owq) this.a.a(), (owf) this.e.a(), (gnt) this.b.a(), (hbj) this.d.a());
            case 19:
                return new kdh((iyu) this.b.a(), ((hoa) this.c).b(), (ktx) this.d.a(), (lsp) this.e.a(), (owf) this.a.a(), new iob());
            default:
                return new gtd((fuf) this.c.a(), (hbj) this.d.a(), ((luj) this.a.a()).a(luf.u), (AmbientMode.AmbientController) this.e.a(), (kdz) this.b.a(), 4);
        }
    }

    public ipw(tzx tzxVar, tzx tzxVar2, tzx tzxVar3, tzx tzxVar4, tzx tzxVar5, int i, byte[] bArr, byte[] bArr2) {
        this.f = i;
        this.b = tzxVar;
        this.c = tzxVar2;
        this.d = tzxVar3;
        this.e = tzxVar4;
        this.a = tzxVar5;
    }

    public ipw(tzx tzxVar, tzx tzxVar2, tzx tzxVar3, tzx tzxVar4, tzx tzxVar5, int i, char[] cArr) {
        this.f = i;
        this.a = tzxVar;
        this.e = tzxVar2;
        this.d = tzxVar3;
        this.b = tzxVar4;
        this.c = tzxVar5;
    }

    public ipw(tzx tzxVar, tzx tzxVar2, tzx tzxVar3, tzx tzxVar4, tzx tzxVar5, int i, char[] cArr, byte[] bArr) {
        this.f = i;
        this.e = tzxVar;
        this.b = tzxVar2;
        this.a = tzxVar3;
        this.d = tzxVar4;
        this.c = tzxVar5;
    }

    public ipw(tzx tzxVar, tzx tzxVar2, tzx tzxVar3, tzx tzxVar4, tzx tzxVar5, int i, float[] fArr) {
        this.f = i;
        this.b = tzxVar;
        this.c = tzxVar2;
        this.a = tzxVar3;
        this.e = tzxVar4;
        this.d = tzxVar5;
    }

    public ipw(tzx tzxVar, tzx tzxVar2, tzx tzxVar3, tzx tzxVar4, tzx tzxVar5, int i, int[] iArr) {
        this.f = i;
        this.c = tzxVar;
        this.a = tzxVar2;
        this.d = tzxVar3;
        this.b = tzxVar4;
        this.e = tzxVar5;
    }

    public ipw(tzx tzxVar, tzx tzxVar2, tzx tzxVar3, tzx tzxVar4, tzx tzxVar5, int i, short[] sArr) {
        this.f = i;
        this.c = tzxVar;
        this.a = tzxVar2;
        this.d = tzxVar3;
        this.e = tzxVar4;
        this.b = tzxVar5;
    }

    public ipw(tzx tzxVar, tzx tzxVar2, tzx tzxVar3, tzx tzxVar4, tzx tzxVar5, int i, boolean[] zArr) {
        this.f = i;
        this.e = tzxVar;
        this.b = tzxVar2;
        this.d = tzxVar3;
        this.a = tzxVar4;
        this.c = tzxVar5;
    }

    public ipw(tzx tzxVar, tzx tzxVar2, tzx tzxVar3, tzx tzxVar4, tzx tzxVar5, int i, byte[][] bArr) {
        this.f = i;
        this.a = tzxVar;
        this.d = tzxVar2;
        this.b = tzxVar3;
        this.e = tzxVar4;
        this.c = tzxVar5;
    }

    public ipw(tzx tzxVar, tzx tzxVar2, tzx tzxVar3, tzx tzxVar4, tzx tzxVar5, int i, char[][] cArr) {
        this.f = i;
        this.c = tzxVar;
        this.b = tzxVar2;
        this.a = tzxVar3;
        this.e = tzxVar4;
        this.d = tzxVar5;
    }

    public ipw(tzx tzxVar, tzx tzxVar2, tzx tzxVar3, tzx tzxVar4, tzx tzxVar5, int i, float[][] fArr) {
        this.f = i;
        this.b = tzxVar;
        this.c = tzxVar2;
        this.a = tzxVar3;
        this.d = tzxVar4;
        this.e = tzxVar5;
    }

    public ipw(tzx tzxVar, tzx tzxVar2, tzx tzxVar3, tzx tzxVar4, tzx tzxVar5, int i, int[][] iArr) {
        this.f = i;
        this.d = tzxVar;
        this.c = tzxVar2;
        this.a = tzxVar3;
        this.e = tzxVar4;
        this.b = tzxVar5;
    }

    public ipw(tzx tzxVar, tzx tzxVar2, tzx tzxVar3, tzx tzxVar4, tzx tzxVar5, int i, short[][] sArr) {
        this.f = i;
        this.b = tzxVar;
        this.a = tzxVar2;
        this.d = tzxVar3;
        this.c = tzxVar4;
        this.e = tzxVar5;
    }

    public ipw(tzx tzxVar, tzx tzxVar2, tzx tzxVar3, tzx tzxVar4, tzx tzxVar5, int i, boolean[][] zArr) {
        this.f = i;
        this.c = tzxVar;
        this.b = tzxVar2;
        this.d = tzxVar3;
        this.a = tzxVar4;
        this.e = tzxVar5;
    }

    public ipw(tzx tzxVar, tzx tzxVar2, tzx tzxVar3, tzx tzxVar4, tzx tzxVar5, int i, byte[][][] bArr) {
        this.f = i;
        this.b = tzxVar;
        this.e = tzxVar2;
        this.c = tzxVar3;
        this.d = tzxVar4;
        this.a = tzxVar5;
    }

    public ipw(tzx tzxVar, tzx tzxVar2, tzx tzxVar3, tzx tzxVar4, tzx tzxVar5, int i, char[][][] cArr) {
        this.f = i;
        this.e = tzxVar;
        this.a = tzxVar2;
        this.d = tzxVar3;
        this.b = tzxVar4;
        this.c = tzxVar5;
    }

    public ipw(tzx tzxVar, tzx tzxVar2, tzx tzxVar3, tzx tzxVar4, tzx tzxVar5, int i, float[][][] fArr) {
        this.f = i;
        this.c = tzxVar;
        this.a = tzxVar2;
        this.e = tzxVar3;
        this.b = tzxVar4;
        this.d = tzxVar5;
    }

    public ipw(tzx tzxVar, tzx tzxVar2, tzx tzxVar3, tzx tzxVar4, tzx tzxVar5, int i, int[][][] iArr) {
        this.f = i;
        this.b = tzxVar;
        this.a = tzxVar2;
        this.e = tzxVar3;
        this.c = tzxVar4;
        this.d = tzxVar5;
    }

    public ipw(tzx tzxVar, tzx tzxVar2, tzx tzxVar3, tzx tzxVar4, tzx tzxVar5, int i, short[][][] sArr) {
        this.f = i;
        this.a = tzxVar;
        this.d = tzxVar2;
        this.b = tzxVar3;
        this.c = tzxVar4;
        this.e = tzxVar5;
    }
}
