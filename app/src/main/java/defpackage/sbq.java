package defpackage;

import java.io.IOException;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.lang.reflect.Field;
import java.util.Collection;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class sbq extends sci implements sea {
    private static final long serialVersionUID = 0;

    public sbq(sbv sbvVar, int i) {
        super(sbvVar, i);
    }

    private void readObject(ObjectInputStream objectInputStream) throws IllegalAccessException, ClassNotFoundException, IOException, IllegalArgumentException {
        objectInputStream.defaultReadObject();
        int i = objectInputStream.readInt();
        if (i < 0) {
            throw new InvalidObjectException(a.bv(i, "Invalid key count "));
        }
        sbr sbrVar = new sbr();
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            Object object = objectInputStream.readObject();
            object.getClass();
            int i4 = objectInputStream.readInt();
            if (i4 <= 0) {
                throw new InvalidObjectException(a.bv(i4, "Invalid value count "));
            }
            int i5 = sbp.d;
            sbk sbkVar = new sbk();
            for (int i6 = 0; i6 < i4; i6++) {
                Object object2 = objectInputStream.readObject();
                object2.getClass();
                sbkVar.h(object2);
            }
            sbrVar.f(object, sbkVar.g());
            i2 += i4;
        }
        try {
            sch.a.b(this, sbrVar.b());
            try {
                ((Field) sch.b.a).set(this, Integer.valueOf(i2));
            } catch (IllegalAccessException e) {
                throw new AssertionError(e);
            }
        } catch (IllegalArgumentException e2) {
            throw ((InvalidObjectException) new InvalidObjectException(e2.getMessage()).initCause(e2));
        }
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        sla.h(this, objectOutputStream);
    }

    @Override // defpackage.sci, defpackage.sea
    public final /* bridge */ /* synthetic */ Collection b(Object obj) {
        throw null;
    }
}
