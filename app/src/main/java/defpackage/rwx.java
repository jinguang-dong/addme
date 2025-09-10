package defpackage;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.Serializable;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class rwx implements Serializable, rww {
    private static final long serialVersionUID = 0;
    final rww a;
    volatile transient boolean b;
    transient Object c;
    private transient ujf d = new ujf();

    public rwx(rww rwwVar) {
        rwwVar.getClass();
        this.a = rwwVar;
    }

    private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        objectInputStream.defaultReadObject();
        this.d = new ujf();
    }

    @Override // defpackage.rww
    public final Object fr() {
        if (!this.b) {
            synchronized (this.d) {
                if (!this.b) {
                    Object objFr = this.a.fr();
                    this.c = objFr;
                    this.b = true;
                    return objFr;
                }
            }
        }
        return this.c;
    }

    public final String toString() {
        Object obj;
        if (this.b) {
            obj = "<supplier that returned " + String.valueOf(this.c) + ">";
        } else {
            obj = this.a;
        }
        return a.bx(obj, "Suppliers.memoize(", ")");
    }
}
