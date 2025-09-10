package defpackage;

import android.hardware.camera2.CaptureRequest;
import com.google.android.libraries.oliveoil.natives.TtaZ.VnmwoBe;
import j$.time.Instant;
import j$.util.Objects;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.atomic.AtomicReference;
import org.chromium.net.UrlRequest;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class fun implements pau {
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;
    private final /* synthetic */ int c;

    public /* synthetic */ fun(Object obj, Object obj2, int i) {
        this.c = i;
        this.a = obj;
        this.b = obj2;
    }

    public /* synthetic */ fun(Object obj, Object obj2, int i, byte[] bArr) {
        this.c = i;
        this.b = obj;
        this.a = obj2;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, owq] */
    /* JADX WARN: Type inference failed for: r6v20, types: [java.lang.Object, owq] */
    /* JADX WARN: Type inference failed for: r6v24, types: [java.lang.Object, pbc] */
    /* JADX WARN: Type inference failed for: r6v25, types: [java.lang.Object, pau] */
    /* JADX WARN: Type inference failed for: r6v26, types: [java.lang.Object, pau] */
    /* JADX WARN: Type inference failed for: r6v29, types: [java.lang.Object, java.util.function.Predicate] */
    /* JADX WARN: Type inference failed for: r6v65, types: [java.lang.Object, owf] */
    /* JADX WARN: Type inference failed for: r7v76, types: [java.lang.Object, owq] */
    @Override // defpackage.pau
    public final void a(Object obj) {
        switch (this.c) {
            case 0:
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                ?? r0 = this.b;
                Object obj2 = this.a;
                if (zBooleanValue) {
                    if (((mbj) obj2).a) {
                        r0.a(ltw.AUTO);
                        return;
                    }
                    return;
                } else {
                    if (ltw.AUTO.equals(r0.dL())) {
                        r0.a(ltw.f);
                        ((mbj) obj2).a = true;
                        return;
                    }
                    return;
                }
            case 1:
                nkw nkwVar = (nkw) obj;
                boolean zA = ((fuf) this.a).a(nkwVar);
                ((sgt) ftu.a.c().M(380)).P(zA, nkwVar);
                ((hyh) this.b).i(zA);
                return;
            case 2:
                gmc gmcVar = (gmc) this.a;
                gmcVar.a.d(lth.EXT_WIRED);
                krj krjVar = (krj) this.b;
                gmcVar.y(krjVar);
                if (gmcVar.z(krjVar)) {
                    krjVar.m(false, krs.MICROPHONE);
                    gmcVar.u(krjVar);
                    return;
                }
                return;
            case 3:
                gmc gmcVar2 = (gmc) this.a;
                gmcVar2.a.d(lth.EXT_BLUETOOTH);
                krj krjVar2 = (krj) this.b;
                gmcVar2.y(krjVar2);
                if (gmcVar2.z(krjVar2)) {
                    krjVar2.m(false, krs.MICROPHONE);
                    gmcVar2.u(krjVar2);
                    return;
                }
                return;
            case 4:
                gmc gmcVar3 = (gmc) this.a;
                boolean z = gmcVar3.c;
                Object obj3 = this.b;
                if (z) {
                    gmcVar3.c = false;
                    krj krjVar3 = (krj) obj3;
                    if (gmcVar3.p(krjVar3)) {
                        krjVar3.m(false, krs.MICROPHONE);
                    }
                }
                gmcVar3.y((krj) obj3);
                return;
            case 5:
                if (((Boolean) obj).booleanValue()) {
                    return;
                }
                ((gmc) this.a).y((krj) this.b);
                return;
            case 6:
                if (((nkw) obj).c()) {
                    ((gme) this.a).z((krj) this.b);
                    return;
                }
                return;
            case 7:
                if (((nkw) obj).c()) {
                    ((gmn) this.a).m((krj) this.b);
                    return;
                }
                return;
            case 8:
                kiy kiyVar = (kiy) obj;
                syu syuVarK = kiyVar.k();
                Object obj4 = this.a;
                ?? r6 = this.b;
                try {
                    try {
                        if (syuVarK == null) {
                            r6.a(hya.UNKNOWN);
                        } else {
                            r6.a(((qrh) obj4).g(kiyVar, (poe) syuVarK.get()));
                        }
                    } catch (InterruptedException | ExecutionException unused) {
                        r6.a(hya.UNKNOWN);
                    }
                    return;
                } finally {
                    kiyVar.close();
                }
            case 9:
                List list = (List) obj;
                ((ovx) this.b).a(Boolean.valueOf(((jho) this.a).b((nkw) list.get(0), (pka) list.get(1), lts.a(((Integer) list.get(2)).intValue()))));
                return;
            case 10:
                this.b.b("ImageCaptureCommand: availability=" + ((Boolean) obj) + " rootCommand=" + String.valueOf(this.a));
                return;
            case 11:
                kox koxVar = (kox) obj;
                if (((koz) this.a).a.l() == pka.BACK) {
                    this.b.a(koxVar);
                    return;
                }
                return;
            case 12:
                kox koxVar2 = (kox) obj;
                if (((koz) this.a).a.l() == pka.FRONT) {
                    this.b.a(koxVar2);
                    return;
                }
                return;
            case 13:
                ksa ksaVar = (ksa) obj;
                sgv sgvVar = ktb.a;
                Object obj5 = this.b;
                if (ksaVar != ksa.PHOTO_FLASH_ON) {
                    ((AtomicReference) obj5).set(ksaVar);
                    return;
                }
                int iOrdinal = ((ksa) ((AtomicReference) obj5).get()).ordinal();
                String str = iOrdinal != 7 ? iOrdinal != 8 ? iOrdinal != 9 ? "" : "ns" : "auto" : "off";
                luj lujVar = (luj) this.a;
                lujVar.d(luf.z, str);
                lujVar.d(luf.w, Long.valueOf(Instant.now().toEpochMilli()));
                return;
            case UrlRequest.Status.READING_RESPONSE /* 14 */:
                sgv sgvVar2 = ktb.a;
                Object obj6 = this.a;
                if (this.b.test(obj6)) {
                    ((krj) obj6).m(false, krs.RAW_OUTPUT);
                    return;
                }
                return;
            case 15:
                sgv sgvVar3 = ktb.a;
                if (((ksa) obj).equals(ksa.aq)) {
                    if (((Boolean) ((luj) this.a).b(luf.aV)).booleanValue()) {
                        return;
                    }
                    ((mnm) this.b).a();
                    return;
                }
                return;
            case 16:
                ksa ksaVar2 = (ksa) obj;
                sgv sgvVar4 = ktb.a;
                Object obj7 = this.b;
                if (ksaVar2 != ksa.PHOTO_FLASH_ON) {
                    ((AtomicReference) obj7).set(ksaVar2);
                    return;
                }
                int iOrdinal2 = ((ksa) ((AtomicReference) obj7).get()).ordinal();
                String str2 = iOrdinal2 != 7 ? iOrdinal2 != 8 ? iOrdinal2 != 9 ? "" : VnmwoBe.bGrJnEtOnp : "auto" : "off";
                luj lujVar2 = (luj) this.a;
                lujVar2.d(luf.A, str2);
                lujVar2.d(luf.y, Long.valueOf(Instant.now().toEpochMilli()));
                return;
            case 17:
                sgv sgvVar5 = ktb.a;
                if (((Boolean) obj).booleanValue()) {
                    ?? r7 = this.b;
                    if (Objects.equals(r7.dL(), ksa.VIDEO_FLASH_ON)) {
                        ((sgt) ktb.a.c().M(3433)).s("MenuItemModule.FrontPhotoFlashForNightSight: fallback to OFF");
                        r7.a(ksa.VIDEO_FLASH_OFF);
                    }
                }
                ((krj) this.a).m(false, krs.NIGHT_FRONT_PHOTO_FLASH);
                return;
            case 18:
                Integer num = (Integer) obj;
                if (((lae) this.a).i()) {
                    return;
                }
                ((pfu) this.b).l(new pej(CaptureRequest.CONTROL_AE_EXPOSURE_COMPENSATION, num));
                return;
            case 19:
                Boolean bool = (Boolean) obj;
                Object obj8 = this.b;
                Object obj9 = this.a;
                synchronized (obj9) {
                    if (((kzi) obj9).e) {
                        return;
                    }
                    if (!bool.booleanValue()) {
                        ((kzi) obj9).d.m(((kzi) obj9).f);
                        kzz.k((pfu) obj8, ((kzi) obj9).d);
                        ((kzi) obj9).d.close();
                        ((kzi) obj9).d = ((kzi) obj9).b;
                    } else if (((kzi) obj9).d.equals(((kzi) obj9).b)) {
                        ((kzi) obj9).d = ((kzi) obj9).r();
                    }
                    return;
                }
            default:
                kzn kznVar = (kzn) this.a;
                AtomicReference atomicReference = kznVar.f;
                kfe kfeVar = (kfe) obj;
                if (kfeVar != atomicReference.get()) {
                    atomicReference.set(kfeVar);
                    if (kfeVar == kfe.RUNNING) {
                        kznVar.g = (String) this.b.dL();
                        return;
                    } else {
                        kznVar.g = null;
                        return;
                    }
                }
                return;
        }
    }
}
