package j$.time.format;

import j$.time.temporal.TemporalAccessor;

/* loaded from: classes3.dex */
public final class u {
    public final TemporalAccessor a;
    public final DateTimeFormatter b;
    public int c;

    /* JADX WARN: Removed duplicated region for block: B:38:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00a0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public u(j$.time.temporal.TemporalAccessor r10, j$.time.format.DateTimeFormatter r11) {
        /*
            r9 = this;
            r9.<init>()
            j$.time.chrono.l r0 = r11.e
            j$.time.ZoneId r1 = r11.f
            if (r0 != 0) goto Ld
            if (r1 != 0) goto Ld
            goto Le9
        Ld:
            j$.desugar.sun.nio.fs.n r2 = j$.time.temporal.m.b
            java.lang.Object r2 = r10.N(r2)
            j$.time.chrono.l r2 = (j$.time.chrono.l) r2
            j$.desugar.sun.nio.fs.n r3 = j$.time.temporal.m.a
            java.lang.Object r3 = r10.N(r3)
            j$.time.ZoneId r3 = (j$.time.ZoneId) r3
            boolean r4 = j$.util.Objects.equals(r0, r2)
            r5 = 0
            if (r4 == 0) goto L25
            r0 = r5
        L25:
            boolean r4 = j$.util.Objects.equals(r1, r3)
            if (r4 == 0) goto L2c
            r1 = r5
        L2c:
            if (r0 != 0) goto L32
            if (r1 != 0) goto L32
            goto Le9
        L32:
            if (r0 == 0) goto L36
            r4 = r0
            goto L37
        L36:
            r4 = r2
        L37:
            if (r1 == 0) goto L9b
            j$.time.temporal.a r6 = j$.time.temporal.a.INSTANT_SECONDS
            boolean r6 = r10.c(r6)
            if (r6 == 0) goto L53
            j$.time.chrono.s r0 = j$.time.chrono.s.c
            java.lang.Object r0 = j$.util.Objects.requireNonNullElse(r4, r0)
            j$.time.chrono.l r0 = (j$.time.chrono.l) r0
            j$.time.Instant r10 = j$.time.Instant.P(r10)
            j$.time.chrono.i r10 = r0.J(r10, r1)
            goto Le9
        L53:
            j$.time.zone.e r6 = r1.P()     // Catch: j$.time.zone.f -> L64
            boolean r7 = r6.h()     // Catch: j$.time.zone.f -> L64
            if (r7 == 0) goto L65
            j$.time.Instant r7 = j$.time.Instant.EPOCH     // Catch: j$.time.zone.f -> L64
            j$.time.ZoneOffset r6 = r6.d(r7)     // Catch: j$.time.zone.f -> L64
            goto L66
        L64:
        L65:
            r6 = r1
        L66:
            boolean r6 = r6 instanceof j$.time.ZoneOffset
            if (r6 == 0) goto L9b
            j$.time.temporal.a r6 = j$.time.temporal.a.OFFSET_SECONDS
            boolean r7 = r10.c(r6)
            if (r7 == 0) goto L9b
            int r6 = r10.h(r6)
            j$.time.zone.e r7 = r1.P()
            j$.time.Instant r8 = j$.time.Instant.EPOCH
            j$.time.ZoneOffset r7 = r7.d(r8)
            int r7 = r7.b
            if (r6 != r7) goto L85
            goto L9b
        L85:
            j$.time.b r11 = new j$.time.b
            java.lang.String r0 = java.lang.String.valueOf(r1)
            java.lang.String r10 = java.lang.String.valueOf(r10)
            java.lang.String r1 = "Unable to apply override zone '"
            java.lang.String r2 = "' because the temporal object being formatted has a different offset but does not represent an instant: "
            java.lang.String r10 = j$.time.e.b(r1, r0, r2, r10)
            r11.<init>(r10)
            throw r11
        L9b:
            if (r1 == 0) goto L9e
            r3 = r1
        L9e:
            if (r0 == 0) goto Le3
            j$.time.temporal.a r1 = j$.time.temporal.a.EPOCH_DAY
            boolean r1 = r10.c(r1)
            if (r1 == 0) goto Lad
            j$.time.chrono.b r5 = r4.C(r10)
            goto Le3
        Lad:
            j$.time.chrono.s r1 = j$.time.chrono.s.c
            if (r0 != r1) goto Lb3
            if (r2 == 0) goto Le3
        Lb3:
            j$.time.temporal.a[] r1 = j$.time.temporal.a.values()
            int r2 = r1.length
            r6 = 0
        Lb9:
            if (r6 >= r2) goto Le3
            r7 = r1[r6]
            boolean r8 = r7.isDateBased()
            if (r8 == 0) goto Le0
            boolean r7 = r10.c(r7)
            if (r7 != 0) goto Lca
            goto Le0
        Lca:
            j$.time.b r11 = new j$.time.b
            java.lang.String r0 = java.lang.String.valueOf(r0)
            java.lang.String r10 = java.lang.String.valueOf(r10)
            java.lang.String r1 = "Unable to apply override chronology '"
            java.lang.String r2 = "' because the temporal object being formatted contains date fields but does not represent a whole date: "
            java.lang.String r10 = j$.time.e.b(r1, r0, r2, r10)
            r11.<init>(r10)
            throw r11
        Le0:
            int r6 = r6 + 1
            goto Lb9
        Le3:
            j$.time.format.t r0 = new j$.time.format.t
            r0.<init>(r5, r10, r4, r3)
            r10 = r0
        Le9:
            r9.a = r10
            r9.b = r11
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: j$.time.format.u.<init>(j$.time.temporal.TemporalAccessor, j$.time.format.DateTimeFormatter):void");
    }

    public final Long a(j$.time.temporal.l lVar) {
        int i = this.c;
        TemporalAccessor temporalAccessor = this.a;
        if (i <= 0 || temporalAccessor.c(lVar)) {
            return Long.valueOf(temporalAccessor.D(lVar));
        }
        return null;
    }

    public final Object b(j$.desugar.sun.nio.fs.n nVar) {
        TemporalAccessor temporalAccessor = this.a;
        Object objN = temporalAccessor.N(nVar);
        if (objN == null && this.c == 0) {
            throw new j$.time.b(j$.time.e.b("Unable to extract ", String.valueOf(nVar), " from temporal ", String.valueOf(temporalAccessor)));
        }
        return objN;
    }

    public final String toString() {
        return this.a.toString();
    }
}
