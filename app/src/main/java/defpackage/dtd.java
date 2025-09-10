package defpackage;

import android.util.Property;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class dtd extends Property {
    public dtd(Class cls) {
        super(cls, "level");
    }

    @Override // android.util.Property
    public final /* bridge */ /* synthetic */ Object get(Object obj) {
        return Integer.valueOf(((dte) obj).getLevel());
    }

    @Override // android.util.Property
    public final /* bridge */ /* synthetic */ void set(Object obj, Object obj2) {
        dte dteVar = (dte) obj;
        dteVar.setLevel(((Integer) obj2).intValue());
        dteVar.invalidateSelf();
    }
}
