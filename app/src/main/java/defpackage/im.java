package defpackage;

import android.graphics.Typeface;
import android.widget.TextView;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class im {
    public Typeface a;
    public String b;
    private final TextView c;
    private final cnh d;
    private Typeface e;

    public im(TextView textView, cnh cnhVar) {
        this.c = textView;
        this.d = cnhVar;
    }

    private final void c(Typeface typeface) {
        this.e = typeface;
        this.d.accept(typeface);
    }

    public final void a(Typeface typeface) {
        this.a = typeface;
        c(typeface);
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00c6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean b(java.lang.String r14) {
        /*
            r13 = this;
            android.widget.TextView r0 = r13.c
            android.graphics.Typeface r1 = r13.a
            android.text.TextPaint r2 = r0.getPaint()
            android.graphics.Typeface r3 = r13.e
            android.graphics.Typeface r4 = r2.getTypeface()
            if (r3 == r4) goto L1b
            java.lang.String r1 = "FontVarSettings"
            java.lang.String r3 = "getPaint().getTypeface() changed unexpectedly. App code should not modify the result of getPaint()."
            android.util.Log.w(r1, r3)
            android.graphics.Typeface r1 = r2.getTypeface()
        L1b:
            android.content.Context r0 = r0.getContext()
            android.content.res.Resources r0 = r0.getResources()
            android.content.res.Configuration r0 = r0.getConfiguration()
            int r0 = r0.fontWeightAdjustment
            r2 = 2147483647(0x7fffffff, float:NaN)
            r3 = 0
            if (r0 != r2) goto L30
            r0 = r3
        L30:
            zd r2 = defpackage.il.a
            ik r2 = new ik
            r2.<init>(r1, r14, r0)
            zd r4 = defpackage.il.a
            java.lang.Object r5 = r4.a(r2)
            android.graphics.Typeface r5 = (android.graphics.Typeface) r5
            r6 = 1
            if (r5 == 0) goto L44
            goto Lc7
        L44:
            android.graphics.Paint r5 = defpackage.il.b
            if (r5 != 0) goto L4f
            android.graphics.Paint r5 = new android.graphics.Paint
            r5.<init>()
            defpackage.il.b = r5
        L4f:
            if (r0 != 0) goto L52
            goto L61
        L52:
            boolean r7 = android.text.TextUtils.isEmpty(r14)
            if (r7 == 0) goto L5b
            android.graphics.fonts.FontVariationAxis[] r7 = new android.graphics.fonts.FontVariationAxis[r3]
            goto L63
        L5b:
            android.graphics.fonts.FontVariationAxis[] r7 = android.graphics.fonts.FontVariationAxis.fromFontVariationSettings(r14)
            if (r7 != 0) goto L63
        L61:
            r0 = r14
            goto La7
        L63:
            r8 = r3
            r9 = r8
        L65:
            int r10 = r7.length
            java.lang.String r11 = "wght"
            if (r8 >= r10) goto L8b
            r10 = r7[r8]
            java.lang.String r12 = r10.getTag()
            boolean r12 = r11.equals(r12)
            if (r12 == 0) goto L88
            android.graphics.fonts.FontVariationAxis r9 = new android.graphics.fonts.FontVariationAxis
            float r10 = r10.getStyleValue()
            float r12 = (float) r0
            float r10 = r10 + r12
            float r10 = defpackage.il.a(r10)
            r9.<init>(r11, r10)
            r7[r8] = r9
            r9 = r6
        L88:
            int r8 = r8 + 1
            goto L65
        L8b:
            if (r9 != 0) goto La3
            int r8 = r10 + 1
            android.graphics.fonts.FontVariationAxis[] r8 = new android.graphics.fonts.FontVariationAxis[r8]
            java.lang.System.arraycopy(r7, r3, r8, r3, r10)
            int r0 = r0 + 400
            android.graphics.fonts.FontVariationAxis r7 = new android.graphics.fonts.FontVariationAxis
            float r0 = (float) r0
            float r0 = defpackage.il.a(r0)
            r7.<init>(r11, r0)
            r8[r10] = r7
            r7 = r8
        La3:
            java.lang.String r0 = android.graphics.fonts.FontVariationAxis.toFontVariationSettings(r7)
        La7:
            java.lang.String r7 = r5.getFontVariationSettings()
            boolean r7 = j$.util.Objects.equals(r7, r0)
            r8 = 0
            if (r7 == 0) goto Lb5
            r5.setFontVariationSettings(r8)
        Lb5:
            r5.setTypeface(r1)
            boolean r0 = r5.setFontVariationSettings(r0)
            if (r0 == 0) goto Lc6
            android.graphics.Typeface r5 = r5.getTypeface()
            r4.b(r2, r5)
            goto Lc7
        Lc6:
            r5 = r8
        Lc7:
            if (r5 == 0) goto Lcf
            r13.c(r5)
            r13.b = r14
            return r6
        Lcf:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.im.b(java.lang.String):boolean");
    }
}
