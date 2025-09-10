package defpackage;

import android.graphics.PointF;
import android.graphics.Rect;
import android.hardware.camera2.CaptureRequest;
import android.os.SystemClock;
import com.google.android.apps.camera.focusindicator.FocusIndicatorView;
import j$.util.Optional;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import org.chromium.net.UrlRequest;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class fcs implements pau {
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;
    private final /* synthetic */ int c;

    public /* synthetic */ fcs(Object obj, Object obj2, int i) {
        this.c = i;
        this.a = obj;
        this.b = obj2;
    }

    /* JADX WARN: Type inference failed for: r11v19, types: [java.lang.Object, pbp] */
    /* JADX WARN: Type inference failed for: r11v39, types: [java.lang.Object, owq] */
    /* JADX WARN: Type inference failed for: r11v40, types: [java.lang.Object, owq] */
    /* JADX WARN: Type inference failed for: r11v41, types: [java.lang.Object, owq] */
    /* JADX WARN: Type inference failed for: r11v42, types: [java.lang.Object, owq] */
    /* JADX WARN: Type inference failed for: r12v33, types: [java.lang.Object, owq] */
    /* JADX WARN: Type inference failed for: r12v38, types: [java.lang.Object, owq] */
    /* JADX WARN: Type inference failed for: r12v40, types: [java.lang.Object, owq] */
    @Override // defpackage.pau
    public final void a(Object obj) {
        switch (this.c) {
            case 0:
                PointF pointF = (PointF) obj;
                if (pointF.x < 0.0f || pointF.y < 0.0f) {
                    return;
                }
                fcv fcvVar = (fcv) this.a;
                if (fcvVar.f()) {
                    return;
                }
                Integer num = fcvVar.c;
                if (num.intValue() > 0) {
                    AtomicInteger atomicInteger = (AtomicInteger) this.b;
                    if (atomicInteger.get() % (num.intValue() + 1) != 0) {
                        if (atomicInteger.incrementAndGet() == num.intValue() + 1) {
                            atomicInteger.set(0);
                            return;
                        }
                        return;
                    }
                    atomicInteger.getAndIncrement();
                }
                if (fcvVar.a == pka.FRONT || ((Boolean) fcvVar.b.dL()).booleanValue()) {
                    pointF.x = 1.0f - pointF.x;
                }
                pointF.getClass();
                PointF pointF2 = new PointF(nwj.f(pointF.x), nwj.f(pointF.y));
                FocusIndicatorView focusIndicatorView = fcvVar.i;
                focusIndicatorView.m.b(focusIndicatorView.g(pointF2));
                return;
            case 1:
                ltq ltqVarA = ltq.a(((Integer) obj).intValue());
                fby fbyVar = (fby) this.a;
                ltq ltqVar = fbyVar.c;
                if (ltqVarA == ltqVar) {
                    return;
                }
                Object obj2 = this.b;
                int iB = ltqVar.b();
                int iB2 = ltqVarA.b();
                float f = fbyVar.b;
                pka pkaVar = fbyVar.a;
                tpc tpcVarM = snq.a.m();
                if (!tpcVarM.b.C()) {
                    tpcVarM.o();
                }
                tph tphVar = tpcVarM.b;
                snq snqVar = (snq) tphVar;
                snqVar.c = iB - 1;
                snqVar.b |= 1;
                if (!tphVar.C()) {
                    tpcVarM.o();
                }
                tph tphVar2 = tpcVarM.b;
                snq snqVar2 = (snq) tphVar2;
                snqVar2.d = iB2 - 1;
                snqVar2.b = 2 | snqVar2.b;
                if (!tphVar2.C()) {
                    tpcVarM.o();
                }
                snq snqVar3 = (snq) tpcVarM.b;
                snqVar3.b |= 4;
                snqVar3.e = f;
                soa soaVarS = mdy.s(pkaVar);
                if (!tpcVarM.b.C()) {
                    tpcVarM.o();
                }
                snq snqVar4 = (snq) tpcVarM.b;
                snqVar4.f = soaVarS.d;
                snqVar4.b |= 16;
                ((mdy) obj2).x(12, null, null, (snq) tpcVarM.l(), null, null, null, null);
                fbyVar.c = ltqVarA;
                return;
            case 2:
                fcv fcvVar2 = (fcv) this.b;
                if (fcvVar2.f()) {
                    fcvVar2.c(rwc.j(this.a));
                    return;
                }
                return;
            case 3:
                Optional optional = (Optional) obj;
                boolean zIsPresent = optional.isPresent();
                Object obj3 = this.a;
                if (zIsPresent) {
                    this.b.a();
                    ((fja) obj3).f.a(true);
                }
                ((fja) obj3).d.h = Optional.ofNullable((foy) optional.orElse(null));
                return;
            case 4:
                ftv ftvVar = (ftv) this.a;
                ftvVar.c.a(Boolean.valueOf(ftv.q((kox) ((oww) this.b).dL(), (ltw) obj, (jjq) ftvVar.i.dL(), ftvVar.v.aa())));
                return;
            case 5:
                ftv ftvVar2 = (ftv) this.a;
                List list = (List) obj;
                boolean zBooleanValue = ((Boolean) ftvVar2.k.dL()).booleanValue();
                Object obj4 = this.b;
                if (zBooleanValue && obj4 == nkw.NIGHT_SIGHT) {
                    mtm mtmVar = ftvVar2.s;
                    mtp mtpVar = mtp.ASTRO;
                    mtmVar.r(mtpVar);
                    ftvVar2.g.a(mtpVar);
                    return;
                }
                boolean zBooleanValue2 = ((Boolean) list.get(0)).booleanValue();
                fug fugVar = (fug) list.get(1);
                fugVar.name();
                mtp mtpVarA = ftvVar2.a(zBooleanValue2, fugVar, (nkw) obj4);
                ftvVar2.s.r(mtpVarA);
                ftvVar2.g.a(mtpVarA);
                return;
            case 6:
                kox koxVar = (kox) ((oww) this.b).dL();
                ftv ftvVar3 = (ftv) this.a;
                boolean zQ = ftv.q(koxVar, (ltw) ftvVar3.e.dL(), (jjq) obj, ftvVar3.v.aa());
                owq owqVar = ftvVar3.c;
                if (zQ != ((Boolean) owqVar.dL()).booleanValue()) {
                    owqVar.a(Boolean.valueOf(zQ));
                    return;
                }
                return;
            case 7:
                if (((our) this.b).b()) {
                    return;
                }
                ((fty) this.a).d();
                return;
            case 8:
                this.a.a(true);
                this.b.a(true);
                return;
            case 9:
                this.b.a(Boolean.valueOf(((String) obj).equals(((gav) this.a).c)));
                return;
            case 10:
                this.a.a(true);
                this.b.a(true);
                return;
            case 11:
                this.a.a(true);
                this.b.a(true);
                return;
            case 12:
                gcp.e(CaptureRequest.CONTROL_AE_EXPOSURE_COMPENSATION, (Integer) obj, (pfu) this.b);
                return;
            case 13:
                kqw kqwVar = (kqw) obj;
                Rect rect = kqwVar.a;
                pfu pfuVar = (pfu) this.b;
                gcp.e(CaptureRequest.SCALER_CROP_REGION, rect, pfuVar);
                gcp.e(CaptureRequest.LENS_FOCAL_LENGTH, Float.valueOf(kqwVar.c), pfuVar);
                return;
            case UrlRequest.Status.READING_RESPONSE /* 14 */:
                ((gcp) this.a).b((pfu) this.b, ((gas) obj) == gas.RECORDING_SESSION_ACTIVE);
                return;
            case 15:
                int iOrdinal = ((mhh) obj).ordinal();
                gcp.e((CaptureRequest.Key) ((gcp) this.a).i.a.get(), iOrdinal != 0 ? iOrdinal != 2 ? mhf.c : mhf.d : mhf.b, (pfu) this.b);
                return;
            case 16:
                lax laxVar = (lax) obj;
                int i = laxVar.a;
                CaptureRequest.Key key = nvm.a;
                Integer numValueOf = Integer.valueOf(i);
                pfu pfuVar2 = (pfu) this.b;
                gcp.e(key, numValueOf, pfuVar2);
                gcp.e(nvm.b, ske.am(laxVar.b), pfuVar2);
                return;
            case 17:
                gho ghoVar = (gho) obj;
                gcp gcpVar = (gcp) this.b;
                gho ghoVar2 = gcpVar.f;
                gho ghoVar3 = gho.DEFAULT;
                boolean zEquals = ghoVar2.equals(ghoVar3);
                Object obj5 = this.a;
                if (zEquals && ghoVar.equals(gho.LOCKED)) {
                    gcp.d((gau) obj5);
                } else if (gcpVar.f.equals(gho.LOCKED) && ghoVar.equals(ghoVar3)) {
                    gcpVar.a((gau) obj5);
                }
                gcpVar.f = ghoVar;
                return;
            case 18:
                Float f2 = (Float) obj;
                if (f2 != null) {
                    gcp.e(nvo.c, f2, (pfu) this.b);
                    return;
                }
                return;
            case 19:
                ArrayList arrayList = new ArrayList();
                Float fValueOf = Float.valueOf(0.0f);
                arrayList.add(fValueOf);
                arrayList.add(fValueOf);
                arrayList.add(fValueOf);
                arrayList.add((Float) obj);
                arrayList.add(fValueOf);
                arrayList.add(fValueOf);
                gcp.e(nvk.b, ske.am(arrayList), (pfu) this.b);
                return;
            default:
                Object obj6 = this.b;
                Float f3 = (Float) obj;
                Object obj7 = this.a;
                synchronized (((gdd) obj7).c) {
                    long micros = TimeUnit.NANOSECONDS.toMicros(((pqn) obj6).a(SystemClock.elapsedRealtimeNanos()));
                    Deque deque = ((gdd) obj7).b;
                    if (!deque.isEmpty()) {
                        qvl qvlVar = (qvl) deque.pollLast();
                        qvlVar.getClass();
                        deque.add(new qvl(qvlVar.a, seo.e((Long) ((seo) qvlVar.b).h(), Long.valueOf(micros))));
                    }
                    deque.add(new qvl(f3.floatValue(), seo.c(Long.valueOf(micros))));
                }
                return;
        }
    }

    public /* synthetic */ fcs(Object obj, Object obj2, int i, byte[] bArr) {
        this.c = i;
        this.b = obj;
        this.a = obj2;
    }
}
