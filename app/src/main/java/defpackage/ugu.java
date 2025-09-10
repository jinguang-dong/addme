package defpackage;

import java.io.Externalizable;
import java.io.IOException;
import java.io.InvalidObjectException;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.util.Collection;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ugu implements Externalizable {
    private static final long serialVersionUID = 0;
    private Collection a;
    private final int b;

    public ugu(Collection collection, int i) {
        this.a = collection;
        this.b = i;
    }

    private final Object readResolve() {
        return this.a;
    }

    @Override // java.io.Externalizable
    public final void readExternal(ObjectInput objectInput) throws InvalidObjectException {
        Collection collectionBi;
        objectInput.getClass();
        byte b = objectInput.readByte();
        int i = b & 1;
        if ((b & (-2)) != 0) {
            throw new InvalidObjectException(a.bE(b, "Unsupported flags value: ", "."));
        }
        int i2 = objectInput.readInt();
        if (i2 < 0) {
            throw new InvalidObjectException(a.bE(i2, "Illegal size value: ", "."));
        }
        int i3 = 0;
        if (i != 0) {
            ugw ugwVar = new ugw(new ugq(i2));
            while (i3 < i2) {
                ugwVar.add(objectInput.readObject());
                i3++;
            }
            collectionBi = ske.aU(ugwVar);
        } else {
            ugl uglVar = new ugl(i2);
            while (i3 < i2) {
                uglVar.add(objectInput.readObject());
                i3++;
            }
            collectionBi = ske.bi(uglVar);
        }
        this.a = collectionBi;
    }

    @Override // java.io.Externalizable
    public final void writeExternal(ObjectOutput objectOutput) throws IOException {
        objectOutput.getClass();
        objectOutput.writeByte(this.b);
        objectOutput.writeInt(this.a.size());
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            objectOutput.writeObject(it.next());
        }
    }

    public ugu() {
        this(ufw.a, 0);
    }
}
