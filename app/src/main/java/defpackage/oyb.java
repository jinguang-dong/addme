package defpackage;

import android.media.MediaMuxer;
import java.io.FileDescriptor;
import java.io.IOException;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class oyb implements oyg {
    @Override // defpackage.oyg
    public final pop a(FileDescriptor fileDescriptor, int i) throws oyf {
        String.valueOf(fileDescriptor);
        try {
            return new pjg(new MediaMuxer(fileDescriptor, i));
        } catch (IOException e) {
            throw new oyf(i, e);
        }
    }
}
