package defpackage;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PG */
/* loaded from: classes2.dex */
final class sdg implements Iterator {
    public static final sdg a;
    private static final /* synthetic */ sdg[] b;

    static {
        sdg sdgVar = new sdg();
        a = sdgVar;
        b = new sdg[]{sdgVar};
    }

    private sdg() {
    }

    public static sdg[] values() {
        return (sdg[]) b.clone();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return false;
    }

    @Override // java.util.Iterator
    public final Object next() {
        throw new NoSuchElementException();
    }

    @Override // java.util.Iterator
    public final void remove() {
        ujp.bp(false);
    }
}
