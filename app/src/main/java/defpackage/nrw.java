package defpackage;

import com.google.android.apps.camera.ui.shutterbutton.ShutterButton;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class nrw implements uif {
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;
    private final /* synthetic */ int c;

    public /* synthetic */ nrw(Object obj, Object obj2, int i) {
        this.c = i;
        this.b = obj;
        this.a = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.uif
    public final Object a() {
        Integer num;
        int i = this.c;
        int i2 = -1;
        int i3 = 0;
        if (i == 0) {
            Object obj = this.b;
            nrx nrxVar = (nrx) this.a;
            azr azrVar = nrxVar.g;
            if (azrVar.a() != obj) {
                obj.getClass();
                bgz bgzVar = nrxVar.s;
                ugi ugiVar = new ugi(bgzVar, 0, 1);
                int i4 = 0;
                while (true) {
                    if (!ugiVar.hasNext()) {
                        i4 = -1;
                        break;
                    }
                    if (a.ao(((nry) ugiVar.next()).c, "key_setting_facing")) {
                        break;
                    }
                    i4++;
                }
                Integer numValueOf = Integer.valueOf(i4);
                if (numValueOf.intValue() == -1) {
                    numValueOf = null;
                }
                if (numValueOf != null) {
                    int iIntValue = numValueOf.intValue();
                    pka pkaVar = (pka) obj;
                    bgzVar.set(iIntValue, nry.a((nry) bgzVar.get(iIntValue), nrxVar.b(pkaVar), false, nrxVar.a(pkaVar), null, false, 1006));
                }
                nrxVar.n((pka) azrVar.a(), false);
                nrxVar.n(obj, true);
                azrVar.b(obj);
                bgz bgzVar2 = nrxVar.i;
                ugi ugiVar2 = new ugi(bgzVar2, 0, 1);
                while (true) {
                    if (!ugiVar2.hasNext()) {
                        i3 = -1;
                        break;
                    }
                    if (((nry) ugiVar2.next()).c == nsu.ASTRO) {
                        break;
                    }
                    i3++;
                }
                Integer numValueOf2 = Integer.valueOf(i3);
                num = numValueOf2.intValue() != -1 ? numValueOf2 : null;
                if (num != null) {
                    int iIntValue2 = num.intValue();
                    bgzVar2.set(iIntValue2, nry.a((nry) bgzVar2.get(iIntValue2), 0, nrxVar.s(), 0, null, false, 1015));
                }
                nsm nsmVar = nsm.MENU;
                nsmVar.getClass();
                nrxVar.o.h(nsmVar);
                nrxVar.r.h(true);
            }
            return ufg.a;
        }
        if (i == 1) {
            ShutterButton shutterButton = ((ndh) this.b).a;
            shutterButton.j.a = rwc.i(this.a);
            shutterButton.invalidate();
            return ufg.a;
        }
        if (i != 2) {
            Object obj2 = this.b;
            nsu nsuVar = (nsu) obj2;
            int iOrdinal = nsuVar.ordinal();
            Object obj3 = this.a;
            if (iOrdinal != 1) {
                nrx nrxVar2 = (nrx) obj3;
                if (obj2 != nrxVar2.l()) {
                    nrxVar2.m(nsuVar);
                    nrxVar2.o(nrxVar2.l(), false);
                    nrxVar2.o(obj2, true);
                    nrxVar2.q(false);
                    nrxVar2.c.b(obj2);
                    nrxVar2.l.h(true);
                    nrxVar2.r.h(true);
                }
            } else {
                nrx nrxVar3 = (nrx) obj3;
                if (obj2 != nrxVar3.l()) {
                    nrxVar3.q(nrxVar3.r());
                    nrxVar3.o(nrxVar3.l(), false);
                    if (!((Boolean) nrxVar3.d.a()).booleanValue()) {
                        nrxVar3.c.b(nsu.NIGHT_SIGHT);
                    } else if (nrxVar3.l() == nsu.NIGHT_SIGHT) {
                        nrxVar3.c.b(nsu.ASTRO);
                    }
                    nrxVar3.m(nrxVar3.l());
                    nrxVar3.o(nrxVar3.l(), true);
                    nrxVar3.n.h(true);
                    nrxVar3.r.h(true);
                }
            }
            return ufg.a;
        }
        Object obj4 = this.a;
        nrx nrxVar4 = (nrx) this.b;
        if (nrxVar4.k() != obj4) {
            obj4.getClass();
            bgz bgzVar3 = nrxVar4.s;
            ugi ugiVar3 = new ugi(bgzVar3, 0, 1);
            int i5 = 0;
            while (true) {
                if (!ugiVar3.hasNext()) {
                    i5 = -1;
                    break;
                }
                if (a.ao(((nry) ugiVar3.next()).c, "key_setting_timer")) {
                    break;
                }
                i5++;
            }
            Integer numValueOf3 = Integer.valueOf(i5);
            num = numValueOf3.intValue() != -1 ? numValueOf3 : null;
            if (num != null) {
                int iIntValue3 = num.intValue();
                ltw ltwVar = (ltw) obj4;
                bgzVar3.set(iIntValue3, nry.a((nry) bgzVar3.get(iIntValue3), nrxVar4.j(ltwVar), false, nrxVar4.f(ltwVar), ltwVar, false, 750));
            }
            cwq cwqVar = nrxVar4.h;
            ltw ltwVar2 = (ltw) cwqVar.a();
            if (ltwVar2 != null) {
                nrxVar4.p(ltwVar2, false);
            }
            nrxVar4.p((ltw) obj4, true);
            cwqVar.h(obj4);
            cwq cwqVar2 = nrxVar4.u;
            ugi ugiVar4 = new ugi(nrxVar4.k, 0, 1);
            while (true) {
                if (!ugiVar4.hasNext()) {
                    break;
                }
                if (((nry) ugiVar4.next()).c == obj4) {
                    i2 = i3;
                    break;
                }
                i3++;
            }
            cwqVar2.h(Integer.valueOf(i2));
            nrxVar4.m.h(true);
            nrxVar4.r.h(true);
        }
        return ufg.a;
    }

    public /* synthetic */ nrw(nrx nrxVar, Enum r2, int i) {
        this.c = i;
        this.a = nrxVar;
        this.b = r2;
    }
}
