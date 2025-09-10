package defpackage;

import java.util.AbstractMap;

/* compiled from: PG */
/* loaded from: classes.dex */
final class sey extends sbp {
    final /* synthetic */ sez a;

    public sey(sez sezVar) {
        this.a = sezVar;
    }

    @Override // defpackage.sbe
    public final boolean fA() {
        return true;
    }

    @Override // java.util.List
    public final /* bridge */ /* synthetic */ Object get(int i) {
        sez sezVar = this.a;
        rnt.S(i, sezVar.c);
        Object[] objArr = sezVar.a;
        int i2 = i + i;
        int i3 = sezVar.b;
        Object obj = objArr[i2 + i3];
        obj.getClass();
        Object obj2 = objArr[i2 + (i3 ^ 1)];
        obj2.getClass();
        return new AbstractMap.SimpleImmutableEntry(obj, obj2);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.a.c;
    }

    @Override // defpackage.sbp, defpackage.sbe
    public Object writeReplace() {
        return super.writeReplace();
    }
}
