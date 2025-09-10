package defpackage;

import android.hardware.camera2.CaptureRequest;
import android.view.Surface;
import j$.util.Optional;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class fcd implements pau {
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    private final /* synthetic */ int d;

    public /* synthetic */ fcd(gnt gntVar, owq owqVar, nas nasVar, int i) {
        this.d = i;
        this.a = gntVar;
        this.c = owqVar;
        this.b = nasVar;
    }

    /* JADX WARN: Type inference failed for: r0v16, types: [ixm, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v19, types: [java.lang.Object, java.util.function.Predicate] */
    /* JADX WARN: Type inference failed for: r0v24, types: [java.lang.Object, java.util.function.Predicate] */
    /* JADX WARN: Type inference failed for: r0v32, types: [java.lang.Object, owf] */
    /* JADX WARN: Type inference failed for: r0v35, types: [java.lang.Object, owf] */
    /* JADX WARN: Type inference failed for: r1v17, types: [java.lang.Object, pbr] */
    /* JADX WARN: Type inference failed for: r1v18, types: [java.lang.Object, owf] */
    /* JADX WARN: Type inference failed for: r1v19, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object, java.lang.Runnable] */
    /* JADX WARN: Type inference failed for: r8v1, types: [java.lang.Object, java.util.concurrent.ScheduledExecutorService] */
    /* JADX WARN: Type inference failed for: r8v12, types: [java.lang.Object, java.util.concurrent.ScheduledExecutorService] */
    /* JADX WARN: Type inference failed for: r8v37, types: [java.lang.Object, java.lang.Runnable] */
    /* JADX WARN: Type inference failed for: r8v38, types: [java.lang.Object, owq] */
    /* JADX WARN: Type inference failed for: r8v53, types: [java.lang.Object, owq] */
    /* JADX WARN: Type inference failed for: r9v16, types: [java.lang.Object, owq] */
    @Override // defpackage.pau
    public final void a(Object obj) throws Exception {
        byte[] bArr = null;
        switch (this.d) {
            case 0:
                Object obj2 = this.a;
                fce fceVar = (fce) obj2;
                gxj gxjVar = (gxj) obj;
                if (fceVar.c && !fceVar.f()) {
                    Object obj3 = this.b;
                    if (!gxjVar.equals(gxj.b)) {
                        rwc rwcVar = (rwc) obj3;
                        if (rwcVar.h() && fceVar.l.get() && !((hko) rwcVar.c()).b) {
                            ((hko) rwcVar.c()).g();
                        }
                        this.c.schedule(new ea(obj2, 16, bArr), 1500L, TimeUnit.MILLISECONDS);
                        return;
                    }
                    synchronized (obj2) {
                        ((fce) obj2).b();
                    }
                    fceVar.l.set(true);
                    rwc rwcVar2 = (rwc) obj3;
                    if (rwcVar2.h() && ((hko) rwcVar2.c()).i()) {
                        ((hko) rwcVar2.c()).h();
                        return;
                    }
                    return;
                }
                return;
            case 1:
                Object obj4 = this.a;
                fce fceVar2 = (fce) obj4;
                boolean z = fceVar2.c;
                Boolean bool = (Boolean) obj;
                Object obj5 = this.b;
                if (z && !fceVar2.f()) {
                    if (!bool.booleanValue()) {
                        this.c.schedule(new ea(obj4, 17, bArr), 1500L, TimeUnit.MILLISECONDS);
                        return;
                    }
                    synchronized (obj4) {
                        ((fce) obj4).b();
                        ((fce) obj4).l.set(bool.booleanValue());
                        if (((rwc) obj5).h() && ((hko) ((rwc) obj5).c()).i()) {
                            ((hko) ((rwc) obj5).c()).h();
                        }
                    }
                    return;
                }
                return;
            case 2:
                if (ihn.e((gnt) this.a, (nkw) this.c.dL())) {
                    return;
                }
                ((nas) this.b).b();
                return;
            case 3:
                dtp dtpVar = (dtp) obj;
                dtp dtpVar2 = dtp.e;
                boolean zEquals = dtpVar.equals(dtpVar2);
                Object obj6 = this.a;
                if (zEquals) {
                    ipq ipqVar = (ipq) obj6;
                    msh mshVar = ipqVar.b;
                    if (mshVar.d()) {
                        mshVar.a();
                        fdo.f(ipqVar.d.g(), "com.google.assistant.extra.CAMERA_OPEN_ONLY", false);
                    }
                }
                ?? r1 = this.c;
                if (!dtpVar.equals(dtpVar2)) {
                    dtp dtpVar3 = ((ipq) obj6).c;
                    if (dtpVar3 != null && dtpVar3.equals(dtpVar2) && dtpVar.equals(dtp.d)) {
                        r1.run();
                    }
                } else if (((ipq) obj6).a.a().equals(pka.FRONT)) {
                    this.b.run();
                } else {
                    r1.run();
                }
                ((ipq) obj6).c = dtpVar;
                return;
            case 4:
                Float f = (Float) obj;
                if (((icd) this.a).d()) {
                    return;
                }
                ?? r0 = this.b;
                float fFloatValue = f.floatValue();
                r0.d();
                ixq ixqVar = (!r0.b() || fFloatValue >= r0.a()) ? ixq.INACTIVE : ixq.NIGHT_SIGHT;
                ?? r8 = this.c;
                if (r8.dL() != ixqVar) {
                    r8.a(ixqVar);
                    return;
                }
                return;
            case 5:
                Object obj7 = this.a;
                if (this.c.test(obj7)) {
                    ((krj) obj7).m(false, (krs) this.b);
                    return;
                }
                return;
            case 6:
                Integer num = (Integer) obj;
                int iIntValue = num.intValue();
                juh juhVar = (juh) this.b;
                if (iIntValue == juhVar.a) {
                    return;
                }
                Object obj8 = this.c;
                Object obj9 = this.a;
                juhVar.a = num.intValue();
                juhVar.a((fqf) obj9, (nkw) obj8);
                return;
            case 7:
                sgv sgvVar = ktb.a;
                Object obj10 = this.a;
                if (this.c.test(obj10)) {
                    ((krj) obj10).m(false, (krs) this.b);
                    return;
                }
                return;
            case 8:
                List list = (List) obj;
                lad ladVar = (lad) list.get(0);
                Float f2 = (Float) list.get(1);
                f2.floatValue();
                Optional optional = ((jvb) this.a).g;
                if (optional.isPresent() && ((lae) this.b).i()) {
                    Object obj11 = this.c;
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(Float.valueOf(0.0f));
                    arrayList.add(Float.valueOf(ladVar.a));
                    arrayList.add(Float.valueOf(ladVar.b));
                    arrayList.add(f2);
                    arrayList.add(Float.valueOf(ladVar.e));
                    arrayList.add(Float.valueOf(ladVar.c));
                    ((pfu) obj11).n(scn.H(new pej((CaptureRequest.Key) optional.get(), ske.am(arrayList)), new pej(CaptureRequest.CONTROL_AE_EXPOSURE_COMPENSATION, Integer.valueOf(ladVar.d))));
                    return;
                }
                return;
            case 9:
                Integer num2 = (Integer) obj;
                ((lpm) this.b).b(num2.intValue());
                this.c.c(num2.intValue());
                ((pmv) ((pfl) this.a).a).c(num2.intValue(), "top");
                return;
            case 10:
                qpt.ca((pfu) this.c, kzz.c((kit) obj), (jjq) this.a.dL(), this.b);
                return;
            case 11:
                Float f3 = (Float) obj;
                if (((ick) this.b.dL()).a) {
                    return;
                }
                this.c.a(Boolean.valueOf(f3.floatValue() < ((lww) this.a).b));
                return;
            default:
                rwc rwcVar3 = (rwc) obj;
                rwcVar3.getClass();
                pv pvVar = (pv) this.c.get(this.b);
                if (pvVar != null) {
                    Object obj12 = this.a;
                    int i = pvVar.a;
                    rh.a(i);
                    Objects.toString(rwcVar3.f());
                    ((vp) obj12).b(i, (Surface) rwcVar3.f());
                    return;
                }
                return;
        }
    }

    public /* synthetic */ fcd(Object obj, Object obj2, Object obj3, int i) {
        this.d = i;
        this.a = obj;
        this.b = obj2;
        this.c = obj3;
    }

    public /* synthetic */ fcd(Object obj, Object obj2, Object obj3, int i, byte[] bArr) {
        this.d = i;
        this.c = obj;
        this.a = obj2;
        this.b = obj3;
    }

    public /* synthetic */ fcd(Object obj, Object obj2, Object obj3, int i, char[] cArr) {
        this.d = i;
        this.b = obj;
        this.c = obj2;
        this.a = obj3;
    }

    public /* synthetic */ fcd(Map map, phy phyVar, vp vpVar, int i) {
        this.d = i;
        this.c = map;
        this.b = phyVar;
        this.a = vpVar;
    }

    public /* synthetic */ fcd(juh juhVar, fqf fqfVar, nkw nkwVar, int i) {
        this.d = i;
        this.b = juhVar;
        this.a = fqfVar;
        this.c = nkwVar;
    }
}
