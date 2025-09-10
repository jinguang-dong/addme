package j$.time.chrono;

import j$.time.LocalTime;
import j$.time.ZoneId;
import j$.time.ZoneOffset;
import j$.util.concurrent.ConcurrentHashMap;
import java.io.Externalizable;
import java.io.IOException;
import java.io.InvalidClassException;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.io.StreamCorruptedException;

/* loaded from: classes3.dex */
public final class E implements Externalizable {
    private static final long serialVersionUID = -6103370247208168577L;
    public byte a;
    public Object b;

    public E() {
    }

    private Object readResolve() {
        return this.b;
    }

    @Override // java.io.Externalizable
    public final void readExternal(ObjectInput objectInput) throws IOException {
        Object objS;
        byte b = objectInput.readByte();
        this.a = b;
        switch (b) {
            case 1:
                ConcurrentHashMap concurrentHashMap = AbstractC0017a.a;
                objS = j$.desugar.sun.nio.fs.g.S(objectInput.readUTF());
                break;
            case 2:
                objS = ((InterfaceC0018b) objectInput.readObject()).F((LocalTime) objectInput.readObject());
                break;
            case 3:
                objS = ((ChronoLocalDateTime) objectInput.readObject()).m((ZoneOffset) objectInput.readObject()).A((ZoneId) objectInput.readObject());
                break;
            case 4:
                j$.time.h hVar = x.d;
                int i = objectInput.readInt();
                byte b2 = objectInput.readByte();
                byte b3 = objectInput.readByte();
                v.c.getClass();
                objS = new x(j$.time.h.Z(i, b2, b3));
                break;
            case 5:
                y yVar = y.d;
                objS = y.i(objectInput.readByte());
                break;
            case 6:
                o oVar = (o) objectInput.readObject();
                int i2 = objectInput.readInt();
                byte b4 = objectInput.readByte();
                byte b5 = objectInput.readByte();
                oVar.getClass();
                objS = new q(oVar, i2, b4, b5);
                break;
            case 7:
                int i3 = objectInput.readInt();
                byte b6 = objectInput.readByte();
                byte b7 = objectInput.readByte();
                A.c.getClass();
                objS = new C(j$.time.h.Z(i3 + 1911, b6, b7));
                break;
            case 8:
                int i4 = objectInput.readInt();
                byte b8 = objectInput.readByte();
                byte b9 = objectInput.readByte();
                G.c.getClass();
                objS = new I(j$.time.h.Z(i4 - 543, b8, b9));
                break;
            case 9:
                int i5 = C0023g.e;
                objS = new C0023g(j$.desugar.sun.nio.fs.g.S(objectInput.readUTF()), objectInput.readInt(), objectInput.readInt(), objectInput.readInt());
                break;
            default:
                throw new StreamCorruptedException("Unknown serialized type");
        }
        this.b = objS;
    }

    @Override // java.io.Externalizable
    public final void writeExternal(ObjectOutput objectOutput) throws IOException {
        byte b = this.a;
        Object obj = this.b;
        objectOutput.writeByte(b);
        switch (b) {
            case 1:
                objectOutput.writeUTF(((AbstractC0017a) obj).f());
                return;
            case 2:
                C0022f c0022f = (C0022f) obj;
                objectOutput.writeObject(c0022f.a);
                objectOutput.writeObject(c0022f.b);
                return;
            case 3:
                k kVar = (k) obj;
                objectOutput.writeObject(kVar.a);
                objectOutput.writeObject(kVar.b);
                objectOutput.writeObject(kVar.c);
                return;
            case 4:
                x xVar = (x) obj;
                xVar.getClass();
                objectOutput.writeInt(j$.time.temporal.m.a(xVar, j$.time.temporal.a.YEAR));
                objectOutput.writeByte(j$.time.temporal.m.a(xVar, j$.time.temporal.a.MONTH_OF_YEAR));
                objectOutput.writeByte(j$.time.temporal.m.a(xVar, j$.time.temporal.a.DAY_OF_MONTH));
                return;
            case 5:
                objectOutput.writeByte(((y) obj).a);
                return;
            case 6:
                q qVar = (q) obj;
                objectOutput.writeObject(qVar.a);
                objectOutput.writeInt(j$.time.temporal.m.a(qVar, j$.time.temporal.a.YEAR));
                objectOutput.writeByte(j$.time.temporal.m.a(qVar, j$.time.temporal.a.MONTH_OF_YEAR));
                objectOutput.writeByte(j$.time.temporal.m.a(qVar, j$.time.temporal.a.DAY_OF_MONTH));
                return;
            case 7:
                C c = (C) obj;
                c.getClass();
                objectOutput.writeInt(j$.time.temporal.m.a(c, j$.time.temporal.a.YEAR));
                objectOutput.writeByte(j$.time.temporal.m.a(c, j$.time.temporal.a.MONTH_OF_YEAR));
                objectOutput.writeByte(j$.time.temporal.m.a(c, j$.time.temporal.a.DAY_OF_MONTH));
                return;
            case 8:
                I i = (I) obj;
                i.getClass();
                objectOutput.writeInt(j$.time.temporal.m.a(i, j$.time.temporal.a.YEAR));
                objectOutput.writeByte(j$.time.temporal.m.a(i, j$.time.temporal.a.MONTH_OF_YEAR));
                objectOutput.writeByte(j$.time.temporal.m.a(i, j$.time.temporal.a.DAY_OF_MONTH));
                return;
            case 9:
                C0023g c0023g = (C0023g) obj;
                objectOutput.writeUTF(c0023g.a.f());
                objectOutput.writeInt(c0023g.b);
                objectOutput.writeInt(c0023g.c);
                objectOutput.writeInt(c0023g.d);
                return;
            default:
                throw new InvalidClassException("Unknown serialized type");
        }
    }

    public E(byte b, Object obj) {
        this.a = b;
        this.b = obj;
    }
}
