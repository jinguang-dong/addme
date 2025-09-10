package defpackage;

import android.util.Property;
import android.view.View;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class dha extends Property {
    public dha(Class cls) {
        super(cls, "translationAlpha");
    }

    @Override // android.util.Property
    public final /* synthetic */ Object get(Object obj) {
        int i = dhc.b;
        return Float.valueOf(((View) obj).getTransitionAlpha());
    }

    @Override // android.util.Property
    public final /* synthetic */ void set(Object obj, Object obj2) {
        float fFloatValue = ((Float) obj2).floatValue();
        int i = dhc.b;
        ((View) obj).setTransitionAlpha(fFloatValue);
    }
}
