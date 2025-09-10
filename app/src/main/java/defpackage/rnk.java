package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.Typeface;
import android.util.TypedValue;
import android.util.Xml;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParserException;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class rnk {
    public final ColorStateList a;
    public final String b;
    public final int c;
    public final int d;
    public final float e;
    public final float f;
    public final float g;
    public final float h;
    public final ColorStateList i;
    public final float j;
    public Typeface k;
    private final int l;
    private boolean m = false;
    private boolean n = false;

    public rnk(Context context, int i) throws Resources.NotFoundException {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(i, fa.w);
        this.j = typedArrayObtainStyledAttributes.getDimension(0, 0.0f);
        this.i = rnt.d(context, typedArrayObtainStyledAttributes, 3);
        rnt.d(context, typedArrayObtainStyledAttributes, 4);
        rnt.d(context, typedArrayObtainStyledAttributes, 5);
        this.c = typedArrayObtainStyledAttributes.getInt(2, 0);
        this.d = typedArrayObtainStyledAttributes.getInt(1, 1);
        int iC = rnt.c(typedArrayObtainStyledAttributes, 15, 10);
        this.l = typedArrayObtainStyledAttributes.getResourceId(iC, 0);
        this.b = typedArrayObtainStyledAttributes.getString(iC);
        typedArrayObtainStyledAttributes.getBoolean(17, false);
        this.a = rnt.d(context, typedArrayObtainStyledAttributes, 6);
        this.e = typedArrayObtainStyledAttributes.getFloat(7, 0.0f);
        this.f = typedArrayObtainStyledAttributes.getFloat(8, 0.0f);
        this.g = typedArrayObtainStyledAttributes.getFloat(9, 0.0f);
        typedArrayObtainStyledAttributes.recycle();
        TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(i, rni.a);
        typedArrayObtainStyledAttributes2.hasValue(0);
        this.h = typedArrayObtainStyledAttributes2.getFloat(0, 0.0f);
        typedArrayObtainStyledAttributes2.getString(rnt.c(typedArrayObtainStyledAttributes2, 3, 1));
        typedArrayObtainStyledAttributes2.recycle();
    }

    private final void d() {
        Typeface typeface;
        String str;
        if (this.k == null && (str = this.b) != null) {
            this.k = Typeface.create(str, this.c);
        }
        if (this.k == null) {
            int i = this.d;
            if (i == 1) {
                typeface = Typeface.SANS_SERIF;
            } else if (i == 2) {
                typeface = Typeface.SERIF;
            } else {
                if (i != 3) {
                    this.k = Typeface.DEFAULT;
                    this.k = Typeface.create(this.k, this.c);
                }
                typeface = Typeface.MONOSPACE;
            }
            this.k = typeface;
            this.k = Typeface.create(this.k, this.c);
        }
    }

    public final Typeface a() {
        d();
        return this.k;
    }

    public final void c(Context context, eze ezeVar) throws XmlPullParserException, Resources.NotFoundException, IOException {
        Context context2;
        Typeface typefaceB;
        String string;
        Typeface typefaceCreate;
        int i = 0;
        if (this.m) {
            context2 = context;
        } else {
            int i2 = this.l;
            if (i2 == 0) {
                context2 = context;
            } else {
                ThreadLocal threadLocal = cme.a;
                Typeface typefaceCreate2 = null;
                if (context.isRestricted()) {
                    context2 = context;
                    typefaceB = null;
                } else {
                    context2 = context;
                    typefaceB = cme.b(context2, i2, new TypedValue(), 0, null, false, true);
                }
                if (typefaceB != null) {
                    this.k = typefaceB;
                } else {
                    if (!this.n) {
                        this.n = true;
                        Resources resources = context2.getResources();
                        if (i2 == 0 || !resources.getResourceTypeName(i2).equals("font")) {
                            string = null;
                            if (string != null && (typefaceCreate = Typeface.create(string, 0)) != Typeface.DEFAULT) {
                                typefaceCreate2 = Typeface.create(typefaceCreate, this.c);
                            }
                        } else {
                            try {
                                XmlResourceParser xml = resources.getXml(i2);
                                while (xml.getEventType() != 1) {
                                    if (xml.getEventType() == 2 && xml.getName().equals("font-family")) {
                                        TypedArray typedArrayObtainAttributes = resources.obtainAttributes(Xml.asAttributeSet(xml), cli.b);
                                        string = typedArrayObtainAttributes.getString(7);
                                        typedArrayObtainAttributes.recycle();
                                        break;
                                    }
                                    xml.next();
                                }
                            } catch (Throwable unused) {
                            }
                            string = null;
                            if (string != null) {
                                typefaceCreate2 = Typeface.create(typefaceCreate, this.c);
                            }
                        }
                    }
                    if (typefaceCreate2 != null) {
                        this.k = typefaceCreate2;
                    }
                }
                this.m = true;
            }
            d();
        }
        int i3 = this.l;
        if (i3 == 0) {
            this.m = true;
        } else {
            i = i3;
        }
        if (this.m) {
            ezeVar.e(this.k);
            return;
        }
        try {
            cme.a(context2, i, new rnj(this, ezeVar));
        } catch (Resources.NotFoundException unused2) {
            this.m = true;
            ezeVar.f();
        } catch (Exception unused3) {
            this.m = true;
            ezeVar.f();
        }
    }
}
