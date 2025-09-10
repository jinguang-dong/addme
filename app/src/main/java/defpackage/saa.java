package defpackage;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.EnumMap;
import java.util.HashMap;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class saa extends rxk {
    private static final long serialVersionUID = 0;
    transient Class c;

    public saa(Class cls) {
        super(new EnumMap(cls), new HashMap());
        this.c = cls;
    }

    private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        objectInputStream.defaultReadObject();
        Object object = objectInputStream.readObject();
        object.getClass();
        this.c = (Class) object;
        i(new EnumMap(this.c), new HashMap());
        sla.e(this, objectInputStream, objectInputStream.readInt());
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeObject(this.c);
        sla.g(this, objectOutputStream);
    }

    @Override // defpackage.rxk
    public final /* synthetic */ Object b(Object obj) {
        Enum r1 = (Enum) obj;
        r1.getClass();
        return r1;
    }

    @Override // defpackage.rxk, defpackage.saf, java.util.Map, defpackage.ryq
    public final /* synthetic */ Object put(Object obj, Object obj2) {
        return super.put((Enum) obj, obj2);
    }
}
