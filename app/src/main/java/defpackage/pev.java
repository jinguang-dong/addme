package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.location.Location;
import android.media.MediaCodec;
import android.media.MediaFormat;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Process;
import android.os.RemoteException;
import android.util.Log;
import com.google.googlex.gcam.dirtylens.PrCd.TOnSyMaYeslEl;
import java.io.IOException;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import org.chromium.net.RequestFinishedInfo;
import org.chromium.net.UrlRequest;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class pev implements Runnable {
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;
    private final /* synthetic */ int c;

    public /* synthetic */ pev(Object obj, Object obj2, int i) {
        this.c = i;
        this.a = obj;
        this.b = obj2;
    }

    public /* synthetic */ pev(Object obj, Object obj2, int i, byte[] bArr) {
        this.c = i;
        this.b = obj;
        this.a = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v34, types: [java.lang.Object, java.lang.Runnable] */
    /* JADX WARN: Type inference failed for: r0v36, types: [java.lang.Object, java.lang.Runnable] */
    /* JADX WARN: Type inference failed for: r0v38, types: [java.lang.Object, java.util.concurrent.Future] */
    /* JADX WARN: Type inference failed for: r0v47, types: [java.lang.Object, java.util.concurrent.Future, syu] */
    /* JADX WARN: Type inference failed for: r0v69, types: [java.lang.Object, tzj] */
    /* JADX WARN: Type inference failed for: r0v73, types: [java.lang.Object, syu] */
    /* JADX WARN: Type inference failed for: r8v14, types: [java.lang.Object, png] */
    /* JADX WARN: Type inference failed for: r8v34, types: [android.os.IInterface, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v63, types: [java.lang.Object, java.lang.Runnable] */
    /* JADX WARN: Type inference failed for: r8v75, types: [java.lang.Object, umk] */
    @Override // java.lang.Runnable
    public final void run() throws SecurityException, IllegalArgumentException {
        nun nunVar;
        int i = 4;
        SharedPreferences.Editor editorEdit = null;
        byte b = 0;
        switch (this.c) {
            case 0:
                ((pew) this.a).a.dH((piw) this.b);
                return;
            case 1:
                pbe pbeVar = pbe.a;
                Object obj = this.b;
                Object obj2 = this.a;
                if (obj2 == null) {
                    throw new pbd((Throwable) obj);
                }
                throw new pbd((String) obj2, (Throwable) obj);
            case 2:
                Object obj3 = this.a;
                Object obj4 = this.b;
                try {
                    ((pfu) obj4).f.b((pen) obj3);
                    return;
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                    ((pfu) obj4).c.c("Interrupted when calling trigger3A.", e);
                    return;
                } catch (pco e2) {
                    ((pfu) obj4).c.c("FrameServer was closed when calling trigger3A.", e2);
                    return;
                }
            case 3:
                this.b.a((pao) this.a);
                return;
            case 4:
                prh.c();
                Object obj5 = this.b;
                psj psjVar = (psj) obj5;
                num numVar = psjVar.h;
                Object obj6 = this.a;
                if (numVar == null) {
                    Log.w("LensServiceConnImpl", TOnSyMaYeslEl.GRHDFBGMppiSQLm);
                    psjVar.d();
                    return;
                }
                try {
                    ((psj) obj5).i = (nun) obj6;
                    if (((psj) obj5).i == null) {
                        Log.e("LensServiceConnImpl", "Failed to create a Lens service session.");
                        ((psj) obj5).g = 11;
                        ((psj) obj5).g(7);
                        return;
                    }
                    ((psj) obj5).g(4);
                    nut nutVar = nut.a;
                    tpe tpeVar = (tpe) nutVar.m();
                    if (!tpeVar.b.C()) {
                        tpeVar.o();
                    }
                    nut nutVar2 = (nut) tpeVar.b;
                    nutVar2.c = 98;
                    nutVar2.b |= 1;
                    nut nutVar3 = (nut) tpeVar.l();
                    tpe tpeVar2 = (tpe) nutVar.m();
                    if (!tpeVar2.b.C()) {
                        tpeVar2.o();
                    }
                    nut nutVar4 = (nut) tpeVar2.b;
                    nutVar4.c = 348;
                    nutVar4.b |= 1;
                    tql tqlVar = nuu.a;
                    tpc tpcVarM = nuv.a.m();
                    if (!tpcVarM.b.C()) {
                        tpcVarM.o();
                    }
                    nuv nuvVar = (nuv) tpcVarM.b;
                    nuvVar.b = 1 | nuvVar.b;
                    nuvVar.c = 2;
                    tpeVar2.aI(tqlVar, (nuv) tpcVarM.l());
                    nut nutVar5 = (nut) tpeVar2.l();
                    nun nunVar2 = ((psj) obj5).i;
                    prh.e(nunVar2);
                    nunVar2.e(nutVar3.h());
                    nun nunVar3 = ((psj) obj5).i;
                    prh.e(nunVar3);
                    nunVar3.e(nutVar5.h());
                    return;
                } catch (RemoteException e3) {
                    Log.w("LensServiceConnImpl", "Failed to call client event callbacks.", e3);
                    psjVar.d();
                    return;
                }
            case 5:
                Object obj7 = this.a;
                ?? r8 = this.b;
                try {
                    Parcel parcelA = ((fbh) obj7).a();
                    parcelA.writeString("LENS_SERVICE_SESSION");
                    fbj.d(parcelA, r8);
                    parcelA.writeByteArray(null);
                    Parcel parcelZ = ((fbh) obj7).z(1, parcelA);
                    IBinder strongBinder = parcelZ.readStrongBinder();
                    if (strongBinder == null) {
                        nunVar = null;
                    } else {
                        IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.apps.gsa.publicsearch.IPublicSearchServiceSession");
                        nunVar = iInterfaceQueryLocalInterface instanceof nun ? (nun) iInterfaceQueryLocalInterface : new nun(strongBinder);
                    }
                    parcelZ.recycle();
                    ((psj) r8).a.execute(new pev(r8, nunVar, i, b == true ? 1 : 0));
                    return;
                } catch (RemoteException e4) {
                    Log.w("LensServiceConnImpl", "Failed to create a Lens service session.", e4);
                    ((psj) r8).a.execute(new oze(r8, 6));
                    return;
                }
            case 6:
                ?? r0 = this.b;
                Object obj8 = this.a;
                try {
                    r0.run();
                    return;
                } finally {
                }
            case 7:
                try {
                    this.b.run();
                    return;
                } catch (Throwable th) {
                    ((qel) this.a).c.a(new ExecutionException(th));
                    return;
                }
            case 8:
                try {
                    rwc rwcVar = (rwc) ske.U(this.b);
                    if (rwcVar.h()) {
                        qel qelVar = (qel) this.a;
                        if (qelVar.b) {
                            Log.w("ConfigurableMux", "Setting video location too late; it will be ignored.");
                            return;
                        } else {
                            qelVar.g.c(new czc((float) ((Location) rwcVar.c()).getLatitude(), (float) ((Location) rwcVar.c()).getLongitude()));
                            return;
                        }
                    }
                    return;
                } catch (Throwable th2) {
                    Log.e("ConfigurableMux", "Couldn't set location", th2);
                    return;
                }
            case 9:
                ((qel) this.b).d.add(this.a);
                return;
            case 10:
                ?? r02 = this.b;
                Object obj9 = this.a;
                if (r02.isCancelled()) {
                    qek qekVar = (qek) obj9;
                    qel qelVar2 = qekVar.c;
                    qelVar2.d.remove(obj9);
                    try {
                        qelVar2.f();
                        return;
                    } catch (czs | IOException e5) {
                        qekVar.c.c.a(e5);
                        return;
                    }
                }
                try {
                    MediaFormat mediaFormat = (MediaFormat) ske.U(r02);
                    try {
                        ((qek) obj9).b = ((qek) obj9).c.g.b(((qek) obj9).a, mediaFormat);
                        if (coi.v(mediaFormat) != null) {
                            ((qek) obj9).c.g.c(new czb("com.android.capture.fps", cza.e(r0.intValue()), 23));
                            return;
                        }
                        return;
                    } catch (czs e6) {
                        ((qek) obj9).c.c.a(e6);
                        return;
                    }
                } catch (ExecutionException e7) {
                    ((qek) obj9).c.c.a(e7);
                    return;
                }
            case 11:
                try {
                    Object obj10 = this.a;
                    ((qfx) obj10).c.a(this.b, ((qfx) obj10).e, ((qfx) obj10).a);
                    return;
                } catch (Throwable th3) {
                    ((qfx) this.a).a(th3);
                    return;
                }
            case 12:
                qlw qlwVar = (qlw) this.b;
                szh szhVar = qlwVar.d;
                if (szhVar.isDone()) {
                    Log.w("MuxerTrackStreamImpl", "WriteSampleData called after close called. Packet dropped.");
                    return;
                }
                Object obj11 = this.a;
                MediaCodec.BufferInfo bufferInfo = (MediaCodec.BufferInfo) ((qth) obj11).b;
                if (bufferInfo.size != 0 || (4 & bufferInfo.flags) == 0) {
                    qlwVar.f.add(obj11);
                } else {
                    szhVar.e(null);
                }
                qlwVar.a();
                return;
            case 13:
                int i2 = ((qni) this.a).a;
                if (i2 != 0) {
                    Process.setThreadPriority(i2);
                }
                this.b.run();
                return;
            case UrlRequest.Status.READING_RESPONSE /* 14 */:
                ((qtn) this.b).b.d.a(5, ((qna) this.a).a);
                return;
            case 15:
                ((qvr) this.a).a(this.b);
                return;
            case 16:
                SharedPreferences sharedPreferencesA = qsz.a((Context) this.a);
                for (Map.Entry<String, ?> entry : sharedPreferencesA.getAll().entrySet()) {
                    if (entry.getValue() instanceof String) {
                        if (entry.getValue().equals(this.b)) {
                            if (editorEdit == null) {
                                editorEdit = sharedPreferencesA.edit();
                            }
                            editorEdit.remove(entry.getKey());
                        }
                    }
                }
                if (editorEdit != null) {
                    editorEdit.commit();
                    return;
                }
                return;
            case 17:
                ((qzm) this.a).b(this.b);
                return;
            case 18:
                ((shf) this.b).a.remove(this.a);
                return;
            case 19:
                this.a.f((una) this.b, ufg.a);
                return;
            default:
                try {
                    ((vdk) this.b).onRequestFinished((RequestFinishedInfo) this.a);
                    return;
                } catch (Exception e8) {
                    Log.e("HttpEngineWrapper", "Exception thrown from observation task", e8);
                    return;
                }
        }
    }

    public pev(qfx qfxVar, Object obj, int i) {
        this.c = i;
        this.b = obj;
        this.a = qfxVar;
    }

    public pev(shf shfVar, she sheVar, int i) {
        this.c = i;
        this.a = sheVar;
        this.b = shfVar;
    }
}
