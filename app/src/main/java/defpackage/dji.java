package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class dji extends djk {
    public final djj a;
    private final boolean b;
    private final ebn c;

    /* JADX WARN: Removed duplicated region for block: B:12:0x001b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public dji(defpackage.djl r5, defpackage.djj r6, defpackage.uiq r7) {
        /*
            r4 = this;
            cib r0 = r5.c
            cib r1 = defpackage.cib.a
            r2 = 1
            r3 = 0
            if (r0 != r1) goto La
            r0 = r2
            goto Lb
        La:
            r0 = r3
        Lb:
            boolean r1 = defpackage.a.p(r3, r2)
            if (r1 == 0) goto L14
            if (r0 != 0) goto L26
            goto L1b
        L14:
            r1 = 2
            boolean r1 = defpackage.a.p(r3, r1)
            if (r1 == 0) goto L1d
        L1b:
            r3 = r2
            goto L26
        L1d:
            r1 = 3
            boolean r1 = defpackage.a.p(r3, r1)
            if (r1 == 0) goto L25
            goto L26
        L25:
            r3 = r0
        L26:
            r0 = r3 ^ 1
            r4.<init>()
            r4.b = r0
            ebn r0 = new ebn
            r0.<init>(r5)
            r7.a(r0)
            r4.c = r0
            r4.a = r6
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dji.<init>(djl, djj, uiq):void");
    }

    @Override // defpackage.djk
    public final float a(float f, float f2, long j) {
        List listJ = j();
        ArrayList arrayList = new ArrayList(listJ.size());
        int size = listJ.size();
        for (int i = 0; i < size; i++) {
            ((djk) listJ.get(i)).g();
            arrayList.add(Float.valueOf(0.0f));
        }
        float fBw = ske.bw(arrayList);
        List listJ2 = j();
        ArrayList arrayList2 = new ArrayList(listJ2.size());
        int size2 = listJ2.size();
        for (int i2 = 0; i2 < size2; i2++) {
            arrayList2.add(Float.valueOf(((Number) arrayList.get(i2)).floatValue() == 0.0f ? ((djk) listJ2.get(i2)).n() : 0.0f));
        }
        float fBw2 = f2 - ske.bw(arrayList2);
        List listJ3 = j();
        int size3 = listJ3.size();
        float f3 = f;
        for (int i3 = 0; i3 < size3; i3++) {
            djk djkVar = (djk) listJ3.get(i3);
            float fFloatValue = ((Number) arrayList.get(i3)).floatValue() > 0.0f ? (((Number) arrayList.get(i3)).floatValue() * fBw2) / fBw : djkVar.n();
            djkVar.k(f3, fFloatValue, j);
            f3 += fFloatValue;
        }
        return f;
    }

    @Override // defpackage.djk
    public final float b(float f) {
        Float f2;
        List listI = i();
        if (listI.isEmpty()) {
            f2 = null;
        } else {
            Float fValueOf = Float.valueOf(((djk) listI.get(0)).l(f));
            int iBk = ske.bk(listI);
            if (iBk > 0) {
                int i = 1;
                while (true) {
                    Float fValueOf2 = Float.valueOf(((djk) listI.get(i)).l(f));
                    if (fValueOf2.compareTo(fValueOf) > 0) {
                        fValueOf = fValueOf2;
                    }
                    if (i == iBk) {
                        break;
                    }
                    i++;
                }
            }
            f2 = fValueOf;
        }
        if (f2 != null) {
            return f2.floatValue();
        }
        return 0.0f;
    }

    @Override // defpackage.djk
    public final dkd c(float f, float f2) {
        List listI = i();
        dpa dpaVar = new dpa(f, f2, this, 1);
        ArrayList arrayList = new ArrayList(ske.bq(listI, 10));
        Iterator it = listI.iterator();
        while (it.hasNext()) {
            arrayList.add(dpaVar.a(it.next()));
        }
        return new dkd(ske.bw(arrayList), f, f2, f - (f2 / 2.0f));
    }

    @Override // defpackage.djk
    public final void d(bmv bmvVar) {
        List listI = i();
        int size = listI.size();
        for (int i = 0; i < size; i++) {
            ((djk) listI.get(i)).d(bmvVar);
        }
    }

    @Override // defpackage.djk
    public final void e(djo djoVar, Iterator it) {
        List listI = i();
        int size = listI.size();
        for (int i = 0; i < size; i++) {
            djk djkVar = (djk) listI.get(i);
            ebn ebnVar = this.c;
            djkVar.e(new djo(djoVar, (djl) ebnVar.b, djoVar.b), it);
        }
    }

    @Override // defpackage.djk
    public final void f(btd btdVar) {
        List listI = i();
        int size = listI.size();
        for (int i = 0; i < size; i++) {
            ((djk) listI.get(i)).f(btdVar);
        }
    }

    @Override // defpackage.djk
    public final void h(kbz kbzVar, ayc aycVar, int i) {
        aycVar.u(-257438458);
        if (kbzVar.b != null || (Float.floatToRawIntBits(Float.NaN) & Integer.MAX_VALUE) < 2139095040) {
            throw new IllegalArgumentException("Cannot add semantic properties to a curved container");
        }
        List listI = i();
        int size = listI.size();
        for (int i2 = 0; i2 < size; i2++) {
            ((djk) listI.get(i2)).h(new kbz((String) null, 7), aycVar, 0);
        }
        ((ayg) aycVar).Y();
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, java.util.List] */
    public final List i() {
        return this.c.a;
    }

    public final List j() {
        ukv ukvVarBo = ske.bo(i());
        ArrayList arrayList = new ArrayList(ske.bq(ukvVarBo, 10));
        ugd it = ukvVarBo.iterator();
        while (((uku) it).a) {
            int iA = it.a();
            List listI = i();
            if (this.b) {
                iA = (i().size() - 1) - iA;
            }
            arrayList.add((djk) listI.get(iA));
        }
        return arrayList;
    }
}
