package defpackage;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
final class rxh extends rxk {
    private static final long serialVersionUID = 0;

    public rxh(Map map, rxk rxkVar) {
        super(map, rxkVar);
    }

    private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        objectInputStream.defaultReadObject();
        Object object = objectInputStream.readObject();
        object.getClass();
        this.b = (rxk) object;
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeObject(this.b);
    }

    @Override // defpackage.rxk
    public final Object b(Object obj) {
        return this.b.c(obj);
    }

    @Override // defpackage.rxk
    public final Object c(Object obj) {
        return this.b.b(obj);
    }

    Object readResolve() {
        return this.b.d();
    }
}
