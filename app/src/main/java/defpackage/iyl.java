package defpackage;

import android.hardware.camera2.CaptureRequest;
import j$.util.Objects;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class iyl implements pau {
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    private final /* synthetic */ int e;

    public /* synthetic */ iyl(iyu iyuVar, ssc sscVar, syu syuVar, AtomicReference atomicReference, int i) {
        this.e = i;
        this.a = iyuVar;
        this.b = sscVar;
        this.c = syuVar;
        this.d = atomicReference;
    }

    /* JADX WARN: Type inference failed for: r0v27, types: [java.lang.Object, owf] */
    /* JADX WARN: Type inference failed for: r11v7, types: [java.lang.Object, owq] */
    /* JADX WARN: Type inference failed for: r12v37, types: [java.lang.Object, owf] */
    /* JADX WARN: Type inference failed for: r1v13, types: [java.lang.Object, owq] */
    /* JADX WARN: Type inference failed for: r1v14, types: [java.lang.Object, owf] */
    /* JADX WARN: Type inference failed for: r3v5, types: [java.lang.Object, owq] */
    @Override // defpackage.pau
    public final void a(Object obj) {
        int i = this.e;
        if (i == 0) {
            if (((Boolean) obj).booleanValue()) {
                Object obj2 = this.c;
                Object obj3 = this.b;
                iyu iyuVar = (iyu) this.a;
                iyuVar.o.a();
                rwc rwcVarJ = rwc.j(obj2);
                mep mepVar = iyuVar.o;
                iyuVar.O.v((ssc) obj3, 1, rwcVarJ, mepVar.m, mepVar.i(meo.MODE_SWITCH_END));
            }
            AtomicReference atomicReference = (AtomicReference) this.d;
            if (atomicReference.get() != null) {
                ((paq) atomicReference.get()).close();
                return;
            }
            return;
        }
        if (i == 1) {
            Float f = (Float) obj;
            gaw gawVar = (gaw) this.b;
            if (gawVar.B == pka.BACK) {
                Object obj4 = this.c;
                pjr pjrVar = gawVar.b;
                gcp gcpVar = (gcp) obj4;
                if (pjrVar.a() == gcpVar.m.g().a()) {
                    pkc pkcVar = gcpVar.k;
                    f = (Float) kqn.c(pkcVar.a(pjrVar), pkcVar.a(gawVar.a), f.floatValue()).getUpper();
                }
            }
            Object obj5 = this.a;
            Object obj6 = this.d;
            gzi gziVar = hba.a;
            pfu pfuVar = (pfu) obj6;
            gcp.e(CaptureRequest.CONTROL_ZOOM_RATIO, f, pfuVar);
            gcp.e(CaptureRequest.SCALER_CROP_REGION, ((kqw) ((gau) obj5).z.dL()).b, pfuVar);
            return;
        }
        if (i == 2) {
            boolean zBooleanValue = ((Boolean) obj).booleanValue();
            Object obj7 = this.d;
            qpt.ct(zBooleanValue, this.c, (krj) this.b, (imi) this.a, (rwc) obj7);
            return;
        }
        if (i != 3) {
            qpt.ca((pfu) this.d, kzz.c((kit) this.a.dL()), (jjq) this.b.dL(), this.c);
            return;
        }
        Boolean bool = (Boolean) obj;
        sgv sgvVar = ktb.a;
        boolean zBooleanValue2 = bool.booleanValue();
        ?? r1 = this.d;
        Object obj8 = this.b;
        ?? r3 = this.c;
        if (!zBooleanValue2 && Objects.equals(r3.dL(), ksa.PHOTO_FLASH_NS)) {
            ((sgt) ktb.a.c().M(3435)).v("MenuItemModule.%s: fallback to Off", ((krs) obj8).name());
            r3.a(ksa.PHOTO_FLASH_OFF);
            r1.a("ns");
        } else if (bool.booleanValue() && Objects.equals(r3.dL(), ksa.PHOTO_FLASH_OFF) && ((String) ((ovx) r1).d).equals("ns")) {
            ((sgt) ktb.a.c().M(3434)).v("MenuItemModule.%s: Reset to ns", ((krs) obj8).name());
            r3.a(ksa.PHOTO_FLASH_NS);
            r1.a("");
        }
        ((krj) this.a).m(false, (krs) obj8);
    }

    public /* synthetic */ iyl(Object obj, Object obj2, Object obj3, Object obj4, int i) {
        this.e = i;
        this.c = obj;
        this.b = obj2;
        this.d = obj3;
        this.a = obj4;
    }

    public /* synthetic */ iyl(owq owqVar, krj krjVar, imi imiVar, rwc rwcVar, int i) {
        this.e = i;
        this.c = owqVar;
        this.b = krjVar;
        this.a = imiVar;
        this.d = rwcVar;
    }

    public /* synthetic */ iyl(pfu pfuVar, owf owfVar, owf owfVar2, owf owfVar3, int i) {
        this.e = i;
        this.d = pfuVar;
        this.a = owfVar;
        this.b = owfVar2;
        this.c = owfVar3;
    }
}
