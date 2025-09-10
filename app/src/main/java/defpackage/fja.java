package defpackage;

import android.content.res.AssetFileDescriptor;
import android.content.res.AssetManager;
import android.graphics.Bitmap;
import android.widget.ImageView;
import com.google.googlex.gcam.creativecamera.allin.jni.AllInNativeImpl;
import j$.time.Duration;
import j$.time.Instant;
import j$.util.Optional;
import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class fja implements lst {
    public static final sgv a = sgv.g("fja");
    public final Executor c;
    public final teg d;
    public final owf e;
    public final ovx f;
    public final fjo g;
    public final pbn h;
    public final rwc i;
    public final owq j;
    public final float k;
    private final ovx m;
    private final owq n;
    private final owf o;
    private final owf p;
    private final Duration q;
    private final swb r;
    private paq s;
    private ouk t;
    private ggg v;
    private final qqq w;
    private final pfl x;
    public final Map b = new HashMap();
    public int l = 0;
    private Instant u = Instant.MIN;

    public fja(hbj hbjVar, Executor executor, teg tegVar, pfl pflVar, owf owfVar, ovx ovxVar, ovx ovxVar2, owq owqVar, owq owqVar2, owf owfVar2, owf owfVar3, rwc rwcVar, fjo fjoVar, swb swbVar, qqq qqqVar, pbn pbnVar) {
        this.c = executor;
        this.d = tegVar;
        this.x = pflVar;
        this.e = owfVar;
        this.f = ovxVar;
        this.g = fjoVar;
        this.h = pbnVar;
        this.m = ovxVar2;
        this.j = owqVar;
        this.i = rwcVar;
        this.n = owqVar2;
        float fFloatValue = ((Float) hbjVar.e(gyi.r).orElse(Float.valueOf(7.0f))).floatValue();
        this.k = fFloatValue * fFloatValue;
        this.p = owfVar3;
        this.o = owfVar2;
        this.q = Duration.ofMillis(((Integer) hbjVar.a(gyi.g).orElse(Integer.MAX_VALUE)).intValue());
        this.r = swbVar;
        this.w = qqqVar;
    }

    private final synchronized void p(fip fipVar) {
        paq paqVar = this.s;
        if (paqVar != null) {
            paqVar.close();
        }
        this.s = fipVar.k.dK(this.m, sxo.a);
    }

    private final void q(ltd ltdVar, int i) {
        paq paqVar;
        fip fipVarA = a(ltdVar);
        if (fipVarA == null) {
            return;
        }
        int i2 = ltdVar.a;
        synchronized (fipVarA) {
            List list = fipVarA.d;
            if (list.contains(ltdVar)) {
                fipVarA.p--;
                fipVarA.q--;
                if (i == 3 || i == 2) {
                    fipVarA.g(spe.HDR_FAILED);
                    list.remove(ltdVar);
                }
                fipVarA.i();
            } else {
                ((sgt) fip.a.c().M(166)).w("ShotId:%s does not belong to groupId:%s", i2, fipVarA.c);
            }
        }
        if (fipVarA.k()) {
            synchronized (this) {
                Map map = this.b;
                map.remove(Integer.valueOf(fipVarA.c));
                if (map.isEmpty() && (paqVar = this.s) != null) {
                    paqVar.close();
                }
            }
        }
    }

    public final fip a(ltd ltdVar) {
        Map map;
        synchronized (this) {
            map = this.b;
        }
        for (Integer num : map.keySet()) {
            num.intValue();
            fip fipVar = (fip) map.get(num);
            if (fipVar.a().contains(ltdVar)) {
                return fipVar;
            }
        }
        return null;
    }

    @Override // defpackage.lst
    public final void b(ltd ltdVar) {
        q(ltdVar, 2);
    }

    @Override // defpackage.lst
    public final void d(ltd ltdVar) {
        q(ltdVar, 1);
    }

    @Override // defpackage.lst
    public final void g(ltd ltdVar, Bitmap bitmap, int i) {
        Bitmap.Config config;
        fip fipVarA = a(ltdVar);
        if (fipVarA == null) {
            return;
        }
        synchronized (fipVarA) {
            if (!fipVarA.v && !fipVarA.t) {
                if (fipVarA.j(ltdVar)) {
                    int i2 = fipVarA.c;
                    fiz fizVar = (fiz) fipVarA.l;
                    if (fizVar.b.l(i2)) {
                        fje fjeVar = (fje) fizVar.a;
                        if (fjeVar.f) {
                            fif fifVar = fjeVar.g;
                            if (fifVar.c == null || (config = bitmap.getConfig()) == null) {
                                return;
                            }
                            fifVar.d = bitmap.copy(config, bitmap.isMutable());
                            fifVar.d = fifVar.k.a(fifVar.d, i);
                            ImageView imageView = fifVar.c;
                            imageView.getClass();
                            imageView.setImageBitmap(fifVar.d);
                        }
                    }
                }
            }
        }
    }

    @Override // defpackage.lst
    public final void i(ltd ltdVar, lsy lsyVar, ltg ltgVar) {
        if (lsyVar.c.equals(ltf.COTTAGE)) {
            int i = ltdVar.a;
            synchronized (this) {
                Map map = this.b;
                fip fipVar = (fip) map.get(Integer.valueOf(this.l));
                if (fipVar == null) {
                    ((sgt) a.c().M(208)).G("addShot Shot-%s failed, current groupId: %s does have an active session in map %s", Integer.valueOf(i), Integer.valueOf(this.l), map.keySet().toArray());
                } else {
                    fipVar.c(ltdVar);
                }
            }
        }
    }

    public final void k(fip fipVar) {
        if (fipVar == null || !((Boolean) this.p.dL()).booleanValue() || ((Boolean) this.o.dL()).booleanValue()) {
            this.n.a(true);
            this.u = this.r.a();
        } else {
            this.n.a(Boolean.valueOf(Duration.between(this.u, this.r.a()).compareTo(this.q) <= 0));
        }
    }

    public final synchronized boolean l(int i) {
        if (i == this.l) {
            if (this.b.containsKey(Integer.valueOf(i))) {
                return true;
            }
        }
        return false;
    }

    public final synchronized boolean m(fji fjiVar) {
        ggg gggVar;
        ouk oukVar = this.t;
        paq paqVarA = oukVar == null ? null : oukVar.a();
        if (paqVarA == null || (gggVar = this.v) == null) {
            return false;
        }
        int i = this.l + 1;
        this.l = i;
        pfl pflVar = this.x;
        fiz fizVar = new fiz(this, fjiVar);
        lsw lswVarQ = this.w.q(System.currentTimeMillis(), hqp.COTTAGE, null, Optional.of(UUID.randomUUID()));
        Object obj = pflVar.a;
        Executor executor = (Executor) ((fiq) obj).a.a();
        syw sywVar = (syw) ((fiq) obj).b.a();
        teg tegVar = (teg) ((fiq) obj).c.a();
        ggg gggVar2 = (ggg) ((fiq) obj).d.a();
        sbv sbvVar = (sbv) ((fiq) obj).f.a();
        tgp tgpVar = (tgp) ((fiq) obj).g.a();
        pbn pbnVar = (pbn) ((fiq) obj).h.a();
        jod jodVar = (jod) ((fiq) obj).i.a();
        tzx tzxVar = ((fiq) obj).j;
        tzx tzxVar2 = ((fiq) obj).k;
        lrp lrpVar = (lrp) ((fiq) obj).l.a();
        tzx tzxVar3 = ((fiq) obj).m;
        owf owfVar = (owf) ((fiq) obj).n.a();
        Executor executor2 = (Executor) ((fiq) obj).o.a();
        hbj hbjVar = (hbj) ((fiq) obj).p.a();
        tzx tzxVar4 = ((fiq) obj).q;
        hmp.b();
        tzx tzxVar5 = ((fiq) obj).r;
        fip fipVar = new fip(executor, sywVar, tegVar, gggVar2, sbvVar, tgpVar, pbnVar, jodVar, tzxVar, tzxVar2, lrpVar, owfVar, executor2, hbjVar, i, paqVarA, gggVar, fizVar, lswVarQ);
        this.b.put(Integer.valueOf(this.l), fipVar);
        p(fipVar);
        k(fipVar);
        return true;
    }

    @Override // defpackage.lst
    public final void n(ltd ltdVar) {
        q(ltdVar, 3);
    }

    public final synchronized paq o(ggg gggVar) {
        paq paqVarA;
        this.v = gggVar;
        ouk oukVar = this.t;
        byte[] bArr = null;
        paqVarA = oukVar == null ? null : oukVar.a();
        if (paqVarA == null) {
            final our ourVar = new our();
            this.c.execute(new Runnable() { // from class: fix
                /* JADX WARN: Type inference failed for: r0v2, types: [sgt, shi] */
                @Override // java.lang.Runnable
                public final void run() throws IOException {
                    sbv sbvVarB;
                    fja fjaVar = this.a;
                    our ourVar2 = ourVar;
                    try {
                        fjo fjoVar = fjaVar.g;
                        tpc tpcVarM = tgh.a.m();
                        ArrayList arrayList = new ArrayList();
                        try {
                            pbm pbmVar = new pbm(fjoVar.d, "AllInAssetManager#openModelAssets");
                            try {
                                if (fjoVar.e) {
                                    sbr sbrVar = new sbr();
                                    sbrVar.j(fjo.a);
                                    tgc tgcVar = tgc.FACE_DETECTOR_CUSTOM_OPS_ID;
                                    hbj hbjVar = fjoVar.f;
                                    String strF = hbjVar.f(gyi.v);
                                    strF.getClass();
                                    sbrVar.f(tgcVar, strF);
                                    tgc tgcVar2 = tgc.PORTRAIT_MATTING_TPU_ID;
                                    String strF2 = hbjVar.f(gyi.w);
                                    strF2.getClass();
                                    sbrVar.f(tgcVar2, strF2);
                                    tgc tgcVar3 = tgc.FG_COLOR_ESTIMATOR_TPU_ID;
                                    String strF3 = hbjVar.f(gyi.x);
                                    strF3.getClass();
                                    sbrVar.f(tgcVar3, strF3);
                                    tgc tgcVar4 = tgc.FACE_TO_PERSON_SEGMENTER_CUSTOM_OPS_ID;
                                    String strF4 = hbjVar.f(gyi.y);
                                    strF4.getClass();
                                    sbrVar.f(tgcVar4, strF4);
                                    tgc tgcVar5 = tgc.RAID_MATTING_768_TPU_ID;
                                    String strF5 = hbjVar.f(gyi.A);
                                    strF5.getClass();
                                    sbrVar.f(tgcVar5, strF5);
                                    tgc tgcVar6 = tgc.FOREGROUND_SEGMENTER_TPU_ID;
                                    String strF6 = hbjVar.f(gyi.z);
                                    strF6.getClass();
                                    sbrVar.f(tgcVar6, strF6);
                                    tgc tgcVar7 = tgc.SHADOW_SEGMENTER_TPU_ID;
                                    String strF7 = hbjVar.f(gyi.B);
                                    strF7.getClass();
                                    sbrVar.f(tgcVar7, strF7);
                                    tgc tgcVar8 = tgc.HOI_CLASSIFIER_TPU_ID;
                                    String strF8 = hbjVar.f(gyi.D);
                                    strF8.getClass();
                                    sbrVar.f(tgcVar8, strF8);
                                    tgc tgcVar9 = tgc.ATTACHED_OBJECTS_SEGMENTER_TPU_ID;
                                    String strF9 = hbjVar.f(gyi.C);
                                    strF9.getClass();
                                    sbrVar.f(tgcVar9, strF9);
                                    tgc tgcVar10 = tgc.ATTACHED_OBJECTS_DETECTOR_TPU_ID;
                                    String strF10 = hbjVar.f(gyi.E);
                                    strF10.getClass();
                                    sbrVar.f(tgcVar10, strF10);
                                    sbvVarB = sbrVar.b();
                                } else {
                                    sbvVarB = fjo.b;
                                }
                                sgj sgjVarListIterator = sbvVarB.keySet().listIterator();
                                while (sgjVarListIterator.hasNext()) {
                                    tgc tgcVar11 = (tgc) sgjVarListIterator.next();
                                    AssetManager assets = fjoVar.c.getAssets();
                                    String str = (String) sbvVarB.get(tgcVar11);
                                    str.getClass();
                                    AssetFileDescriptor assetFileDescriptorOpenFd = assets.openFd(str);
                                    int i = tgcVar11.T;
                                    tpc tpcVarM2 = tgd.a.m();
                                    int fd = assetFileDescriptorOpenFd.getParcelFileDescriptor().getFd();
                                    if (!tpcVarM2.b.C()) {
                                        tpcVarM2.o();
                                    }
                                    tgd tgdVar = (tgd) tpcVarM2.b;
                                    tgdVar.b |= 1;
                                    tgdVar.c = fd;
                                    long startOffset = assetFileDescriptorOpenFd.getStartOffset();
                                    if (!tpcVarM2.b.C()) {
                                        tpcVarM2.o();
                                    }
                                    tgd tgdVar2 = (tgd) tpcVarM2.b;
                                    tgdVar2.b = 2 | tgdVar2.b;
                                    tgdVar2.d = startOffset;
                                    long length = assetFileDescriptorOpenFd.getLength();
                                    if (!tpcVarM2.b.C()) {
                                        tpcVarM2.o();
                                    }
                                    tgd tgdVar3 = (tgd) tpcVarM2.b;
                                    tgdVar3.b |= 4;
                                    tgdVar3.e = length;
                                    tgd tgdVar4 = (tgd) tpcVarM2.l();
                                    tgdVar4.getClass();
                                    if (!tpcVarM.b.C()) {
                                        tpcVarM.o();
                                    }
                                    tgh tghVar = (tgh) tpcVarM.b;
                                    tqm tqmVar = tghVar.b;
                                    if (!tqmVar.b) {
                                        tghVar.b = tqmVar.a();
                                    }
                                    tghVar.b.put(Integer.valueOf(i), tgdVar4);
                                    arrayList.add(assetFileDescriptorOpenFd);
                                }
                                pbmVar.close();
                                fjn fjnVar = new fjn((tgh) tpcVarM.l(), fjoVar.e, sbp.j(arrayList));
                                try {
                                    pbn pbnVar = fjaVar.h;
                                    pbnVar.f("processor#initProcessor");
                                    teg tegVar = fjaVar.d;
                                    tpc tpcVarM3 = tfp.a.m();
                                    tgh tghVar2 = fjnVar.a;
                                    if (!tpcVarM3.b.C()) {
                                        tpcVarM3.o();
                                    }
                                    tfp tfpVar = (tfp) tpcVarM3.b;
                                    tfpVar.c = tghVar2;
                                    tfpVar.b |= 1;
                                    rwc rwcVar = fjaVar.i;
                                    String absolutePath = rwcVar.h() ? ((File) rwcVar.c()).getAbsolutePath() : "";
                                    if (!tpcVarM3.b.C()) {
                                        tpcVarM3.o();
                                    }
                                    tph tphVar = tpcVarM3.b;
                                    tfp tfpVar2 = (tfp) tphVar;
                                    absolutePath.getClass();
                                    tfpVar2.b |= 2;
                                    tfpVar2.d = absolutePath;
                                    boolean z = fjnVar.b;
                                    if (!tphVar.C()) {
                                        tpcVarM3.o();
                                    }
                                    tfp tfpVar3 = (tfp) tpcVarM3.b;
                                    tfpVar3.b |= 4;
                                    tfpVar3.e = z;
                                    tfp tfpVar4 = (tfp) tpcVarM3.l();
                                    tfq tfqVar = tegVar.b;
                                    tga tgaVarA = AllInNativeImpl.a(((AllInNativeImpl) tfqVar).createImpl(tfpVar4.h()));
                                    int iAA = a.aA(tgaVarA.d);
                                    int i2 = 3;
                                    if (iAA != 0 && iAA == 2) {
                                        ((AllInNativeImpl) tfqVar).b = (tgaVarA.b == 3 ? (tfs) tgaVarA.c : tfs.a).b;
                                    }
                                    pbnVar.g();
                                    ourVar2.d(owb.a(fjaVar.e).dK(new fcs(fjaVar, pbnVar.a("#setTrackingSession"), i2), fjaVar.c));
                                    fjnVar.close();
                                } finally {
                                }
                            } finally {
                            }
                        } catch (IOException e) {
                            int size = arrayList.size();
                            for (int i3 = 0; i3 < size; i3++) {
                                ((Closeable) arrayList.get(i3)).close();
                            }
                            throw e;
                        }
                    } catch (IOException e2) {
                        ((sgt) ((sgt) fja.a.b().i(e2)).M((char) 215)).s("Could not init processor");
                    }
                }
            });
            ouk oukVar2 = new ouk(new fid(this, ourVar, 2, bArr));
            this.t = oukVar2;
            paqVarA = oukVar2.a();
        }
        paqVarA.getClass();
        return new fis(paqVarA, 4);
    }

    @Override // defpackage.lst
    public final /* synthetic */ void c(ltd ltdVar) {
    }

    @Override // defpackage.lst
    public final /* synthetic */ void e(long j) {
    }

    @Override // defpackage.lst
    public final /* synthetic */ void eh(Bitmap bitmap) {
    }

    @Override // defpackage.lst
    public final /* synthetic */ void j(ltd ltdVar) {
    }

    @Override // defpackage.lst
    public final /* synthetic */ void h(ltd ltdVar, par parVar) {
    }
}
