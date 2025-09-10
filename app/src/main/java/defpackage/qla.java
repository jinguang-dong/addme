package defpackage;

import android.media.AudioFormat;
import android.media.AudioRouting;
import android.media.MicrophoneDirection;
import java.nio.ByteBuffer;

/* compiled from: PG */
/* loaded from: classes.dex */
public interface qla extends AutoCloseable, AudioRouting, MicrophoneDirection {
    AudioFormat a();

    qkz b(ByteBuffer byteBuffer, int i);

    void c();

    @Override // java.lang.AutoCloseable
    void close();

    void d();
}
