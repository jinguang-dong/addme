package defpackage;

import android.database.sqlite.SQLiteException;
import com.google.android.apps.camera.camerafatalerror.CameraFatalErrorTrackerDatabase;
import com.google.googlex.gcam.dirtylens.PrCd.TOnSyMaYeslEl;
import j$.time.Instant;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class gon implements Runnable {
    public final /* synthetic */ long a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    private final /* synthetic */ int d;

    public /* synthetic */ gon(Object obj, long j, Object obj2, int i) {
        this.d = i;
        this.b = obj;
        this.a = j;
        this.c = obj2;
    }

    public /* synthetic */ gon(Object obj, Object obj2, long j, int i) {
        this.d = i;
        this.b = obj;
        this.c = obj2;
        this.a = j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte[] bArrH;
        switch (this.d) {
            case 0:
                gop gopVar = (gop) this.b;
                gopVar.e.b();
                CameraFatalErrorTrackerDatabase cameraFatalErrorTrackerDatabase = gopVar.b;
                got gotVarW = cameraFatalErrorTrackerDatabase.w();
                Object obj = gotVarW.c;
                int i = ((pbw) this.c).t;
                gos gosVar = (gos) dei.a((dco) obj, false, true, new bgx(gotVarW, i, 4));
                long j = gosVar.e;
                long j2 = this.a;
                if (gop.a(j2, j) >= ((Integer) gopVar.c.fr()).intValue()) {
                    cameraFatalErrorTrackerDatabase.w().a();
                    gosVar = new gos(i);
                }
                if (gosVar.d == 0) {
                    gosVar.b++;
                } else {
                    gosVar.c++;
                }
                gosVar.e = j2;
                got gotVarW2 = cameraFatalErrorTrackerDatabase.w();
                dei.a((dco) gotVarW2.c, false, true, new dql(gotVarW2, gosVar, 7));
                int i2 = gosVar.a;
                int i3 = gosVar.b;
                int i4 = gosVar.c;
                long j3 = gosVar.e;
                int i5 = gosVar.d;
                mdy mdyVar = gopVar.d;
                tpc tpcVarM = spu.a.m();
                if (!tpcVarM.b.C()) {
                    tpcVarM.o();
                }
                tph tphVar = tpcVarM.b;
                spu spuVar = (spu) tphVar;
                spuVar.b |= 1;
                spuVar.c = i2;
                if (!tphVar.C()) {
                    tpcVarM.o();
                }
                tph tphVar2 = tpcVarM.b;
                spu spuVar2 = (spu) tphVar2;
                spuVar2.b |= 2;
                spuVar2.d = i3;
                if (!tphVar2.C()) {
                    tpcVarM.o();
                }
                tph tphVar3 = tpcVarM.b;
                spu spuVar3 = (spu) tphVar3;
                spuVar3.b = 4 | spuVar3.b;
                spuVar3.e = i4;
                if (!tphVar3.C()) {
                    tpcVarM.o();
                }
                spu spuVar4 = (spu) tpcVarM.b;
                spuVar4.b |= 8;
                spuVar4.f = i5;
                tpc tpcVarM2 = sod.a.m();
                soc socVar = soc.CAMERA_FATAL_ERROR_COUNTS_EVENT;
                if (!tpcVarM2.b.C()) {
                    tpcVarM2.o();
                }
                sod sodVar = (sod) tpcVarM2.b;
                sodVar.f = socVar.aJ;
                sodVar.b |= 1;
                tpc tpcVarM3 = sof.a.m();
                spu spuVar5 = (spu) tpcVarM.l();
                if (!tpcVarM3.b.C()) {
                    tpcVarM3.o();
                }
                sof sofVar = (sof) tpcVarM3.b;
                spuVar5.getClass();
                sofVar.d = spuVar5;
                sofVar.b |= 2;
                sof sofVar2 = (sof) tpcVarM3.l();
                if (!tpcVarM2.b.C()) {
                    tpcVarM2.o();
                }
                sod sodVar2 = (sod) tpcVarM2.b;
                sofVar2.getClass();
                sodVar2.Y = sofVar2;
                sodVar2.c |= 1073741824;
                mdyVar.I(tpcVarM2);
                gopVar.d("Suspected camera device error", true);
                return;
            case 1:
                mlb mlbVar = (mlb) this.c;
                gcc gccVar = mlbVar.d;
                rwc rwcVarC = gccVar.c();
                Object objC = gccVar.b().c();
                ltf ltfVar = ltf.TIMELAPSE;
                int i6 = sbp.d;
                Object obj2 = this.b;
                gfn gfnVar = (gfn) obj2;
                gfnVar.l(rwcVarC, mlbVar.j, (lsu) objC, ltfVar, mlbVar.i, sex.a);
                gfnVar.c(rwcVarC, gccVar.b(), this.a, mlbVar.h, "");
                gfn.m(rwcVarC);
                return;
            case 2:
                Object obj3 = this.c;
                long j4 = this.a;
                Object obj4 = this.b;
                try {
                    int iA = ((hep) obj4).g.a(j4, ((Instant) obj3).toEpochMilli());
                    if (iA != 1) {
                        ((hep) obj4).d.d(ojl.bI("makingProgress updated %d rows for id=%d with time=%s (expected 1)", Integer.valueOf(iA), Long.valueOf(j4), obj3));
                        return;
                    }
                    return;
                } catch (SQLiteException e) {
                    ((hep) obj4).d.e(ojl.bI("SQLite error in makingProgressImpl for id=%d time=%s", Long.valueOf(j4), obj3), e);
                    return;
                }
            case 3:
                Object obj5 = this.c;
                long j5 = this.a;
                Object obj6 = this.b;
                try {
                    hez hezVarB = ((hep) obj6).g.b(j5);
                    if (hezVarB == null) {
                        ((hep) obj6).d.h(ojl.bI(TOnSyMaYeslEl.ZdbUJAiYirEv, Long.valueOf(j5)));
                        return;
                    }
                    if (hezVarB.k) {
                        return;
                    }
                    hezVarB.k = true;
                    ((hep) obj6).g.c(hezVarB);
                    ((hep) obj6).h.b(hep.j(j5, (Instant) obj5, "marked stuck"));
                    ((hep) obj6).d.d(ojl.bI("Stuck shot %s detected. Log contents:\n%s", Long.valueOf(j5), hep.k(((hep) obj6).h.a(j5))));
                    return;
                } catch (SQLiteException e2) {
                    ((hep) obj6).d.e(ojl.bI("SQLite error in markShotStuckImpl for id=%d time=%s", Long.valueOf(j5), obj5), e2);
                    return;
                }
            case 4:
                Object obj7 = this.c;
                long j6 = this.a;
                Object obj8 = this.b;
                try {
                    hez hezVarB2 = ((hep) obj8).g.b(j6);
                    if (hezVarB2 == null) {
                        ((hep) obj8).d.h(ojl.bI("Attempted to mark shot %s as failed, but couldn't find it", Long.valueOf(j6)));
                        return;
                    }
                    if (hezVarB2.l) {
                        return;
                    }
                    hezVarB2.l = true;
                    ((hep) obj8).g.c(hezVarB2);
                    ((hep) obj8).h.b(hep.j(j6, (Instant) obj7, "marked failed"));
                    ((hep) obj8).d.d(ojl.bI("Failed shot %s detected. Log contents:\n%s", Long.valueOf(j6), hep.k(((hep) obj8).h.a(j6))));
                    return;
                } catch (SQLiteException e3) {
                    ((hep) obj8).d.e(ojl.bI("SQLite error in markShotFailedImpl for id=%d time=%s", Long.valueOf(j6), obj7), e3);
                    return;
                }
            case 5:
                Object obj9 = this.c;
                long j7 = this.a;
                Object obj10 = this.b;
                try {
                    hez hezVarB3 = ((hep) obj10).g.b(j7);
                    if (hezVarB3 != null) {
                        long epochMilli = ((Instant) obj9).toEpochMilli();
                        hezVarB3.f = epochMilli;
                        hezVarB3.g = epochMilli;
                        ((hep) obj10).g.c(hezVarB3);
                        return;
                    }
                    return;
                } catch (SQLiteException e4) {
                    ((hep) obj10).d.e(ojl.bI("SQLite error in deletedImpl for id=%d time=%s", Long.valueOf(j7), obj9), e4);
                    return;
                }
            case 6:
                ((kai) this.b).j((ltd) this.c, this.a);
                return;
            case 7:
                long j8 = this.a;
                Object obj11 = this.b;
                String strB = mn.b(j8, "Microvideo ended at <", ">");
                kai kaiVar = ((kaa) obj11).b;
                kaiVar.e.b(strB);
                Object obj12 = this.c;
                Long l = (Long) ((kae) obj12).d.h();
                long jLongValue = l.longValue();
                long jConvert = TimeUnit.NANOSECONDS.convert(j8, TimeUnit.MICROSECONDS);
                if (jLongValue > jConvert) {
                    ((sgt) kai.a.c().M(3183)).A("MomentsMicrovideoSession got ann invalid range: %d to %d", jLongValue, jConvert);
                    jConvert = Math.max(jLongValue, jConvert);
                }
                synchronized (kaiVar) {
                    ((kae) obj12).d = seo.e(l, Long.valueOf(jConvert));
                    kaiVar.n();
                }
                return;
            default:
                long j9 = this.a;
                if (j9 >= 0) {
                    tpc tpcVarM4 = nqu.a.m();
                    if (!tpcVarM4.b.C()) {
                        tpcVarM4.o();
                    }
                    ((nqu) tpcVarM4.b).b = j9;
                    bArrH = ((nqu) tpcVarM4.l()).h();
                } else {
                    bArrH = null;
                }
                ((ntf) this.b).k.d((String) this.c, bArrH);
                return;
        }
    }
}
