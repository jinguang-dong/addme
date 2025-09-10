package defpackage;

import android.content.Context;
import android.graphics.Rect;
import android.hardware.camera2.CaptureRequest;
import android.net.Uri;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ProgressBar;
import androidx.wear.ambient.AmbientMode;
import androidx.wear.ambient.AmbientModeSupport;
import com.google.android.apps.camera.jupiter.uranus.UranusAnimationView;
import com.google.googlex.gcam.dirtylens.PrCd.TOnSyMaYeslEl;
import j$.lang.Iterable$EL;
import j$.util.Collection;
import j$.util.DesugarCollections;
import j$.util.Optional;
import j$.util.stream.Stream;
import java.io.FileDescriptor;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import org.chromium.net.UrlRequest;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class hve implements rvu {
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;
    private final /* synthetic */ int c;

    public /* synthetic */ hve(Object obj, Object obj2, int i) {
        this.c = i;
        this.a = obj;
        this.b = obj2;
    }

    public /* synthetic */ hve(Object obj, Object obj2, int i, byte[] bArr) {
        this.c = i;
        this.b = obj;
        this.a = obj2;
    }

    /* JADX WARN: Type inference failed for: r0v68, types: [java.lang.Object, owf] */
    /* JADX WARN: Type inference failed for: r0v83, types: [java.lang.Object, java.util.Collection] */
    /* JADX WARN: Type inference failed for: r1v56, types: [java.lang.Object, pjo] */
    /* JADX WARN: Type inference failed for: r2v22, types: [java.lang.Object, owf] */
    /* JADX WARN: Type inference failed for: r2v32, types: [java.lang.Object, lss] */
    /* JADX WARN: Type inference failed for: r2v34, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r2v43, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r3v24, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r4v25, types: [java.lang.Object, java.util.List] */
    @Override // defpackage.rvu
    public final Object apply(Object obj) {
        ProgressBar progressBar;
        int i;
        byte[] bArr = null;
        boolean z = true;
        z = true;
        z = true;
        z = true;
        z = true;
        int i2 = 0;
        switch (this.c) {
            case 0:
                List list = (List) obj;
                list.getClass();
                Enum r2 = (Enum) list.get(0);
                Enum r0 = (Enum) list.get(1);
                r2.getClass();
                kiq kiqVar = ((hvb) r2).d;
                if (kiqVar != null) {
                    r0 = kiqVar;
                }
                return r0 == kiq.NIGHT_SIGHT ? this.a : this.b;
            case 1:
                List list2 = (List) obj;
                Object obj2 = this.b;
                ozl ozlVar = (ozl) obj2;
                rwc rwcVar = (rwc) ske.V(ozlVar.s);
                FileDescriptor fileDescriptor = (FileDescriptor) ske.V(ozlVar.r());
                rnt.L(list2.get(0) == rwcVar);
                rnt.L(list2.get(1) == fileDescriptor);
                try {
                    return new oza(fileDescriptor, 0, ((ozl) obj2).l, rwcVar, ((ozl) obj2).k, ((ozl) obj2).j, ((ozl) obj2).c != null ? 2 : 3, ((ozl) obj2).d != null ? 1 : 3, true != ((ozl) obj2).o.isEmpty() ? 2 : 3, ((ozl) obj2).n, ((ozl) obj2).i, new sxp(), (oyx) this.a, ((ozl) obj2).r, ((ozl) obj2).w);
                } catch (oyf e) {
                    throw new IllegalArgumentException("Failed to create muxer processor", e);
                }
            case 2:
                Map map = (Map) obj;
                map.getClass();
                Object obj3 = this.a;
                sbv sbvVarM = sbv.m(map);
                sbp sbpVar = ((iqz) obj3).equals(iqz.PUFFER_FISH) ? iry.a : iry.b;
                Object obj4 = this.b;
                iry iryVar = (iry) obj4;
                Rect rect = iryVar.h;
                UranusAnimationView uranusAnimationView = iryVar.k;
                irc ircVar = new irc();
                gzg gzgVar = gza.a;
                out outVar = iryVar.c;
                ira iraVar = iryVar.d;
                iryVar.n = new irk(sbvVarM, sbpVar, rect, uranusAnimationView, outVar, iryVar.t, iraVar, iryVar.e, ircVar, Optional.empty(), iryVar.r);
                sbv sbvVarM2 = sbv.m(map);
                syu syuVar = iraVar.h;
                if (syuVar != null) {
                    syuVar.cancel(false);
                    iraVar.e.clear();
                    iraVar.f.clear();
                }
                Iterable$EL.forEach(sbvVarM2.keySet(), new hyq(iraVar, 19));
                iraVar.h = ske.P(new gdq((Object) iraVar, (Object) sbvVarM2, obj3, 8, (short[]) null), iraVar.d);
                irk irkVar = iryVar.n;
                irkVar.k.c = new AmbientModeSupport.AmbientController(irkVar, bArr);
                irkVar.j.c(irkVar.o);
                ggg gggVar = irkVar.s;
                iri iriVar = iri.CHARACTER_MAIN;
                Iterable$EL.forEach(scn.H(iriVar, iri.c), new fxu(gggVar, new irg(irkVar), 15, null));
                iryVar.n.t = new AmbientModeSupport.AmbientController(obj4);
                ImageButton imageButton = iryVar.l.q;
                if (imageButton != null && imageButton.isSelected()) {
                    iryVar.n.h();
                } else {
                    iryVar.n.m();
                }
                UranusAnimationView uranusAnimationView2 = iryVar.k;
                uranusAnimationView2.a = iryVar.n;
                uranusAnimationView2.a.b(iriVar, new iqs(uranusAnimationView2));
                iryVar.k.b = iryVar.j;
                irk irkVar2 = iryVar.n;
                AmbientModeSupport.AmbientController ambientController = irkVar2.t;
                if (ambientController != null && (progressBar = ((iry) ambientController.a).m) != null) {
                    progressBar.setVisibility(0);
                }
                scn scnVarI = scn.I(isj.BACKGROUND, isj.CHARACTER_MAIN_IDLE_LOOP, isj.CHARACTER_SUB_IDLE_LOOP);
                sbv sbvVar = irkVar2.d;
                sbv sbvVar2 = (sbv) Collection.EL.stream(sbvVar.entrySet()).filter(new fme(scnVarI, 18)).collect(ryv.a(new idv(11), new idv(13)));
                syj syjVarE = ske.E(sbvVar2.values());
                dyo dyoVar = new dyo(sbvVar2, 12);
                sxo sxoVar = sxo.a;
                syu syuVarA = syjVarE.a(dyoVar, sxoVar);
                fym fymVar = new fym(irkVar2, 8);
                out outVar2 = irkVar2.h;
                syu syuVarI = swz.i(syuVarA, fymVar, outVar2);
                Stream map2 = Collection.EL.stream(sbvVar.entrySet()).filter(new fme(scnVarI, 17)).map(new idv(10));
                int i3 = sbp.d;
                irkVar2.q = ske.F(syuVarI, ske.E((sbp) map2.collect(ryv.a)).a(new ire(0), sxoVar)).c(new ild(irkVar2, 14), outVar2);
                iryVar.k.invalidate();
                iryVar.n.b(iriVar, new irx(iryVar));
                return true;
            case 3:
                List list3 = (List) obj;
                boolean z2 = ((hbj) this.a).p(gzs.aa) && list3 != null && list3.get(0) != kpa.c && ((Integer) list3.get(2)).intValue() == 1;
                mev mevVar = new mev();
                mevVar.e(z2);
                nkw nkwVar = (nkw) list3.get(1);
                if (!nkwVar.equals(nkw.PHOTO) && !nkwVar.equals(nkw.PORTRAIT) && !nkwVar.equals(nkw.LANDSCAPE) && !nkwVar.equals(nkw.ACTION_PAN) && !nkwVar.equals(nkw.NIGHT_SIGHT)) {
                    if (nkwVar.equals(nkw.SERENGETI)) {
                        gzi gziVar = gzp.a;
                    }
                    z = false;
                }
                mevVar.f(z);
                return mevVar.d();
            case 4:
                Integer num = (Integer) obj;
                int iIntValue = num.intValue();
                ?? r3 = this.b;
                rnt.S(iIntValue, r3.size());
                poj pojVar = null;
                for (int i4 = 0; i4 < r3.size(); i4++) {
                    if (i4 == num.intValue()) {
                        pojVar = (poj) r3.get(i4);
                    } else {
                        ((kiy) r3.get(i4)).close();
                    }
                }
                Object obj5 = this.a;
                pojVar.getClass();
                kjn kjnVar = (kjn) obj5;
                pao paoVar = kjnVar.c;
                paoVar.getClass();
                szh szhVar = new szh();
                szh szhVar2 = new szh();
                syu syuVarL = ske.L(new IllegalStateException("Thumbnail generation should not require metadata"));
                klg klgVar = new klg(pojVar);
                Rect rect2 = new Rect(0, 0, pojVar.c(), pojVar.b());
                lmf lmfVar = new lmf(klgVar);
                lmfVar.c = paoVar;
                lmfVar.d = syuVarL;
                lmfVar.e = rect2;
                lmg lmgVarA = lmfVar.a();
                sxp sxpVar = new sxp();
                scn scnVarI2 = scn.I(llz.CLOSE_ON_ALL_TASKS_RELEASE, llz.CREATE_EARLY_FILMSTRIP_PREVIEW, llz.CONVERT_TO_RGB_PREVIEW);
                kkk kkkVar = new kkk();
                kkkVar.c = new kki(szhVar, paoVar, szhVar2);
                try {
                    ((lly) kjnVar.d.i.a).d(lmgVarA, sxpVar, scnVarI2, kjnVar.a, kkkVar.d);
                    return new obu(szhVar, szhVar2, (byte[]) null);
                } catch (InterruptedException e2) {
                    Thread.currentThread().interrupt();
                    throw new IllegalStateException(e2);
                }
            case 5:
                String str = (String) obj;
                sbp sbpVar2 = knm.a;
                boolean zEquals = str.equals("on");
                Object obj6 = this.a;
                if (zEquals) {
                    return obj6;
                }
                return !str.equals("ns") ? new ovx(ixq.INACTIVE) : this.b;
            case 6:
                return ((Boolean) this.b.dL()).booleanValue() ? kiq.HDR_PLUS_WITH_TORCH : ((Boolean) ((hyh) this.a).b.dL()).booleanValue() ? kiq.NIGHT_SIGHT : (kiq) obj;
            case 7:
                Float f = (Float) obj;
                pej[] pejVarArr = new pej[1];
                pejVarArr[0] = new pej((CaptureRequest.Key) ((Optional) this.b).get(), Float.valueOf(f.floatValue() >= this.a.c() ? f.floatValue() : 0.0f));
                return qpt.ck(pejVarArr);
            case 8:
                ?? r02 = ((AmbientMode.AmbientController) obj).a;
                rwc rwcVarQ = ((gga) this.a).b.q();
                if (((iwt) r02.dL()).equals(iwt.ACTION) && rwcVarQ.h()) {
                    long jA = ((meu) rwcVarQ.c()).a();
                    long j = Long.MAX_VALUE;
                    i = -1;
                    while (true) {
                        ?? r22 = this.b;
                        if (i2 < ((sex) r22).c) {
                            pdo pdoVarB = ((pdk) r22.get(i2)).b();
                            if (pdoVarB != null) {
                                long jAbs = Math.abs(jA - pdoVarB.b);
                                if (jAbs < j) {
                                    i = i2;
                                    j = jAbs;
                                }
                            }
                            i2++;
                        }
                    }
                } else {
                    i = -1;
                }
                if (i >= 0) {
                    return Integer.valueOf(i);
                }
                return -1;
            case 9:
                Stream map3 = Collection.EL.stream(this.b).filter(new mdn(7)).map(new npd(this.a, true ? 1 : 0));
                int i5 = sbp.d;
                return (sbp) map3.collect(ryv.a);
            case 10:
                return ((jw) this.b).c((kq) this.a, (View) obj);
            case 11:
                Iterator it = ((List) obj).iterator();
                while (true) {
                    ?? r23 = this.b;
                    if (!it.hasNext()) {
                        return r23;
                    }
                    pvc pvcVar = ((qao) it.next()).b;
                    if (qsp.af(pvcVar)) {
                        Iterator it2 = pvcVar.o.iterator();
                        while (it2.hasNext()) {
                            qav qavVar = (qav) this.a;
                            r23.add(qsp.Y(qsp.Z((Context) qavVar.i, qavVar.a, pvcVar), (pva) it2.next()));
                        }
                    }
                }
            case 12:
                Object obj7 = this.a;
                pzb pzbVar = (pzb) this.b;
                pvc pvcVar2 = (pvc) obj7;
                sbv sbvVarC = pzbVar.c(pzbVar.b(pvcVar2), (sbv) obj);
                for (pva pvaVar : pvcVar2.o) {
                    if (!sbvVarC.containsKey(pvaVar)) {
                        Object[] objArr = {TOnSyMaYeslEl.UBuOVvmqUw, pvcVar2.d, pvaVar.c};
                        int i6 = qbu.a;
                        sgv sgvVar = qbt.a;
                        ((sgt) sgvVar.c().M(5669)).J("%s: Detected corruption of isolated structure for group %s %s", objArr);
                        sgvVar.c().Q();
                        return false;
                    }
                }
                return true;
            case 13:
                if (!((Boolean) obj).booleanValue()) {
                    ((pzb) this.a).b.l(1036);
                }
                return this.b;
            case UrlRequest.Status.READING_RESPONSE /* 14 */:
                sbv sbvVar3 = (sbv) obj;
                sgj sgjVarListIterator = ((sbv) this.b).entrySet().listIterator();
                while (true) {
                    Object obj8 = this.a;
                    if (!sgjVarListIterator.hasNext()) {
                        return ((sbr) obj8).e();
                    }
                    Map.Entry entry = (Map.Entry) sgjVarListIterator.next();
                    pvp pvpVar = (pvp) entry.getValue();
                    if (pvpVar != null && sbvVar3.containsKey(pvpVar)) {
                        ((sbr) obj8).f((pva) entry.getKey(), (Uri) sbvVar3.get(pvpVar));
                    }
                }
                break;
            case 15:
                pvj pvjVar = (pvj) obj;
                tpc tpcVar = (tpc) pvjVar.a(5, null);
                tpcVar.r(pvjVar);
                ?? r4 = this.b;
                for (String str2 : DesugarCollections.unmodifiableMap(pvjVar.b).keySet()) {
                    try {
                        r4.add(qsp.U(str2));
                    } catch (qct e3) {
                        Object obj9 = this.a;
                        qbu.f(e3, "Failed to deserialize groupKey:".concat(String.valueOf(str2)));
                        ((pzs) obj9).a.a();
                        tpcVar.D(str2);
                    }
                }
                return (pvj) tpcVar.l();
            case 16:
                pvj pvjVar2 = (pvj) obj;
                tpc tpcVar2 = (tpc) pvjVar2.a(5, null);
                tpcVar2.r(pvjVar2);
                tpcVar2.C((String) this.b, (pvc) this.a);
                return (pvj) tpcVar2.l();
            case 17:
                pvt pvtVar = (pvt) obj;
                sbr sbrVar = new sbr();
                sgj sgjVarListIterator2 = ((scn) this.b).listIterator();
                while (sgjVarListIterator2.hasNext()) {
                    Object obj10 = this.a;
                    pvp pvpVar2 = (pvp) sgjVarListIterator2.next();
                    pzx pzxVar = (pzx) obj10;
                    Object obj11 = (pvr) DesugarCollections.unmodifiableMap(pvtVar.b).get(qsp.H(pvpVar2, pzxVar.a, pzxVar.b));
                    if (obj11 != null) {
                        sbrVar.f(pvpVar2, obj11);
                    }
                }
                return sbrVar.e();
            case 18:
                pvt pvtVar2 = (pvt) obj;
                tpc tpcVar3 = (tpc) pvtVar2.a(5, null);
                tpcVar3.r(pvtVar2);
                tpcVar3.E((String) this.b, (pvr) this.a);
                return (pvt) tpcVar3.l();
            case 19:
                pvt pvtVar3 = (pvt) obj;
                ArrayList arrayList = new ArrayList();
                tpc tpcVar4 = (tpc) pvtVar3.a(5, null);
                tpcVar4.r(pvtVar3);
                Object obj12 = this.a;
                for (String str3 : DesugarCollections.unmodifiableMap(pvtVar3.b).keySet()) {
                    try {
                        arrayList.add(qsp.G(str3, ((pzx) obj12).a, ((pzx) obj12).b));
                    } catch (qcv e4) {
                        tpcVar4.F(str3);
                        qbu.f(e4, "Failed to deserialize newFileKey:".concat(String.valueOf(str3)));
                        pwt pwtVar = ((pzx) obj12).b;
                        rwr.c("|").f(str3).size();
                        pwtVar.a();
                    }
                }
                ((AtomicReference) this.b).set(arrayList);
                return (pvt) tpcVar4.l();
            default:
                pvo pvoVar = (pvo) obj;
                long jQ = prh.q();
                rwc rwcVarJ = rvk.a;
                Map mapUnmodifiableMap = DesugarCollections.unmodifiableMap(pvoVar.g);
                Object obj13 = this.a;
                if (mapUnmodifiableMap.containsKey(obj13)) {
                    rwcVarJ = rwc.j(Long.valueOf(tsi.a((trn) DesugarCollections.unmodifiableMap(pvoVar.g).get(obj13))));
                }
                tpc tpcVar5 = (tpc) pvoVar.a(5, null);
                tpcVar5.r(pvoVar);
                trn trnVarB = tsi.b(jQ);
                trnVarB.getClass();
                if (!tpcVar5.b.C()) {
                    tpcVar5.o();
                }
                pvo pvoVar2 = (pvo) tpcVar5.b;
                tqm tqmVar = pvoVar2.g;
                if (!tqmVar.b) {
                    pvoVar2.g = tqmVar.a();
                }
                pvoVar2.g.put(obj13, trnVarB);
                if (!tpcVar5.b.C()) {
                    tpcVar5.o();
                }
                pvo pvoVar3 = (pvo) tpcVar5.b;
                pvoVar3.c = null;
                pvoVar3.b &= -2;
                pvo pvoVar4 = (pvo) tpcVar5.l();
                if (rwcVarJ.h()) {
                    ((AtomicReference) this.b).set(rwc.j(Long.valueOf(TimeUnit.MILLISECONDS.toHours(jQ - ((Long) rwcVarJ.c()).longValue()))));
                }
                return pvoVar4;
        }
    }
}
