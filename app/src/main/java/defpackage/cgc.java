package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class cgc implements cen {
    private final /* synthetic */ int c;
    public static final cgc b = new cgc(1);
    public static final cgc a = new cgc(0);

    private cgc(int i) {
        this.c = i;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0055  */
    @Override // defpackage.cen
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.graphics.Typeface a(android.content.Context r7, defpackage.ceo r8) {
        /*
            r6 = this;
            int r6 = r6.c
            if (r6 == 0) goto Lb9
            boolean r6 = r8 instanceof defpackage.cfb
            r0 = 0
            if (r6 == 0) goto Lc
            cfb r8 = (defpackage.cfb) r8
            goto Ld
        Lc:
            r8 = r0
        Ld:
            if (r8 == 0) goto Lb8
            cfr r6 = defpackage.cfd.a
            java.lang.String r1 = r6.f
            java.lang.String r2 = r8.c
            cfp r3 = r8.d
            boolean r1 = defpackage.a.ao(r2, r1)
            if (r1 == 0) goto L22
            android.graphics.Typeface r6 = defpackage.clc.Z(r6, r3)
            goto L7a
        L22:
            cfr r6 = defpackage.cfd.b
            java.lang.String r1 = r6.f
            boolean r1 = defpackage.a.ao(r2, r1)
            if (r1 == 0) goto L31
            android.graphics.Typeface r6 = defpackage.clc.Z(r6, r3)
            goto L7a
        L31:
            cfr r6 = defpackage.cfd.c
            java.lang.String r1 = r6.f
            boolean r1 = defpackage.a.ao(r2, r1)
            if (r1 == 0) goto L40
            android.graphics.Typeface r6 = defpackage.clc.Z(r6, r3)
            goto L7a
        L40:
            cfr r6 = defpackage.cfd.d
            java.lang.String r1 = r6.f
            boolean r1 = defpackage.a.ao(r2, r1)
            if (r1 == 0) goto L4f
            android.graphics.Typeface r6 = defpackage.clc.Z(r6, r3)
            goto L7a
        L4f:
            int r6 = r2.length()
            if (r6 != 0) goto L57
        L55:
            r6 = r0
            goto L7a
        L57:
            android.graphics.Typeface r6 = defpackage.clc.Y(r2, r3)
            int r1 = r3.h
            android.graphics.Typeface r2 = android.graphics.Typeface.DEFAULT
            r4 = 0
            r5 = 1
            boolean r4 = defpackage.a.p(r4, r5)
            android.graphics.Typeface r1 = android.graphics.Typeface.create(r2, r1, r4)
            boolean r1 = defpackage.a.ao(r6, r1)
            if (r1 != 0) goto L55
            android.graphics.Typeface r1 = defpackage.clc.Y(r0, r3)
            boolean r1 = defpackage.a.ao(r6, r1)
            if (r1 == 0) goto L7a
            goto L55
        L7a:
            cfo r8 = r8.b
            java.lang.ThreadLocal r1 = defpackage.cfu.a
            if (r6 != 0) goto L81
            return r0
        L81:
            java.util.List r8 = r8.a
            boolean r1 = r8.isEmpty()
            if (r1 != 0) goto Lb7
            java.lang.ThreadLocal r1 = defpackage.cfu.a
            java.lang.Object r2 = r1.get()
            android.graphics.Paint r2 = (android.graphics.Paint) r2
            if (r2 != 0) goto L9b
            android.graphics.Paint r2 = new android.graphics.Paint
            r2.<init>()
            r1.set(r2)
        L9b:
            r2.setFontVariationSettings(r0)
            r2.setTypeface(r6)
            defpackage.chp.n(r7)
            axa r6 = new axa
            r7 = 5
            r6.<init>(r7)
            r7 = 31
            java.lang.String r6 = defpackage.cij.c(r8, r0, r6, r7)
            r2.setFontVariationSettings(r6)
            android.graphics.Typeface r6 = r2.getTypeface()
        Lb7:
            return r6
        Lb8:
            return r0
        Lb9:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.util.Objects.toString(r8)
            java.lang.String r7 = java.lang.String.valueOf(r8)
            java.lang.String r8 = "GoogleFont only support async loading: "
            java.lang.String r7 = r8.concat(r7)
            r6.<init>(r7)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cgc.a(android.content.Context, ceo):android.graphics.Typeface");
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x005f  */
    @Override // defpackage.cen
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object b(android.content.Context r13, defpackage.ceo r14, defpackage.uhb r15) {
        /*
            r12 = this;
            int r12 = r12.c
            if (r12 != 0) goto Lad
            boolean r12 = r14 instanceof defpackage.cga
            if (r12 == 0) goto L94
            r12 = r14
            cga r12 = (defpackage.cga) r12
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "name="
            r0.<init>(r1)
            java.lang.String r1 = r12.c
            r0.append(r1)
            java.lang.String r1 = "&weight="
            r0.append(r1)
            cfp r1 = r12.e
            int r2 = r1.h
            r0.append(r2)
            java.lang.String r2 = "&italic="
            r0.append(r2)
            int r2 = r12.f
            r2 = 0
            r3 = 1
            boolean r4 = defpackage.a.p(r2, r3)
            r0.append(r4)
            r4 = 0
            java.lang.String r4 = com.google.android.clockwork.common.wearable.wearmaterial.list.CaNf.PJGqOKsIpSdZ.OsJv
            r0.append(r4)
            java.lang.String r0 = r0.toString()
            cmx r4 = new cmx
            cfz r12 = r12.d
            r4.<init>(r0)
            cfp r12 = defpackage.cfp.g
            int r12 = r1.compareTo(r12)
            if (r12 < 0) goto L4e
            r12 = r3
            goto L4f
        L4e:
            r12 = r2
        L4f:
            boolean r0 = defpackage.a.p(r2, r3)
            if (r0 == 0) goto L5a
            if (r12 == 0) goto L59
            r2 = 3
            goto L5d
        L59:
            r12 = r2
        L5a:
            if (r0 == 0) goto L5f
            r2 = 2
        L5d:
            r7 = r2
            goto L62
        L5f:
            if (r12 == 0) goto L5d
            r7 = r3
        L62:
            uml r12 = new uml
            uhb r15 = defpackage.ske.aE(r15)
            r12.<init>(r15, r3)
            r12.x()
            cgb r11 = new cgb
            r11.<init>(r12, r14)
            android.os.Looper r14 = android.os.Looper.myLooper()
            if (r14 != 0) goto L7d
            android.os.Looper r14 = android.os.Looper.getMainLooper()
        L7d:
            android.os.Handler r10 = android.os.Handler.createAsync(r14)
            java.lang.Object[] r14 = new java.lang.Object[]{r4}
            java.util.List r6 = defpackage.ebn.j(r14)
            r8 = 0
            r9 = 0
            r5 = r13
            defpackage.coi.G(r5, r6, r7, r8, r9, r10, r11)
            java.lang.Object r12 = r12.i()
            return r12
        L94:
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            java.lang.String r13 = "Only GoogleFontImpl supported (actual "
            r12.<init>(r13)
            r12.append(r14)
            r13 = 41
            r12.append(r13)
            java.lang.String r12 = r12.toString()
            java.lang.IllegalArgumentException r13 = new java.lang.IllegalArgumentException
            r13.<init>(r12)
            throw r13
        Lad:
            java.lang.UnsupportedOperationException r12 = new java.lang.UnsupportedOperationException
            java.lang.String r13 = "All preloaded fonts are optional local."
            r12.<init>(r13)
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cgc.b(android.content.Context, ceo, uhb):java.lang.Object");
    }
}
