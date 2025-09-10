package androidx.media3.muxer;

import androidx.coordinatorlayout.widget.pcp.OPuAVreQM;
import defpackage.coi;
import defpackage.cyx;
import defpackage.czl;
import defpackage.scf;
import java.nio.ByteBuffer;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class NativeAnnexBToAvccConverter implements czl {
    public static final cyx b = new cyx("annexbtoavcc");

    public static native void processNative(ByteBuffer byteBuffer, int i);

    @Override // defpackage.czl
    public final /* synthetic */ ByteBuffer a(ByteBuffer byteBuffer, scf scfVar) {
        boolean z;
        if (!byteBuffer.hasRemaining()) {
            return byteBuffer;
        }
        if (b.a()) {
            if (byteBuffer.position() == 0) {
                z = true;
            } else {
                z = false;
            }
            coi.w(z, "The input buffer should have position set to 0.");
            coi.w(byteBuffer.isDirect(), "Conversion only works with direct ByteBuffers");
            processNative(byteBuffer, byteBuffer.limit());
            return byteBuffer;
        }
        throw new IllegalStateException(OPuAVreQM.nNTkcEs);
    }
}
