package defpackage;

import android.graphics.Paint;
import android.graphics.Typeface;
import android.graphics.fonts.Font;
import android.graphics.fonts.FontVariationAxis;
import android.graphics.text.TextRunShaper;
import android.text.TextPaint;
import android.util.LruCache;
import java.io.IOException;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class dob {
    public final float a;
    public final float b;
    public TextPaint c;
    public TextPaint d;
    private final cdo e;
    private final cfo f;
    private final cfo g;
    private final long h;
    private final chq i;
    private final long j;
    private LruCache k = new LruCache(5);
    private FontVariationAxis[] l;
    private Font m;
    private Font n;

    public dob(cdo cdoVar, cfo cfoVar, cfo cfoVar2, long j, long j2, chq chqVar, qqq qqqVar, long j3) {
        this.e = cdoVar;
        this.f = cfoVar;
        this.g = cfoVar2;
        this.h = j2;
        this.i = chqVar;
        this.j = j3;
        this.a = chqVar.dj(j);
        this.b = chqVar.dj(j2);
        int size = cfoVar.a.size();
        FontVariationAxis[] fontVariationAxisArr = new FontVariationAxis[size];
        for (int i = 0; i < size; i++) {
            fontVariationAxisArr[i] = new FontVariationAxis("null", 0.0f);
        }
        this.l = fontVariationAxisArr;
        TextPaint textPaint = new TextPaint();
        cfd cfdVarL = this.e.l();
        cfp cfpVarO = this.e.o();
        cfpVarO = cfpVarO == null ? cfp.e : cfpVarO;
        this.e.m();
        this.e.n();
        textPaint.setTypeface((Typeface) qqqVar.J(cfdVarL, cfpVarO).a());
        textPaint.setColor(bko.h(this.j));
        textPaint.setTextSize(this.a);
        textPaint.setFontVariationSettings(FontVariationAxis.toFontVariationSettings(c(this.f, this.g, 0.0f)));
        this.c = textPaint;
        TextPaint textPaint2 = new TextPaint(textPaint);
        textPaint2.setTextSize(this.b);
        textPaint2.setFontVariationSettings(FontVariationAxis.toFontVariationSettings(c(this.f, this.g, 1.0f)));
        this.d = textPaint2;
    }

    private final Font b(String str) throws IOException {
        Font font = this.m;
        if (font != null) {
            return font;
        }
        Font fontBuild = new Font.Builder(TextRunShaper.shapeTextRun((CharSequence) str, 0, str.length(), 0, str.length(), 0.0f, 0.0f, false, (Paint) this.c).getFont(0)).setFontVariationSettings(c(this.f, this.g, 0.0f)).build();
        this.m = fontBuild;
        fontBuild.getClass();
        return fontBuild;
    }

    private final FontVariationAxis[] c(cfo cfoVar, cfo cfoVar2, float f) {
        List list = cfoVar.a;
        ugd it = ske.bo(list).iterator();
        while (((uku) it).a) {
            int iA = it.a();
            cfl cflVar = (cfl) list.get(iA);
            List list2 = cfoVar2.a;
            int size = list2.size();
            int i = 0;
            while (true) {
                if (i >= size) {
                    break;
                }
                if (a.ao(((cfl) list2.get(i)).a(), ((cfl) list.get(iA)).a())) {
                    cflVar = (cfl) list2.get(i);
                    break;
                }
                i++;
            }
            this.l[iA] = new FontVariationAxis(((cfl) list.get(iA)).a(), chp.x(((cfl) list.get(iA)).c(), cflVar.c(), f));
        }
        return this.l;
    }

    public final Font a(String str, float f) throws IOException {
        float fFloor = (float) Math.floor(f / 0.016f);
        if (f == 0.0f) {
            return b(str);
        }
        if (f == 1.0f) {
            Font font = this.n;
            if (font != null) {
                return font;
            }
            Font fontBuild = new Font.Builder(b(str)).setFontVariationSettings(c(this.f, this.g, 1.0f)).build();
            this.n = fontBuild;
            fontBuild.getClass();
            return fontBuild;
        }
        LruCache lruCache = this.k;
        Float fValueOf = Float.valueOf(f);
        Font fontBuild2 = (Font) lruCache.get(fValueOf);
        if (fontBuild2 == null) {
            fontBuild2 = new Font.Builder(b(str)).setFontVariationSettings(c(this.f, this.g, fFloor * 0.016f)).build();
        }
        this.k.put(fValueOf, fontBuild2);
        return fontBuild2;
    }
}
