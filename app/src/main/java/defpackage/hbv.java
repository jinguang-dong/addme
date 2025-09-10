package defpackage;

import android.app.Activity;
import android.content.Intent;
import android.content.OperationApplicationException;
import android.net.Uri;
import android.os.RemoteException;
import android.view.View;
import com.google.android.apps.camera.dynamicdepth.DynamicDepthUtils;
import com.google.android.apps.camera.jni.facebeautification.GpuRetoucherNative;
import j$.time.Instant;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import org.chromium.net.UrlRequest;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class hbv implements Runnable {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ hbv(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    /* JADX WARN: Type inference failed for: r11v20, types: [java.lang.Object, tzj] */
    /* JADX WARN: Type inference failed for: r11v24, types: [hgj, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r11v39, types: [java.lang.Object, pdk] */
    @Override // java.lang.Runnable
    public final void run() throws RemoteException, OperationApplicationException {
        boolean zA;
        View view = null;
        switch (this.b) {
            case 0:
                ((hbw) this.a).c.b(null);
                return;
            case 1:
                hbw hbwVar = (hbw) this.a;
                if (((Boolean) hbwVar.q.b(luf.aN)).booleanValue()) {
                    pbn pbnVar = hbwVar.g;
                    pbnVar.f("CameraFilmstripDataAdapter#removeMarsDeletedItems");
                    hcj hcjVar = hbwVar.j;
                    ArrayList arrayList = new ArrayList(hcjVar.a());
                    Iterator it = hcjVar.iterator();
                    while (it.hasNext()) {
                        arrayList.add(((fqb) it.next()).a().c());
                    }
                    Map mapA = hbwVar.m.a(arrayList);
                    pbnVar.g();
                    pbnVar.f("RemoveDeletedMarsItems");
                    int size = arrayList.size();
                    for (int i = 0; i < size; i++) {
                        Uri uri = (Uri) arrayList.get(i);
                        if (!Boolean.TRUE.equals(mapA.get(uri))) {
                            hcjVar.j(uri);
                        }
                    }
                    pbnVar.g();
                }
                hcj hcjVar2 = hbwVar.i;
                fqb fqbVarF = hcjVar2.f();
                if (fqbVarF == null) {
                    return;
                }
                pbn pbnVar2 = hbwVar.g;
                pbnVar2.f("CameraFilmstripDataAdapter#removeDeletedItems");
                ArrayList arrayList2 = new ArrayList();
                Instant instantG = fqbVarF.a().g();
                Instant instantH = fqbVarF.a().h();
                HashSet hashSet = new HashSet();
                hashSet.addAll(hbwVar.e.c.e(instantG, instantH, false));
                hashSet.addAll(((hcf) hbwVar.r.d).e(instantG, instantH, true));
                Iterator it2 = hcjVar2.iterator();
                while (it2.hasNext()) {
                    fqc fqcVarA = ((fqb) it2.next()).a();
                    if (!fqcVarA.k() && !hashSet.contains(fqcVarA.c())) {
                        arrayList2.add(fqcVarA.c());
                    }
                }
                pbnVar2.g();
                fdq fdqVar = hbwVar.o;
                synchronized (fdqVar.a) {
                    zA = fdqVar.g.a();
                }
                if (zA) {
                    ((sgt) hbw.a.c().M(1137)).s("Activity is destroyed. Canceling load.");
                    return;
                }
                pbnVar2.f("RemoveDeleted");
                int size2 = arrayList2.size();
                for (int i2 = 0; i2 < size2; i2++) {
                    hcjVar2.j((Uri) arrayList2.get(i2));
                }
                pbnVar2.g();
                return;
            case 2:
                ((hdw) this.a).a();
                return;
            case 3:
                hep hepVar = (hep) this.a;
                pbc pbcVar = hepVar.d;
                pbcVar.b("deleting old data from per-shot log");
                int iIntValue = ((Integer) dei.a(((hew) hepVar.g).a, false, true, new hes(hepVar.e.instant().minus(hep.c).toEpochMilli(), 2))).intValue();
                if (iIntValue > 0) {
                    pbcVar.b(a.bE(iIntValue, "deleted ", " rows"));
                }
                hepVar.m();
                return;
            case 4:
                ((DynamicDepthUtils) this.a.a()).a().run();
                return;
            case 5:
                this.a.g();
                return;
            case 6:
                ((hgi) this.a).a.h();
                return;
            case 7:
                ((hjv) this.a).b();
                return;
            case 8:
                Object obj = this.a;
                synchronized (((hkg) obj).b) {
                    ((hkg) obj).c = GpuRetoucherNative.createRetoucher(false, 1);
                }
                return;
            case 9:
                ((hkn) this.a).c = true;
                return;
            case 10:
                ((hkn) this.a).c = false;
                return;
            case 11:
                ((hkv) this.a).a();
                return;
            case 12:
                ?? r11 = this.a;
                pdo pdoVarB = r11.b();
                ((sgt) hla.a.b().M(1370)).u("Dropped frame%d because the feature extraction took too long", pdoVarB != null ? pdoVarB.b : -1L);
                r11.close();
                return;
            case 13:
                ((hoq) this.a).a();
                return;
            case UrlRequest.Status.READING_RESPONSE /* 14 */:
                ((Activity) this.a).startActivity(new Intent("android.intent.action.VIEW", Uri.parse("https://support.google.com/googlecamera/answer/9937175")));
                return;
            case 15:
                hti htiVar = (hti) this.a;
                jth jthVar = htiVar.O;
                if (jthVar != null) {
                    jub jubVar = htiVar.k;
                    uh uhVarI = jthVar.i();
                    lss lssVarA = jubVar.a();
                    if (lssVarA == null || !((Boolean) ((ovx) uhVarI.a).d).booleanValue()) {
                        return;
                    }
                    htv htvVar = htiVar.K;
                    ltd ltdVarL = lssVarA.l();
                    ltdVarL.getClass();
                    if (htvVar.k.isEmpty()) {
                        htvVar.l = ltdVarL;
                        return;
                    } else {
                        htvVar.b(ltdVarL);
                        return;
                    }
                }
                return;
            case 16:
                ((hti) this.a).c();
                return;
            case 17:
                ((huc) this.a).e(false);
                return;
            case 18:
                huc hucVar = (huc) this.a;
                View view2 = hucVar.r;
                if (view2 == null) {
                    ujp.c("ghostViewfinderContainer");
                } else {
                    view = view2;
                }
                view.setVisibility(0);
                hur hurVar = hucVar.d;
                hurVar.d(true);
                hurVar.l = true;
                return;
            case 19:
                ((huc) this.a).e(true);
                return;
            default:
                ((huq) this.a).postInvalidate();
                return;
        }
    }
}
