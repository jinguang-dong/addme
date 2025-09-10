package defpackage;

import com.google.android.apps.camera.rectiface.Iqz.mPfBwqXsnpXI;
import java.io.Externalizable;
import java.io.IOException;
import java.io.InvalidObjectException;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class ugv implements Externalizable {
    private static final long serialVersionUID = 0;
    private Map a;

    public ugv(Map map) {
        this.a = map;
    }

    private final Object readResolve() {
        return this.a;
    }

    @Override // java.io.Externalizable
    public final void writeExternal(ObjectOutput objectOutput) throws IOException {
        objectOutput.getClass();
        objectOutput.writeByte(0);
        objectOutput.writeInt(this.a.size());
        for (Map.Entry entry : this.a.entrySet()) {
            objectOutput.writeObject(entry.getKey());
            objectOutput.writeObject(entry.getValue());
        }
    }

    public ugv() {
        this(ufx.a);
    }

    @Override // java.io.Externalizable
    public final void readExternal(ObjectInput objectInput) throws InvalidObjectException {
        objectInput.getClass();
        byte b = objectInput.readByte();
        if (b == 0) {
            int i = objectInput.readInt();
            if (i >= 0) {
                ugq ugqVar = new ugq(i);
                for (int i2 = 0; i2 < i; i2++) {
                    ugqVar.put(objectInput.readObject(), objectInput.readObject());
                }
                this.a = ugqVar.e();
                return;
            }
            throw new InvalidObjectException(a.bE(i, "Illegal size value: ", mPfBwqXsnpXI.KeumEED));
        }
        throw new InvalidObjectException(a.bv(b, "Unsupported flags value: "));
    }
}
