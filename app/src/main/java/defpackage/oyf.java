package defpackage;

import java.io.IOException;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class oyf extends IOException {
    public oyf(int i, Throwable th) {
        super("Unable to create MediaMuxer with file path file descriptor and format " + i, th);
    }
}
