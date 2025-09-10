package defpackage;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Collection;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class sax extends ryl {
    private static final long serialVersionUID = 0;
    transient int d;

    public sax() {
        super(new rzf(12));
        this.d = 2;
        a.I(true);
        this.d = 2;
    }

    private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        objectInputStream.defaultReadObject();
        this.d = 2;
        int i = objectInputStream.readInt();
        m(new rzf(12));
        sla.f(this, objectInputStream, i);
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        sla.h(this, objectOutputStream);
    }

    @Override // defpackage.ryl, defpackage.ryb
    public final /* bridge */ /* synthetic */ Collection a() {
        return new rzh(this.d);
    }
}
