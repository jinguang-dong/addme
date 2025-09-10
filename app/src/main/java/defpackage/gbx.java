package defpackage;

import android.os.ParcelFileDescriptor;
import java.io.FileDescriptor;
import java.io.IOException;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class gbx implements gcc {
    private static final sgv a = sgv.g("gbx");
    private final ParcelFileDescriptor b;
    private final FileDescriptor c;

    public gbx(ParcelFileDescriptor parcelFileDescriptor) {
        this.b = parcelFileDescriptor;
        this.c = parcelFileDescriptor.getFileDescriptor();
    }

    @Override // defpackage.gcc
    public final /* synthetic */ ltg a() {
        return ezh.E(this);
    }

    @Override // defpackage.gcc
    public final rwc b() {
        return rvk.a;
    }

    @Override // defpackage.gcc
    public final rwc c() {
        return rvk.a;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [sgt, shi] */
    @Override // defpackage.paq, java.lang.AutoCloseable
    public final void close() throws IOException {
        try {
            this.b.close();
        } catch (IOException e) {
            ((sgt) ((sgt) a.b().i(e)).M((char) 694)).s("Error closing parcelFileDescriptor.");
        }
    }

    @Override // defpackage.gcc
    public final syu d() {
        return ske.M(this.c);
    }

    @Override // defpackage.gcc
    public final FileDescriptor e() {
        throw null;
    }

    @Override // defpackage.gcc
    public final void f() {
    }
}
