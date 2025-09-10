package com.google.babelfish.device.avenh.l2l.speechenhancer2.jni;

import androidx.compose.foundation.text.modifiers.Yk.LmJPKwPBa;
import com.bumptech.glide.qd.MyBPCgKwEjJI;
import defpackage.qoi;
import defpackage.ruo;
import defpackage.rup;
import defpackage.rus;
import defpackage.rut;
import defpackage.ruu;
import defpackage.rva;
import defpackage.ttn;
import j$.nio.file.Path;
import j$.util.Optional;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class SpeechEnhancerJniWrapperRealtime {
    private static final long ILLEGAL_JNI_CONTEXT = -1;
    private static final String IS_SPEAKING_CALLBACK_NAME = "isSpeakingJniCallback";
    private static final String MAIN_SPEAKER_DETECTED_CALLBACK_NAME = "mainSpeakerDetectedJniCallback";
    private static final String ON_SWITCH_AUDIO_ONLY_CALLBACK_NAME = "onSwitchToAudioOnlyJniCallback";
    private static final String PROCESSED_AUDIO_CALLBACK_NAME = "processedAudioJniCallback";
    private final int audioChannels;
    private final ruo callback;
    private final int fileDescriptor;
    private final long fileOffset;
    private long jniContext;
    private final long length;
    private final Path modelDirectory;
    private final float sampleRate;
    private final boolean skipInitGoogle;
    private final boolean useBatchMode;
    private final boolean useTpu;

    private SpeechEnhancerJniWrapperRealtime(boolean z, Path path, int i, long j, long j2, int i2, float f, ruo ruoVar, boolean z2, boolean z3) {
        this.useBatchMode = z;
        this.modelDirectory = path;
        this.fileDescriptor = i;
        this.fileOffset = j;
        this.length = j2;
        this.callback = ruoVar;
        this.skipInitGoogle = z2;
        this.useTpu = z3;
        this.jniContext = -1L;
        this.audioChannels = i2;
        this.sampleRate = f;
    }

    private native int avenhAudioBytesPerSample(long j);

    private native int avenhAudioNumberOfChannels(long j);

    private native float avenhAudioSampleRateHz(long j);

    private native void avenhCleanup(long j);

    private native int avenhFlush(long j);

    private native double avenhGetAllSpeechMixingRatio(long j);

    private native double avenhGetRawAudioMixingRatio(long j);

    private native boolean avenhHasAllSpeechOutput(long j);

    private native long avenhInit(String str, int i, float f, boolean z, boolean z2, boolean z3, String str2, String str3, String str4, String str5);

    private native long avenhInitFd(int i, long j, long j2, int i2, float f, boolean z, boolean z2, boolean z3, String str, String str2, String str3, String str4);

    private static native void avenhModelWarmup(String str, boolean z);

    private static native void avenhModelWarmupFd(int i, long j, long j2, boolean z);

    private native int avenhNumberOfThumbnailImageChannels(long j);

    private native void avenhProvideFrame(long j, ByteBuffer byteBuffer, int i, int i2, int i3);

    private native void avenhProvideFrameAndFace(long j, ByteBuffer byteBuffer, int i, int i2, int i3, ByteBuffer byteBuffer2);

    private native void avenhProvideRawAudio(long j, ByteBuffer byteBuffer);

    private native void avenhSetAllSpeechMixingRatio(long j, double d);

    private native void avenhSetRawAudioMixingRatio(long j, double d);

    private native int avenhThumbnailHeightPixels(long j);

    private native int avenhThumbnailWidthPixels(long j);

    private native int avenhVideoFramesPerSecond(long j);

    private static ByteBuffer byteArrayToDirectByteBuffer(byte[] bArr) {
        ByteBuffer byteBufferAllocateDirect = ByteBuffer.allocateDirect(bArr.length);
        byteBufferAllocateDirect.order(ByteOrder.nativeOrder());
        byteBufferAllocateDirect.put(bArr);
        byteBufferAllocateDirect.position(0);
        return byteBufferAllocateDirect;
    }

    public static void modelWarmup(int i, long j, long j2, boolean z) {
        avenhModelWarmupFd(i, j, j2, z);
    }

    public void flush() {
        long j = this.jniContext;
        if (j == -1) {
            throw new IllegalStateException("'initialize' must be called before calling flush().");
        }
        avenhFlush(j);
    }

    public double getAllSpeechMixingRatio() {
        long j = this.jniContext;
        if (j != -1) {
            return avenhGetAllSpeechMixingRatio(j);
        }
        throw new IllegalStateException("'initialize' must be called before calling getAllSpeechMixingRatio().");
    }

    public double getRawAudioMixingRatio() {
        long j = this.jniContext;
        if (j != -1) {
            return avenhGetRawAudioMixingRatio(j);
        }
        throw new IllegalStateException("'initialize' must be called before calling getRawAudioMixingRatio().");
    }

    public ruu getSpeechEnhancerModelInfo() {
        if (this.jniContext == -1) {
            throw new IllegalStateException("'initialize' must be called before calling getSpeechEnhancerModelInfo().");
        }
        int i = ruu.e;
        rut rutVar = new rut();
        rutVar.g(avenhThumbnailWidthPixels(this.jniContext));
        rutVar.f(avenhThumbnailHeightPixels(this.jniContext));
        rutVar.e((rus) rus.c.get(Integer.valueOf(avenhNumberOfThumbnailImageChannels(this.jniContext))));
        rutVar.h(avenhVideoFramesPerSecond(this.jniContext));
        rutVar.d(avenhAudioSampleRateHz(this.jniContext));
        rutVar.b(avenhAudioBytesPerSample(this.jniContext));
        rutVar.c(avenhAudioNumberOfChannels(this.jniContext));
        return rutVar.a();
    }

    public boolean hasAllSpeechOutput() {
        long j = this.jniContext;
        if (j != -1) {
            return avenhHasAllSpeechOutput(j);
        }
        throw new IllegalStateException("'initialize' must be called before calling hasAllSpeechOutput().");
    }

    public void initialize() {
        int i = this.fileDescriptor;
        if (i != -1) {
            this.jniContext = avenhInitFd(i, this.fileOffset, this.length, this.audioChannels, this.sampleRate, this.useBatchMode, this.skipInitGoogle, this.useTpu, PROCESSED_AUDIO_CALLBACK_NAME, IS_SPEAKING_CALLBACK_NAME, MAIN_SPEAKER_DETECTED_CALLBACK_NAME, ON_SWITCH_AUDIO_ONLY_CALLBACK_NAME);
            return;
        }
        Path path = this.modelDirectory;
        this.jniContext = avenhInit(path.toString(), this.audioChannels, this.sampleRate, this.useBatchMode, this.skipInitGoogle, this.useTpu, PROCESSED_AUDIO_CALLBACK_NAME, IS_SPEAKING_CALLBACK_NAME, MAIN_SPEAKER_DETECTED_CALLBACK_NAME, ON_SWITCH_AUDIO_ONLY_CALLBACK_NAME);
    }

    public void isSpeakingJniCallback(float f) {
        this.callback.c();
    }

    public void mainSpeakerDetectedJniCallback(byte[] bArr) {
        Optional.ofNullable(bArr).map(new qoi(5));
        this.callback.d();
    }

    public void onSwitchToAudioOnlyJniCallback(int i) {
        this.callback.b(i);
    }

    public void processedAudioJniCallback(byte[] bArr) {
        this.callback.a(bArr);
    }

    public void provideVideoFrame(rva rvaVar) {
        if (this.jniContext == -1) {
            throw new IllegalStateException("'initialize' must be called before calling provideVideoFrame().");
        }
        Optional optional = rvaVar.e;
        if (optional.isPresent()) {
            avenhProvideFrameAndFace(this.jniContext, rvaVar.a, rvaVar.b, rvaVar.c, rvaVar.d.d, byteArrayToDirectByteBuffer(((ttn) optional.get()).h()));
        } else {
            avenhProvideFrame(this.jniContext, rvaVar.a, rvaVar.b, rvaVar.c, rvaVar.d.d);
        }
    }

    public void setAllSpeechMixingRatio(double d) {
        long j = this.jniContext;
        if (j == -1) {
            throw new IllegalStateException("'initialize' must be called before calling setAllSpeechMixingRatio().");
        }
        avenhSetAllSpeechMixingRatio(j, d);
    }

    public void setRawAudioMixingRatio(double d) {
        long j = this.jniContext;
        if (j == -1) {
            throw new IllegalStateException("'initialize' must be called before calling setRawAudioMixingRatio().");
        }
        avenhSetRawAudioMixingRatio(j, d);
    }

    public /* synthetic */ SpeechEnhancerJniWrapperRealtime(boolean z, Path path, int i, long j, long j2, int i2, float f, ruo ruoVar, boolean z2, boolean z3, rup rupVar) {
        this(z, path, i, j, j2, i2, f, ruoVar, z2, z3);
    }

    public static void modelWarmup(Path path, boolean z) {
        avenhModelWarmup(path.toString(), z);
    }

    public void cleanup() {
        long j = this.jniContext;
        if (j == -1) {
            throw new IllegalStateException(LmJPKwPBa.UglSJbIGbd);
        }
        avenhCleanup(j);
    }

    public void provideRawAudio(byte[] bArr) {
        if (this.jniContext == -1) {
            throw new IllegalStateException(MyBPCgKwEjJI.RWxuMxiyEJ);
        }
        avenhProvideRawAudio(this.jniContext, byteArrayToDirectByteBuffer(bArr));
    }
}
