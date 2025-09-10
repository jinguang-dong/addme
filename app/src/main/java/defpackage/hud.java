package defpackage;

import android.os.SystemClock;
import androidx.wear.ambient.AmbientModeSupport;
import com.google.android.apps.camera.autotimer.analysis.jni.wVCD.HHdu;
import com.google.ar.core.R;
import com.google.googlex.gcam.BurstSpec;
import com.google.googlex.gcam.GcamModuleJNI;
import com.google.googlex.gcam.InterleavedImageU16;
import com.google.googlex.gcam.InterleavedImageU8;
import com.google.googlex.gcam.ShotMetadata;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class hud implements hzi, iac, ial, iah {
    public final htv a;
    private final hxv b;
    private final iso c;

    public hud(iso isoVar, htv htvVar, hxv hxvVar, hbj hbjVar) {
        isoVar.getClass();
        htvVar.getClass();
        hbjVar.getClass();
        this.c = isoVar;
        this.a = htvVar;
        this.b = hxvVar;
    }

    /* JADX WARN: Type inference failed for: r3v7, types: [java.lang.Object, lss] */
    @Override // defpackage.hzi
    public final void a(ltd ltdVar) {
        Object next;
        ltdVar.getClass();
        htv htvVar = this.a;
        Set set = htvVar.h;
        Iterator it = set.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            } else {
                next = it.next();
                if (((iby) next).x.b.l().equals(ltdVar)) {
                    break;
                }
            }
        }
        iby ibyVar = (iby) next;
        if (ibyVar == null) {
            ((sgt) htv.a.c().M(1557)).v("onShotAborted called on unknown shot %s", ltdVar);
            return;
        }
        ibyVar.a();
        List list = htvVar.k;
        int iA = ibyVar.a();
        boolean zRemove = list.remove(ibyVar);
        set.remove(ibyVar);
        Map map = htvVar.g;
        Integer numValueOf = Integer.valueOf(iA);
        huy huyVar = (huy) map.remove(numValueOf);
        if (huyVar != null) {
            hui huiVar = huyVar.a;
            if (zRemove) {
                synchronized (huiVar) {
                    huiVar.m.remove(Integer.valueOf(ibyVar.a()));
                    huiVar.d(ibyVar);
                }
            } else {
                ((sgt) htv.a.c().M(1570)).s("dequeueShotForStitching called. Expect a hole");
                huiVar.d(ibyVar);
            }
        }
        htvVar.j.remove(numValueOf);
    }

    @Override // defpackage.hzi
    public final void b(iby ibyVar, lau lauVar) {
        lauVar.close();
    }

    /* JADX WARN: Type inference failed for: r10v1, types: [java.lang.Object, lss] */
    @Override // defpackage.hzi
    public final void c(iby ibyVar, BurstSpec burstSpec, poe poeVar) {
        hxu hxuVarA = this.b.a();
        ibyVar.a();
        htv htvVar = this.a;
        htvVar.h.add(ibyVar);
        htvVar.k.add(ibyVar);
        gga ggaVar = ibyVar.x;
        ltd ltdVarL = ggaVar.b.l();
        if (ltdVarL.equals(htvVar.l)) {
            ibyVar.a();
            ltdVarL.getClass();
            htvVar.b(ltdVarL);
            return;
        }
        hui huiVar = htvVar.f;
        if (huiVar != null) {
            ibyVar.a();
            if (huiVar.y == null) {
                huiVar.y = ggaVar;
            }
            if (huiVar.v == null) {
                huiVar.v = hxuVarA;
            }
            synchronized (huiVar) {
                huiVar.m.add(Integer.valueOf(ibyVar.a()));
                if (!huiVar.s) {
                    huiVar.l.add(Integer.valueOf(ibyVar.a()));
                }
            }
            htvVar.g.put(Integer.valueOf(ibyVar.a()), new huy(huiVar, new dvj(13)));
            int iA = ibyVar.a();
            hui huiVar2 = htvVar.f;
            if (huiVar2 == null) {
                ((sgt) htv.a.c().M(1542)).s("Session not active. Not adding preview frame");
                return;
            }
            htw htwVar = htvVar.n;
            if (htwVar == null) {
                ((sgt) htv.a.c().M(1541)).s("Preview controller not registered. Not adding preview frame");
                return;
            }
            int i = huiVar2.f;
            lau lauVarA = htwVar.d.a(htwVar.b.h().b(htwVar.c));
            pdk pdkVar = lauVarA.a;
            our ourVar = new our();
            ourVar.d(pdkVar);
            pdkVar.j(new htt(lauVarA, ourVar, iA, htvVar, i, huiVar2));
        }
    }

    @Override // defpackage.hzi
    public final void d(iby ibyVar, BurstSpec burstSpec) {
        burstSpec.getClass();
        htv htvVar = this.a;
        int iA = ibyVar.a();
        hui huiVar = htvVar.f;
        Integer numA = huiVar != null ? huiVar.a(ibyVar) : null;
        if (numA != null) {
            AmbientModeSupport.AmbientController ambientController = htvVar.o;
            if (ambientController != null) {
                int iIntValue = numA.intValue();
                hti htiVar = (hti) ambientController.a;
                htiVar.T.h(hti.c);
                htiVar.N.c(R.raw.panorama_capture);
                hup hupVar = htiVar.e;
                hupVar.r = iIntValue + 1;
                hupVar.D = Long.valueOf(SystemClock.elapsedRealtime());
                hupVar.h(true);
                hupVar.d();
                hupVar.e(false, true);
                if (hupVar.r >= hupVar.j) {
                    hupVar.g();
                    AmbientModeSupport.AmbientController ambientController2 = hupVar.O;
                    if (ambientController2 != null) {
                        Object obj = ambientController2.a;
                        ((hti) obj).g.c(new hbv(obj, 16));
                    }
                }
            }
            htvVar.i.add(Integer.valueOf(iA));
            htvVar.e(iA);
        }
        htvVar.k.remove(ibyVar);
    }

    @Override // defpackage.hzi
    public final /* synthetic */ void e(iby ibyVar) {
    }

    @Override // defpackage.iac
    public final void f(iby ibyVar, int i, long j, poe poeVar) {
        poeVar.getClass();
        ibyVar.a();
        htv htvVar = this.a;
        float[] fArr = ((hms) ((rwg) htvVar.b).a).c(j).a;
        if (fArr.length != 3) {
            ((sgt) htv.a.c().M(1546)).s("dequeueShotForStitching called. Expect a hole");
            huy huyVar = (huy) htvVar.g.get(Integer.valueOf(ibyVar.a()));
            if (huyVar != null) {
                huyVar.a.d(ibyVar);
                return;
            }
            return;
        }
        huy huyVar2 = (huy) htvVar.g.get(Integer.valueOf(ibyVar.a()));
        if (huyVar2 != null) {
            huyVar2.b = fArr;
        }
        if (htvVar.c.h()) {
            gzi gziVar = gzp.a;
        }
    }

    @Override // defpackage.iah
    public final void g(iby ibyVar, InterleavedImageU16 interleavedImageU16) {
        interleavedImageU16.getClass();
        ibyVar.a();
        huy huyVar = (huy) this.a.g.get(Integer.valueOf(ibyVar.a()));
        if ((huyVar != null ? huyVar.a : null) == null) {
            ((sgt) htv.a.b().M(1552)).t("Cannot find session for shot_id = %s", ibyVar.a());
            return;
        }
        ibyVar.a();
        GcamModuleJNI.InterleavedImageU16_width(interleavedImageU16.a, interleavedImageU16);
        GcamModuleJNI.InterleavedImageU16_height(interleavedImageU16.a, interleavedImageU16);
        huyVar.e = interleavedImageU16;
    }

    @Override // defpackage.ial
    public final void h(iby ibyVar, InterleavedImageU8 interleavedImageU8, ShotMetadata shotMetadata) {
        uiq uiqVar;
        interleavedImageU8.getClass();
        ibyVar.a();
        Integer numValueOf = Integer.valueOf(ibyVar.a());
        htv htvVar = this.a;
        huy huyVar = (huy) htvVar.g.remove(numValueOf);
        if (huyVar != null && (uiqVar = huyVar.d) != null) {
            uiqVar.a(shotMetadata);
        }
        htvVar.h.remove(ibyVar);
    }

    @Override // defpackage.hzi
    public final void i(ltd ltdVar) {
        ltdVar.getClass();
        ibz ibzVarF = this.c.f(ltdVar);
        ibzVarF.C = rwc.j(this);
        ibzVarF.a(this);
        ibzVarF.e(this);
        gzi gziVar = gzp.a;
    }

    @Override // defpackage.iah
    public final void j(iag iagVar) {
        ((sgt) htv.a.b().i(iagVar).M(1553)).s(HHdu.JoKGPXWEv);
    }
}
