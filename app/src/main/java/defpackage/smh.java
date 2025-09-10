package defpackage;

import java.io.ByteArrayOutputStream;
import java.io.DataOutput;
import java.io.DataOutputStream;
import java.io.IOException;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class smh implements smd {
    final DataOutput a;

    public smh(ByteArrayOutputStream byteArrayOutputStream) {
        this.a = new DataOutputStream(byteArrayOutputStream);
    }

    @Override // java.io.DataOutput
    public final void write(int i) throws IOException {
        try {
            this.a.write(i);
        } catch (IOException e) {
            throw new AssertionError(e);
        }
    }

    @Override // java.io.DataOutput
    public final void writeBoolean(boolean z) throws IOException {
        try {
            this.a.writeBoolean(z);
        } catch (IOException e) {
            throw new AssertionError(e);
        }
    }

    @Override // java.io.DataOutput
    public final void writeByte(int i) throws IOException {
        try {
            this.a.writeByte(i);
        } catch (IOException e) {
            throw new AssertionError(e);
        }
    }

    @Override // java.io.DataOutput
    public final void writeBytes(String str) throws IOException {
        try {
            this.a.writeBytes(str);
        } catch (IOException e) {
            throw new AssertionError(e);
        }
    }

    @Override // java.io.DataOutput
    public final void writeChar(int i) throws IOException {
        try {
            this.a.writeChar(i);
        } catch (IOException e) {
            throw new AssertionError(e);
        }
    }

    @Override // java.io.DataOutput
    public final void writeChars(String str) throws IOException {
        try {
            this.a.writeChars(str);
        } catch (IOException e) {
            throw new AssertionError(e);
        }
    }

    @Override // java.io.DataOutput
    public final void writeDouble(double d) throws IOException {
        try {
            this.a.writeDouble(d);
        } catch (IOException e) {
            throw new AssertionError(e);
        }
    }

    @Override // java.io.DataOutput
    public final void writeFloat(float f) throws IOException {
        try {
            this.a.writeFloat(f);
        } catch (IOException e) {
            throw new AssertionError(e);
        }
    }

    @Override // java.io.DataOutput
    public final void writeInt(int i) throws IOException {
        try {
            this.a.writeInt(i);
        } catch (IOException e) {
            throw new AssertionError(e);
        }
    }

    @Override // java.io.DataOutput
    public final void writeLong(long j) throws IOException {
        try {
            this.a.writeLong(j);
        } catch (IOException e) {
            throw new AssertionError(e);
        }
    }

    @Override // java.io.DataOutput
    public final void writeShort(int i) throws IOException {
        try {
            this.a.writeShort(i);
        } catch (IOException e) {
            throw new AssertionError(e);
        }
    }

    @Override // java.io.DataOutput
    public final void writeUTF(String str) throws IOException {
        try {
            this.a.writeUTF(str);
        } catch (IOException e) {
            throw new AssertionError(e);
        }
    }

    @Override // java.io.DataOutput
    public final void write(byte[] bArr) throws IOException {
        try {
            this.a.write(bArr);
        } catch (IOException e) {
            throw new AssertionError(e);
        }
    }

    @Override // java.io.DataOutput
    public final void write(byte[] bArr, int i, int i2) throws IOException {
        try {
            this.a.write(bArr, i, i2);
        } catch (IOException e) {
            throw new AssertionError(e);
        }
    }
}
