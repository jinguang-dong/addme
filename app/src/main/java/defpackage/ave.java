package defpackage;

import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ave extends bij implements bun, buu, bvd {
    public final boolean a;
    public final uif b;
    public avg c;
    public float d;
    public boolean f;
    public final ocq h;
    private final float i;
    private final bkx j;
    private avb k;
    private avc l;
    public long e = 0;
    public final zo g = new zo((byte[]) null);

    public ave(ocq ocqVar, boolean z, float f, bkx bkxVar, uif uifVar) {
        this.h = ocqVar;
        this.a = z;
        this.i = f;
        this.j = bkxVar;
        this.b = uifVar;
    }

    private final void m(avc avcVar) {
        this.l = avcVar;
        bko.x(this);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0077  */
    @Override // defpackage.buu
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void cS(defpackage.bvo r14) {
        /*
            r13 = this;
            r14.p()
            avg r0 = r13.c
            if (r0 == 0) goto L77
            float r4 = r13.d
            long r1 = r13.d()
            abr r3 = r0.c
            java.lang.Object r3 = r3.d()
            java.lang.Number r3 = (java.lang.Number) r3
            float r3 = r3.floatValue()
            r5 = 0
            int r5 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r5 <= 0) goto L77
            long r2 = defpackage.bkv.h(r1, r3)
            boolean r0 = r0.a
            if (r0 == 0) goto L6c
            long r0 = r14.m()
            float r0 = defpackage.a.z(r0)
            long r5 = r14.m()
            float r1 = defpackage.a.A(r5)
            bms r10 = r14.o()
            long r11 = r10.a()
            bku r5 = r10.b()
            r5.f()
            rnu r5 = r10.c     // Catch: java.lang.Throwable -> L5f
            r5.l(r0, r1)     // Catch: java.lang.Throwable -> L5f
            r8 = 0
            r9 = 124(0x7c, float:1.74E-43)
            r5 = 0
            r7 = 0
            r1 = r14
            defpackage.byi.am(r1, r2, r4, r5, r7, r8, r9)     // Catch: java.lang.Throwable -> L5f
            bku r14 = r10.b()
            r14.d()
            r10.h(r11)
            goto L78
        L5f:
            r0 = move-exception
            r13 = r0
            bku r14 = r10.b()
            r14.d()
            r10.h(r11)
            throw r13
        L6c:
            r1 = r14
            r8 = 0
            r9 = 124(0x7c, float:1.74E-43)
            r5 = 0
            r7 = 0
            defpackage.byi.am(r1, r2, r4, r5, r7, r8, r9)
            goto L78
        L77:
            r1 = r14
        L78:
            bms r14 = r1.o()
            bku r14 = r14.b()
            avc r0 = r13.l
            if (r0 == 0) goto La4
            long r1 = r13.e
            float r3 = r13.d
            int r3 = defpackage.ukj.x(r3)
            long r4 = r13.d()
            uif r13 = r13.b
            java.lang.Object r13 = r13.a()
            ava r13 = (defpackage.ava) r13
            float r6 = r13.d
            r0.b(r1, r3, r4, r6)
            android.graphics.Canvas r13 = defpackage.bkk.a(r14)
            r0.draw(r13)
        La4:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ave.cS(bvo):void");
    }

    @Override // defpackage.bij
    public final void cW() {
        ukc.C(C(), null, 0, new aie(this, (uhb) null, 2), 3);
    }

    @Override // defpackage.bij
    public final void cZ() {
        avb avbVar = this.k;
        if (avbVar != null) {
            f();
            ebn ebnVar = avbVar.e;
            avc avcVarM = ebnVar.m(this);
            if (avcVarM != null) {
                avcVarM.a();
                ebnVar.n(this);
                avbVar.c.add(avcVarM);
            }
        }
    }

    public final long d() {
        return this.j.a();
    }

    @Override // defpackage.bij
    public final boolean db() {
        return false;
    }

    /* JADX WARN: Type inference failed for: r3v3, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r3v4, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r8v3, types: [java.lang.Object, java.util.Map] */
    public final void e(akf akfVar) {
        if (!(akfVar instanceof akd)) {
            if (akfVar instanceof ake) {
                akd akdVar = ((ake) akfVar).a;
                l();
                return;
            } else {
                if (akfVar instanceof akc) {
                    akd akdVar2 = ((akc) akfVar).a;
                    l();
                    return;
                }
                return;
            }
        }
        akd akdVar3 = (akd) akfVar;
        long j = this.e;
        float f = this.d;
        avb avbVar = this.k;
        if (avbVar == null) {
            Object obj = (View) bko.H(this, AndroidCompositionLocals_androidKt.f);
            while (!(obj instanceof ViewGroup)) {
                Object parent = ((View) obj).getParent();
                if (!(parent instanceof View)) {
                    throw new IllegalArgumentException(a.bz(obj, "Couldn't find a valid parent for ", ". Are you overriding LocalView and providing a View that is not attached to the view hierarchy?"));
                }
                obj = parent;
            }
            ViewGroup viewGroup = (ViewGroup) obj;
            int childCount = viewGroup.getChildCount();
            int i = 0;
            while (true) {
                if (i >= childCount) {
                    avb avbVar2 = new avb(viewGroup.getContext());
                    viewGroup.addView(avbVar2);
                    avbVar = avbVar2;
                    break;
                } else {
                    View childAt = viewGroup.getChildAt(i);
                    if (childAt instanceof avb) {
                        avbVar = (avb) childAt;
                        break;
                    }
                    i++;
                }
            }
            this.k = avbVar;
            avbVar.getClass();
        }
        ebn ebnVar = avbVar.e;
        avc avcVarM = ebnVar.m(this);
        if (avcVarM == null) {
            List list = avbVar.c;
            list.getClass();
            avcVarM = (avc) (list.isEmpty() ? null : list.remove(0));
            if (avcVarM == null) {
                int i2 = avbVar.d;
                List list2 = avbVar.b;
                if (i2 > ske.bk(list2)) {
                    avcVarM = new avc(avbVar.getContext());
                    avbVar.addView(avcVarM);
                    list2.add(avcVarM);
                } else {
                    avcVarM = (avc) list2.get(avbVar.d);
                    ave aveVar = (ave) ebnVar.a.get(avcVarM);
                    if (aveVar != null) {
                        aveVar.f();
                        ebnVar.n(aveVar);
                        avcVarM.a();
                    }
                }
                int i3 = avbVar.d;
                if (i3 < avbVar.a - 1) {
                    avbVar.d = i3 + 1;
                } else {
                    avbVar.d = 0;
                }
            }
            ebnVar.b.put(this, avcVarM);
            ebnVar.a.put(avcVarM, this);
        }
        boolean z = this.a;
        int iX = ukj.x(f);
        long jD = d();
        float f2 = ((ava) this.b.a()).d;
        ats atsVar = new ats(this, 3);
        if (avcVarM.b == null || !a.ao(Boolean.valueOf(z), avcVarM.c)) {
            avh avhVar = new avh(z);
            avcVarM.setBackground(avhVar);
            avcVarM.b = avhVar;
            avcVarM.c = Boolean.valueOf(z);
        }
        avh avhVar2 = avcVarM.b;
        avhVar2.getClass();
        avcVarM.e = atsVar;
        avc avcVar = avcVarM;
        avcVar.b(j, iX, jD, f2);
        if (z) {
            long j2 = akdVar3.a;
            avhVar2.setHotspot(Float.intBitsToFloat((int) (j2 >> 32)), Float.intBitsToFloat((int) (j2 & 4294967295L)));
        } else {
            avhVar2.setHotspot(avhVar2.getBounds().centerX(), avhVar2.getBounds().centerY());
        }
        avcVar.c(true);
        m(avcVar);
    }

    public final void f() {
        m(null);
    }

    @Override // defpackage.bvd
    public final void k(long j) {
        float fDk;
        this.f = true;
        chq chqVarE = bko.E(this);
        this.e = chp.G(j);
        float f = this.i;
        if (Float.isNaN(f)) {
            boolean z = this.a;
            long j2 = this.e;
            fDk = bkf.a(a.t(Float.intBitsToFloat((int) (j2 >> 32)), Float.intBitsToFloat((int) (j2 & 4294967295L)))) / 2.0f;
            if (z) {
                fDk += chqVarE.dk(10.0f);
            }
        } else {
            fDk = chqVarE.dk(f);
        }
        this.d = fDk;
        zo zoVar = this.g;
        Object[] objArr = zoVar.a;
        int i = zoVar.b;
        for (int i2 = 0; i2 < i; i2++) {
            e((akf) objArr[i2]);
        }
        zoVar.j();
    }

    public final void l() {
        avc avcVar = this.l;
        if (avcVar != null) {
            avcVar.c(false);
        }
    }

    @Override // defpackage.buu
    public final /* synthetic */ void cR() {
    }

    @Override // defpackage.bvd
    public final /* synthetic */ void dd(bry bryVar) {
    }
}
