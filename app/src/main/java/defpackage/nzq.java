package defpackage;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Intent;
import android.media.MediaCodec;
import android.media.MediaFormat;
import android.os.Parcel;
import android.os.RemoteException;
import android.util.Log;
import androidx.wear.ambient.AmbientModeSupport;
import j$.util.DesugarCollections;
import java.util.Iterator;
import java.util.Set;
import org.chromium.net.UrlRequest;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class nzq implements Runnable {
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;
    private final /* synthetic */ int c;

    public /* synthetic */ nzq(Object obj, Object obj2, int i) {
        this.c = i;
        this.a = obj;
        this.b = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v12, types: [java.lang.Object, java.util.Map$Entry] */
    /* JADX WARN: Type inference failed for: r0v26, types: [java.lang.Object, obg] */
    /* JADX WARN: Type inference failed for: r0v75, types: [java.lang.Object, java.util.concurrent.Future] */
    /* JADX WARN: Type inference failed for: r0v9, types: [java.lang.Object, syu] */
    /* JADX WARN: Type inference failed for: r2v12, types: [java.lang.Object, pop] */
    /* JADX WARN: Type inference failed for: r7v33, types: [java.lang.Object, ogm] */
    /* JADX WARN: Type inference failed for: r7v67, types: [java.lang.Object, java.lang.Runnable] */
    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        boolean z = true;
        switch (this.c) {
            case 0:
                Object obj = this.b;
                Object obj2 = this.a;
                nzv nzvVar = (nzv) obj2;
                synchronized (nzvVar.f) {
                    if (((nzv) obj2).g.remove(((nzl) obj).f)) {
                        ((nzv) obj2).d();
                    }
                }
                nzvVar.b();
                return;
            case 1:
                ((nza) this.a).b.unregisterReceiver((BroadcastReceiver) this.b);
                return;
            case 2:
                ?? r0 = this.a;
                synchronized (((nzv) this.b).f) {
                    r0.cancel(false);
                }
                return;
            case 3:
                int i = nzv.j;
                Object obj3 = ((AmbientModeSupport.AmbientController) this.a.getKey()).a;
                nzu nzuVar = (nzu) this.b;
                if (nzuVar.b <= 0 || nzuVar.a != 0) {
                    return;
                }
                qdc qdcVar = (qdc) ((rwg) obj3).a;
                synchronized (qdc.class) {
                    Iterator it = qdcVar.d.values().iterator();
                    while (it.hasNext()) {
                        ((qdb) ((rdj) it.next()).a).a.c();
                    }
                    qcy qcyVar = qdcVar.b;
                    synchronized (qcy.class) {
                        Iterator it2 = qcyVar.a.values().iterator();
                        if (it2.hasNext()) {
                            throw null;
                        }
                    }
                }
                return;
            case 4:
                Object obj4 = this.a;
                Object obj5 = ((nzv) obj4).f;
                Object obj6 = this.b;
                synchronized (obj5) {
                    if (((nzv) obj4).c.remove(obj6)) {
                        ((nzv) obj4).d();
                    }
                }
                return;
            case 5:
                ((oam) this.b).a.c(this.a);
                return;
            case 6:
                oau oauVar = ((oat) this.b).b;
                if (oauVar.D()) {
                    return;
                }
                oauVar.w(3, "Connected to service after a timeout", null, null, null);
                Object obj7 = this.a;
                oak.a();
                oauVar.c = (obk) obj7;
                oauVar.C();
                oam oamVarF = oauVar.f();
                oak.a();
                oamVarF.a.D();
                return;
            case 7:
                oak.a();
                oau oauVar2 = ((oat) this.a).b;
                if (oauVar2.c != null) {
                    Object obj8 = this.b;
                    oauVar2.c = null;
                    oauVar2.r("Disconnected from device AnalyticsService", obj8);
                    oauVar2.c();
                    return;
                }
                return;
            case 8:
                Object obj9 = ((ogn) this.a).a;
                ?? r7 = this.b;
                if (obj9 == null) {
                    return;
                }
                r7.a(obj9);
                return;
            case 9:
                oob oobVar = (oob) this.a;
                odj odjVar = oobVar.b;
                boolean zC = odjVar.c();
                Object obj10 = this.b;
                if (zC) {
                    oir oirVar = oobVar.c;
                    ojl.ay(oirVar);
                    odj odjVar2 = oirVar.c;
                    if (!odjVar2.c()) {
                        Log.wtf("SignInCoordinator", "Sign-in succeeded with resolve account failure: ".concat(String.valueOf(String.valueOf(odjVar2))), new Exception());
                        ogu oguVar = (ogu) obj10;
                        oguVar.f.b(odjVar2);
                        oguVar.e.w();
                        return;
                    }
                    ogu oguVar2 = (ogu) obj10;
                    ogc ogcVar = oguVar2.f;
                    oid oidVarA = oirVar.a();
                    Set set = oguVar2.c;
                    if (oidVarA == null || set == null) {
                        Log.wtf("GoogleApiManager", "Received null response from onSignInSuccess", new Exception());
                        ogcVar.b(new odj(4));
                    } else {
                        ogcVar.f = oidVarA;
                        ogcVar.c = set;
                        ogcVar.c();
                    }
                } else {
                    ((ogu) obj10).f.b(odjVar);
                }
                ((ogu) obj10).e.w();
                return;
            case 10:
                ((Activity) ((qas) this.a).b).startActivity((Intent) this.b);
                return;
            case 11:
                ((Activity) this.b).startActivityForResult((Intent) this.a, 123);
                return;
            case 12:
                Object obj11 = this.a;
                if (((oow) obj11).c) {
                    ((ooh) this.b).b.q();
                    return;
                }
                try {
                    ((ooh) this.b).b.p(((ooh) this.b).a.a((oor) obj11));
                    return;
                } catch (ooq e) {
                    if (!(e.getCause() instanceof Exception)) {
                        ((ooh) this.b).b.o(e);
                        return;
                    }
                    ((ooh) this.b).b.o((Exception) e.getCause());
                    return;
                } catch (Exception e2) {
                    ((ooh) this.b).b.o(e2);
                    return;
                }
            case 13:
                osy osyVar = (osy) this.a;
                String str = osyVar.d;
                String str2 = osyVar.b;
                byte[] bArr = osyVar.c;
                Object obj12 = this.b;
                try {
                    Parcel parcelA = ((fbh) obj12).a();
                    int i2 = fbj.a;
                    parcelA.writeInt(0);
                    parcelA.writeByteArray(null);
                    ((fbh) obj12).B(1, parcelA);
                    return;
                } catch (RemoteException e3) {
                    Log.e("WearableLS", "Failed to send a response back", e3);
                    return;
                }
            case UrlRequest.Status.READING_RESPONSE /* 14 */:
                ((oql) this.b).a.a((osy) this.a);
                return;
            case 15:
                oqm oqmVar = ((oql) this.b).a;
                orc orcVar = (orc) this.a;
                orcVar.a(oqmVar);
                orcVar.a(oqmVar.e);
                return;
            case 16:
                if (((Boolean) ske.V(this.b)).booleanValue()) {
                    return;
                }
                this.a.run();
                return;
            case 17:
                Object obj13 = this.b;
                String.valueOf(obj13);
                sbp sbpVar = ((oys) this.a).i;
                int size = sbpVar.size();
                for (int i3 = 0; i3 < size; i3++) {
                    oyj oyjVar = (oyj) sbpVar.get(i3);
                    oyjVar.c((MediaFormat) obj13);
                    oyjVar.l();
                }
                return;
            case 18:
                ((oyv) ((oyx) this.a).e.c()).c((oyu) this.b);
                return;
            case 19:
                ?? r2 = this.a;
                try {
                    r2.h();
                    z = false;
                } catch (IllegalStateException e4) {
                    Log.e("MediaMuxerMul", "Failed to stop previous media muxer", e4);
                }
                try {
                    r2.c();
                    if (!z) {
                        return;
                    }
                } catch (IllegalStateException e5) {
                    Log.e("MediaMuxerMul", "Failed to release previous media muxer", e5);
                }
                ((oza) this.b).d.a(oyu.MUXER_STOP_ERROR);
                return;
            default:
                Iterator it3 = DesugarCollections.unmodifiableCollection(((oza) this.a).a).iterator();
                while (it3.hasNext()) {
                    ((oyk) it3.next()).h(((MediaCodec.BufferInfo) this.b).presentationTimeUs, r1.size);
                }
                return;
        }
    }

    public /* synthetic */ nzq(Object obj, Object obj2, int i, byte[] bArr) {
        this.c = i;
        this.b = obj;
        this.a = obj2;
    }

    public nzq(Object obj, Object obj2, int i, char[] cArr) {
        this.c = i;
        this.a = obj2;
        this.b = obj;
    }

    public nzq(oat oatVar, ComponentName componentName, int i) {
        this.c = i;
        this.b = componentName;
        this.a = oatVar;
    }
}
