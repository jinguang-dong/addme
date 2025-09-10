package defpackage;

import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.os.Handler;
import androidx.wear.ambient.AmbientMode;
import com.google.android.apps.camera.camerafatalerror.CameraFatalErrorTrackerDatabase;
import com.google.googlex.gcam.Gcam;
import com.google.googlex.gcam.hdrplus.NativeHdrPlusInterface;
import java.io.IOException;
import java.util.HashSet;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import org.chromium.net.UrlRequest;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fgc implements tzt {
    private final tzx a;
    private final tzx b;
    private final tzx c;
    private final tzx d;
    private final tzx e;
    private final tzx f;
    private final tzx g;
    private final /* synthetic */ int h;

    public fgc(tzx tzxVar, tzx tzxVar2, tzx tzxVar3, tzx tzxVar4, tzx tzxVar5, tzx tzxVar6, tzx tzxVar7, int i) {
        this.h = i;
        this.a = tzxVar;
        this.b = tzxVar2;
        this.c = tzxVar3;
        this.d = tzxVar4;
        this.e = tzxVar5;
        this.f = tzxVar6;
        this.g = tzxVar7;
    }

    @Override // defpackage.uem, defpackage.uel
    public final /* synthetic */ Object a() {
        scn scnVarG;
        switch (this.h) {
            case 0:
                owf owfVar = (owf) this.a.a();
                owf owfVar2 = (owf) this.b.a();
                owf owfVar3 = (owf) this.c.a();
                owf owfVar4 = (owf) this.d.a();
                Executor executor = (Executor) this.e.a();
                fgn fgnVar = (fgn) this.f.a();
                fqg fqgVar = (fqg) this.g.a();
                fft fftVar = new fft(executor, fgnVar);
                fftVar.n(owfVar);
                fftVar.m(owfVar2);
                fftVar.j(owfVar3);
                fftVar.h(owfVar4);
                fqgVar.b.d(fftVar);
                return fftVar;
            case 1:
                ovx ovxVar = (ovx) this.b.a();
                mhp mhpVarB = ((mia) this.a).b();
                return ((fgn) this.f.a()).b ? new kue(new ffz((fqg) this.e.a(), (mhq) this.c.a(), (out) this.d.a(), mhpVarB, ovxVar, (fgq) this.g.a(), 0), 2) : hgd.a;
            case 2:
                return new fif((owf) this.d.a(), ((ixw) this.f).a(), (ktx) this.a.a(), (jug) this.e.a(), ((mxx) this.c).a(), (out) this.b.a(), new iob(), ((fjg) this.g).a());
            case 3:
                return new fnc(((imn) this.f).a(), (owq) this.d.a(), (owq) this.a.a(), tzs.b(this.e), (hbj) this.b.a(), (Executor) this.c.a(), (owf) this.g.a());
            case 4:
                Executor executor2 = (Executor) this.g.a();
                Executor executor3 = (Executor) this.e.a();
                out outVar = (out) this.d.a();
                pbn pbnVar = (pbn) this.a.a();
                return new gno(this.c, this.f, this.b, executor2, executor3, outVar, pbnVar);
            case 5:
                return new qrh((ggx) this.b.a(), (luw) this.a.a(), (glf) this.e.a(), (owf) this.d.a(), (owf) this.g.a(), (hbj) this.f.a(), (luj) this.c.a());
            case 6:
                gfr gfrVar = (gfr) this.c.a();
                gfr gfrVar2 = (gfr) this.g.a();
                gfu gfuVar = (gfu) this.d.a();
                tzx tzxVar = this.a;
                return new gfq(gfrVar, gfrVar2, gfuVar, (gfs) this.e.a(), (gfr) tzxVar.a(), ((gfp) this.f).a(), ((gfv) this.b).a());
            case 7:
                return new gif((fvu) this.f.a(), (gkw) this.g.a(), (ndj) this.b.a(), (mts) this.e.a(), (mzz) this.c.a(), ((gjz) this.a).a(), (hbj) this.d.a());
            case 8:
                return new gkv((mni) this.f.a(), (mwq) this.e.a(), (muu) this.c.a(), ((imm) this.g).b(), ((fry) this.b).b(), (ScheduledExecutorService) this.a.a(), (hbj) this.d.a());
            case 9:
                return new gmp((krj) this.e.a(), (kqy) this.d.a(), (imi) this.g.a(), ((imm) this.f).b(), (luj) this.b.a(), (luj) this.a.a(), (owq) this.c.a());
            case 10:
                return new qrh((gtm) this.f.a(), (out) this.b.a(), (gox) this.d.a(), ((goe) this.g).a(), (mdy) this.a.a(), ((pba) this.c).a(), (gof) this.e.a());
            case 11:
                CameraFatalErrorTrackerDatabase cameraFatalErrorTrackerDatabase = (CameraFatalErrorTrackerDatabase) this.f.a();
                tzx tzxVar2 = this.a;
                Executor executorB = ((fth) this.d).b();
                mdy mdyVar = (mdy) tzxVar2.a();
                return new gop(cameraFatalErrorTrackerDatabase, executorB, mdyVar, (out) this.b.a(), (hbj) this.c.a(), ((gol) this.g).a());
            case 12:
                hbj hbjVar = (hbj) this.g.a();
                luj lujVar = (luj) this.c.a();
                AmbientMode.AmbientController ambientController = (AmbientMode.AmbientController) this.b.a();
                tzx tzxVar3 = this.f;
                tzx tzxVar4 = this.d;
                tzx tzxVar5 = this.a;
                tzj tzjVarB = tzs.b(this.e);
                tzj tzjVarB2 = tzs.b(tzxVar5);
                tzj tzjVarB3 = tzs.b(tzxVar4);
                tzj tzjVarB4 = tzs.b(tzxVar3);
                scl sclVar = new scl();
                if (hbjVar.p(gyp.b)) {
                    owq owqVarA = lujVar.a(luf.u);
                    HashSet hashSet = new HashSet();
                    hashSet.add(nkw.PHOTO);
                    if (hbjVar.p(gyp.j)) {
                        hashSet.add(nkw.NIGHT_SIGHT);
                    }
                    if (hbjVar.p(gyp.k)) {
                        hashSet.add(nkw.LANDSCAPE);
                        hashSet.add(nkw.ACTION_PAN);
                    }
                    if (hbjVar.p(gyp.c)) {
                        sclVar.d(new gtd(ambientController, tzjVarB, hashSet, hbjVar, owqVarA, 2));
                    }
                    if (hbjVar.p(gyp.f)) {
                        sclVar.d(new gtd(ambientController, tzjVarB2, hashSet, hbjVar, owqVarA, 3));
                    }
                    if (hbjVar.p(gyp.e)) {
                        sclVar.d(new hrg(ambientController, tzjVarB3, (owf) owqVarA, 1));
                    }
                    if (hbjVar.p(gyp.m)) {
                        sclVar.d(new gtr(ambientController, tzjVarB4, hbjVar, owqVarA, 0));
                    }
                    scnVarG = sclVar.g();
                } else {
                    scnVarG = sclVar.g();
                }
                scnVarG.getClass();
                return scnVarG;
            case 13:
                return new gue(((jaf) this.c).b(), (guh) this.f.a(), (ktx) this.b.a(), (owq) this.e.a(), (ScheduledExecutorService) this.g.a(), (mdy) this.a.a(), (owf) this.d.a());
            case UrlRequest.Status.READING_RESPONSE /* 14 */:
                return new hkn(new kjc(1), (Executor) this.g.a(), (our) this.d.a(), (hbj) this.e.a(), (pbn) this.a.a(), ((imm) this.f).b(), (mhq) this.c.a(), ((mia) this.b).b());
            case 15:
                iyu iyuVar = (iyu) this.f.a();
                owq owqVar = (owq) this.e.a();
                owf owfVar5 = (owf) this.b.a();
                owf owfVar6 = (owf) this.a.a();
                out outVar2 = (out) this.c.a();
                fdq fdqVarA = ((ixw) this.d).a();
                hbj hbjVar2 = (hbj) this.g.a();
                return !hbjVar2.p(gzj.f) ? rvk.a : rwc.j(new hko(iyuVar.K.C, owqVar, owfVar5, owfVar6, outVar2, fdqVarA, hbjVar2));
            case 16:
                tzx tzxVar6 = this.g;
                iso isoVarA = ((hfg) this.f).a();
                tzx tzxVar7 = this.b;
                qyc qycVarA = ((kil) this.d).a();
                final fto ftoVar = (fto) tzxVar7.a();
                final pbn pbnVar2 = (pbn) this.a.a();
                hgc.o(isoVarA, qycVarA);
                final tzx tzxVar8 = this.e;
                final tzx tzxVar9 = this.c;
                return new sfm(new fre() { // from class: hoy
                    @Override // defpackage.fre
                    public final /* synthetic */ int a() {
                        return 0;
                    }

                    @Override // defpackage.fre
                    public final syu b() {
                        hoz hozVar = (hoz) tzxVar8;
                        Handler handlerA = hozVar.a();
                        fto ftoVar2 = ftoVar;
                        ftoVar2.getClass();
                        handlerA.post(new hjp(ftoVar2, 7));
                        hozVar.a().post(new cmc(pbnVar2, tzxVar9, 16, null));
                        return ske.M(true);
                    }

                    @Override // defpackage.fre
                    public final /* synthetic */ String c() {
                        return gsn.Z(this);
                    }
                });
            case 17:
                return new hto((owf) this.a.a(), (out) this.c.a(), (itl) this.d.a(), (imi) this.e.a(), ((ngx) this.g).a(), (ktx) this.b.a(), ((imq) this.f).a());
            case 18:
                owq owqVar2 = (owq) this.d.a();
                jub jubVar = (jub) this.f.a();
                hvy hvyVar = (hvy) this.c.a();
                mes mesVar = (mes) this.a.a();
                return new hvp(owqVar2, jubVar, hvyVar, mesVar, (out) this.b.a());
            case 19:
                tzx tzxVar10 = this.a;
                final Context contextB = ((imm) this.g).b();
                final pbn pbnVar3 = (pbn) tzxVar10.a();
                hbj hbjVar3 = (hbj) this.e.a();
                hyd hydVar = (hyd) this.c.a();
                final syu syuVar = (syu) this.f.a();
                final boolean z = hbjVar3.p(gzs.Q) && hydVar.a();
                if (!hbjVar3.p(gzs.O)) {
                    return hgd.a;
                }
                final String strF = hbjVar3.f(gzs.P);
                if (rnt.V(strF)) {
                    return hgd.a;
                }
                final tzx tzxVar11 = this.b;
                final tzx tzxVar12 = this.d;
                return new kue(new Runnable() { // from class: hyo
                    @Override // java.lang.Runnable
                    public final void run() {
                        final pbn pbnVar4 = pbnVar3;
                        final uem uemVar = tzxVar12;
                        final uem uemVar2 = tzxVar11;
                        final Context context = contextB;
                        final String str = strF;
                        final boolean z2 = z;
                        ojl.ck(syuVar, new paf() { // from class: hyl
                            /* JADX WARN: Type inference failed for: r0v6, types: [sgt, shi] */
                            /* JADX WARN: Type inference failed for: r0v9, types: [sgt, shi] */
                            @Override // defpackage.paf
                            public final void a(Object obj) throws IOException {
                                pbn pbnVar5 = pbnVar4;
                                pbnVar5.f("Lancet#initialize");
                                Gcam gcam = (Gcam) uemVar.a();
                                Object objA = ((hyt) uemVar2).a();
                                boolean z3 = z2;
                                String str2 = str;
                                try {
                                    AssetFileDescriptor assetFileDescriptorOpenFd = context.getAssets().openFd(str2);
                                    try {
                                        ((NativeHdrPlusInterface) objA).nativeInitializeLancetFromOpenFile(assetFileDescriptorOpenFd.getParcelFileDescriptor().getFd(), assetFileDescriptorOpenFd.getStartOffset(), assetFileDescriptorOpenFd.getLength(), z3, Gcam.a(gcam));
                                        if (assetFileDescriptorOpenFd != null) {
                                            assetFileDescriptorOpenFd.close();
                                        }
                                    } finally {
                                    }
                                } catch (IOException e) {
                                    ((sgt) ((sgt) iaw.a.b().i(e)).M((char) 1789)).s("Unable to get model asset file");
                                } catch (RuntimeException e2) {
                                    ((sgt) ((sgt) iaw.a.b().i(e2)).M((char) 1790)).v("Failed to initialize %s", str2);
                                }
                                pbnVar5.g();
                            }
                        }, sxo.a);
                    }
                }, 2);
            default:
                return new icc((mhq) this.b.a(), ((mia) this.a).b(), (iao) this.g.a(), (ibb) this.e.a(), (owf) this.c.a(), (hbj) this.f.a(), (our) this.d.a());
        }
    }

    public fgc(tzx tzxVar, tzx tzxVar2, tzx tzxVar3, tzx tzxVar4, tzx tzxVar5, tzx tzxVar6, tzx tzxVar7, int i, byte[] bArr) {
        this.h = i;
        this.b = tzxVar;
        this.a = tzxVar2;
        this.c = tzxVar3;
        this.d = tzxVar4;
        this.f = tzxVar5;
        this.e = tzxVar6;
        this.g = tzxVar7;
    }

    public fgc(tzx tzxVar, tzx tzxVar2, tzx tzxVar3, tzx tzxVar4, tzx tzxVar5, tzx tzxVar6, tzx tzxVar7, int i, byte[] bArr, byte[] bArr2) {
        this.h = i;
        this.d = tzxVar;
        this.b = tzxVar2;
        this.g = tzxVar3;
        this.a = tzxVar4;
        this.e = tzxVar5;
        this.c = tzxVar6;
        this.f = tzxVar7;
    }

    public fgc(tzx tzxVar, tzx tzxVar2, tzx tzxVar3, tzx tzxVar4, tzx tzxVar5, tzx tzxVar6, tzx tzxVar7, int i, char[] cArr) {
        this.h = i;
        this.d = tzxVar;
        this.f = tzxVar2;
        this.a = tzxVar3;
        this.e = tzxVar4;
        this.c = tzxVar5;
        this.b = tzxVar6;
        this.g = tzxVar7;
    }

    public fgc(tzx tzxVar, tzx tzxVar2, tzx tzxVar3, tzx tzxVar4, tzx tzxVar5, tzx tzxVar6, tzx tzxVar7, int i, char[] cArr, byte[] bArr) {
        this.h = i;
        this.g = tzxVar;
        this.b = tzxVar2;
        this.a = tzxVar3;
        this.e = tzxVar4;
        this.c = tzxVar5;
        this.f = tzxVar6;
        this.d = tzxVar7;
    }

    public fgc(tzx tzxVar, tzx tzxVar2, tzx tzxVar3, tzx tzxVar4, tzx tzxVar5, tzx tzxVar6, tzx tzxVar7, int i, float[] fArr) {
        this.h = i;
        this.c = tzxVar;
        this.g = tzxVar2;
        this.d = tzxVar3;
        this.e = tzxVar4;
        this.a = tzxVar5;
        this.f = tzxVar6;
        this.b = tzxVar7;
    }

    public fgc(tzx tzxVar, tzx tzxVar2, tzx tzxVar3, tzx tzxVar4, tzx tzxVar5, tzx tzxVar6, tzx tzxVar7, int i, int[] iArr) {
        this.h = i;
        this.c = tzxVar;
        this.f = tzxVar2;
        this.b = tzxVar3;
        this.g = tzxVar4;
        this.e = tzxVar5;
        this.d = tzxVar6;
        this.a = tzxVar7;
    }

    public fgc(tzx tzxVar, tzx tzxVar2, tzx tzxVar3, tzx tzxVar4, tzx tzxVar5, tzx tzxVar6, tzx tzxVar7, int i, short[] sArr) {
        this.h = i;
        this.f = tzxVar;
        this.d = tzxVar2;
        this.a = tzxVar3;
        this.e = tzxVar4;
        this.b = tzxVar5;
        this.c = tzxVar6;
        this.g = tzxVar7;
    }

    public fgc(tzx tzxVar, tzx tzxVar2, tzx tzxVar3, tzx tzxVar4, tzx tzxVar5, tzx tzxVar6, tzx tzxVar7, int i, boolean[] zArr) {
        this.h = i;
        this.b = tzxVar;
        this.a = tzxVar2;
        this.e = tzxVar3;
        this.d = tzxVar4;
        this.g = tzxVar5;
        this.f = tzxVar6;
        this.c = tzxVar7;
    }

    public fgc(tzx tzxVar, tzx tzxVar2, tzx tzxVar3, tzx tzxVar4, tzx tzxVar5, tzx tzxVar6, tzx tzxVar7, int i, byte[][] bArr) {
        this.h = i;
        this.f = tzxVar;
        this.g = tzxVar2;
        this.b = tzxVar3;
        this.e = tzxVar4;
        this.c = tzxVar5;
        this.a = tzxVar6;
        this.d = tzxVar7;
    }

    public fgc(tzx tzxVar, tzx tzxVar2, tzx tzxVar3, tzx tzxVar4, tzx tzxVar5, tzx tzxVar6, tzx tzxVar7, int i, char[][] cArr) {
        this.h = i;
        this.f = tzxVar;
        this.e = tzxVar2;
        this.c = tzxVar3;
        this.g = tzxVar4;
        this.b = tzxVar5;
        this.a = tzxVar6;
        this.d = tzxVar7;
    }

    public fgc(tzx tzxVar, tzx tzxVar2, tzx tzxVar3, tzx tzxVar4, tzx tzxVar5, tzx tzxVar6, tzx tzxVar7, int i, float[][] fArr) {
        this.h = i;
        this.g = tzxVar;
        this.c = tzxVar2;
        this.b = tzxVar3;
        this.e = tzxVar4;
        this.a = tzxVar5;
        this.d = tzxVar6;
        this.f = tzxVar7;
    }

    public fgc(tzx tzxVar, tzx tzxVar2, tzx tzxVar3, tzx tzxVar4, tzx tzxVar5, tzx tzxVar6, tzx tzxVar7, int i, int[][] iArr) {
        this.h = i;
        this.f = tzxVar;
        this.b = tzxVar2;
        this.d = tzxVar3;
        this.g = tzxVar4;
        this.a = tzxVar5;
        this.c = tzxVar6;
        this.e = tzxVar7;
    }

    public fgc(tzx tzxVar, tzx tzxVar2, tzx tzxVar3, tzx tzxVar4, tzx tzxVar5, tzx tzxVar6, tzx tzxVar7, int i, short[][] sArr) {
        this.h = i;
        this.e = tzxVar;
        this.d = tzxVar2;
        this.g = tzxVar3;
        this.f = tzxVar4;
        this.b = tzxVar5;
        this.a = tzxVar6;
        this.c = tzxVar7;
    }

    public fgc(tzx tzxVar, tzx tzxVar2, tzx tzxVar3, tzx tzxVar4, tzx tzxVar5, tzx tzxVar6, tzx tzxVar7, int i, byte[][][] bArr) {
        this.h = i;
        this.c = tzxVar;
        this.f = tzxVar2;
        this.b = tzxVar3;
        this.e = tzxVar4;
        this.g = tzxVar5;
        this.a = tzxVar6;
        this.d = tzxVar7;
    }

    public fgc(tzx tzxVar, tzx tzxVar2, tzx tzxVar3, tzx tzxVar4, tzx tzxVar5, tzx tzxVar6, tzx tzxVar7, int i, char[][][] cArr) {
        this.h = i;
        this.g = tzxVar;
        this.d = tzxVar2;
        this.e = tzxVar3;
        this.a = tzxVar4;
        this.f = tzxVar5;
        this.c = tzxVar6;
        this.b = tzxVar7;
    }

    public fgc(tzx tzxVar, tzx tzxVar2, tzx tzxVar3, tzx tzxVar4, tzx tzxVar5, tzx tzxVar6, tzx tzxVar7, int i, float[][][] fArr) {
        this.h = i;
        this.d = tzxVar;
        this.f = tzxVar2;
        this.c = tzxVar3;
        this.a = tzxVar4;
        this.e = tzxVar5;
        this.g = tzxVar6;
        this.b = tzxVar7;
    }

    public fgc(tzx tzxVar, tzx tzxVar2, tzx tzxVar3, tzx tzxVar4, tzx tzxVar5, tzx tzxVar6, tzx tzxVar7, int i, int[][][] iArr) {
        this.h = i;
        this.c = tzxVar;
        this.e = tzxVar2;
        this.f = tzxVar3;
        this.g = tzxVar4;
        this.d = tzxVar5;
        this.b = tzxVar6;
        this.a = tzxVar7;
    }

    public fgc(tzx tzxVar, tzx tzxVar2, tzx tzxVar3, tzx tzxVar4, tzx tzxVar5, tzx tzxVar6, tzx tzxVar7, int i, short[][][] sArr) {
        this.h = i;
        this.f = tzxVar;
        this.e = tzxVar2;
        this.b = tzxVar3;
        this.a = tzxVar4;
        this.c = tzxVar5;
        this.d = tzxVar6;
        this.g = tzxVar7;
    }

    public fgc(tzx tzxVar, tzx tzxVar2, tzx tzxVar3, tzx tzxVar4, tzx tzxVar5, tzx tzxVar6, tzx tzxVar7, int i, boolean[][][] zArr) {
        this.h = i;
        this.a = tzxVar;
        this.c = tzxVar2;
        this.d = tzxVar3;
        this.e = tzxVar4;
        this.g = tzxVar5;
        this.b = tzxVar6;
        this.f = tzxVar7;
    }
}
