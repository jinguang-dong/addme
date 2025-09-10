package defpackage;

import android.media.AudioFormat;
import android.media.AudioRouting;
import android.media.MicrophoneDirection;
import java.nio.ByteBuffer;

/* compiled from: PG */
/* loaded from: classes2.dex */
public interface plx extends AutoCloseable, AudioRouting, MicrophoneDirection {
    int a();

    int b();

    int c();

    @Override // java.lang.AutoCloseable
    void close();

    AudioFormat d();

    void e();

    void f();

    qaq g(ByteBuffer byteBuffer, int i);
}
