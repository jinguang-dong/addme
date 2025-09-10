package defpackage;

import android.media.MediaCodec;
import java.nio.ByteBuffer;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class oyr {
    public final MediaCodec.BufferInfo a;
    public final ByteBuffer b;

    public oyr() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof oyr) {
            oyr oyrVar = (oyr) obj;
            if (this.a.equals(oyrVar.a) && this.b.equals(oyrVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() ^ 1000003;
        return this.b.hashCode() ^ (iHashCode * 1000003);
    }

    public final String toString() {
        ByteBuffer byteBuffer = this.b;
        return "{" + this.a.toString() + ", " + byteBuffer.toString() + "}";
    }

    public oyr(MediaCodec.BufferInfo bufferInfo, ByteBuffer byteBuffer) {
        bufferInfo.getClass();
        this.a = bufferInfo;
        byteBuffer.getClass();
        this.b = byteBuffer;
    }
}
