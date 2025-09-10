package defpackage;

import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class bcn extends bdf {
    public static final bcn a = new bcn();

    private bcn() {
        super(1, 0, 2);
    }

    @Override // defpackage.bdf
    protected final void a(bdi bdiVar, axr axrVar, baz bazVar, bfn bfnVar, bdg bdgVar) {
        axq axqVar;
        int iA;
        int i;
        int i2;
        int iA2 = bdiVar.a(0);
        if (bazVar.m != 0) {
            ayi.i("Cannot move a group while inserting");
        }
        if (iA2 < 0) {
            ayi.i("Parameter offset is out of bounds");
        }
        if (iA2 == 0) {
            return;
        }
        int i3 = bazVar.o;
        int i4 = bazVar.q;
        int i5 = bazVar.p;
        int iA3 = i3;
        while (iA2 > 0) {
            iA3 += bay.a(bazVar.b, bazVar.h(iA3));
            if (iA3 > i5) {
                ayi.i("Parameter offset is out of bounds");
            }
            iA2--;
        }
        int iA4 = bay.a(bazVar.b, bazVar.h(iA3));
        int iC = bazVar.c(bazVar.b, bazVar.h(bazVar.o));
        int iC2 = bazVar.c(bazVar.b, bazVar.h(iA3));
        int i6 = iA3 + iA4;
        int iC3 = bazVar.c(bazVar.b, bazVar.h(i6));
        int i7 = iC3 - iC2;
        bazVar.E(i7, Math.max(bazVar.o - 1, 0));
        bazVar.D(iA4);
        int[] iArr = bazVar.b;
        int iH = bazVar.h(i6) * 5;
        rnt.aw(iArr, iArr, bazVar.h(i3) * 5, iH, (iA4 * 5) + iH);
        if (i7 > 0) {
            Object[] objArr = bazVar.c;
            int iD = bazVar.d(iC2 + i7);
            System.arraycopy(objArr, iD, objArr, iC, bazVar.d(iC3 + i7) - iD);
        }
        int i8 = iC2 + i7;
        int i9 = i8 - iC;
        int i10 = bazVar.j;
        int i11 = bazVar.k;
        int length = bazVar.c.length;
        int i12 = bazVar.l;
        int i13 = i3 + iA4;
        int i14 = i3;
        while (i14 < i13) {
            int iH2 = bazVar.h(i14);
            int i15 = i9;
            int iC4 = bazVar.c(iArr, iH2) - i15;
            if (i12 < iH2) {
                i = iH2;
                i2 = 0;
            } else {
                i = iH2;
                i2 = i10;
            }
            int[] iArr2 = iArr;
            iArr2[(i * 5) + 4] = baz.V(baz.V(iC4, i2, i11, length), bazVar.j, bazVar.k, bazVar.c.length);
            i14++;
            i9 = i15;
            iArr = iArr2;
            i10 = i10;
        }
        int i16 = i6 + iA4;
        int iF = bazVar.f();
        int iB = bay.b(bazVar.d, i6, iF);
        ArrayList arrayList = new ArrayList();
        while (iB < bazVar.d.size() && (iA = bazVar.a((axqVar = (axq) bazVar.d.get(iB)))) >= i6 && iA < i16) {
            arrayList.add(axqVar);
        }
        int i17 = i3 - i6;
        int size = arrayList.size();
        for (int i18 = 0; i18 < size; i18++) {
            axq axqVar2 = (axq) arrayList.get(i18);
            int iA5 = bazVar.a(axqVar2) + i17;
            if (iA5 >= bazVar.f) {
                axqVar2.a = -(iF - iA5);
            } else {
                axqVar2.a = iA5;
            }
            bazVar.d.add(bay.b(bazVar.d, iA5, iF), axqVar2);
        }
        if (bazVar.U(i6, iA4)) {
            ayi.i("Unexpectedly removed anchors");
        }
        bazVar.C(i4, bazVar.p, i3);
        if (i7 > 0) {
            bazVar.I(i8, i7, i6 - 1);
        }
    }
}
