package defpackage;

import android.graphics.Rect;
import android.util.Property;
import android.view.View;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class dhb extends Property {
    public dhb(Class cls) {
        super(cls, "clipBounds");
    }

    @Override // android.util.Property
    public final /* synthetic */ Object get(Object obj) {
        return ((View) obj).getClipBounds();
    }

    @Override // android.util.Property
    public final /* synthetic */ void set(Object obj, Object obj2) {
        ((View) obj).setClipBounds((Rect) obj2);
    }
}
