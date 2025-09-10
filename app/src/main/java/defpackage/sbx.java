package defpackage;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes2.dex */
abstract class sbx extends scn {
    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Use EntrySetSerializedForm");
    }

    public abstract sbv a();

    @Override // defpackage.sbe, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            Object obj2 = a().get(entry.getKey());
            if (obj2 != null && obj2.equals(entry.getValue())) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.sbe
    public final boolean fA() {
        return a().fF();
    }

    @Override // defpackage.scn, java.util.Collection, java.util.Set
    public final int hashCode() {
        return a().hashCode();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return a().size();
    }

    @Override // defpackage.scn
    public final boolean w() {
        return false;
    }

    @Override // defpackage.scn, defpackage.sbe
    public Object writeReplace() {
        return new sbw(a());
    }
}
