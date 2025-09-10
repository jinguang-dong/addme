package defpackage;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.util.Collection;
import java.util.EnumSet;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class sbj extends scn {
    private final transient EnumSet a;
    private transient int b;

    public sbj(EnumSet enumSet) {
        this.a = enumSet;
    }

    public static scn a(EnumSet enumSet) {
        int size = enumSet.size();
        return size != 0 ? size != 1 ? new sbj(enumSet) : new sfm((Enum) ujp.aS(enumSet)) : sfd.a;
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Use SerializedForm");
    }

    @Override // defpackage.sbe, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return this.a.contains(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean containsAll(Collection collection) {
        if (collection instanceof sbj) {
            collection = ((sbj) collection).a;
        }
        return this.a.containsAll(collection);
    }

    @Override // defpackage.scn, java.util.Collection, java.util.Set
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof sbj) {
            obj = ((sbj) obj).a;
        }
        return this.a.equals(obj);
    }

    @Override // defpackage.sbe
    public final boolean fA() {
        return false;
    }

    @Override // defpackage.scn, defpackage.sbe, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set, java.util.NavigableSet
    /* renamed from: fz */
    public final sgj listIterator() {
        return ujp.aJ(this.a.iterator());
    }

    @Override // defpackage.scn, java.util.Collection, java.util.Set
    public final int hashCode() {
        int i = this.b;
        if (i != 0) {
            return i;
        }
        int iHashCode = this.a.hashCode();
        this.b = iHashCode;
        return iHashCode;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        return this.a.isEmpty();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.a.size();
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        return this.a.toString();
    }

    @Override // defpackage.scn
    public final boolean w() {
        return true;
    }

    @Override // defpackage.scn, defpackage.sbe
    public Object writeReplace() {
        return new sbi(this.a);
    }
}
