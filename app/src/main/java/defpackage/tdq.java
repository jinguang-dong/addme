package defpackage;

import com.google.googlex.gcam.GcamModuleJNI;
import com.google.googlex.gcam.clientallocator.RawClientAllocator;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class tdq implements RawClientAllocator {
    public tcu a;
    public boolean b = false;

    public tdq() {
        a.I(GcamModuleJNI.kInvalidAllocationId_get() != 0);
    }

    /* JADX WARN: Removed duplicated region for block: B:22:? A[SYNTHETIC] */
    @Override // com.google.googlex.gcam.clientallocator.RawClientAllocator
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final com.google.googlex.gcam.base.LongPair allocate(int r7, int r8, int r9) {
        /*
            r6 = this;
            tcu r0 = r6.a
            r1 = 0
            if (r0 != 0) goto L7
            r0 = 1
            goto L8
        L7:
            r0 = r1
        L8:
            java.lang.String r2 = "allocate() should be called at most once."
            defpackage.rnt.M(r0, r2)
            tcu r0 = new tcu
            tct[] r2 = defpackage.tct.f
            r3 = 5
            if (r9 >= r3) goto L1d
            if (r9 < 0) goto L1d
            r4 = r2[r9]
            int r5 = r4.g
            if (r5 != r9) goto L1d
            goto L25
        L1d:
            if (r1 >= r3) goto L3b
            r4 = r2[r1]
            int r5 = r4.g
            if (r5 != r9) goto L38
        L25:
            r0.<init>(r7, r8, r4)
            r6.a = r0
            com.google.googlex.gcam.base.LongPair r7 = new com.google.googlex.gcam.base.LongPair
            tcu r6 = r6.a
            long r8 = com.google.googlex.gcam.RawWriteView.e(r6)
            r0 = 0
            r7.<init>(r0, r8)
            return r7
        L38:
            int r1 = r1 + 1
            goto L1d
        L3b:
            java.lang.Class<tct> r6 = defpackage.tct.class
            java.lang.IllegalArgumentException r7 = new java.lang.IllegalArgumentException
            java.lang.String r6 = r6.toString()
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            java.lang.String r0 = "No enum "
            r8.<init>(r0)
            r8.append(r6)
            java.lang.String r6 = " with value "
            r8.append(r6)
            r8.append(r9)
            java.lang.String r6 = r8.toString()
            r7.<init>(r6)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.tdq.allocate(int, int, int):com.google.googlex.gcam.base.LongPair");
    }

    @Override // com.google.googlex.gcam.clientallocator.RawClientAllocator
    public final void doneWriting(long j) {
        a.I(j == 0);
        rnt.M(this.a != null, "doneWriting() was called before allocate().");
        rnt.M(!this.b, "doneWriting() should be called at most once.");
        this.b = true;
    }
}
