package defpackage;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* compiled from: PG */
/* loaded from: classes.dex */
final class sgf implements Iterator {
    sgg a;
    sec b;
    final /* synthetic */ sgi c;

    /* JADX WARN: Removed duplicated region for block: B:4:0x000c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public sgf(defpackage.sgi r6) {
        /*
            r5 = this;
            r5.c = r6
            r5.<init>()
            sgh r0 = r6.rootReference
            java.lang.Object r0 = r0.a
            r1 = 0
            if (r0 != 0) goto Le
        Lc:
            r0 = r1
            goto L4c
        Le:
            sam r2 = r6.range
            boolean r3 = r2.d
            if (r3 == 0) goto L37
            java.lang.Object r2 = r2.e
            java.util.Comparator r3 = r6.comparator
            sgg r0 = (defpackage.sgg) r0
            sgg r0 = r0.d(r3, r2)
            if (r0 != 0) goto L21
            goto Lc
        L21:
            sam r3 = r6.range
            int r3 = r3.g
            r4 = 1
            if (r3 != r4) goto L3d
            java.util.Comparator r3 = r6.comparator
            java.lang.Object r4 = r0.a
            int r2 = r3.compare(r2, r4)
            if (r2 != 0) goto L3d
            sgg r0 = r0.e()
            goto L3d
        L37:
            sgg r0 = r6.header
            sgg r0 = r0.e()
        L3d:
            sgg r2 = r6.header
            if (r0 == r2) goto Lc
            sam r6 = r6.range
            java.lang.Object r2 = r0.a
            boolean r6 = r6.b(r2)
            if (r6 != 0) goto L4c
            goto Lc
        L4c:
            r5.a = r0
            r5.b = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.sgf.<init>(sgi):void");
    }

    @Override // java.util.Iterator
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final sec next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        sgg sggVar = this.a;
        sggVar.getClass();
        sgi sgiVar = this.c;
        sgd sgdVar = new sgd(sgiVar, sggVar);
        this.b = sgdVar;
        if (sggVar.e() == sgiVar.header) {
            this.a = null;
            return sgdVar;
        }
        this.a = this.a.e();
        return sgdVar;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        sgg sggVar = this.a;
        if (sggVar == null) {
            return false;
        }
        sgi sgiVar = this.c;
        if (!sgiVar.range.d(sggVar.a)) {
            return true;
        }
        this.a = null;
        return false;
    }

    @Override // java.util.Iterator
    public final void remove() {
        rnt.M(this.b != null, "no calls to next() since the last call to remove()");
        this.c.w(this.b.b());
        this.b = null;
    }
}
