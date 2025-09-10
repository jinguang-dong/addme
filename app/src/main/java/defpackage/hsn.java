package defpackage;

import android.content.Context;
import android.hardware.camera2.CaptureResult;
import android.widget.FrameLayout;
import com.google.android.apps.camera.focusindicator.CIAk.YyLACfm;
import com.google.android.apps.camera.jni.serengeti.SerengetiNative;
import com.google.ar.core.R;
import com.google.googlex.gcam.Gcam;
import com.google.googlex.gcam.GcamModuleJNI;
import com.google.googlex.gcam.ShotMetadata;
import com.google.googlex.gcam.hdrplus.NativeMetadataConverter;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import org.chromium.net.UrlRequest;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hsn implements tzt {
    private final tzx a;
    private final tzx b;
    private final /* synthetic */ int c;

    public hsn(tzx tzxVar, tzx tzxVar2, int i) {
        this.c = i;
        this.a = tzxVar;
        this.b = tzxVar2;
    }

    public hsn(tzx tzxVar, tzx tzxVar2, int i, float[] fArr) {
        this.c = i;
        this.b = tzxVar;
        this.a = tzxVar2;
    }

    @Override // defpackage.uem, defpackage.uel
    public final /* synthetic */ Object a() {
        plb plbVarB;
        Object sfmVar;
        switch (this.c) {
            case 0:
                tzx tzxVar = this.b;
                Context contextB = ((imm) this.a).b();
                huq huqVar = (huq) tzxVar.a();
                huqVar.getClass();
                FrameLayout frameLayout = new FrameLayout(contextB);
                frameLayout.setId(R.id.serengeti_tracker_view_container);
                frameLayout.setLayoutParams(new mxf(5));
                frameLayout.addView(huqVar);
                return frameLayout;
            case 1:
                return ((hbj) this.b.a()).p(gyo.f) ? ((jaf) this.a).b() : rvk.a;
            case 2:
                tdi tdiVar = (tdi) this.a.a();
                uhf uhfVar = (uhf) this.b.a();
                tdiVar.getClass();
                uhfVar.getClass();
                return new SerengetiNative(tdiVar, uhfVar);
            case 3:
                return ((hbj) this.a.a()).p(gzq.d) ? ((jaf) this.b).b() : rvk.a;
            case 4:
                ((jaf) this.a).b();
                gzi gziVar = gzq.a;
                return rvk.a;
            case 5:
                return new hwj((plc) this.b.a(), (our) this.a.a());
            case 6:
                Object sfmVar2 = ((Integer) this.b.a()).intValue() < 0 ? sfd.a : new sfm((ojl) this.a.a());
                sfmVar2.getClass();
                return sfmVar2;
            case 7:
                plc plcVar = (plc) this.b.a();
                gzi gziVar2 = gzo.a;
                plcVar.getClass();
                return plcVar;
            case 8:
                Integer num = (Integer) this.a.a();
                return num.intValue() < 0 ? new inx() : new ioa(num.intValue(), ((kqp) this.b.a()).b());
            case 9:
                pjo pjoVar = (pjo) this.a.a();
                hbj hbjVar = (hbj) this.b.a();
                pka pkaVarL = pjoVar.l();
                pka pkaVar = pka.BACK;
                if (hbjVar.p(gzo.ay) && pkaVarL == pkaVar) {
                    return hbjVar.a(gzo.n).get();
                }
                return -1;
            case 10:
                return new hyd(((hfg) this.a).a(), (hbj) this.b.a());
            case 11:
                return new hyf((Gcam) this.b.a(), (ScheduledExecutorService) this.a.a());
            case 12:
                tzx tzxVar2 = this.b;
                pjp pjpVarA = ((pab) this.a).a();
                sbr sbrVar = new sbr();
                for (pjr pjrVar : pjpVarA.g()) {
                    sbrVar.f(pjrVar, new NativeMetadataConverter(pjpVarA.a(pjrVar), pjpVarA));
                }
                return sbrVar.b();
            case 13:
                gzi gziVar3 = gzs.a;
                sfd sfdVar = sfd.a;
                sfdVar.getClass();
                return sfdVar;
            case UrlRequest.Status.READING_RESPONSE /* 14 */:
                rwc rwcVar = (rwc) this.b.a();
                our ourVar = (our) this.a.a();
                if (!rwcVar.h() || (plbVarB = ((plc) rwcVar.c()).b(YyLACfm.yVzik)) == null) {
                    return rvk.a;
                }
                ourVar.d(plbVarB);
                return rwc.j(plbVarB);
            case 15:
                return new iaq((khf) this.a.a(), (rwc) this.b.a());
            case 16:
                return new ibj((Executor) this.a.a(), (pbn) this.b.a());
            case 17:
                return new ovx(((hyb) this.b).a(), (owq) this.a.a());
            case 18:
                final rwc rwcVar2 = (rwc) this.a.a();
                if (rwcVar2.h()) {
                    gzi gziVar4 = gzs.a;
                    sfmVar = new sfm(new ihc() { // from class: icr
                        /* JADX WARN: Type inference failed for: r10v2, types: [sgt, shi] */
                        @Override // defpackage.ihc
                        public final void a(ShotMetadata shotMetadata, lss lssVar, hxu hxuVar, iea ieaVar) throws NumberFormatException {
                            icv icvVarH = lssVar.h();
                            if (icvVarH.a()) {
                                icu icuVar = (icu) rwcVar2.c();
                                poe poeVar = icvVarH.b;
                                if (poeVar == null) {
                                    ((sgt) icu.a.c().M(1864)).s("3A_DEBUG XMP Capture result is null, cannot save metadata.");
                                    return;
                                }
                                String strB = poeVar.b();
                                if (strB == null) {
                                    ((sgt) icu.a.c().M(1863)).s("3A_DEBUG XMP camera ID is null, cannot save metadata.");
                                    return;
                                }
                                jva jvaVar = icuVar.b;
                                icw icwVar = new icw();
                                icwVar.a(0L);
                                icwVar.a = poeVar.d();
                                icwVar.g = (byte) (icwVar.g | 1);
                                Long l = (Long) poeVar.a(CaptureResult.SENSOR_TIMESTAMP);
                                icwVar.a(l != null ? l.longValue() : 0L);
                                jvaVar.d.ifPresent(new fxu(icwVar, poeVar, 6));
                                jvaVar.e.ifPresent(new fxu(icwVar, poeVar, 7));
                                jvaVar.f.ifPresent(new fxu(icwVar, poeVar, 8));
                                jvaVar.g.ifPresent(new fxu(icwVar, poeVar, 9));
                                if (icwVar.g != 3) {
                                    throw new IllegalStateException();
                                }
                                icx icxVar = new icx(icwVar.a, icwVar.b, icwVar.c, icwVar.d, icwVar.e, icwVar.f);
                                try {
                                    int i = Integer.parseInt(strB);
                                    byte[] bArrA = icu.a(icxVar.a);
                                    byte[] bArrA2 = icu.a(icxVar.b);
                                    byte[] bArrA3 = icu.a(icxVar.c);
                                    byte[] bArrA4 = icu.a(icxVar.d);
                                    tcq tcqVar = hxy.a;
                                    GcamModuleJNI.AddG3aMetadata__SWIG_1(i, bArrA, bArrA2, bArrA3, bArrA4, ShotMetadata.a(shotMetadata), shotMetadata);
                                } catch (RuntimeException e) {
                                    ((sgt) ((sgt) icu.a.c().i(e)).M((char) 1862)).v("3A_DEBUG XMP Error saving metadata from cameraId=%s.", strB);
                                }
                            }
                        }
                    });
                } else {
                    sfmVar = sfd.a;
                }
                sfmVar.getClass();
                return sfmVar;
            case 19:
                Object sfmVar3 = ((hbj) this.b.a()).a(gzs.a).isPresent() ? new sfm((hzi) this.a.a()) : sfd.a;
                sfmVar3.getClass();
                return sfmVar3;
            default:
                hbj hbjVar2 = (hbj) this.a.a();
                ((hfl) this.b).a();
                return (icy.a(hbjVar2) && ins.v() && !hbjVar2.p(gzs.y)) ? new ict(hbjVar2) : new icz();
        }
    }
}
