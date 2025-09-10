package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.text.TextUtils;
import android.util.Xml;
import android.widget.Button;
import com.google.android.material.button.MaterialButton;
import java.text.AttributedCharacterIterator;
import java.util.ArrayList;
import org.xmlpull.v1.XmlPullParser;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class eof {
    public int a;
    public int b;
    public Object c;
    public Object d;

    public eof() {
    }

    public static final boolean b() {
        return !TextUtils.isEmpty(null);
    }

    public final void a() {
        ((Button) this.c).setText((CharSequence) null);
        ((Button) this.c).setOnClickListener(null);
        Object obj = this.c;
        MaterialButton materialButton = obj instanceof MaterialButton ? (MaterialButton) obj : null;
        if (materialButton == null || !eoq.a(materialButton.getContext())) {
            ((Button) this.c).setTextColor(this.a);
        } else {
            int i = this.b;
            if (i != 0) {
                materialButton.setBackgroundColor(i);
            }
            Object obj2 = this.d;
            if (obj2 != null && materialButton.r()) {
                rjn rjnVar = materialButton.j;
                if (rjnVar.m != obj2) {
                    rjnVar.m = (ColorStateList) obj2;
                    rnx rnxVarA = rjnVar.a();
                    rnx rnxVarB = rjnVar.b();
                    if (rnxVarA != null) {
                        rnxVarA.q(rjnVar.j, rjnVar.m);
                        if (rnxVarB != null) {
                            rnxVarB.w(rjnVar.j);
                        }
                    }
                }
            }
        }
        if (b()) {
            ((Button) this.c).setVisibility(0);
        } else {
            ((Button) this.c).setVisibility(8);
        }
    }

    public final void c(AttributedCharacterIterator.Attribute attribute, Object obj, int i, int i2) {
        this.c = attribute;
        this.d = obj;
        this.a = i;
        this.b = i2;
    }

    public eof(Object obj, int i, int i2) {
        c(h.a, obj, i, i2);
    }

    public eof(AttributedCharacterIterator.Attribute attribute, Object obj, int i, int i2) {
        c(attribute, obj, i, i2);
    }

    public eof(Context context, XmlPullParser xmlPullParser) throws Resources.NotFoundException {
        this.c = new ArrayList();
        this.b = -1;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlPullParser), cky.h);
        int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
        for (int i = 0; i < indexCount; i++) {
            int index = typedArrayObtainStyledAttributes.getIndex(i);
            if (index == 0) {
                this.a = typedArrayObtainStyledAttributes.getResourceId(0, this.a);
            } else if (index == 1) {
                this.b = typedArrayObtainStyledAttributes.getResourceId(1, this.b);
                String resourceTypeName = context.getResources().getResourceTypeName(this.b);
                context.getResources().getResourceName(this.b);
                if ("layout".equals(resourceTypeName)) {
                    cku ckuVar = new cku();
                    this.d = ckuVar;
                    ckuVar.h(context, this.b);
                }
            }
        }
        typedArrayObtainStyledAttributes.recycle();
    }
}
