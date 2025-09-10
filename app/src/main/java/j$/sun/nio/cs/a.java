package j$.sun.nio.cs;

import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.Charset;
import java.nio.charset.CharsetDecoder;
import java.nio.charset.CoderResult;

/* loaded from: classes3.dex */
public final class a extends CharsetDecoder {
    public final /* synthetic */ int a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a(Charset charset, int i) {
        super(charset, 1.0f, 1.0f);
        this.a = i;
    }

    public static boolean a(int i, int i2, int i3) {
        return ((i != -32 || (i2 & 224) != 128) && (i2 & 192) == 128 && (i3 & 192) == 128) ? false : true;
    }

    public static boolean b(int i, int i2) {
        if (i != 240 || (i2 >= 144 && i2 <= 191)) {
            return (i == 244 && (i2 & 240) != 128) || (i2 & 192) != 128;
        }
        return true;
    }

    public static boolean c(int i) {
        return (i & 192) != 128;
    }

    public static CoderResult d(ByteBuffer byteBuffer, int i, CharBuffer charBuffer, int i2, int i3) {
        CoderResult coderResultE = e(byteBuffer, i3);
        f.h(byteBuffer, i, charBuffer, i2);
        return coderResultE;
    }

    public static CoderResult e(ByteBuffer byteBuffer, int i) {
        int i2 = 1;
        if (i == 1 || i == 2) {
            return CoderResult.malformedForLength(1);
        }
        if (i != 3) {
            if (i != 4) {
                return null;
            }
            int i3 = byteBuffer.get() & 255;
            byte b = byteBuffer.get();
            int i4 = b & 255;
            return (i3 > 244 || (i3 == 240 && (i4 < 144 || i4 > 191)) || ((i3 == 244 && (b & 240) != 128) || c(i4))) ? CoderResult.malformedForLength(1) : c(byteBuffer.get()) ? CoderResult.malformedForLength(2) : CoderResult.malformedForLength(3);
        }
        byte b2 = byteBuffer.get();
        byte b3 = byteBuffer.get();
        if ((b2 != -32 || (b3 & 224) != 128) && !c(b3)) {
            i2 = 2;
        }
        return CoderResult.malformedForLength(i2);
    }

    public static CoderResult f(ByteBuffer byteBuffer, int i, int i2) {
        byteBuffer.position(i);
        return (i2 == 0 || byteBuffer.remaining() < i2) ? CoderResult.UNDERFLOW : CoderResult.OVERFLOW;
    }

    public static CoderResult g(ByteBuffer byteBuffer, int i, int i2, CharBuffer charBuffer, int i3, int i4) {
        f.h(byteBuffer, i, charBuffer, i3);
        return (i4 == 0 || i2 - i < i4) ? CoderResult.UNDERFLOW : CoderResult.OVERFLOW;
    }

    /* JADX WARN: Code restructure failed: missing block: B:137:0x02d0, code lost:
    
        if ((r2 & 192) != r10) goto L138;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x012a, code lost:
    
        if ((r0 & 192) != r10) goto L54;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:14:0x006d  */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.nio.Buffer, java.nio.ByteBuffer] */
    /* JADX WARN: Type inference failed for: r1v10, types: [java.nio.CharBuffer] */
    /* JADX WARN: Type inference failed for: r1v11, types: [java.nio.ByteBuffer] */
    /* JADX WARN: Type inference failed for: r1v5 */
    @Override // java.nio.charset.CharsetDecoder
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.nio.charset.CoderResult decodeLoop(java.nio.ByteBuffer r24, java.nio.CharBuffer r25) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 1128
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: j$.sun.nio.cs.a.decodeLoop(java.nio.ByteBuffer, java.nio.CharBuffer):java.nio.charset.CoderResult");
    }
}
