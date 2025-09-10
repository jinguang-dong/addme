package defpackage;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.util.EnumMap;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class sbh extends sbt {
    private final transient EnumMap a;

    public sbh(EnumMap enumMap) {
        this.a = enumMap;
        a.I(!enumMap.isEmpty());
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Use EnumSerializedForm");
    }

    @Override // defpackage.sbt
    public final sgj a() {
        return new sdt(this.a.entrySet().iterator());
    }

    @Override // defpackage.sbv, java.util.Map
    public final boolean containsKey(Object obj) {
        return this.a.containsKey(obj);
    }

    @Override // defpackage.sbv, java.util.Map
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof sbh) {
            obj = ((sbh) obj).a;
        }
        return this.a.equals(obj);
    }

    @Override // defpackage.sbv
    public final sgj fE() {
        return ujp.aJ(this.a.keySet().iterator());
    }

    @Override // defpackage.sbv
    public final boolean fF() {
        return false;
    }

    @Override // defpackage.sbv, java.util.Map
    public final Object get(Object obj) {
        return this.a.get(obj);
    }

    @Override // java.util.Map
    public final int size() {
        return this.a.size();
    }

    @Override // defpackage.sbt, defpackage.sbv
    public Object writeReplace() {
        return new sbg(this.a);
    }
}
