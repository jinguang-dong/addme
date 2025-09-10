package defpackage;

import androidx.compose.foundation.layout.FillElement;
import androidx.compose.foundation.layout.SizeElement;
import androidx.compose.foundation.layout.UnspecifiedConstraintsElement;
import androidx.compose.foundation.layout.WrapContentElement;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class amd {
    private static final FillElement c = new FillElement(2);
    public static final FillElement a = new FillElement(1);
    public static final FillElement b = new FillElement(3);
    private static final WrapContentElement d = byi.aw(bib.j);
    private static final WrapContentElement e = byi.aw(bib.f);

    public static final bik a(bik bikVar, float f, float f2) {
        return bikVar.cM(new UnspecifiedConstraintsElement(f, f2));
    }

    public static final bik b(bik bikVar, float f) {
        return bikVar.cM(new SizeElement(0.0f, f, 0.0f, f, true, 5));
    }

    public static final bik c(bik bikVar, float f) {
        return bikVar.cM(new SizeElement(f, f, f, f, true));
    }

    public static final bik d(bik bikVar, long j) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j & 4294967295L));
        return bikVar.cM(new SizeElement(fIntBitsToFloat, fIntBitsToFloat2, fIntBitsToFloat, fIntBitsToFloat2, true));
    }

    public static final bik e(bik bikVar, float f) {
        return bikVar.cM(new SizeElement(f, 0.0f, f, 0.0f, true, 10));
    }

    public static /* synthetic */ bik i(bik bikVar, bie bieVar, int i) {
        if ((i & 1) != 0) {
            bieVar = bib.j;
        }
        return bikVar.cM(a.ao(bieVar, bib.j) ? d : a.ao(bieVar, bib.f) ? e : byi.aw(bieVar));
    }
}
