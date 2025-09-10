package j$.time;

import j$.util.Objects;
import java.io.Externalizable;
import java.io.IOException;
import java.io.InvalidClassException;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.io.Serializable;
import java.io.StreamCorruptedException;
import org.chromium.net.UrlRequest;

/* loaded from: classes3.dex */
public final class s implements Externalizable {
    private static final long serialVersionUID = -7683839454370182990L;
    public byte a;
    public Object b;

    public s() {
    }

    public static Serializable a(byte b, ObjectInput objectInput) throws IOException {
        switch (b) {
            case 1:
                Duration duration = Duration.ZERO;
                return Duration.ofSeconds(objectInput.readLong(), objectInput.readInt());
            case 2:
                Instant instant = Instant.EPOCH;
                return Instant.ofEpochSecond(objectInput.readLong(), objectInput.readInt());
            case 3:
                h hVar = h.d;
                return h.Z(objectInput.readInt(), objectInput.readByte(), objectInput.readByte());
            case 4:
                return LocalTime.Y(objectInput);
            case 5:
                LocalDateTime localDateTime = LocalDateTime.c;
                h hVar2 = h.d;
                return LocalDateTime.R(h.Z(objectInput.readInt(), objectInput.readByte(), objectInput.readByte()), LocalTime.Y(objectInput));
            case 6:
                LocalDateTime localDateTime2 = LocalDateTime.c;
                h hVar3 = h.d;
                LocalDateTime localDateTimeR = LocalDateTime.R(h.Z(objectInput.readInt(), objectInput.readByte(), objectInput.readByte()), LocalTime.Y(objectInput));
                ZoneOffset zoneOffsetZ = ZoneOffset.Z(objectInput);
                ZoneId zoneId = (ZoneId) a(objectInput.readByte(), objectInput);
                Objects.a(zoneId, "zone");
                if (!(zoneId instanceof ZoneOffset) || zoneOffsetZ.equals(zoneId)) {
                    return new ZonedDateTime(localDateTimeR, zoneId, zoneOffsetZ);
                }
                throw new IllegalArgumentException("ZoneId must match ZoneOffset");
            case 7:
                int i = x.d;
                return ZoneId.Q(objectInput.readUTF(), false);
            case 8:
                return ZoneOffset.Z(objectInput);
            case 9:
                int i2 = q.c;
                return new q(LocalTime.Y(objectInput), ZoneOffset.Z(objectInput));
            case 10:
                int i3 = o.c;
                h hVar4 = h.d;
                return new o(LocalDateTime.R(h.Z(objectInput.readInt(), objectInput.readByte(), objectInput.readByte()), LocalTime.Y(objectInput)), ZoneOffset.Z(objectInput));
            case 11:
                int i4 = u.b;
                return u.O(objectInput.readInt());
            case 12:
                int i5 = w.c;
                int i6 = objectInput.readInt();
                byte b2 = objectInput.readByte();
                j$.time.temporal.a.YEAR.B(i6);
                j$.time.temporal.a.MONTH_OF_YEAR.B(b2);
                return new w(i6, b2);
            case 13:
                int i7 = m.c;
                byte b3 = objectInput.readByte();
                byte b4 = objectInput.readByte();
                k kVarR = k.R(b3);
                Objects.a(kVarR, "month");
                j$.time.temporal.a.DAY_OF_MONTH.B(b4);
                if (b4 <= kVarR.Q()) {
                    return new m(kVarR.getValue(), b4);
                }
                throw new b("Illegal value for DayOfMonth field, value " + ((int) b4) + " is not valid for month " + kVarR.name());
            case UrlRequest.Status.READING_RESPONSE /* 14 */:
                r rVar = r.d;
                int i8 = objectInput.readInt();
                int i9 = objectInput.readInt();
                int i10 = objectInput.readInt();
                return ((i8 | i9) | i10) == 0 ? r.d : new r(i8, i9, i10);
            default:
                throw new StreamCorruptedException("Unknown serialized type");
        }
    }

    private Object readResolve() {
        return this.b;
    }

    @Override // java.io.Externalizable
    public final void readExternal(ObjectInput objectInput) throws IOException {
        byte b = objectInput.readByte();
        this.a = b;
        this.b = a(b, objectInput);
    }

    @Override // java.io.Externalizable
    public final void writeExternal(ObjectOutput objectOutput) throws IOException {
        byte b = this.a;
        Object obj = this.b;
        objectOutput.writeByte(b);
        switch (b) {
            case 1:
                Duration duration = (Duration) obj;
                objectOutput.writeLong(duration.a);
                objectOutput.writeInt(duration.b);
                return;
            case 2:
                Instant instant = (Instant) obj;
                objectOutput.writeLong(instant.a);
                objectOutput.writeInt(instant.b);
                return;
            case 3:
                h hVar = (h) obj;
                objectOutput.writeInt(hVar.a);
                objectOutput.writeByte(hVar.b);
                objectOutput.writeByte(hVar.c);
                return;
            case 4:
                ((LocalTime) obj).d0(objectOutput);
                return;
            case 5:
                LocalDateTime localDateTime = (LocalDateTime) obj;
                h hVar2 = localDateTime.a;
                objectOutput.writeInt(hVar2.a);
                objectOutput.writeByte(hVar2.b);
                objectOutput.writeByte(hVar2.c);
                localDateTime.b.d0(objectOutput);
                return;
            case 6:
                ZonedDateTime zonedDateTime = (ZonedDateTime) obj;
                LocalDateTime localDateTime2 = zonedDateTime.a;
                h hVar3 = localDateTime2.a;
                objectOutput.writeInt(hVar3.a);
                objectOutput.writeByte(hVar3.b);
                objectOutput.writeByte(hVar3.c);
                localDateTime2.b.d0(objectOutput);
                zonedDateTime.b.a0(objectOutput);
                zonedDateTime.c.T(objectOutput);
                return;
            case 7:
                objectOutput.writeUTF(((x) obj).b);
                return;
            case 8:
                ((ZoneOffset) obj).a0(objectOutput);
                return;
            case 9:
                q qVar = (q) obj;
                qVar.a.d0(objectOutput);
                qVar.b.a0(objectOutput);
                return;
            case 10:
                o oVar = (o) obj;
                LocalDateTime localDateTime3 = oVar.a;
                h hVar4 = localDateTime3.a;
                objectOutput.writeInt(hVar4.a);
                objectOutput.writeByte(hVar4.b);
                objectOutput.writeByte(hVar4.c);
                localDateTime3.b.d0(objectOutput);
                oVar.b.a0(objectOutput);
                return;
            case 11:
                objectOutput.writeInt(((u) obj).a);
                return;
            case 12:
                w wVar = (w) obj;
                objectOutput.writeInt(wVar.a);
                objectOutput.writeByte(wVar.b);
                return;
            case 13:
                m mVar = (m) obj;
                objectOutput.writeByte(mVar.a);
                objectOutput.writeByte(mVar.b);
                return;
            case UrlRequest.Status.READING_RESPONSE /* 14 */:
                r rVar = (r) obj;
                objectOutput.writeInt(rVar.a);
                objectOutput.writeInt(rVar.b);
                objectOutput.writeInt(rVar.c);
                return;
            default:
                throw new InvalidClassException("Unknown serialized type");
        }
    }

    public s(byte b, Object obj) {
        this.a = b;
        this.b = obj;
    }
}
