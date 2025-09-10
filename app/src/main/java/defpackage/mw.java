package defpackage;

import android.util.Property;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class mw extends Property {
    public mw(Class cls) {
        super(cls, "level");
    }

    @Override // android.util.Property
    public final /* bridge */ /* synthetic */ Object get(Object obj) {
        return Integer.valueOf(((mx) obj).getLevel());
    }

    @Override // android.util.Property
    public final /* bridge */ /* synthetic */ void set(Object obj, Object obj2) {
        mx mxVar = (mx) obj;
        mxVar.setLevel(((Integer) obj2).intValue());
        mxVar.invalidateSelf();
    }
}
