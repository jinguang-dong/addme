package defpackage;

import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class boo {
    public final XmlPullParser a;
    private int c = 0;
    public final cwi b = new cwi();

    public boo(XmlPullParser xmlPullParser) {
        this.a = xmlPullParser;
    }

    public final float a(TypedArray typedArray, String str, int i, float f) {
        float fG = clc.G(typedArray, this.a, str, i, f);
        e(typedArray.getChangingConfigurations());
        return fG;
    }

    public final int b(TypedArray typedArray, String str, int i, int i2) {
        int I = clc.I(typedArray, this.a, str, i, i2);
        e(typedArray.getChangingConfigurations());
        return I;
    }

    public final TypedArray c(Resources resources, Resources.Theme theme, AttributeSet attributeSet, int[] iArr) {
        TypedArray typedArrayK = clc.K(resources, theme, attributeSet, iArr);
        e(typedArrayK.getChangingConfigurations());
        return typedArrayK;
    }

    public final String d(TypedArray typedArray, int i) {
        String string = typedArray.getString(i);
        e(typedArray.getChangingConfigurations());
        return string;
    }

    public final void e(int i) {
        this.c = i | this.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof boo)) {
            return false;
        }
        boo booVar = (boo) obj;
        return a.ao(this.a, booVar.a) && this.c == booVar.c;
    }

    public final float f(TypedArray typedArray, int i) {
        float dimension = typedArray.getDimension(i, 0.0f);
        e(typedArray.getChangingConfigurations());
        return dimension;
    }

    public final float g(TypedArray typedArray, int i) {
        float f = typedArray.getFloat(i, 0.0f);
        e(typedArray.getChangingConfigurations());
        return f;
    }

    public final nll h(TypedArray typedArray, Resources.Theme theme, String str, int i) throws XmlPullParserException, Resources.NotFoundException, IOException {
        nll nllVarV = clc.V(typedArray, this.a, theme, str, i);
        e(typedArray.getChangingConfigurations());
        return nllVarV;
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + this.c;
    }

    public final String toString() {
        return "AndroidVectorParser(xmlParser=" + this.a + ", config=" + this.c + ')';
    }
}
