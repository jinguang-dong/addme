package defpackage;

import com.google.android.apps.camera.coach.YOHg.INRGuObcrHjSQz;
import com.google.babelfish.device.avenh.l2l.speechenhancer2.jni.SpeechEnhancerJniWrapperRealtime;
import com.google.vr.audio.Cf.qcjAcSmlN;
import j$.io.DesugarInputStream;
import j$.io.InputStreamRetargetInterface;
import j$.util.Optional;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PipedInputStream;
import java.io.PipedOutputStream;
import java.nio.ByteBuffer;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class rul extends InputStream implements InputStreamRetargetInterface {
    public static final sgv a = sgv.g("rul");
    public final PipedOutputStream c;
    public final ruz e;
    public final run g;
    public final SpeechEnhancerJniWrapperRealtime h;
    private final PipedInputStream i;
    public final AtomicReference b = new AtomicReference(ruk.UNINITIALIZED);
    public Optional d = Optional.empty();
    public volatile Thread f = null;

    public rul(run runVar, ruz ruzVar, PipedInputStream pipedInputStream, PipedOutputStream pipedOutputStream, SpeechEnhancerJniWrapperRealtime speechEnhancerJniWrapperRealtime) {
        this.g = runVar;
        this.e = ruzVar;
        this.i = pipedInputStream;
        this.c = pipedOutputStream;
        this.h = speechEnhancerJniWrapperRealtime;
    }

    public final void a(ByteBuffer byteBuffer) {
        rnt.B(byteBuffer.hasRemaining(), "audio buffer can't be empty");
        run runVar = this.g;
        if (runVar.k == 1) {
            runVar.d.ifPresent(new lig(16));
        }
        byte[] bArr = new byte[byteBuffer.remaining()];
        byteBuffer.get(bArr);
        this.h.provideRawAudio(bArr);
    }

    @Override // java.io.InputStream
    public final int available() {
        int i = this.g.l;
        rnt.M(false, "To use InputStream methods on SpeechEnhancer, set the 'processed audio interface type' to 'INPUT_STREAM' when creating the SpeechEnhancer instance.");
        return this.i.available();
    }

    @Override // java.io.InputStream
    public final int read() {
        int i = this.g.l;
        rnt.M(false, "To use InputStream methods on SpeechEnhancer, set the 'processed audio interface type' to 'INPUT_STREAM' when creating the SpeechEnhancer instance.");
        AtomicReference atomicReference = this.b;
        rnt.M((atomicReference.get() == ruk.UNINITIALIZED || atomicReference.get() == ruk.INITIALIZING) ? false : true, "'initialize()' must be called before calling 'read()'.");
        rnt.M(atomicReference.get() != ruk.READY, "'start()' must be called before calling 'read()'.");
        return this.i.read();
    }

    @Override // java.io.InputStream, j$.io.InputStreamRetargetInterface
    public final /* synthetic */ long transferTo(OutputStream outputStream) {
        return DesugarInputStream.transferTo(this, outputStream);
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) {
        int i3 = this.g.l;
        rnt.M(false, qcjAcSmlN.PhBVeqSneSQZ);
        AtomicReference atomicReference = this.b;
        rnt.M((atomicReference.get() == ruk.UNINITIALIZED || atomicReference.get() == ruk.INITIALIZING) ? false : true, INRGuObcrHjSQz.apGp);
        rnt.M(atomicReference.get() != ruk.READY, "'start()' must be called before calling 'read()'.");
        return this.i.read(bArr, i, i2);
    }
}
