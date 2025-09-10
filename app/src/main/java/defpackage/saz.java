package defpackage;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;

/* compiled from: PG */
/* loaded from: classes2.dex */
abstract class saz extends sbp {
    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Use SerializedForm");
    }

    public abstract sbe a();

    @Override // defpackage.sbp, defpackage.sbe, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return a().contains(obj);
    }

    @Override // defpackage.sbe
    public final boolean fA() {
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean isEmpty() {
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return a().size();
    }

    @Override // defpackage.sbp, defpackage.sbe
    public Object writeReplace() {
        return new say(a());
    }
}
