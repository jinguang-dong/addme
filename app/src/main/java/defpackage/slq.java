package defpackage;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import org.chromium.net.UrlRequest;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class slq extends slf {
    private long b = 0;
    private long c = 0;
    private int d = 0;

    private static long j(long j) {
        long j2 = (j ^ (j >>> 33)) * (-49064778989728563L);
        long j3 = (j2 ^ (j2 >>> 33)) * (-4265267296055464877L);
        return j3 ^ (j3 >>> 33);
    }

    private static long k(long j) {
        return Long.rotateLeft(j * (-8663945395140668459L), 31) * 5545529020109919103L;
    }

    private static long l(long j) {
        return Long.rotateLeft(j * 5545529020109919103L, 33) * (-8663945395140668459L);
    }

    @Override // defpackage.slf
    protected final sli c() {
        long j = this.b;
        long j2 = this.d;
        long j3 = j ^ j2;
        long j4 = j2 ^ this.c;
        long j5 = j3 + j4;
        this.b = j5;
        long j6 = j4 + j5;
        this.c = j6;
        long j7 = j(j5);
        this.b = j7;
        long j8 = j(j6);
        long j9 = j7 + j8;
        this.b = j9;
        this.c = j8 + j9;
        byte[] bArrArray = ByteBuffer.wrap(new byte[16]).order(ByteOrder.LITTLE_ENDIAN).putLong(this.b).putLong(this.c).array();
        int i = sli.b;
        return new slg(bArrArray);
    }

    @Override // defpackage.slf
    protected final void h(ByteBuffer byteBuffer) {
        long j = byteBuffer.getLong();
        long j2 = byteBuffer.getLong();
        long jK = k(j) ^ this.b;
        this.b = jK;
        long jRotateLeft = Long.rotateLeft(jK, 27);
        long j3 = this.c;
        this.b = ((jRotateLeft + j3) * 5) + 1390208809;
        long jL = l(j2) ^ j3;
        this.c = jL;
        this.c = ((Long.rotateLeft(jL, 31) + this.b) * 5) + 944331445;
        this.d += 16;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // defpackage.slf
    protected final void i(ByteBuffer byteBuffer) {
        long j;
        long j2;
        long j3;
        long j4;
        long j5;
        long j6;
        long j7;
        this.d += byteBuffer.remaining();
        long j8 = 0;
        switch (byteBuffer.remaining()) {
            case 1:
                j = 0;
                j7 = j ^ rup.j(byteBuffer.get(0));
                this.b = k(j7) ^ this.b;
                this.c ^= l(j8);
                return;
            case 2:
                j2 = 0;
                j = j2 ^ (rup.j(byteBuffer.get(1)) << 8);
                j7 = j ^ rup.j(byteBuffer.get(0));
                this.b = k(j7) ^ this.b;
                this.c ^= l(j8);
                return;
            case 3:
                j3 = 0;
                j2 = j3 ^ (rup.j(byteBuffer.get(2)) << 16);
                j = j2 ^ (rup.j(byteBuffer.get(1)) << 8);
                j7 = j ^ rup.j(byteBuffer.get(0));
                this.b = k(j7) ^ this.b;
                this.c ^= l(j8);
                return;
            case 4:
                j4 = 0;
                j3 = j4 ^ (rup.j(byteBuffer.get(3)) << 24);
                j2 = j3 ^ (rup.j(byteBuffer.get(2)) << 16);
                j = j2 ^ (rup.j(byteBuffer.get(1)) << 8);
                j7 = j ^ rup.j(byteBuffer.get(0));
                this.b = k(j7) ^ this.b;
                this.c ^= l(j8);
                return;
            case 5:
                j5 = 0;
                j4 = j5 ^ (rup.j(byteBuffer.get(4)) << 32);
                j3 = j4 ^ (rup.j(byteBuffer.get(3)) << 24);
                j2 = j3 ^ (rup.j(byteBuffer.get(2)) << 16);
                j = j2 ^ (rup.j(byteBuffer.get(1)) << 8);
                j7 = j ^ rup.j(byteBuffer.get(0));
                this.b = k(j7) ^ this.b;
                this.c ^= l(j8);
                return;
            case 6:
                j6 = 0;
                j5 = (rup.j(byteBuffer.get(5)) << 40) ^ j6;
                j4 = j5 ^ (rup.j(byteBuffer.get(4)) << 32);
                j3 = j4 ^ (rup.j(byteBuffer.get(3)) << 24);
                j2 = j3 ^ (rup.j(byteBuffer.get(2)) << 16);
                j = j2 ^ (rup.j(byteBuffer.get(1)) << 8);
                j7 = j ^ rup.j(byteBuffer.get(0));
                this.b = k(j7) ^ this.b;
                this.c ^= l(j8);
                return;
            case 7:
                j6 = rup.j(byteBuffer.get(6)) << 48;
                j5 = (rup.j(byteBuffer.get(5)) << 40) ^ j6;
                j4 = j5 ^ (rup.j(byteBuffer.get(4)) << 32);
                j3 = j4 ^ (rup.j(byteBuffer.get(3)) << 24);
                j2 = j3 ^ (rup.j(byteBuffer.get(2)) << 16);
                j = j2 ^ (rup.j(byteBuffer.get(1)) << 8);
                j7 = j ^ rup.j(byteBuffer.get(0));
                this.b = k(j7) ^ this.b;
                this.c ^= l(j8);
                return;
            case 8:
                j7 = byteBuffer.getLong();
                this.b = k(j7) ^ this.b;
                this.c ^= l(j8);
                return;
            case 9:
                j8 ^= rup.j(byteBuffer.get(8));
                j7 = byteBuffer.getLong();
                this.b = k(j7) ^ this.b;
                this.c ^= l(j8);
                return;
            case 10:
                j8 ^= rup.j(byteBuffer.get(9)) << 8;
                j8 ^= rup.j(byteBuffer.get(8));
                j7 = byteBuffer.getLong();
                this.b = k(j7) ^ this.b;
                this.c ^= l(j8);
                return;
            case 11:
                j8 ^= rup.j(byteBuffer.get(10)) << 16;
                j8 ^= rup.j(byteBuffer.get(9)) << 8;
                j8 ^= rup.j(byteBuffer.get(8));
                j7 = byteBuffer.getLong();
                this.b = k(j7) ^ this.b;
                this.c ^= l(j8);
                return;
            case 12:
                j8 ^= rup.j(byteBuffer.get(11)) << 24;
                j8 ^= rup.j(byteBuffer.get(10)) << 16;
                j8 ^= rup.j(byteBuffer.get(9)) << 8;
                j8 ^= rup.j(byteBuffer.get(8));
                j7 = byteBuffer.getLong();
                this.b = k(j7) ^ this.b;
                this.c ^= l(j8);
                return;
            case 13:
                j8 ^= rup.j(byteBuffer.get(12)) << 32;
                j8 ^= rup.j(byteBuffer.get(11)) << 24;
                j8 ^= rup.j(byteBuffer.get(10)) << 16;
                j8 ^= rup.j(byteBuffer.get(9)) << 8;
                j8 ^= rup.j(byteBuffer.get(8));
                j7 = byteBuffer.getLong();
                this.b = k(j7) ^ this.b;
                this.c ^= l(j8);
                return;
            case UrlRequest.Status.READING_RESPONSE /* 14 */:
                j8 ^= rup.j(byteBuffer.get(13)) << 40;
                j8 ^= rup.j(byteBuffer.get(12)) << 32;
                j8 ^= rup.j(byteBuffer.get(11)) << 24;
                j8 ^= rup.j(byteBuffer.get(10)) << 16;
                j8 ^= rup.j(byteBuffer.get(9)) << 8;
                j8 ^= rup.j(byteBuffer.get(8));
                j7 = byteBuffer.getLong();
                this.b = k(j7) ^ this.b;
                this.c ^= l(j8);
                return;
            case 15:
                j8 = rup.j(byteBuffer.get(14)) << 48;
                j8 ^= rup.j(byteBuffer.get(13)) << 40;
                j8 ^= rup.j(byteBuffer.get(12)) << 32;
                j8 ^= rup.j(byteBuffer.get(11)) << 24;
                j8 ^= rup.j(byteBuffer.get(10)) << 16;
                j8 ^= rup.j(byteBuffer.get(9)) << 8;
                j8 ^= rup.j(byteBuffer.get(8));
                j7 = byteBuffer.getLong();
                this.b = k(j7) ^ this.b;
                this.c ^= l(j8);
                return;
            default:
                throw new AssertionError("Should never get here.");
        }
    }
}
