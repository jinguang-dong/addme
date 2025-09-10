package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class rwo extends rvl {
    final /* synthetic */ String f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rwo(rwr rwrVar, CharSequence charSequence, String str) {
        super(rwrVar, charSequence);
        this.f = str;
    }

    @Override // defpackage.rvl
    public final int a(int i) {
        return i + this.f.length();
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x001e, code lost:
    
        r7 = r7 + 1;
     */
    @Override // defpackage.rvl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int b(int r7) {
        /*
            r6 = this;
            java.lang.String r0 = r6.f
            java.lang.CharSequence r6 = r6.b
            int r1 = r6.length()
            int r2 = r0.length()
            int r1 = r1 - r2
        Ld:
            if (r7 > r1) goto L25
            r3 = 0
        L10:
            if (r3 >= r2) goto L24
            int r4 = r3 + r7
            char r4 = r6.charAt(r4)
            char r5 = r0.charAt(r3)
            if (r4 == r5) goto L21
            int r7 = r7 + 1
            goto Ld
        L21:
            int r3 = r3 + 1
            goto L10
        L24:
            return r7
        L25:
            r6 = -1
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rwo.b(int):int");
    }
}
