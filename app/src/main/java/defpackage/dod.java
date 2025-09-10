package defpackage;

import android.graphics.Paint;
import android.graphics.fonts.Font;
import android.graphics.text.PositionedGlyphs;
import android.graphics.text.TextRunShaper;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class dod {
    public final dob a;
    public final cib b;
    public float d;
    public float e;
    public int f;
    public int g;
    public int h;
    public int i;
    public float k;
    public float l;
    public PositionedGlyphs m;
    public PositionedGlyphs n;
    private final chq o;
    private final azr p = new azz(new chv(0), bap.c);
    public long c = 0;
    public String j = "";

    public dod(dob dobVar, cib cibVar, chq chqVar) {
        this.a = dobVar;
        this.b = cibVar;
        this.o = chqVar;
    }

    public final long a() {
        return ((chv) this.p.a()).a;
    }

    public final void b(String str) {
        float fMax;
        if (a.ao(this.j, str)) {
            return;
        }
        this.j = str;
        chq chqVar = this.o;
        float fMax2 = 0.0f;
        if (str.length() == 0) {
            this.k = 0.0f;
            this.m = null;
            this.l = 0.0f;
            this.n = null;
            fMax = 0.0f;
        } else {
            this.k = 0.0f;
            this.l = 0.0f;
            String str2 = this.j;
            int length = str2.length();
            int length2 = this.j.length();
            boolean z = this.b == cib.b;
            dob dobVar = this.a;
            PositionedGlyphs positionedGlyphsShapeTextRun = TextRunShaper.shapeTextRun(str2, 0, length, 0, length2, 0.0f, 0.0f, z, dobVar.c);
            this.m = positionedGlyphsShapeTextRun;
            positionedGlyphsShapeTextRun.getClass();
            this.k = positionedGlyphsShapeTextRun.getAdvance();
            String str3 = this.j;
            PositionedGlyphs positionedGlyphsShapeTextRun2 = TextRunShaper.shapeTextRun(str3, 0, str3.length(), 0, this.j.length(), 0.0f, 0.0f, z, dobVar.d);
            this.n = positionedGlyphsShapeTextRun2;
            positionedGlyphsShapeTextRun2.getClass();
            float advance = positionedGlyphsShapeTextRun2.getAdvance();
            this.l = advance;
            fMax = Math.max(this.k, advance);
        }
        int iX = ukj.x(fMax);
        if (this.j.length() == 0) {
            this.d = 0.0f;
            this.h = 0;
            this.f = 0;
            this.e = 0.0f;
            this.i = 0;
            this.g = 0;
        } else {
            Paint.FontMetrics fontMetrics = new Paint.FontMetrics();
            dob dobVar2 = this.a;
            Font fontA = dobVar2.a(this.j, 0.0f);
            Font fontA2 = dobVar2.a(this.j, 1.0f);
            fontA.getMetrics(dobVar2.c, fontMetrics);
            this.d = fontMetrics.descent - fontMetrics.ascent;
            this.h = ukj.x(fontMetrics.ascent);
            this.f = -ukj.x(fontMetrics.top);
            fontA2.getMetrics(dobVar2.d, fontMetrics);
            this.e = fontMetrics.descent - fontMetrics.ascent;
            this.i = ukj.x(fontMetrics.ascent);
            this.g = -ukj.x(fontMetrics.top);
            fMax2 = Math.max(this.d, this.e);
        }
        long jX = (ukj.x(fMax2) & 4294967295L) | (iX << 32);
        this.c = jX;
        this.p.b(new chv(a.t(chqVar.di((int) (jX >> 32)), chqVar.di((int) (this.c & 4294967295L)))));
    }
}
