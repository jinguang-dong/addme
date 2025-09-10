package defpackage;

import android.media.MediaCodec;
import android.media.MediaFormat;
import android.net.Uri;
import android.os.StrictMode;
import android.view.Surface;
import j$.util.DesugarCollections;
import java.io.IOException;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class qcj implements rvu {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ qcj(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v27, types: [java.lang.Object, java.util.concurrent.ConcurrentMap] */
    @Override // defpackage.rvu
    public final Object apply(Object obj) {
        switch (this.b) {
            case 0:
                Uri uri = (Uri) obj;
                Object obj2 = this.a;
                if (uri != null) {
                    try {
                        return Long.valueOf(((qcl) obj2).h.k(uri));
                    } catch (IOException e) {
                        qbu.g(e, "%s: Failed to call mobstore fileSize on uri %s!", "StorageLogger", uri);
                    }
                }
                return 0L;
            case 1:
                pvo pvoVar = (pvo) obj;
                int i = qcd.d;
                ((AtomicReference) this.a).set(pvoVar.d);
                tpc tpcVar = (tpc) pvoVar.a(5, null);
                tpcVar.r(pvoVar);
                if (!tpcVar.b.C()) {
                    tpcVar.o();
                }
                ((pvo) tpcVar.b).d = trb.a;
                return (pvo) tpcVar.l();
            case 2:
                Object obj3 = this.a;
                ((MediaCodec) obj).setInputSurface((Surface) obj3);
                return obj3;
            case 3:
                MediaFormat mediaFormat = (MediaFormat) obj;
                if (mediaFormat != null) {
                    MediaFormat mediaFormat2 = (MediaFormat) this.a;
                    qsp.i("oo.muxer.drop_initial_non_keyframes", mediaFormat2, mediaFormat);
                    qsp.i("oo.muxer.force_sequential", mediaFormat2, mediaFormat);
                }
                return mediaFormat;
            case 4:
                try {
                    return new ProcessBuilder("/system/bin/trigger_perfetto", (String) obj).start();
                } catch (IOException unused) {
                    ((qqy) this.a).b = true;
                    return null;
                }
            case 5:
                opm opmVar = ((opp) ((sgh) obj).a).a;
                ojl.ay(opmVar);
                int i2 = opmVar.a;
                boolean z = i2 == 1 || i2 == 3;
                Object obj4 = this.a;
                Boolean boolValueOf = Boolean.valueOf(z);
                ((qwf) obj4).a.set(boolValueOf);
                return boolValueOf;
            case 6:
                return (qzf) ((qqq) this.a).b.get((String) obj);
            case 7:
                int i3 = qzu.a;
                tpc tpcVarM = qyt.a.m();
                for (Map.Entry entry : DesugarCollections.unmodifiableMap(((qyt) obj).b).entrySet()) {
                    Object obj5 = this.a;
                    qyr qyrVar = (qyr) entry.getValue();
                    tpc tpcVarM2 = qyr.a.m();
                    if (!qyrVar.d.equals(obj5)) {
                        String str = qyrVar.d;
                        if (!tpcVarM2.b.C()) {
                            tpcVarM2.o();
                        }
                        qyr qyrVar2 = (qyr) tpcVarM2.b;
                        str.getClass();
                        qyrVar2.b |= 1;
                        qyrVar2.d = str;
                    }
                    for (String str2 : qyrVar.c) {
                        if (!str2.equals(obj5)) {
                            tpcVarM2.H(str2);
                        }
                    }
                    tpcVarM.I((String) entry.getKey(), (qyr) tpcVarM2.l());
                }
                return (qyt) tpcVarM.l();
            case 8:
                int i4 = qzu.a;
                qyr qyrVar3 = qyr.a;
                tqm tqmVar = ((qyt) obj).b;
                Object obj6 = this.a;
                if (tqmVar.containsKey(obj6)) {
                    qyrVar3 = (qyr) tqmVar.get(obj6);
                }
                return qyrVar3.c;
            case 9:
                int i5 = qzu.a;
                Object obj7 = this.a;
                qyr qyrVar4 = qyr.a;
                obj7.getClass();
                tqm tqmVar2 = ((qyt) obj).b;
                if (tqmVar2.containsKey(obj7)) {
                    qyrVar4 = (qyr) tqmVar2.get(obj7);
                }
                return qyrVar4.d;
            case 10:
                qyp qypVar = (qyp) obj;
                sdy sdyVar = new sdy(null);
                StrictMode.ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
                StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder(threadPolicy).permitDiskWrites().build());
                Object obj8 = this.a;
                try {
                    try {
                        synchronized (rak.a) {
                            lat latVar = (lat) ((rak) obj8).f.fr();
                            Uri uri2 = ((rak) obj8).i;
                            qym qymVar = qypVar.c;
                            if (qymVar == null) {
                                qymVar = qym.b;
                            }
                            rdq rdqVar = new rdq(qymVar);
                            rdqVar.a = new sdy[]{sdyVar};
                            latVar.m(uri2, rdqVar);
                            qym qymVar2 = qypVar.c;
                            if (qymVar2 == null) {
                                qymVar2 = qym.b;
                            }
                            ((rak) obj8).j = qymVar2;
                        }
                        synchronized (rak.b) {
                            lat latVar2 = (lat) ((rak) obj8).f.fr();
                            Uri uri3 = ((rak) obj8).k;
                            qyn qynVar = qypVar.d;
                            if (qynVar == null) {
                                qynVar = qyn.b;
                            }
                            rdq rdqVar2 = new rdq(qynVar);
                            rdqVar2.a = new sdy[]{sdyVar};
                            latVar2.m(uri3, rdqVar2);
                            qyn qynVar2 = qypVar.d;
                            if (qynVar2 == null) {
                                qynVar2 = qyn.b;
                            }
                            ((rak) obj8).l = qynVar2;
                        }
                        return null;
                    } catch (IOException e2) {
                        throw new RuntimeException(e2);
                    }
                } finally {
                    StrictMode.setThreadPolicy(threadPolicy);
                }
            case 11:
                return qas.f((pxn) obj, (Uri) this.a);
            default:
                pxn pxnVar = (pxn) obj;
                Uri uri4 = (Uri) this.a;
                return !qas.f(pxnVar, uri4).h() ? pxnVar : qas.e(pxnVar, uri4, rvk.a);
        }
    }
}
