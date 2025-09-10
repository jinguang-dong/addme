package defpackage;

import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.text.LineBreakConfig;
import android.text.Layout;
import android.text.Spanned;
import android.text.StaticLayout;
import android.text.TextDirectionHeuristic;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.style.MetricAffectingSpan;
import com.google.android.apps.camera.jni.saliency.tLp.KsvNaXS;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bqs {
    public static final Void a(String str) {
        throw new IllegalStateException(str);
    }

    public static final void b(String str) {
        throw new IllegalArgumentException(str);
    }

    public static final void c(String str) {
        throw new IllegalStateException(str);
    }

    public static final void d(String str) {
        throw new IndexOutOfBoundsException(str);
    }

    public static final Object f(bsq bsqVar) {
        Object objG = bsqVar.g();
        brz brzVar = objG instanceof brz ? (brz) objG : null;
        if (brzVar != null) {
            return brzVar.a;
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x001c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final float g(defpackage.btd r5, boolean r6, defpackage.btk[] r7, float r8) {
        /*
            r0 = 0
            r1 = 2143289344(0x7fc00000, float:NaN)
            r2 = r0
        L4:
            int r3 = r7.length
            if (r2 >= r3) goto L20
            r3 = r7[r2]
            float r3 = r5.o(r3)
            boolean r4 = java.lang.Float.isNaN(r1)
            if (r4 != 0) goto L1c
            int r4 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r4 > 0) goto L19
            r4 = r0
            goto L1a
        L19:
            r4 = 1
        L1a:
            if (r6 != r4) goto L1d
        L1c:
            r1 = r3
        L1d:
            int r2 = r2 + 1
            goto L4
        L20:
            boolean r5 = java.lang.Float.isNaN(r1)
            if (r5 == 0) goto L27
            return r8
        L27:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bqs.g(btd, boolean, btk[], float):float");
    }

    public static int h(bsr bsrVar, brv brvVar, List list, int i) {
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            arrayList.add(new bwk((bru) list.get(i2), 2, 2, 1));
        }
        return bsrVar.e(new brx(brvVar, brvVar.m()), arrayList, chp.k(i, 0, 13)).a();
    }

    public static int i(bsr bsrVar, brv brvVar, List list, int i) {
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            arrayList.add(new bwk((bru) list.get(i2), 2, 1, 1));
        }
        return bsrVar.e(new brx(brvVar, brvVar.m()), arrayList, chp.k(0, i, 7)).b();
    }

    public static int j(bsr bsrVar, brv brvVar, List list, int i) {
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            arrayList.add(new bwk((bru) list.get(i2), 1, 2, 1));
        }
        return bsrVar.e(new brx(brvVar, brvVar.m()), arrayList, chp.k(i, 0, 13)).a();
    }

    public static int k(bsr bsrVar, brv brvVar, List list, int i) {
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            arrayList.add(new bwk((bru) list.get(i2), 1, 1, 1));
        }
        return bsrVar.e(new brx(brvVar, brvVar.m()), arrayList, chp.k(0, i, 7)).b();
    }

    public static final bvu l(bvu bvuVar) {
        bvm bvmVarH = bvuVar.H();
        while (true) {
            bvm bvmVarJ = bvmVarH.j();
            bvm bvmVar = null;
            if ((bvmVarJ != null ? bvmVarJ.h : null) == null) {
                bvu bvuVarY = bvmVarH.o().y();
                bvuVarY.getClass();
                return bvuVarY;
            }
            bvm bvmVarJ2 = bvmVarH.j();
            if (bvmVarJ2 != null) {
                bvmVar = bvmVarJ2.h;
            }
            bvmVar.getClass();
            bvm bvmVarJ3 = bvmVarH.j();
            bvmVarJ3.getClass();
            bvmVarH = bvmVarJ3.h;
            bvmVarH.getClass();
        }
    }

    public static final cfl m(String str, float f) {
        if (str.length() != 4) {
            cgh.a("Name must be exactly four characters. Actual: '" + str + '\'');
        }
        return new cfm(str, f);
    }

    public static final cfd n(cfc cfcVar) {
        return byx.f(cfcVar);
    }

    public static final int o(Paint.FontMetricsInt fontMetricsInt) {
        return fontMetricsInt.descent - fontMetricsInt.ascent;
    }

    public static final boolean q(Spanned spanned, Class cls) {
        return spanned.nextSpanTransition(-1, spanned.length(), cls) != spanned.length();
    }

    public static final Rect r(TextPaint textPaint, CharSequence charSequence, int i, int i2) {
        if (charSequence instanceof Spanned) {
            Spanned spanned = (Spanned) charSequence;
            if (spanned.nextSpanTransition(i - 1, i2, MetricAffectingSpan.class) != i2) {
                Rect rect = new Rect();
                Rect rect2 = new Rect();
                TextPaint textPaint2 = new TextPaint();
                while (i < i2) {
                    int iNextSpanTransition = spanned.nextSpanTransition(i, i2, MetricAffectingSpan.class);
                    MetricAffectingSpan[] metricAffectingSpanArr = (MetricAffectingSpan[]) spanned.getSpans(i, iNextSpanTransition, MetricAffectingSpan.class);
                    textPaint2.set(textPaint);
                    Iterator itAu = ske.au(metricAffectingSpanArr);
                    while (itAu.hasNext()) {
                        MetricAffectingSpan metricAffectingSpan = (MetricAffectingSpan) itAu.next();
                        if (spanned.getSpanStart(metricAffectingSpan) != spanned.getSpanEnd(metricAffectingSpan)) {
                            metricAffectingSpan.updateMeasureState(textPaint2);
                        }
                    }
                    textPaint2.getTextBounds(charSequence, i, iNextSpanTransition, rect2);
                    rect.right += rect2.width();
                    rect.top = Math.min(rect.top, rect2.top);
                    rect.bottom = Math.max(rect.bottom, rect2.bottom);
                    i = iNextSpanTransition;
                }
                return rect;
            }
        }
        Rect rect3 = new Rect();
        textPaint.getTextBounds(charSequence, i, i2, rect3);
        return rect3;
    }

    public static final int s(List list, int i) {
        int i2;
        int i3 = ((ccy) ske.bF(list)).b;
        if (i > ((ccy) ske.bF(list)).b) {
            cgh.a(a.bu(i3, i, "Index ", " should be less or equal than last line's end "));
        }
        int size = list.size() - 1;
        int i4 = 0;
        while (true) {
            if (i4 > size) {
                i2 = -(i4 + 1);
                break;
            }
            i2 = (i4 + size) >>> 1;
            ccy ccyVar = (ccy) list.get(i2);
            char c = ccyVar.a <= i ? ccyVar.b <= i ? (char) 65535 : (char) 0 : (char) 1;
            if (c >= 0) {
                if (c <= 0) {
                    break;
                }
                size = i2 - 1;
            } else {
                i4 = i2 + 1;
            }
        }
        if (i2 >= 0 && i2 < list.size()) {
            return i2;
        }
        cgh.a("Found paragraph index " + i2 + " should be in range [0, " + list.size() + ").\nDebug info: index=" + i + ", paragraphs=[" + cij.c(list, null, new axa(4), 31) + ']');
        return i2;
    }

    public static final int t(List list, int i) {
        int size = list.size() - 1;
        int i2 = 0;
        while (true) {
            if (i2 > size) {
                return -(i2 + 1);
            }
            int i3 = (i2 + size) >>> 1;
            ccy ccyVar = (ccy) list.get(i3);
            char c = ccyVar.c <= i ? ccyVar.d <= i ? (char) 65535 : (char) 0 : (char) 1;
            if (c < 0) {
                i2 = i3 + 1;
            } else {
                if (c <= 0) {
                    return i3;
                }
                size = i3 - 1;
            }
        }
    }

    public static final ccj u(ccl cclVar) {
        String str = cclVar.d;
        return new ccj(cclVar.a, cclVar.b, cclVar.c);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v10, types: [bij] */
    /* JADX WARN: Type inference failed for: r1v11, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v12 */
    /* JADX WARN: Type inference failed for: r1v13 */
    /* JADX WARN: Type inference failed for: r1v14 */
    /* JADX WARN: Type inference failed for: r1v15 */
    /* JADX WARN: Type inference failed for: r1v16 */
    /* JADX WARN: Type inference failed for: r1v6 */
    /* JADX WARN: Type inference failed for: r1v7, types: [bij] */
    /* JADX WARN: Type inference failed for: r1v9 */
    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v10 */
    /* JADX WARN: Type inference failed for: r3v11 */
    /* JADX WARN: Type inference failed for: r3v2 */
    /* JADX WARN: Type inference failed for: r3v3, types: [bdp] */
    /* JADX WARN: Type inference failed for: r3v4 */
    /* JADX WARN: Type inference failed for: r3v5 */
    /* JADX WARN: Type inference failed for: r3v6, types: [bdp] */
    /* JADX WARN: Type inference failed for: r3v8 */
    /* JADX WARN: Type inference failed for: r3v9 */
    /* JADX WARN: Type inference failed for: r8v3, types: [java.lang.Object, uif] */
    public static Object v(bub bubVar, ocq ocqVar) {
        bwe bweVar;
        if (!bubVar.B().w) {
            b("ModifierLocal accessed from an unattached node");
        }
        if (!bubVar.B().w) {
            c("visitAncestors called on an unattached node");
        }
        bij bijVar = bubVar.B().p;
        bvm bvmVarB = bko.B(bubVar);
        while (bvmVarB != null) {
            if ((bvmVarB.s.f.o & 32) != 0) {
                while (bijVar != null) {
                    if ((bijVar.n & 32) != 0) {
                        bup bupVarY = bijVar;
                        ?? bdpVar = 0;
                        while (bupVarY != 0) {
                            if (bupVarY instanceof bub) {
                                bub bubVar2 = (bub) bupVarY;
                                if (bubVar2.h().b(ocqVar)) {
                                    return bubVar2.h().a(ocqVar);
                                }
                            } else if ((bupVarY.n & 32) != 0 && (bupVarY instanceof bup)) {
                                bij bijVar2 = bupVarY.y;
                                int i = 0;
                                bupVarY = bupVarY;
                                bdpVar = bdpVar;
                                while (bijVar2 != null) {
                                    if ((bijVar2.n & 32) != 0) {
                                        i++;
                                        bdpVar = bdpVar;
                                        if (i == 1) {
                                            bupVarY = bijVar2;
                                        } else {
                                            if (bdpVar == 0) {
                                                bdpVar = new bdp(new bij[16]);
                                            }
                                            if (bupVarY != 0) {
                                                bdpVar.n(bupVarY);
                                            }
                                            bdpVar.n(bijVar2);
                                            bupVarY = 0;
                                        }
                                    }
                                    bijVar2 = bijVar2.q;
                                    bupVarY = bupVarY;
                                    bdpVar = bdpVar;
                                }
                                if (i != 1) {
                                }
                            }
                            bupVarY = bko.y(bdpVar);
                        }
                    }
                    bijVar = bijVar.p;
                }
            }
            bvmVarB = bvmVarB.j();
            bijVar = (bvmVarB == null || (bweVar = bvmVarB.s) == null) ? null : bweVar.e;
        }
        return ocqVar.a.a();
    }

    public static final StaticLayout p(CharSequence charSequence, TextPaint textPaint, int i, int i2, TextDirectionHeuristic textDirectionHeuristic, Layout.Alignment alignment, int i3, TextUtils.TruncateAt truncateAt, int i4, int i5, int i6, int i7, int i8, int i9) {
        if (i2 < 0) {
            cgh.a("invalid start value");
        }
        int length = charSequence.length();
        if (i2 < 0 || i2 > length) {
            cgh.a("invalid end value");
        }
        if (i3 < 0) {
            cgh.a(KsvNaXS.HWDKkibq);
        }
        if (i < 0) {
            cgh.a("invalid width value");
        }
        if (i4 < 0) {
            cgh.a("invalid ellipsizedWidth value");
        }
        StaticLayout.Builder builderObtain = StaticLayout.Builder.obtain(charSequence, 0, i2, textPaint, i);
        builderObtain.setTextDirection(textDirectionHeuristic);
        builderObtain.setAlignment(alignment);
        builderObtain.setMaxLines(i3);
        builderObtain.setEllipsize(truncateAt);
        builderObtain.setEllipsizedWidth(i4);
        builderObtain.setLineSpacing(0.0f, 1.0f);
        builderObtain.setIncludePad(false);
        builderObtain.setBreakStrategy(i6);
        builderObtain.setHyphenationFrequency(i9);
        builderObtain.setIndents(null, null);
        builderObtain.setJustificationMode(i5);
        builderObtain.setUseLineSpacingFromFallbacks(true);
        builderObtain.setLineBreakConfig(new LineBreakConfig.Builder().setLineBreakStyle(i7).setLineBreakWordStyle(i8).build());
        builderObtain.setUseBoundsForWidth(false);
        return builderObtain.build();
    }
}
