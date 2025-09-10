package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.AttributeSet;
import android.util.StateSet;
import android.util.Xml;
import com.google.android.apps.camera.facemetadata.conversions.jni.HM.oUZhwRhE;
import com.google.ar.core.R;
import j$.util.Optional;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParserException;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class tfm {
    public int a;
    public Object b;
    public Object c;
    public Object d;

    public tfm() {
        throw null;
    }

    private final void d() {
        this.b = new roc();
        this.d = new int[10][];
        this.c = new roc[10];
    }

    public final tfn a() {
        int i;
        Object obj = this.b;
        if (obj == null || (i = this.a) == 0) {
            throw new IllegalStateException();
        }
        return new tfn((sbp) obj, (Optional) this.c, (Optional) this.d, i);
    }

    public final void b(sbp sbpVar) {
        sbpVar.getClass();
        this.b = sbpVar;
    }

    public final pul c() {
        Object obj = this.b;
        obj.getClass();
        if (this.c == null) {
            this.c = "Download result code: ".concat(String.valueOf(((puk) obj).name()));
        }
        return new pul(this);
    }

    public tfm(char[] cArr) {
    }

    public tfm(Context context, int i) throws Resources.NotFoundException {
        int next;
        int depth;
        TypedArray typedArrayObtainStyledAttributes;
        d();
        try {
            XmlResourceParser xml = context.getResources().getXml(i);
            try {
                AttributeSet attributeSetAsAttributeSet = Xml.asAttributeSet(xml);
                do {
                    next = xml.next();
                    if (next == 2) {
                        if (xml.getName().equals("selector")) {
                            Resources.Theme theme = context.getTheme();
                            int depth2 = xml.getDepth() + 1;
                            while (true) {
                                int next2 = xml.next();
                                if (next2 == 1 || ((depth = xml.getDepth()) < depth2 && next2 == 3)) {
                                    break;
                                }
                                if (next2 == 2 && depth <= depth2 && xml.getName().equals("item")) {
                                    Resources resources = context.getResources();
                                    if (theme == null) {
                                        typedArrayObtainStyledAttributes = resources.obtainAttributes(attributeSetAsAttributeSet, rny.a);
                                    } else {
                                        typedArrayObtainStyledAttributes = theme.obtainStyledAttributes(attributeSetAsAttributeSet, rny.a, 0, 0);
                                    }
                                    roc rocVar = new roc(roc.b(context, typedArrayObtainStyledAttributes.getResourceId(0, 0), typedArrayObtainStyledAttributes.getResourceId(1, 0), new rno(0.0f)));
                                    typedArrayObtainStyledAttributes.recycle();
                                    int attributeCount = attributeSetAsAttributeSet.getAttributeCount();
                                    int[] iArr = new int[attributeCount];
                                    int i2 = 0;
                                    for (int i3 = 0; i3 < attributeCount; i3++) {
                                        int attributeNameResource = attributeSetAsAttributeSet.getAttributeNameResource(i3);
                                        if (attributeNameResource != R.attr.shapeAppearance && attributeNameResource != R.attr.shapeAppearanceOverlay) {
                                            int i4 = i2 + 1;
                                            iArr[i2] = attributeSetAsAttributeSet.getAttributeBooleanValue(i3, false) ? attributeNameResource : -attributeNameResource;
                                            i2 = i4;
                                        }
                                    }
                                    int[] iArrTrimStateSet = StateSet.trimStateSet(iArr, i2);
                                    int i5 = this.a;
                                    if (i5 == 0 || iArrTrimStateSet.length == 0) {
                                        this.b = rocVar;
                                    }
                                    Object obj = this.d;
                                    if (i5 >= ((int[][]) obj).length) {
                                        int i6 = i5 + 10;
                                        int[][] iArr2 = new int[i6][];
                                        System.arraycopy(obj, 0, iArr2, 0, i5);
                                        this.d = iArr2;
                                        roc[] rocVarArr = new roc[i6];
                                        System.arraycopy(this.c, 0, rocVarArr, 0, i5);
                                        this.c = rocVarArr;
                                    }
                                    Object obj2 = this.d;
                                    int i7 = this.a;
                                    ((int[][]) obj2)[i7] = iArrTrimStateSet;
                                    ((roc[]) this.c)[i7] = rocVar;
                                    this.a = i7 + 1;
                                }
                            }
                        }
                        if (xml != null) {
                            xml.close();
                            return;
                        }
                        return;
                    }
                } while (next != 1);
                throw new XmlPullParserException(oUZhwRhE.EVFJXySG);
            } finally {
            }
        } catch (Resources.NotFoundException | IOException | XmlPullParserException unused) {
            d();
        }
    }

    public tfm(byte[] bArr) {
        this.c = Optional.empty();
        this.d = Optional.empty();
    }
}
