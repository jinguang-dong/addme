package defpackage;

import java.util.AbstractCollection;
import java.util.Collection;

/* compiled from: PG */
/* loaded from: classes2.dex */
public abstract class ufo extends AbstractCollection implements Collection, uke {
    protected ufo() {
    }

    public abstract int a();

    @Override // java.util.AbstractCollection, java.util.Collection
    public final /* bridge */ int size() {
        return a();
    }
}
