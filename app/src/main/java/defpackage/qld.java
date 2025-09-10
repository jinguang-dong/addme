package defpackage;

import android.media.AudioFormat;

/* compiled from: PG */
/* loaded from: classes.dex */
final class qld {
    public final long b;
    public final int c;
    public final int d;
    public final Object a = new Object();
    public long e = 0;

    public qld(AudioFormat audioFormat) {
        this.b = 1000000000 / audioFormat.getSampleRate();
        this.d = audioFormat.getChannelCount();
        this.c = a(audioFormat);
    }

    public static int a(AudioFormat audioFormat) {
        int encoding = audioFormat.getEncoding();
        int i = 1;
        if (encoding != 1 && encoding != 2) {
            if (encoding != 3) {
                i = 4;
                if (encoding != 4) {
                    if (encoding != 13) {
                        throw new IllegalArgumentException("Bad audio format ".concat(String.valueOf(String.valueOf(audioFormat))));
                    }
                }
            }
            return i;
        }
        return 2;
    }
}
